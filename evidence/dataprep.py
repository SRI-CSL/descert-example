# Creates csv files from JSON files that were created by the plugin.
# Evaluators only care about CSV files.  The JSON files were created for our own convenience.
# The schemas of the CSV and JSON files are hard-coded in this file.

import csv
import datetime
import functools
import json
import os
import re

import shutil

RANDOOP_EVIDENCE = "randoop-evidence.json"
DAIKON_EVIDENCE = "daikon-evidence.json"

RANDOOP_IDENTIFIER = "Randoop-4.2.3"
DAIKON_IDENTIFIER = "Daikon-5.8.8"


IDENTIFIERS = {
    "randoop-evidence.json": RANDOOP_IDENTIFIER,
    "daikon-evidence.json": DAIKON_IDENTIFIER,
}

READMES = {
    "randoop-evidence.json": "https://randoop.github.io/randoop/manual/",
    "daikon-evidence.json": "https://plse.cs.washington.edu/daikon/download/doc/", 
}

DESCRIPTIONS = {
    "randoop-evidence.json": "Automatic unit test generation for Java",
    "daikon-evidence.json": "Dynamic detection of likely program invariants",
    "RandoopJUnitTestGeneration": "Generated unit tests using Randoop",
}


TOOL_INVOCATION = {
    "description": "", 
    "generatedAtTime": "",
    "identifier": "",
    "invalidatedAtTime": "",
    "title": "",
    "toolParamaters": "[]",
    "definedIn_identifier": "",
    "dataInsertedBy_identifier": "",
    "invokedBy_identifier": "",
    "toolUsed_identifier": "",
    "wasAttributedTo_identifier": "",
    "wasDerivedFrom_identifier": "",
    }

TOOL = {
    "toolInstallationConfiguration": "",
    "toolSummaryDescription": "",
    "toolVersion": "",
    "description": "",
    "identifier": "",
    "title": "",
    "toolQualificationData_identifier": "",
    "userGuide_identifier": "",
    "definedIn_identifier": "",
    "actedOnBehalfOf_identifier": "",
    "dataInsertedBy_identifier": "",
}


RANDOOP_JUNIT_GENERATION = {
    "description": "",
    "endedAtTime": "",
    "identifier": "",
    "startedAtTime": "",
    "title": "",
    "definedIn_identifier": "",
    "dataInsertedBy_identifier": "",
    "used_identifier": "",
    "wasAssociatedWith_identifier": "",
    "wasInformedBy_identifier": "",
    "developedBy_identifier": "",
    "toolInvocation_identifier": "",
}


RANDOOP_METRICS = {
    "numberOfErrorRevealingTestCases": "",
    "numberOfReducedViolationInducingTestCases": "",
    "numberOfRegressionTestCases": "",
    "numberOfViolationInducingTestCases": "",
    "totalNumberOfTestCases": "",
    "description": "",
    "generatedAtTime": "",
    "identifier": "",
    "title": "",
    "jUnitTestFile_identifier": "",
    "producedBy_identifier": "",
    "verifies_identifier": "",
    "definedIn_identifier": "",
    "dataInsertedBy_identifier": "",
    "wasAttributedTo_identifier": "",
    "wasDerivedFrom_identifier": "",
    "wasGeneratedBy_identifier": "",
    "wasImpactedBy_identifier": "",
    "asRevisionOf_identifier": "",
}

FILE_DATA = {
    "filename": "",
    "description": "",
    "generatedAtTime": "",
    "identifier": "",
    "invalidatedAtTime": "",
    "title": "",
    "createBy_identifier": "",
    "definedIn_identifier": "",
    "fileFormat_identifier": "",
    "fileHash_identifier": "",
    "satisfies_identifier": "",
    "dataInsertedBy_identifier": "",
    "wasAttributedTo_identifier": "",
    "wasDerivedFrom_identifier": "",
    "wasGeneratedBy_identifier": "",
    "wasImpactedBy_identifier": "",
    "wasRevisionOf_identifier": "",
}


DAIKON_INVARIANT_DETECTION = {
    "description": "",
    "endedAtTime": "",
    "identifier": "",
    "startedAtTime": "",
    "title": "",
    "toolInvocation_identifier": "",
    "definedIn_identifier": "",
    "dataInsertedBy_identifier": "",
    "used_identifier": "",
    "wasAssociatedWith_identifier": "",
    "wasInformedBy_identifier": "",
}


DAIKON_INVARIANT_OUTPUT = {
    "classesCount": "",
    "invariantCount": "",
    "testsCount": "",
    "description": "",
    "generatedAtTime": "",
    "identifier": "",
    "invalidatedAtTime": "",
    "title": "",
    "likelyInvariants_identifier": "",
    "producedBy_identifier": "",
    "supportFiles_identifier": "",
    "testDriver_identifier": "",
    "verifies_identifier": "",
    "definedIn_identifier": "",
    "dataInsertedBy_identifier": "",
    "wasAttributedTo_identifier": "",
    "wasDerivedFrom_identifier": "",
    "wasGeneratedBy_identifier": "",
    "wasImpactedBy_identifier": "",
    "wasRevisionOf_identifier": "",
}


LIKELY_INVARIANT_MODEL = {
    "invariantSpecification": "",
    "description": "",
    "generatedAtTime": "",
    "identifier": "",
    "invalidatedAtTime": "",
    "title": "",
    "definedIn_identifier": "",
    "models_identifier": "",
    "dataInsertedBy_identifier": "",
    "wasAttributedTo_identifier": "",
    "wasDerivedFrom_identifier": "",
    "wasGeneratedBy_identifier": "",
    "wasImpactedBy_identifier": "",
    "wasRevisionOf_identifier": "",
}

LIKELY_INVARIANT_MODEL = {
    "invariantSpecification": "",
    "description": "",
    "generatedAtTime": "",
    "identifier": "",
    "invalidatedAtTime": "",
    "title": "",
    "definedIn_identifier": "",
    "models_identifier": "",
    "dataInsertedBy_identifier": "",
    "wasAttributedTo_identifier": "",
    "wasDerivedFrom_identifier": "",
    "wasGeneratedBy_identifier": "",
    "wasImpactedBy_identifier": "",
    "wasRevisionOf_identifier": "",
}



def new_tool(json_file):
    tool_instance = TOOL.copy()
    tool_instance["toolSummaryDescription"] = DESCRIPTIONS.get(json_file, "MISSING")
    tool_instance["toolVersion"] = IDENTIFIERS.get(json_file, "MISSING").split("-")[1]
    tool_instance["description"] = DESCRIPTIONS.get(json_file, "MISSING")
    tool_instance["identifier"] = IDENTIFIERS.get(json_file, "MISSING").replace(".", "_").replace("-", "_")
    tool_instance["title"] = " version ".join(IDENTIFIERS.get(json_file, "MISSING").split("-"))
    # Comment this line out per Davesh's comment
    # tool_instance["toolInstallationConfiguration"] = READMES.get(json_file, "MISSING")
    return tool_instance

def new_tool_invoke(tool_instance):
    tool_invoke = TOOL_INVOCATION.copy()
    tool_invoke["identifier"] = tool_instance["identifier"] + "_INVOKE"
    tool_invoke["title"] = tool_instance["title"] + " Invocation"
    tool_invoke["toolUsed_identifier"] = tool_instance["identifier"]
    return tool_invoke


def new_randoop_test_gen(tool_instance):
    randoop_test_data = RANDOOP_JUNIT_GENERATION.copy()
    randoop_test_data["description"] = tool_instance["title"] + " data"
    randoop_test_data["identifier"] = tool_instance["identifier"] + "_TEST"
    randoop_test_data["title"] = "Tests generated by " + tool_instance["title"]
    randoop_test_data["developedBy_identifier"] = tool_instance["identifier"]
    return randoop_test_data

def new_randoop_metrics(tool_instance):
    randoop_metrics = RANDOOP_METRICS.copy()
    randoop_metrics["description"] = tool_instance["title"] + " metrics"
    randoop_metrics["identifier"] = tool_instance["identifier"] + "_METRICS"
    randoop_metrics["title"] = tool_instance["title"] + " metrics data"
    randoop_metrics["wasGeneratedBy_identifier"] = tool_instance["identifier"]
    return randoop_metrics


def new_daikon_invar_detect(tool_instance, tool_invoke):
    daikon_data = DAIKON_INVARIANT_DETECTION.copy()
    daikon_data["description"] = tool_instance["title"] + " detection"
    daikon_data["identifier"] = tool_instance["identifier"] + "_DETECT"
    daikon_data["title"] = tool_instance["title"] + " invariant detection"
    daikon_data["toolInvocation_identifier"] = tool_invoke["identifier"]
    return daikon_data

def new_daikon_invar_output(tool_instance):
    daikon_data = DAIKON_INVARIANT_OUTPUT.copy()
    daikon_data["description"] = tool_instance["title"] + " output data"
    daikon_data["identifier"] = tool_instance["identifier"] + "_OUT"
    daikon_data["title"] = tool_instance["title"] + " invariant detection"
    return daikon_data


def move(src, dst):
    if os.path.exists(src):
        shutil.move(src, dst)


def copytree(src, dst):
    if os.path.exists(src):
        shutil.copytree(src, dst)


def rotate_dir(d, retain_src=False):
    i = 1
    dirformat = "{}.{}"

    while os.path.exists(dirformat.format(d, i)):
        i += 1

    rd = dirformat.format(d, i)
    move(d, rd)
    if retain_src:
        copytree(rd, d)



def truncate_csv_files(base_dir):
    # opening the file with w+ mode truncates the file
    ingest_Auto_FILE = os.path.join(base_dir, "ingest_Auto_FILE.csv")
    with open(ingest_Auto_FILE, "w+", newline='') as csv_file:
        fieldnames = [key for key in FILE_DATA]
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
    
    ingest_Auto_TOOL = os.path.join(base_dir, "ingest_Auto_TOOL.csv")
    with open(ingest_Auto_TOOL, "w+", newline='') as csv_file:
        fieldnames = [key for key in TOOL]
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
    
    ingest_Auto_TOOL_Invoke = os.path.join(base_dir, "ingest_Auto_ToolInvocationInstance.csv")
    with open(ingest_Auto_TOOL_Invoke, "w+", newline='') as csv_file:
        fieldnames = [key for key in TOOL_INVOCATION]
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
        
    ingest_Auto_RandoopJUnitTestGen = os.path.join(base_dir, "ingest_Auto_RandoopJUnitTestGeneration.csv")
    with open(ingest_Auto_RandoopJUnitTestGen, "w+", newline='') as csv_file:
        fieldnames = [key for key in RANDOOP_JUNIT_GENERATION]
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
    
    ingest_Auto_RandoopTestsAndMetrics = os.path.join(base_dir, "ingest_Auto_RandoopTestsAndMetrics.csv")
    with open(ingest_Auto_RandoopTestsAndMetrics, "w+", newline='') as csv_file:
        fieldnames = [key for key in RANDOOP_METRICS]
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
        
    ingest_Auto_DaikonInvariantDetection = os.path.join(base_dir, "ingest_Auto_DaikonInvariantDetection.csv")
    with open(ingest_Auto_DaikonInvariantDetection, "w+", newline='') as csv_file:
        fieldnames = [key for key in DAIKON_INVARIANT_DETECTION]
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
    
    
    ingest_Auto_DaikonInvariantOutput = os.path.join(base_dir, "ingest_Auto_DaikonInvariantOutput.csv")
    with open(ingest_Auto_DaikonInvariantOutput, "w+", newline='') as csv_file:
        fieldnames = [key for key in DAIKON_INVARIANT_OUTPUT]
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
        
    ingest_Auto_LikelyInvariantModel = os.path.join(base_dir, "ingest_Auto_LikelyInvariantModel.csv")
    with open(ingest_Auto_LikelyInvariantModel, "w+", newline='') as csv_file:
        fieldnames = [key for key in LIKELY_INVARIANT_MODEL]
        writer = csv.DictWriter(csv_file, fieldnames=fieldnames)
        writer.writeheader()
        
    print("Finished truncating csv files")


def camel_to_snake(name):
  name = re.sub('(.)([A-Z][a-z]+)', r'\1_\2', name)
  return re.sub('([a-z0-9])([A-Z])', r'\1_\2', name)


def cwd_aware(function):
    @functools.wraps(function)
    def decorator(*args, **kwargs):
        os.chdir(os.path.dirname(__file__))
        orig_cwd = os.getcwd()
        os.chdir("..")  # parent
        try:
            return function(*args, **kwargs)
        finally:
            os.chdir(orig_cwd)
    return decorator


@cwd_aware
def read_randoop_file(json_file):
    json_file_path = os.path.join(os.getcwd(), json_file)
    if not os.path.exists(json_file_path):
        return False
 
    result_dict = {"tool": None, "invoke": None, "data": None, "metrics": None, "files": None}

    # Defines the <Randoop|Daikon> tool
    tool_instance = new_tool(json_file)
    tool_instance["userGuide_identifier"] = "DOCUMENT_RANDOOP_4_2_3"
    # Tool Invocation
    tool_invoke = new_tool_invoke(tool_instance)
    # Randoop data
    randoop_test_data = new_randoop_test_gen(tool_instance)
    randoop_metrics_data = new_randoop_metrics(tool_instance)
 
    metrics_data, unit_tests = [], []
    with open(json_file_path, "r") as read_file:
        data = json.load(read_file)
        for root_dict_key in data:
            evidence_dict = data.get(root_dict_key, None)
            if evidence_dict is None:
                return False, result_dict
            
            for each_key in evidence_dict:
                data_dict = evidence_dict[each_key]
                if each_key == "RandoopJUnitTestGeneration":
                    tool_invoke["toolParamaters"] = data_dict.get("PARAMETERS", "[]")
                elif each_key == "RandoopToolQualification":
                    # Comment this line out per Davesh's comment
                    # if tool_instance["toolInstallationConfiguration"] == "MISSING":
                    #     tool_instance["toolInstallationConfiguration"] = data_dict.get("INSTALLATION", "MISSING")
                    tool_invoke["description"] = data_dict.get("SUMMARY", "MISSING")
                elif each_key == "RandoopTestsAndMetrics":
                    randoop_metrics_data["numberOfErrorRevealingTestCases"] = data_dict.get("ERROR_REVEALING_TEST_COUNT", "0")
                    randoop_metrics_data["numberOfReducedViolationInducingTestCases"] = "0"
                    randoop_metrics_data["numberOfRegressionTestCases"] = data_dict.get("REGRESSION_TEST_COUNT", "0")
                    randoop_metrics_data["numberOfViolationInducingTestCases"] = "0"
                    randoop_metrics_data["totalNumberOfTestCases"] = data_dict.get("NUMBEROFTESTCASES", "0")
                    randoop_metrics_data["jUnitTestFile_identifier"] = ";".join([t["identifier"] for t in unit_tests])
                    
                    generated_tests = data_dict.get("GENERATED_TEST_FILES", [])
                    for each_test in generated_tests:
                        cur_randoop_metrics_data = randoop_metrics_data.copy()
                        filename = f"{os.path.basename(os.path.normpath(each_test))}"
                        
                        # copying test file to its final destination
                        new_each_test =  os.path.join(os.getcwd(), f"ingestpack/Randoop_Daikon/{filename}")
                        if not os.path.exists(new_each_test):
                            shutil.copyfile(each_test, new_each_test)
                        
                        filename_no_ext = filename.split(".")[0]
                        test_file = FILE_DATA.copy()
                        test_file["filename"] = filename
                        test_file["description"] = "JUnit tests"
                        date_str = datetime.datetime.now().strftime("%Y-%m-%dT%H:%M:%S.%f%z")
                        test_file["generatedAtTime"] = f"{date_str}"
                        test_file["identifier"] = f"FILE_{camel_to_snake(filename_no_ext)}".upper()

                        test_file["title"] = camel_to_snake(filename_no_ext).replace("_", " ")
                        test_file["fileFormat_identifier"] = "FORMAT_JAVA"
                        unit_tests += [test_file]
                        cur_randoop_metrics_data["jUnitTestFile_identifier"] = test_file["identifier"]
                        metrics_data += [cur_randoop_metrics_data]

    result_dict["tool"] = tool_instance
    result_dict["invoke"] = tool_invoke
    result_dict["data"] = randoop_test_data
    result_dict["files"] = unit_tests
    result_dict["metrics"] = metrics_data

    return True, result_dict


def write_file_csv(base_dir, file_data, insert_manuals=True):
    ingest_Auto_FILE = os.path.join(base_dir, "ingestpack/Randoop_Daikon/ingest_Auto_FILE.csv")
    if not os.path.exists(ingest_Auto_FILE):
        print(f"WARNING: Could not find {ingest_Auto_FILE} file")
    else:
        with open(ingest_Auto_FILE, 'a+', newline='') as csvfile:
            fieldnames = [key for key in FILE_DATA]
            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            for unit_test in file_data:
                writer.writerow(unit_test)
            
            # insert manuals
            if insert_manuals:
                date_str = datetime.datetime.now().strftime("%Y-%m-%dT%H:%M:%S.%f%z")
                randoop_manual = FILE_DATA.copy()
                randoop_manual["filename"] = "randoop_4_2_3_usermanual.pdf"
                randoop_manual["description"] = "Randoop Manual 4.2.3"
                randoop_manual["generatedAtTime"] = f"{date_str}"
                randoop_manual["identifier"] = "FILE_RANDOOP_4_2_3"
                randoop_manual["title"] = "Randoop Manual 4.2.3"
                randoop_manual["fileFormat_identifier"] = "FORMAT_PDF"
                
                writer.writerow(randoop_manual)
                
                daikon_manual = FILE_DATA.copy()
                daikon_manual["filename"] = "daikon_5_8_8_usermanual.pdf"
                daikon_manual["description"] = "Daikon Manual 5.8.8"
                daikon_manual["generatedAtTime"] = f"{date_str}"
                daikon_manual["identifier"] = "FILE_DAIKON_5_8_8"
                daikon_manual["title"] = "Daikon Manual 5.8.8"
                daikon_manual["fileFormat_identifier"] = "FORMAT_PDF"
                writer.writerow(daikon_manual)
                
                print(f"Finished updating {ingest_Auto_FILE} file")


def write_tool_csv(base_dir, tool_instance):
    ingest_Auto_TOOL = os.path.join(base_dir, "ingestpack/Randoop_Daikon/ingest_Auto_TOOL.csv")
    if not os.path.exists(ingest_Auto_TOOL):
        print(f"WARNING: Could not find {ingest_Auto_TOOL} file")
    else:
        with open(ingest_Auto_TOOL, 'a+', newline='') as csvfile:
            fieldnames = [key for key in TOOL]
            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            writer.writerow(tool_instance)
            print(f"Finished updating {ingest_Auto_TOOL} file")


def write_tool_invoke_csv(base_dir, tool_invoke):
    ingest_Auto_TOOL_Invoke = os.path.join(base_dir, "ingestpack/Randoop_Daikon/ingest_Auto_ToolInvocationInstance.csv")
    if not os.path.exists(ingest_Auto_TOOL_Invoke):
        print(f"WARNING: Could not find {ingest_Auto_TOOL_Invoke} file")
    else:
        with open(ingest_Auto_TOOL_Invoke, 'a+', newline='') as csvfile:
            fieldnames = [key for key in TOOL_INVOCATION]
            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            writer.writerow(tool_invoke)
            print(f"Finished updating {ingest_Auto_TOOL_Invoke} file")


def write_tool_randoop_junit_test_csv(base_dir, tool_randoop_junit):
    ingest_Auto_RandoopJUnitTestGen = os.path.join(base_dir, "ingestpack/Randoop_Daikon/ingest_Auto_RandoopJUnitTestGeneration.csv")
    if not os.path.exists(ingest_Auto_RandoopJUnitTestGen):
        print(f"WARNING: Could not find {ingest_Auto_RandoopJUnitTestGen} file")
    else:
        with open(ingest_Auto_RandoopJUnitTestGen, 'a+', newline='') as csvfile:
            fieldnames = [key for key in RANDOOP_JUNIT_GENERATION]
            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            writer.writerow(tool_randoop_junit)
            print(f"Finished updating {ingest_Auto_RandoopJUnitTestGen} file")


def write_tool_randoop_metrics_csv(base_dir, tool_randoop_metrics):
    ingest_Auto_RandoopTestsAndMetrics = os.path.join(base_dir, "ingestpack/Randoop_Daikon/ingest_Auto_RandoopTestsAndMetrics.csv")
    if not os.path.exists(ingest_Auto_RandoopTestsAndMetrics):
        print(f"WARNING: Could not find {ingest_Auto_RandoopTestsAndMetrics} file")
    else:
        with open(ingest_Auto_RandoopTestsAndMetrics, 'a+', newline='') as csvfile:
            fieldnames = [key for key in RANDOOP_METRICS]
            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            for each_metric in tool_randoop_metrics:
                writer.writerow(each_metric)
            print(f"Finished updating {ingest_Auto_RandoopTestsAndMetrics} file")

@cwd_aware
def write_randoop_evidence_csv(result_dict, truncate_files=False):
    
    if truncate_files:
        randoop_daikon_dir = os.path.join(os.getcwd(), "ingestpack/Randoop_Daikon")
        rotate_dir(randoop_daikon_dir, retain_src=True)
        truncate_csv_files(randoop_daikon_dir)
    
    # write to ingest_Auto_FILE.csv
    write_file_csv(os.getcwd(), result_dict["files"])
    # write to ingest_Auto_TOOL.csv
    write_tool_csv(os.getcwd(), result_dict["tool"])
    # write to ingest_Auto_ToolInvocation.csv
    write_tool_invoke_csv(os.getcwd(), result_dict["invoke"])
    # write to ingest_Auto_RandoopJUnitTestGeneration.csv
    write_tool_randoop_junit_test_csv(os.getcwd(), result_dict["data"])
    # write to ingest_Auto_RandoopTestsAndMetrics.csv
    write_tool_randoop_metrics_csv(os.getcwd(), result_dict["metrics"])


def parse_invar_file(invariant_file_path, tool_instance):
    invars = []
    with open(invariant_file_path, "r") as reader:
        all_lines = reader.readlines()
        for idx in range(len(all_lines)):
            if "=====================" in all_lines[idx]:
                idx += 1
                if ":::" in all_lines[idx]:
                    print("Ignoring", all_lines[idx])
                idx += 1
                while idx < len(all_lines) and "=====================" not in all_lines[idx]:
                    if all_lines[idx].startswith("com.foo") or all_lines[idx].startswith("this."):
                        cls_name = all_lines[idx]
                        if all_lines[idx].startswith("com.foo"):
                            cls_name = all_lines[idx][0:all_lines[idx].rindex(".")]
                        if "Tests" not in cls_name:
                            daikon_invar_model = LIKELY_INVARIANT_MODEL.copy()
                            daikon_invar_model["invariantSpecification"] = all_lines[idx].rstrip("\n")
                            daikon_invar_model["description"] = tool_instance["title"] + " invariant spec"
                            daikon_invar_model["identifier"] = f"LIKELY_INVARIANT_SPEC_{len(invars)}"
                            daikon_invar_model["title"] = f"Like program invariant specification"
                            invars += [daikon_invar_model]
                    idx += 1
            idx += 1
    return invars

@cwd_aware
def read_daikon_file(json_file):
    json_file_path = os.path.join(os.getcwd(), json_file)
    if not os.path.exists(json_file_path):
        return False
 
    result_dict = {"tool": None, "invoke": None,
                   "data": None, "output": None, 
                   "model": None, "files": None}
    
    # Defines the <Randoop|Daikon> tool
    tool_instance = new_tool(json_file)
    tool_instance["userGuide_identifier"] = "DOCUMENT_DAIKON_5_8_8"
    # Tool Invocation
    tool_invoke = new_tool_invoke(tool_instance)
    # Daikon data
    daikon_detect_data = new_daikon_invar_detect(tool_instance, tool_invoke)
    daikon_output_data = new_daikon_invar_output(tool_instance)
    
    output_data, support_files, invars = [], [], []
    with open(json_file_path, "r") as read_file:
        data = json.load(read_file)
        for root_dict_key in data:
            evidence_dict = data.get(root_dict_key, None)
            if evidence_dict is None:
                return False, result_dict
            
            for each_key in evidence_dict:
                data_dict = evidence_dict[each_key]
                if each_key == "DaikonInvsAndMetrics":
                    invariant_file_path = data_dict["INVARIANTS_FILE"]
                    if invariant_file_path is None:
                        continue
                    
                    invars = parse_invar_file(invariant_file_path, tool_instance)
                    filename = f"{os.path.basename(os.path.normpath(invariant_file_path))}"
                    # copying inv.txt to its final destination
                    new_invariant_file_path = os.path.join(os.getcwd(), f"ingestpack/Randoop_Daikon/{filename}")
                    if not os.path.exists(new_invariant_file_path):
                        shutil.copyfile(invariant_file_path, new_invariant_file_path)

                    filename_no_ext = filename.split(".")[0]
                    invariant_file = FILE_DATA.copy()
                    invariant_file["filename"] = filename
                    invariant_file["description"] = "Set of likely program invariant specifications"
                    date_str = datetime.datetime.now().strftime("%Y-%m-%dT%H:%M:%S.%f%z")
                    invariant_file["generatedAtTime"] = f"{date_str}"
                    invariant_file["identifier"] = f"FILE_{camel_to_snake(filename_no_ext)}".upper()
                    invariant_file["title"] = camel_to_snake(f"{filename_no_ext}").replace("_", " ")
                    invariant_file["fileFormat_identifier"] = "FORMAT_TXT"
                    support_files += [invariant_file]

                    other_support_files = data_dict.get("SUPPORT_FILES", [])
                    for each_support_file in other_support_files:
                        # each_support_file = each_support_file.replace("build/", "")
                        if "decls-DynComp" in each_support_file:
                            filename = f"{os.path.basename(os.path.normpath(each_support_file))}"
                            # copying decls-DynComp to its final destination
                            new_each_support_file = os.path.join(os.getcwd(), f"ingestpack/Randoop_Daikon/{filename}")
                            if not os.path.exists(new_each_support_file):
                                shutil.copyfile(each_support_file, new_each_support_file)
                            
                            dyn_comp_file = FILE_DATA.copy()
                            dyn_comp_file["filename"] = filename
                            dyn_comp_file["description"] = "DynComp analysis file"
                            date_str = datetime.datetime.now().strftime("%Y-%m-%dT%H:%M:%S.%f%z")
                            dyn_comp_file["generatedAtTime"] = f"{date_str}"
                            dyn_comp_file["identifier"] = f"FILE_{camel_to_snake(filename)}".upper()
                            dyn_comp_file["title"] = camel_to_snake(f"{filename}").replace("_", " ")
                            dyn_comp_file["fileFormat_identifier"] = "FORMAT_DynComp"
                            support_files += [dyn_comp_file]

                    daikon_output_data["classesCount"] = data_dict.get("CLASSES_COUNT", "MISSING")
                    daikon_output_data["invariantCount"] = data_dict.get("INVARIANT_COUNT", "0")
                    daikon_output_data["testsCount"] = data_dict.get("INVARIANT_COUNT", "0")

                    invar_support_file = [f for f in support_files if f["fileFormat_identifier"] == "FORMAT_TXT"]
                    invar_support_file = invar_support_file[0] if invar_support_file else None
                    
                    for each_invar in invars:
                        each_daikon_output_data = daikon_output_data.copy()
                        each_daikon_output_data["likelyInvariants_identifier"] = each_invar["identifier"]
                        output_data += [each_daikon_output_data]

                elif each_key == "DaikonPluginQualification":
                    tool_invoke["toolParamaters"] = "[]"
                    # Comment this line out per Davesh's comment
                    # if tool_instance["toolInstallationConfiguration"] == "MISSING":
                    #     tool_instance["toolInstallationConfiguration"] = data_dict.get("INSTALLATION", "MISSING")
                    tool_invoke["description"] = data_dict.get("SUMMARY", "MISSING")

    
    result_dict["tool"] = tool_instance
    result_dict["invoke"] = tool_invoke
    result_dict["data"] = daikon_detect_data
    result_dict["output"] = output_data
    result_dict["model"] = invars
    result_dict["files"] = support_files
    
    return True, result_dict


def write_tool_daikon_detect_csv(base_dir, tool_daikon_detect):
    ingest_Auto_DaikonInvariantDetection = os.path.join(base_dir, "ingestpack/Randoop_Daikon/ingest_Auto_DaikonInvariantDetection.csv")
    if not os.path.exists(ingest_Auto_DaikonInvariantDetection):
        print(f"WARNING: Could not find {ingest_Auto_DaikonInvariantDetection} file")
    else:
        with open(ingest_Auto_DaikonInvariantDetection, 'a+', newline='') as csvfile:
            fieldnames = [key for key in DAIKON_INVARIANT_DETECTION]
            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            writer.writerow(tool_daikon_detect)
            print(f"Finished updating {ingest_Auto_DaikonInvariantDetection} file")


def write_tool_daikon_output_csv(base_dir, tool_daikon_output):
    ingest_Auto_DaikonInvariantOutput = os.path.join(base_dir, "ingestpack/Randoop_Daikon/ingest_Auto_DaikonInvariantOutput.csv")
    if not os.path.exists(ingest_Auto_DaikonInvariantOutput):
        print(f"WARNING: Could not find {ingest_Auto_DaikonInvariantOutput} file")
    else:
        with open(ingest_Auto_DaikonInvariantOutput, 'a+', newline='') as csvfile:
            fieldnames = [key for key in DAIKON_INVARIANT_OUTPUT]
            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            for each_out in tool_daikon_output:
                writer.writerow(each_out)
            print(f"Finished updating {ingest_Auto_DaikonInvariantOutput} file")
            

def write_tool_daikon_inv_model(base_dir, tool_daikon_model):
    ingest_Auto_LikelyInvariantModel = os.path.join(base_dir, "ingestpack/Randoop_Daikon/ingest_Auto_LikelyInvariantModel.csv")
    if not os.path.exists(ingest_Auto_LikelyInvariantModel):
        print(f"WARNING: Could not find {ingest_Auto_LikelyInvariantModel} file")
    else:
        with open(ingest_Auto_LikelyInvariantModel, 'a+', newline='') as csvfile:
            fieldnames = [key for key in LIKELY_INVARIANT_MODEL]
            writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
            for each_out in tool_daikon_model:
                writer.writerow(each_out)
            print(f"Finished updating {ingest_Auto_LikelyInvariantModel} file")


@cwd_aware
def write_daikon_evidence_csv(result_dict):
    write_file_csv(os.getcwd(), result_dict["files"], insert_manuals=False)
    write_tool_csv(os.getcwd(), result_dict["tool"])
    write_tool_invoke_csv(os.getcwd(), result_dict["invoke"])
    write_tool_daikon_detect_csv(os.getcwd(), result_dict["data"])
    write_tool_daikon_output_csv(os.getcwd(), result_dict["output"])
    write_tool_daikon_inv_model(os.getcwd(), result_dict["model"])

def main():
    success, result_dict = read_randoop_file(RANDOOP_EVIDENCE)
    if not success:
        return
    
    
    write_randoop_evidence_csv(result_dict, truncate_files=True)

    success, result_dict = read_daikon_file(DAIKON_EVIDENCE)
    if not success:
        return
    
    write_daikon_evidence_csv(result_dict)


if __name__ == "__main__":
    main()

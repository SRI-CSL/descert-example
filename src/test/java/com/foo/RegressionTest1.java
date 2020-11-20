package com.foo;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass10 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass15 = fooManager14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        fooManager14.initialize();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        fooManager7.initialize();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
        fooManager10.initialize();
        fooManager10.initialize();
        java.lang.Class<?> wildcardClass14 = fooManager10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass11 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass8 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass7 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        java.lang.Class<?> wildcardClass11 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass13 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
        fooManager12.initialize();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        fooManager4.initialize();
        java.lang.Class<?> wildcardClass6 = fooManager4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        fooManager11.initialize();
        java.lang.Class<?> wildcardClass14 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager16 = new com.foo.FooManager(foo0);
        fooManager16.initialize();
        fooManager16.initialize();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        fooManager8.initialize();
        fooManager8.initialize();
        fooManager8.initialize();
        java.lang.Class<?> wildcardClass12 = fooManager8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass9 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        java.lang.Class<?> wildcardClass11 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        java.lang.Class<?> wildcardClass12 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
        fooManager10.initialize();
        fooManager10.initialize();
        fooManager10.initialize();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = fooManager13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        java.lang.Class<?> wildcardClass11 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass13 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        fooManager7.initialize();
        java.lang.Class<?> wildcardClass9 = fooManager7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        fooManager8.initialize();
        java.lang.Class<?> wildcardClass10 = fooManager8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass11 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
        java.lang.Class<?> wildcardClass12 = fooManager10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
        fooManager10.initialize();
        java.lang.Class<?> wildcardClass13 = fooManager10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass18 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass9 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        fooManager11.initialize();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass16 = fooManager15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        java.lang.Class<?> wildcardClass13 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
        fooManager13.initialize();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass10 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass11 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        fooManager14.initialize();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
        java.lang.Class<?> wildcardClass13 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        fooManager6.initialize();
        fooManager6.initialize();
        fooManager6.initialize();
        fooManager6.initialize();
        fooManager6.initialize();
        java.lang.Class<?> wildcardClass12 = fooManager6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        fooManager7.initialize();
        fooManager7.initialize();
        fooManager7.initialize();
        fooManager7.initialize();
        fooManager7.initialize();
        java.lang.Class<?> wildcardClass13 = fooManager7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        fooManager15.initialize();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        fooManager7.initialize();
        fooManager7.initialize();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
        fooManager13.initialize();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
        fooManager13.initialize();
        java.lang.Class<?> wildcardClass16 = fooManager13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
        fooManager12.initialize();
        java.lang.Class<?> wildcardClass15 = fooManager12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager17 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager16 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager17 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass18 = fooManager17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass9 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        java.lang.Class<?> wildcardClass12 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        fooManager6.initialize();
        fooManager6.initialize();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
        fooManager12.initialize();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager16 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass17 = fooManager16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass19 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass9 = fooManager8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass11 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass16 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        fooManager11.initialize();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass9 = fooManager8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass4 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager16 = new com.foo.FooManager(foo0);
        fooManager16.initialize();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass11 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        fooManager8.initialize();
        fooManager8.initialize();
        java.lang.Class<?> wildcardClass11 = fooManager8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        fooManager5.initialize();
        java.lang.Class<?> wildcardClass7 = fooManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        java.lang.Class<?> wildcardClass13 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass15 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
        fooManager12.initialize();
        fooManager12.initialize();
        fooManager12.initialize();
        fooManager12.initialize();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass10 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass15 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass8 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass10 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass11 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass13 = fooManager12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        fooManager11.initialize();
        fooManager11.initialize();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        fooManager7.initialize();
        fooManager7.initialize();
        fooManager7.initialize();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
        fooManager10.initialize();
        fooManager10.initialize();
        fooManager10.initialize();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        fooManager2.initialize();
        fooManager2.initialize();
        fooManager2.initialize();
        fooManager2.initialize();
        fooManager2.initialize();
        fooManager2.initialize();
        fooManager2.initialize();
        fooManager2.initialize();
        fooManager2.initialize();
        fooManager2.initialize();
        java.lang.Class<?> wildcardClass13 = fooManager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass11 = fooManager10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass13 = fooManager12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = fooManager13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        fooManager8.initialize();
        fooManager8.initialize();
        fooManager8.initialize();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
        fooManager12.initialize();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager16 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass17 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass10 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        fooManager7.initialize();
        java.lang.Class<?> wildcardClass9 = fooManager7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        java.lang.Class<?> wildcardClass13 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        fooManager5.initialize();
        java.lang.Class<?> wildcardClass7 = fooManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        fooManager11.initialize();
        fooManager11.initialize();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        fooManager11.initialize();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass17 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass9 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass15 = fooManager14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass10 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        fooManager8.initialize();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
        fooManager10.initialize();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = fooManager13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass7 = fooManager6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = fooManager13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        fooManager14.initialize();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        fooManager8.initialize();
        java.lang.Class<?> wildcardClass10 = fooManager8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass13 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        fooManager14.initialize();
        fooManager14.initialize();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass9 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        fooManager15.initialize();
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        java.lang.Class<?> wildcardClass13 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass8 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        fooManager14.initialize();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
        java.lang.Class<?> wildcardClass15 = fooManager13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        fooManager8.initialize();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass9 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass13 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
        fooManager10.initialize();
        fooManager10.initialize();
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass11 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass8 = fooManager7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        fooManager2.initialize();
        fooManager2.initialize();
        fooManager2.initialize();
        java.lang.Class<?> wildcardClass6 = fooManager2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass15 = fooManager14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        fooManager3.initialize();
        fooManager3.initialize();
        fooManager3.initialize();
        fooManager3.initialize();
        java.lang.Class<?> wildcardClass8 = fooManager3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        fooManager7.initialize();
        java.lang.Class<?> wildcardClass9 = fooManager7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass6 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        java.lang.Class<?> wildcardClass11 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        fooManager4.initialize();
        fooManager4.initialize();
        fooManager4.initialize();
        fooManager4.initialize();
        fooManager4.initialize();
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        fooManager11.initialize();
        java.lang.Class<?> wildcardClass14 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        java.lang.Class<?> wildcardClass12 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
        fooManager12.initialize();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager16 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass13 = fooManager12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass11 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass11 = fooManager10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        fooManager6.initialize();
        fooManager6.initialize();
        fooManager6.initialize();
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        fooManager1.initialize();
        fooManager1.initialize();
        fooManager1.initialize();
        fooManager1.initialize();
        java.lang.Class<?> wildcardClass6 = fooManager1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
        java.lang.Class<?> wildcardClass14 = fooManager12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass16 = fooManager15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
        fooManager11.initialize();
        fooManager11.initialize();
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass17 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass10 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass6 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass16 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager17 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass11 = fooManager10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        fooManager14.initialize();
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        fooManager14.initialize();
        fooManager14.initialize();
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass10 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass13 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        fooManager4.initialize();
        fooManager4.initialize();
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
        fooManager12.initialize();
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        fooManager8.initialize();
        fooManager8.initialize();
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
        java.lang.Class<?> wildcardClass12 = fooManager10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass13 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass7 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass6 = fooManager5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass14 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        fooManager5.initialize();
        fooManager5.initialize();
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        fooManager6.initialize();
        fooManager6.initialize();
        fooManager6.initialize();
        fooManager6.initialize();
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        fooManager7.initialize();
        fooManager7.initialize();
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass9 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        fooManager10.initialize();
        fooManager10.initialize();
        fooManager10.initialize();
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        fooManager12.initialize();
        fooManager12.initialize();
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        fooManager3.initialize();
        fooManager3.initialize();
        fooManager3.initialize();
        fooManager3.initialize();
        fooManager3.initialize();
        fooManager3.initialize();
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager16 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass17 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass13 = fooManager12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        fooManager8.initialize();
        fooManager8.initialize();
        fooManager8.initialize();
        fooManager8.initialize();
        fooManager8.initialize();
        fooManager8.initialize();
        fooManager8.initialize();
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        fooManager7.initialize();
        fooManager7.initialize();
        fooManager7.initialize();
        fooManager7.initialize();
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass15 = fooManager14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = fooManager11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        fooManager15.initialize();
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
        fooManager9.initialize();
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass11 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        fooManager6.initialize();
        fooManager6.initialize();
        java.lang.Class<?> wildcardClass9 = fooManager6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager14 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass14 = fooManager13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass16 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        foo0.mutate();
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        java.lang.Class<?> wildcardClass8 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        fooManager9.initialize();
        fooManager9.initialize();
        java.lang.Class<?> wildcardClass12 = fooManager9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        java.lang.Class<?> wildcardClass12 = foo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        com.foo.Foo foo0 = new com.foo.Foo();
        com.foo.FooManager fooManager1 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager9 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        fooManager11.initialize();
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager6 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager15 = new com.foo.FooManager(foo0);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
        foo0.mutate();
        com.foo.FooManager fooManager12 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager13 = new com.foo.FooManager(foo0);
        fooManager13.initialize();
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        com.foo.Foo foo0 = new com.foo.Foo();
        foo0.mutate();
        com.foo.FooManager fooManager2 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager3 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager4 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager5 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager7 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager8 = new com.foo.FooManager(foo0);
        foo0.mutate();
        com.foo.FooManager fooManager10 = new com.foo.FooManager(foo0);
        com.foo.FooManager fooManager11 = new com.foo.FooManager(foo0);
        foo0.mutate();
        foo0.mutate();
    }
}

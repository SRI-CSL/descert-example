package com.foo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FooStuffTest {
  @Test public void testEquality() {
    Foo x = new Foo();
    Foo y = x;

    assertEquals(x, y);
  }
}

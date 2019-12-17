package com.sidd.javademo.application.designpattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LazySingletonDoubleLockCheckTest {
    @Test
    public void testSingleton() {

        LazySingletonDoubleLockCheck instance1 = LazySingletonDoubleLockCheck.getInstance();
        LazySingletonDoubleLockCheck instance2 = LazySingletonDoubleLockCheck.getInstance();
        System.out.println("checking singleton objects equality");
        assertEquals(true, instance1==instance2);
        //fail("Not yet implemented");
    }
}

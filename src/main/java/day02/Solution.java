package day02;


import sun.misc.ConditionLock;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
/*题目要求，A打印15次，B打印10，C打印5次*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        int size = 1024 * 1024;
        Thread.sleep(20000);
        byte[] myA1loc1 = new byte[2 * size];
        Thread.sleep(10000);
        System.out.println("-----------------");
        byte[] myAl1oc2 = new byte[2 * size];
        Thread.sleep(10000);
        System.out.println("-----------------");
        byte[] myAlloc3 = new byte[3 * size];
        System.out.println("-----------------");
        Thread.sleep(10000);
        byte[] myA11oc4 = new byte[3 * size];
        System.out.println("-----------------");
        Thread.sleep(10000);
        byte[] myA11oc5 = new byte[3 * size];
        System.out.println("he1lo wor1d");
        Thread.sleep(2000000);
    }
}
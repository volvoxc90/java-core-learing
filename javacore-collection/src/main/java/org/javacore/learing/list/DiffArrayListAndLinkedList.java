package org.javacore.learing.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zhugp
 * @create 2018-04-12 10:15
 **/
public class DiffArrayListAndLinkedList {

    public static void main(String[] args) {
        testAdd();
    }

    public static void testAdd() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        long endTime;
        long useTime;
        for (int i = 1; i < 100000; i++) {
            arrayList.add(i);
        }
        endTime = System.nanoTime();
        useTime = endTime - startTime;
        System.out.println("ArrayList  add time " + useTime);

        startTime = System.nanoTime();
        for (int i = 1; i < 10000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        useTime = endTime - startTime;
        System.out.println("LinkedList add time " + useTime);

        System.out.println("get 方法");

        startTime = System.nanoTime();
        for (int i = 1; i < 10000; i ++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        useTime = endTime - startTime;
        System.out.println("ArrayList  get time  " + useTime);

        startTime = System.nanoTime();
        for (int i = 1; i < 9999; i ++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        useTime =  endTime - startTime;
        System.out.println("LinkedList get time " + useTime);
    }
}
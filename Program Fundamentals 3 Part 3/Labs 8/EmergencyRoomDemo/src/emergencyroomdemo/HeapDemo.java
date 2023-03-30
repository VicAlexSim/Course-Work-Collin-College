/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emergencyroomdemo;

/**
 *
 * @author Owner
 */
package edu.collin.cocs2436.heap;
import java.util.Random;

/**
 * This is a demo program to test the heap implementation
 *
 * @author (put your name here, and your class number/section/semester)
 *
 */
public class HeapDemo {

    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>();
        for (int i = 0; i < 20; i++) {
            int num = new Random().nextInt(100);
            System.out.print(num + " ");
            heap.add(num);
        }
        System.out.println();
        for (Integer num = heap.remove(); num != null; num = heap.remove()) {
            System.out.print(num + " ");
        }
    }
}

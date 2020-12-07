package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");
        queue.add("Element 4");
        queue.add("Element 5");
        queue.add("Element 6");
        queue.add("Element 7");
        queue.add("Element 8");
        queue.add("Element 9");
        queue.add("Element 10");
        System.out.println(queue);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");
        queue.add("Element 4");
        queue.add("Element 5");
        System.out.println(queue);
    }
}

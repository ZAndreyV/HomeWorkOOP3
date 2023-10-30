package org.example;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        for (int item : linkedList) {
            System.out.println(item);
        }
    }
}
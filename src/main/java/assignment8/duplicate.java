package assignment8;

import java.util.LinkedList;

public class duplicate {

    public static void main(String args[]) {
        int i = -1;
        LinkedList linkedList = new LinkedList();
        LinkedList newLinkedList = new LinkedList();
        linkedList.add(0, 1);
        linkedList.add(1, 3);
        linkedList.add(2, 4);
        System.out.println(linkedList);
        while (!linkedList.isEmpty()) {
            newLinkedList.add(i + 1, linkedList.getFirst());
            newLinkedList.add(i + 1, linkedList.getFirst());
            linkedList.removeFirst();
        }
        System.out.println(reverse(newLinkedList));


    }

    public static LinkedList reverse(LinkedList linkedList) {
        LinkedList newList = new LinkedList();
        int i =0;
        while(!linkedList.isEmpty()){
            newList.add(i,linkedList.getLast());
            linkedList.removeLast();
            i = i+1;

        }
        return newList;
    }
}


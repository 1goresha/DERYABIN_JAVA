package com.company;

public class LinkedIntegerList implements IntegerList {
    private Node top;
    private Node tail;
    private int count;

    public LinkedIntegerList() {
        this.top = null;
        this.count = -1;
    }

    private Node getNodeByIndex(int index) {
        Node node = top;
        for (int i = 0; i < count; i++) {
            if (i == index) {
                return node;
            }
            node = node.getNext();
        }

        return node;
    }

    @Override
    public void addToBegin(int value) {
        Node node = new Node(value);

        if (top == null) {
            tail = node;
        }
        node.setNext(top);
        count++;
        top = node;
    }

    @Override
    public void add(int value) {
        Node node = new Node(value);

        if (top == null) {
            top = node;
            tail = top;
        } else {
//            Node current = top;
//            while(current.getNext() != null){
//                current = current.getNext();
//            }
//            current.setNext(top);
            tail.setNext(node);
            count++;
            tail = node;
        }
    }

    @Override
    public int get(int index) {
        return getNodeByIndex(index).getValue();
    }

    @Override
    public void insert(int value, int index) {
        if (index == 0) {
            addToBegin(value);
        } else if (index == count) {
            add(value);
        }
        Node node = new Node(value);
        count++;
        Node previousNode = getNodeByIndex(index - 1);
        Node current = getNodeByIndex(index);
        previousNode.setNext(node);
        node.setNext(current);
    }

    @Override
    public void reverse() {
        for (int i = count; i > 0; i--) {
            Node current = getNodeByIndex(i);
//            if (i == 0){
//                top = current;
//                tail = getNodeByIndex(count);
//                tail.setNext(null);
//                return;
//            }
            Node previousNode = getNodeByIndex(i - 1);
            current.setNext(previousNode);
        }
        Node temp = top;
        top = tail;
        tail = temp;
        tail.setNext(null);
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public void sort() {
        Node tempNode;
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                Node nodeI = getNodeByIndex(i);
                Node nodeJ = getNodeByIndex(j);
                Node nextNodeJ = getNodeByIndex(j+1);
                if (nodeI.getValue() > nodeJ.getValue()){
                    tempNode = nodeI.getNext();
                    nodeJ.setNext(nodeI);
                    nodeI.setNext(tempNode);
                }
            }
        }
    }


}

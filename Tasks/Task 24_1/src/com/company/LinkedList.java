package com.company;

public class LinkedList<T> {           //я хочу чтобы в параметр T можно было закинуть свой тип Node, нам же никто не запрещает сделать это, вот только как это сделать?
    private T top;                     //с классами обертками примитивных типов все понятно вроде, а что с собственными типами? тоже нужны обертки?
    private T tail;
    private int count;

    public LinkedList() {
        this.top = null;
        this.count = -1;
    }

    private T getNodeByIndex(int index) {
        T node = top;
        for (int i = 0; i <= count; i++) {
            if (index == i) {
                return node;
            }
            node = node.getNext();    //почему не видит методы ???
        }
        return node;
    }

//    @Override
    public void addToBegin(int value) {
        T node = (T)new Node(value);  //сначала создаем объект с типом Node(почему если написать тип Object, то пишет ошибку) , а затем уже преобразовываем в (T) ???
        if (top == null) {
            tail = node;
        }
        node.setNext(top);            //почему не видит методы ???
        count++;
        top = node;
    }

//    @Override
    public void add(int value) {
        T node = (T)new Node(value);
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

//    @Override
    public int get(int index) {
        return getNodeByIndex(index).getValue();
    }

//    @Override
    public void insert(int value, int index) {
        if (index == 0) {
            addToBegin(value);
        } else if (index == count) {
            add(value);
        }
        T node = (T)new Node(value);
        count++;
        T previousNode = getNodeByIndex(index - 1);
        T current = getNodeByIndex(index);
        previousNode.setNext(node);
        node.setNext(current);
    }

//    @Override
    public void reverse() {
        for (int i = count; i > 0; i--) {
            T current = getNodeByIndex(i);
//            if (i == 0){
//                top = current;
//                tail = getNodeByIndex(count);
//                tail.setNext(null);
//                return;
//            }
            T previousNode = getNodeByIndex(i - 1);
            current.setNext(previousNode);
        }
        T temp = top;
        top = tail;
        tail = temp;
        tail.setNext(null);
    }

//    @Override
    public int getCount() {
        return this.count;
    }

//    @Override
//    public void sort() {
//        Node tempNode;
//        for (int i = 0; i < count; i++) {
//            for (int j = i + 1; j < count; j++) {
//                Node nodeI = getNodeByIndex(i);
//                Node nodeJ = getNodeByIndex(j);
//                Node nextNodeJ = getNodeByIndex(j+1);
//                if (nodeI.getValue() > nodeJ.getValue()){
//                    tempNode = nodeI.getNext();
//                    nodeJ.setNext(nodeI);
//                    nodeI.setNext(tempNode);
//                }
//            }
//        }
//    }

//    @Override
    public boolean contains(int element) {
        for (int i=0;i<=count;i++){
            if (getNodeByIndex(i).getValue()== element){
                return true;
            }
        }
        return false;
    }

//    @Override
    public int indexOf(int element) {
        for (int i =0;i<=count;i++){
            if (getNodeByIndex(i).getValue() == element){
                return i;
            }
        }
        return -1;
    }

//    @Override
    public void remove(int index) {
        if (index == 0){
            top = top.getNext();
            count--;
            return;
        }else if (index == count){
            getNodeByIndex(index-1).setNext(null);
            tail = getNodeByIndex(index - 1);
            count--;
            return;
        }
        T current = getNodeByIndex(index);
        T previousNode = getNodeByIndex(index -1);
        T nextNode = getNodeByIndex(index + 1);
        previousNode.setNext(nextNode);
        current.setNext(null);
        count--;
    }


}

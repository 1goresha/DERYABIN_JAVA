package com.company;

public class Main {

	public static void main(String[] args) {
//	Node a = new Node(1);
//	Node b = new Node(2);
//	Node c = new Node(3);
//	Node d = new Node(4);
//
//	a.setNext(b);
//	b.setNext(c);
//	c.setNext(d);
//
//	Node currentCount = a;
//
//	while (currentCount != null){
//		System.out.println(currentCount.getValue());
//		currentCount = currentCount.getNext();
//	}

//	LinkedList list = new LinkedList();
//	list.addToBegin(0);
//	list.addToBegin(1);
//	list.addToBegin(2);
//	list.addToBegin(3);
//	list.addToBegin(4);
//
//	list.add(5);
//	list.add(6);
//	list.add(7);
//	list.add(8);
//	list.add(9);
//
//		System.out.println(list.get(5));
//	list.insert(999,6);
//
//		list.reverse();
////		list.sort();
//		System.out.println(list.contains(4));
//		System.out.println(list.indexOf(4));
//		list.remove(0);
//		list.remove(9);
//		int i = 0;

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.addToBegin(3);
		list.insert(4,1);
		list.reverse();
		list.remove(1);

		int i = 0;
	}
}

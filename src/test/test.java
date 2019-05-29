package test;


import myLinkedList.LinkedList;


public class test {


    public static void main(String[] args) {



        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);;
        list.add(99);
        list.add(8);
        list.addLast(99);
        list.addLast(93);
        list.addLast(25);
        list.addLast(99);
        System.out.println(list.getSize());
        System.out.println(list.toString());
        System.out.println(list.containa(9));
        list.remove(99);
        System.out.println(list.getSize());
        System.out.println(list.toString());
    }
}

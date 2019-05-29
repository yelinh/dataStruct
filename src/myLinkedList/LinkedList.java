package myLinkedList;

import Interface.myLinkList;

public class LinkedList<E> implements myLinkList<E> {
    private Integer size = 0;
    private Node Dummyhead = new Node();

    //内部节点内
    private class Node{
        E e;
        Node next;

        //内部结点无参构造方法
        Node(){
            e = null;
            next=null;
        }

        //内部节点有参构造方法
        Node(E e,Node next){
            this.e = e;
            this.next = next;
        }

        Node(E e) {
            this.e = e;
            this.next = null;

        }
        @Override
        public String toString(){
            return e.toString();
        }
    }

    @Override
    public Integer getSize(){
        return this.size;
    }


    public void addWithIndex(Integer index,E e) {

        if(index<0||index>size) {
            throw new IllegalArgumentException("索引超出范围");
        }
            Node prev = Dummyhead;
            for(int i=0;i<index;i++){
                prev = prev.next;
            }
            Node node = new Node(e);
            node.next = prev.next;
            prev.next=node;
            size++;


        }

    @Override
    public void add(E e){

        addWithIndex(0,e);
    }

    public void addLast(E e){
        addWithIndex(size,e);
    }
    @Override
    public boolean isEmpty(){
        return size==0;
    }

    public boolean containa(E e){
        Node cur = Dummyhead.next;
        while(cur!=null){
         if(cur.e ==e){
             return true;
         }
         cur =cur.next;
        }
        return false;
    }
    @Override
    public void remove(E e) {


        //z在删除节点时先把该节点的上一个节点的指针指向该节点的下一个节点；
        Node prev = Dummyhead;
        Node cur = Dummyhead.next;
        while(cur!=null){
            if(e.equals(cur.e)){
                Node delNode = cur;
              cur = cur.next;
              prev.next = cur;
              delNode = null;
                size --;
                continue;
            }

            prev=prev.next;
            cur =cur.next;

        }


    }

    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        Node cur = Dummyhead.next;
        while (cur!=null){
            stringBuffer.append(cur+"->");

            cur = cur.next;

        }
        stringBuffer.append("null");
        return stringBuffer.toString();
    }




    }



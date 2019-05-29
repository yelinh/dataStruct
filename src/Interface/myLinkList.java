package Interface;

//自定义链表接口
public interface myLinkList<E> {
    public void add(E e);
    public boolean isEmpty();
    public void remove(E e);
    public Integer getSize();
}

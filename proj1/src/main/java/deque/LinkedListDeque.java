package deque;

/**
 * @author zyz
 * @version 1.0
 * @date 2023/5/19 17:19
 */
public class LinkedListDeque<T> implements Deque<T>{

    /**
     * 哨兵节点
     */
    private IntNode sentinel;

    private int size;

    public LinkedListDeque() {
        this.sentinel = new IntNode(null, null,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        this.size = 0;
    }

    public LinkedListDeque(int size) {

        this.sentinel = new IntNode(63, null, null);

        this.size = 1;
    }

    public class IntNode<T> {

        public T item;

        public IntNode next;

        public IntNode prev;

        public IntNode(T item, IntNode prev, IntNode next) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }

    /**
     * sentinel.next永远指向第一个节点
     * @return 第一个节点
     */
    private IntNode getFirstNode() {
        return sentinel.next;
    }

    /**
     * sentinel.prev永远指向最后一个节点
     * @return 最后一个节点
     */
    private IntNode getLastNode() {
        return sentinel.prev;
    }

    @Override
    public  void addFirst(T item) {
        IntNode nextNode = sentinel.next;

        IntNode current = new IntNode(item, sentinel, nextNode);

        sentinel.next = current;

        nextNode.prev = current;

        size += 1;

    }

    @Override
    public void addLast(T item) {

        IntNode prevNode = sentinel.prev;

        IntNode current = new IntNode(item,prevNode,sentinel);

        prevNode.next = current;

        sentinel.prev = current;

        size += 1;

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printDeque() {
        IntNode p = getFirstNode();
        while (p != sentinel) {
            System.out.print(p.item + " ");
            p = p.next;
        }
        System.out.println();
    }

    @Override
    public T removeFirst() {

        IntNode firstNode = getFirstNode();

        if (firstNode == sentinel) {
            return null;
        }

        IntNode newFirstNode = firstNode.next;

        T item = (T) firstNode.item;

        sentinel.next = newFirstNode;

        newFirstNode.prev = sentinel;

        size -= 1;

        return item;
    }

    @Override
    public T removeLast() {

        IntNode lastNode = getLastNode();

        if (lastNode == sentinel) {
            return null;
        }

        IntNode newLastNode = lastNode.prev;

        T item = (T) lastNode.item;

        sentinel.prev = newLastNode;

        newLastNode.next = sentinel;

        size -= 1;

        return item;
    }

    @Override
    public T get(int index) {

        IntNode p = getFirstNode();

        while ( p != sentinel) {
            if (index == 0) {
                return (T) p.item;
            }
            index -= 1;
            p = p.next;

        }

        return null;
    }

    public T getRecursive(int index){
        return (T) getRecursiveHelper(index, sentinel.next);
    }

    /**
     * 递归获取
     * @param index     索引
     * @param p  当前节点
     * @return  元素
     */
    private T getRecursiveHelper(int index, IntNode p) {

        if (p == sentinel) {
            return null;
        }

        if (index == 0){
            return (T) p.item;
        }

        return (T) getRecursiveHelper(index-1,p.next);

    }

}

/**
 * @author zyz
 * @version 1.0
 * @date 2023/5/16 09:51
 */
public class SLList {

    /**
     * 哨兵节点
     */
    private IntNode sentinel;

    private int size;

    public class IntNode {

        public int item;

        public IntNode next;

        public IntNode(int i, IntNode n) {
            this.item = i;
            this.next = n;
        }
    }

    public SLList() {
        sentinel = new IntNode(63, null);
        size = 0;
    }

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public int size() {

        return size;

    }

    public void addLast(int x) {
        size = size + 1;

        IntNode p = sentinel;

        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    public static void main(String[] args) {
        SLList slList = new SLList();
        slList.addFirst(10);
        slList.addFirst(5);
        System.out.println(slList.getFirst());
    }

}

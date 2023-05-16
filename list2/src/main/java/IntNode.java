/**
 * 第五课代码
 * @author zyz
 * @version 1.0
 * @date 2023/5/16 09:46
 */
public class IntNode {

    public int item;

    public IntNode next;

    public IntNode(int i, IntNode n) {
        this.item = i;
        this.next = n;
    }

    /**
     * 使用递归获取长度
     * @return 长度
     */
    public int size() {

        if (next == null) {
            return 1;
        }

        return 1 + next.size();
    }

    public int iterativeSize() {
        IntNode p = this;
        int totalSize = 0;
        while ( p != null){
            totalSize += 1;
            p = p.next;
        }
        return totalSize;
    }

    public int get(int i) {
        if (i == 0){
            return item;
        }

        return next.get(i-1);
    }


}

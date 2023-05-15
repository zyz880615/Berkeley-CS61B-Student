/**
 * 第四课课上程序
 * @author zyz
 * @version 1.0
 * @date 2023/5/12 15:59
 */
public class IntList {

    private int first;

    private IntList rest;

    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    /**
     * 使用递归获取长度
     * @return 长度
     */
    public int size() {

        if (rest == null) {
            return 1;
        }

        return 1 + rest.size();
    }

    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while ( p != null){
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    public int get(int i) {
        if (i == 0){
            return first;
        }

        return rest.get(i-1);
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L = new IntList(10,L);
        L = new IntList(15,L);
        System.out.println(L.get(1));
    }
}

package deque;

/**
 * @author zyz
 * @version 1.0
 * @date 2023/5/19 17:08
 */
public interface Deque<T> {

    /**
     * 将类型为T的项添加到deque的前面。您可以假设item永远不为空。
     * @param item 元素
     */
     void addFirst(T item);

    /**
     * 将类型为T的项添加到deque的后面。您可以假设item永远不为空。
     * @param item 元素
     * @param <T> 任意引用类型
     */
    void addLast(T item);

    /**
     * 如果deque为空，则返回true，否则返回false。
     * @return true
     */
    boolean isEmpty();

    /**
     * 返回deque中的项数。
     * @return 数量
     */
    int size();

    /**
     * 从第一个到最后一个打印deque中的项，用空格分隔。打印完所有项目后，打印一个新行。
     */
    void printDeque();

    /**
     * 删除并返回deque前面的项。如果不存在这样的项，则返回null。
     * @param <T> 任意引用类型
     * @return 删除项
     */
    T removeFirst();

    /**
     * 删除并返回deque后面的项。如果不存在这样的项，则返回null。
     * @param <T> 任意引用类型
     * @return 删除项
     */
    T removeLast();

    /**
     * 获取给定索引处的项，其中0是前面，1是下一个项，依此类推。如果不存在这样的项，则返回null。不能更改deque！
     * @param index 索引
     * @return 索引项
     */
    T get(int index);

}

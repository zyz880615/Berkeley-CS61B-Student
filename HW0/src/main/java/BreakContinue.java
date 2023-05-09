/**
 * 练习4,编写一个函数windowPosSum(int[] a, int n)，
 * 它将每个元素a[i]替换为a[i]到a[i + n]的总和，但仅当a[i]为正值时。
 * 如果由于到达数组结尾而没有足够的值，则只计算我们拥有的值。
 * @author zyz
 * @version 1.0
 * @date 2023/5/9 13:39
 */
public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            if (a[i] < 0) {
                //负数不执行
                continue;
            }
            for (int j = i; j <= i + n; j++){
                if (j >= a.length){
                    //数组越界不执行
                    break;
                }
                sum = sum + a[j];
            }
            a[i] = sum;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}

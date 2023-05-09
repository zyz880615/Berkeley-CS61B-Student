/**
 * 练习2，返回数组最大值
 * @author zyz
 * @version 1.0
 * @date 2023/5/9 11:30
 */
public class ClassNameHere {

    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int max = 0;
        int i = 0;
        while ( i < m.length ){
            if (m[i] > max){
                max = m[i];
            }
            i++;
        }
        return max;
    }

    public static int forMax(int[] m){
        int max = 0;
        for (int i = 0; i < m.length ; i++) {
            if (m[i] > max){
                max = m[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
        System.out.println(forMax(numbers));
    }

}

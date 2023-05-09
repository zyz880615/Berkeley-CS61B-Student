/**
 * 将练习1a的程序封装为方法
 * @author zyz
 * @version 1.0
 * @date 2023/5/9 11:19
 */
public class Exercise1b {

    public static void drawTriangle(int N) {
        for (int i=1; i<=N;i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }

}

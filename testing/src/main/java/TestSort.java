import org.junit.Assert;
import org.junit.Test;

/**
 * 测试选择排序类
 * @author zyz
 * @version 1.0
 * @date 2023/5/17 09:27
 */
public class TestSort {

    @Test
    /** Tests the sort method of the Sort class. */
    public  void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        Assert.assertArrayEquals(expected, input);
    }

    @Test
    public  void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;

        int actual = Sort.findSmallest(input, 0);
        org.junit.Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 2;

        int actual2 = Sort.findSmallest(input2, 2);
        org.junit.Assert.assertEquals(expected2, actual2);
    }

    @Test
    public  void testSwap(){
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};
        Sort.swap(input, a, b);
        Assert.assertArrayEquals(expected, input);
    }

}

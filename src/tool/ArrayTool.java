package tool;

/**
 * 数组工具类
 * @author fengqian
 * @since <pre>2018/10/23</pre>
 */
public class ArrayTool {

    /**
     * 交换数组中的元素
     *
     * @param A 数组
     * @param s 元素1的索引
     * @param d 元素2的索引
     */
    public static void exchange(int[] A, int s, int d) {
        int cache = A[s];
        A[s] = A[d];
        A[d] = cache;
    }

    /**
     * 打印数组
     * @param A
     */
    public static void print(int[] A) {
        for (int i = 0; i < A.length; i++) {
            System.out.printf(A[i] + " ");
        }
        System.out.println();
    }
}

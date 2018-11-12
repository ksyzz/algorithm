import tool.ArrayTool;

/**
 * 快速排序
 * @author fengqian
 * @since <pre>2018/11/08</pre>
 */
public class QuickSort {

    /**
     * 快速排序
     *
     * @param A
     * @param start 开始位置的索引
     * @param end 结束位置的索引
     */
    public static void quickSort(int[] A, int start, int end) {
        if (start < end) {
            int q = partition(A, start, end);
            quickSort(A, start, q-1);
            quickSort(A, q+1, end);
        }
    }


    /**
     * 将数组A划分为两部分
     *
     * @param A
     * @param start 开始位置的索引
     * @param end 结束位置的索引
     * @return q，有A[start to q-1] <= A[q] <= A[q+1 to end]
     */
    private static int partition(int[] A, int start, int end) {
        int standard = A[end];
        int q = start;
        for (int i = start; i <= end - 1; i++) {
            if (A[i] <= standard) {
                ArrayTool.exchange(A, i, q++);
            }
        }
        ArrayTool.exchange(A, q, end);
        return q;
    }

}

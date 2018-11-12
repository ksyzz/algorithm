import tool.ArrayTool;

/**
 * 最大堆
 * @author fengqian
 * @since <pre>2018/10/23</pre>
 */
public class MaxHeap {

    /**
     * 堆排序
     * O(nlgn)
     *
     * @param A
     */
    public static void heapSort(int[] A) {
        buildMaxHeap(A);
        for (int i = A.length - 1; i >= 1; i--) {
            maxHeapify(A, 0, i + 1);
            ArrayTool.exchange(A, 0, i);
        }
    }


    /**
     * 构建最大堆
     * O(n)
     *
     * @param A
     */
    public static void buildMaxHeap(int[] A) {
        for (int i = A.length / 2; i >= 0; i--) {
            maxHeapify(A, i, A.length);
        }
    }


    /**
     * 将当前节点转换为转换为最大堆(要求该节点的左右子树均为最大堆)
     * O(lgn)
     *
     * @param A 堆
     * @param parent 当前节点
     * @param size 处理的数据的索引上限（不包含）
     */
    public static void maxHeapify(int[] A, int parent, int size) {
        // 最大堆的左叶子索引为根索引的2倍,考虑索引从0开始，这里做出一些改变
        int left = parent * 2 + 1;
        int right = parent * 2 + 2;
        int largest = parent;
        if (left <size && A[left] > A[parent]) {
            largest = left;
        }
        if (right < size && A[right] > A[largest]) {
            largest = right;
        }
        if (largest != parent) {
            ArrayTool.exchange(A, largest, parent);
            maxHeapify(A, largest, size);
        }
    }

}

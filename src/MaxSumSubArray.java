/**
 * 最大子数组
 * @author fengqian
 * @since <pre>2018/09/25</pre>
 */
public class MaxSumSubArray {

    /**
     * 获取最大子数组，采用分治算法，分别找出左侧最大子数组，右侧最大子数组和过中点的最大子数组，然后进行比较
     * O(nlgn)
     *
     * @param A
     * @param low
     * @param high
     * @return {startIndex, endIndex, sum}
     */
    public static int[] maxSumSubArray(int[] A, int low, int high){
        if (low == high) {
            return new int[]{low, high, A[low]};
        }
        int mid = (low + high) / 2;
        int[] leftSumSubArray = maxSumSubArray(A, low, mid);
        int[] rightSumSubArray = maxSumSubArray(A, mid + 1, high);
        int[] midSumSubArray = maxMidSumSubArray(A, low, high, mid);
        if (leftSumSubArray[2] >= rightSumSubArray[2] && leftSumSubArray[2] >= midSumSubArray[2]) {
            return leftSumSubArray;
        } else if (rightSumSubArray[2] >= leftSumSubArray[2] && rightSumSubArray[2] >= midSumSubArray[2]) {
            return rightSumSubArray;
        } else {
            return midSumSubArray;
        }
    }

    /**
     * 获取数组的过中点的最大子数组
     * @return
     */
    public static int[] maxMidSumSubArray(int[] A, int low, int high, int mid){
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        int leftIndex = mid;
        for (int i = mid; i >= low ; i--) {
            sum += A[i];
            if (sum > leftSum) {
                leftSum = sum;
                leftIndex = i;
            }
        }
        sum = 0;
        int rightIndex = mid;
        int rightSum = Integer.MIN_VALUE;
        for (int i = mid; i <= high ; i++) {
            sum += A[i];
            if (sum > rightSum) {
                rightSum = sum;
                rightIndex = i;
            }
        }
        return new int[]{leftIndex, rightIndex, leftSum + rightSum - A[mid]};
    }
}

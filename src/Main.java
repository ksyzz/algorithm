import tool.ArrayTool;

import java.util.ArrayList;
import java.util.List;

/**
 * 主函数
 * @author fengqian
 * @since <pre>2018/11/08</pre>
 */
public class Main {
    public static void main(String[] args) {
        int[] A = new int[]{2, 8, 7, 1, 3, 5, 6, 4};
        QuickSort.quickSort(A, 0, A.length-1);
        ArrayTool.print(A);

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        new ArrayList<>().addAll(integers.subList(0,0));
    }
}

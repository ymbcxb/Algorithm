import java.util.Random;

/**
 * @author ymbcxb
 * @title
 * @Package PACKAGE_NAME
 * @date 2019/7/24 0:23
 * @排序助手
 */
public class SortTestHelper {

    //生成随机数[left,right)
    public static Integer[] generateRandomArray(int n, int left, int right) {
        assert left <= right;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Random().nextInt(right) % (right - left) + left;
        }
        return arr;
    }

    //验证数据是否排序的
    public static void isSorted(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                System.out.println(false);
                return ;
            }
        }
        printArray(arr);
    }

    //打印数据
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

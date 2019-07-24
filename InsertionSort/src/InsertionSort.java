/**
 * @author ymbcxb
 * @title
 * @Package PACKAGE_NAME
 * @date 2019/7/24 1:02
 */
public class InsertionSort {

    private static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    /**
     * 减少交换次数，提示性能
     * @param arr
     */
    private static void sort2(Comparable[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Comparable temp = arr[i];
            Integer index = i;
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    arr[j] = arr[j - 1];
                    index = j - 1;
                }
                arr[index] = temp;
            }

        }
    }

    private static void swap(Object[] object, int i, int j) {
        Object temp = object[i];
        object[i] = object[j];
        object[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.generateRandomArray(20, 10, 100);
        sort2(arr);
        SortTestHelper.isSorted(arr);
    }
}

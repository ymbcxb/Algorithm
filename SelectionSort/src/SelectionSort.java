/**
 * @author ymbcxb
 * @title
 * @Package PACKAGE_NAME
 * @date 2019/7/24 0:10
 * @Description:选择排序
 */
public class SelectionSort {

    private static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }

    private static void swap(Object[] object, int i, int j) {
        Object temp = object[i];
        object[i] = object[j];
        object[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.generateRandomArray(10, 0, 100);
        sort(arr);
        SortTestHelper.isSorted(arr);
    }
}

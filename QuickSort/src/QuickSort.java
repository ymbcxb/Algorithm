/**
 * @author ymbcxb
 * @title
 * @Package PACKAGE_NAME
 * @date 2019/7/26 0:45
 */
public class QuickSort {

    private static int partition(Comparable[] arr, int left, int right) {
        Comparable o = arr[left];
        int index = left;
        for (int i = left + 1; i <= right; i++) {
            if (arr[i].compareTo(o) < 0) {
                swap(arr, i, index + 1);
                index++;
            }
        }
        swap(arr, left, index);
        return index;
    }

    private static void swap(Object[] object, int i, int j) {
        Object temp = object[i];
        object[i] = object[j];
        object[j] = temp;
    }

    private static void sort(Comparable[] arr, int left, int right) {
        if (left >= right)
            return;
        int q = partition(arr, left, right);
        sort(arr, left, q - 1);
        sort(arr, q + 1, right);
    }

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.generateRandomArray(100, 10, 10000);
        sort(arr, 0, arr.length - 1);
        SortTestHelper.isSorted(arr);
    }
}
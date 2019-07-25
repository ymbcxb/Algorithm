import java.util.Arrays;

/**
 * @author ymbcxb
 * @title
 * @Package PACKAGE_NAME
 * @date 2019/7/25 0:08
 */
public class MergeSort {

    //将arr[l,mid]和[mid+1,r]进行归并
    public static void merge(Comparable[] arr, int l, int mid, int r) {

        //设置一个临时数组
        Comparable[] temp = new Comparable[r - l + 1];
        int i = l;
        int j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                temp[k - l] = arr[j];
                j++;
            } else if (j > r) {
                temp[k - l] = arr[i];
                i++;
            } else if (arr[i].compareTo(arr[j]) < 0) {
                temp[k - l] = arr[i];
                i++;
            } else {
                temp[k - l] = arr[j];
                j++;
            }
        }
        for (int k = 0; k < r - l + 1; k++) {
            arr[l + k] = temp[k];
        }
    }

    //将arr[l,r]进行排序
    public static void sort(Comparable[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.generateRandomArray(1000, 1, 100000);
        sort(arr, 0, arr.length - 1);
        SortTestHelper.isSorted(arr);
    }
}

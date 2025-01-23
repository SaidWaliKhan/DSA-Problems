package sortingalgorithms;

public class MergeSort {

    public void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int i, j, k;
        
        i = low;
        j = mid + 1;
        k = 0;

        int[] merged = new int[high - low + 1];

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

       
        while (i <= mid) {
            merged[k++] = arr[i++];
        }

        while (j <= high) {
            merged[k++] = arr[j++];
        }

        for (int x = 0; x < merged.length; x++) {
            arr[low + x] = merged[x];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        MergeSort sorter = new MergeSort();
        sorter.mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

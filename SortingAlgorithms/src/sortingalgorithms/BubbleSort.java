package sortingalgorithms;

public class BubbleSort {

    public void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return; 
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = {4, 6, 3, 2, 8, 5, 7};

          bs.bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

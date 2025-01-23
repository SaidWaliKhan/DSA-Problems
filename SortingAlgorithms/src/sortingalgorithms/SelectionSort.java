package sortingalgorithms;

public class SelectionSort
{
    public void selecSort(int [] arr) {
        int n = arr.length; 

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j; 
                }
            }
            int temp = arr[i]; 
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 9, 6};
        
        SelectionSort sorter = new SelectionSort();
        sorter.selecSort(arr);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class BinarySearch {
    
    // Iterative method for binary search
    public int binSearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; 
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int key = 8;

        int result = bs.binSearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}







//         public class BinarySearch{
//        public int binSearch(int[] arr, int key, int low, int high) {
//        if (low <= high) {
//            int mid = low + (high - low) / 2;
//
//            if (arr[mid] == key) {
//                return mid;
//            } else if (arr[mid] > key) {
//                
//                return binSearch(arr, key, low, mid - 1);
//            } else {
//                return binSearch(arr, key, mid + 1, high);
//            }
//        }
//        return -1; 
//    }
//    
//    
//    public static void main(String[] args) {
//        BinarySearch bs = new BinarySearch();
//        
//        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
//        int key = 3;

//        int low = 0;
//        int high = arr.length - 1;
//
//        int result = bs.binSearch(arr, key, low, high);
//
//        if (result != -1) {
//            System.out.println("Element found at index: " + result);
//        } else {
//            System.out.println("Element not found");
//        }
//    }
//}

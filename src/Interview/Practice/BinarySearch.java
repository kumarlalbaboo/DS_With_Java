package Interview.Practice;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid =low + (high-low)/2;
            //int mid = (low+high)/2;

            if(arr[mid]==key){
                return mid;
            } else if(arr[mid] < key){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return -1;
    }

//    public static int binarySearch(int[] arr, int low, int high, int key){
//        if (low > high){
//            return -1;
//        }
//
//        int mid = low + (high-low)/2;
//
//        if (arr[mid] == key){
//            return mid;
//        } else if (arr[mid] < key) {
//            return binarySearch(arr, mid+1, high, key);
//        }
//        else {
//            return binarySearch(arr, low, mid-1, key);
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {20,25,30,40,50};
        int key = 40;

        int result = binarySearch(arr,key);

//        int low = 0;
//        int high = arr.length-1;
//        int result = binarySearch(arr, low, high, key);

        if (result == -1){
            System.out.println("Element not found");
        } else  {
            System.out.println("Element found at index: "+result);
        }

    }
}

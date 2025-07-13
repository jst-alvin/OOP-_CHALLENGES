public class Main {

    // Binary search
    public static void search(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                System.out.print("Found!");
                break;
            }
            else if (arr[mid] < key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        System.out.print("Not Found!");


    }

    // Bubble sort -- we'll pass in an unsorted array and sort it before using binary search

    public static void BubbleSort(int[] a){

    }

    public static void main(String[] args){
        int[] array = {1,2,4,6,7,8,19,23,45,65,68,78,899};
        search(14, array);


    }
}

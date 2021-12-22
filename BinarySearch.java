import java.util.*;

public class BinarySearch {

    static ArrayList<Integer> subArr(ArrayList<Integer> arr, int start, int end) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = start; i <= end; i ++) {
            res.add(arr.get(i));
        }
        return res;

    }
    
    // O(log(n))
    static int binarySearch(ArrayList<Integer> arr, int target) {
        Collections.sort(arr);
        System.out.println("Sorted array: " +arr);
        int low = 0;
        int high = arr.size()-1;

        while(low <= high) {
            int middle = (low+high)/2;
            if (arr.get(middle) == target) {
                return middle;
            } else if (arr.get(middle) > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(22, 3, 54, 23, 65, 23, 9, 5));

        // ArrayList<Integer> arr1 = subArr(arr, 2, 5);
        // System.out.println(arr1); 

        int res = binarySearch(arr, 5);
        System.out.println("Target's index: " +res);

    }
}

import java.util.*;

public class BubleSort {
    
    //O(n^2)
    static void bubleSort(ArrayList<Integer> arr) {
        for (int i = 0; i <= arr.size(); i++) {
            for(int j = 0; j < arr.size() - 1; j ++) {
                if (arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }

    //Still O(n^2) but 50% reduction in time taken
    static void bubleSortLessTime(ArrayList<Integer> arr) {
        for(int i = 0; i <= arr.size(); i++) {
            for(int j = 0; j < arr.size() - 1 - i; j++ ) {
                if (arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(10, 9, 8, 7, 6, 5));
        System.out.println(arr);
        bubleSort(arr);
        System.out.println("new: " +arr);
    }    
}

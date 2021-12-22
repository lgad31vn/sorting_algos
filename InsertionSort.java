public class InsertionSort {

    // O(n^2)
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int position = i;

            while(position > 0 && current < arr[position - 1]) {
                arr[position] = arr[position - 1];
                position = position - 1;
            }
            arr[position] = current;
        }
    }

     public static void main(String[] args) {
        int[] arr = {8, 7, 5, 2, 4, 99, 1, 3, 43, 266, 544, 234, 654};
        insertionSort(arr);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }


     }
}

public class selectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallNumber;
        }
    }

    public static void main(String a[]) {
        int[] arr = {10,5,1,3,45,17,28,37};
           
        selectionSort(arr);
        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}

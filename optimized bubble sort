
import java.util.Arrays;

class Main {
  static void bubbleSortAlgorithm(int arr[]) {
  
    int len = arr.length-1;
    
    for (int i = 0; i < len; i++){
    
        boolean isSwap = false;
        
      for (int j = 0; j < len - i; j++){
      
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          isSwap = true;
        }
      }
      if (!isSwap)
        break;
    }
}

  public static void main(String args[]) {
    int[] data = { 15, 5, 8, 1, 2 ,18,25,33};
    
    bubbleSortAlgorithm(data);
    
    System.out.println("The array performing the Bubble Sort Algorithm is:");
    System.out.println(Arrays.toString(data));
  }
}

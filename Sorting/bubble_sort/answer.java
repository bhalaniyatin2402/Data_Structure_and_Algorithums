public class Bubble {
  // print array
  public static void printArray(int arr[]) {
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  // bubble sort
  public static void main(String args[]) {;
    int arr[] = {8, 7, 1, 3, 2};

    for(int i=0; i<arr.length-1; i++) {
      for(int j=0; j<arr.length-1-i; j++) {
        if(arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    printArray(arr);
  }
}

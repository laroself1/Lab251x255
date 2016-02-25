import java.util.Arrays;

public class MyInit {


    private static int[] arr = new int[10];
  public static void  printArray()
  {   for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
  System.out.print(arr[i]);}}}

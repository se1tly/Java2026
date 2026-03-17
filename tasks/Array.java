import java.util.Arrays;

public class Array {
    public static void main() {
      int numbers1[] = {1,3,5,4,2};
      int numbers2[] = {4,5,6,8,7};

      System.out.println(Arrays.toString(numbers1)); //[1,3,5,4,2]
      Arrays.sort(numbers1); //[1,2,3,4,5]
      int ind = Arrays.binarySearch(numbers1, 4);
      System.out.printf("%d\n", ind); //3
      System.out.printf("%b\n", Arrays.equals(numbers1, numbers2)); //false
      int comp = Arrays.compare(numbers1,numbers2);
      System.out.printf("%d", comp); //-1
    }
}

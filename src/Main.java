import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Arrays.setAll(arr, (index)-> index*index);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        System.out.println();

        int array1[] = new int[10];
        Arrays.setAll(array1, (index)-> index*index);
        System.out.println(Arrays.toString(array1));

        long array2[] = new long[10];
        Arrays.setAll(array2, (index)-> index*index);
        System.out.println(Arrays.toString(array2));

        double array3[] = new double[10];
        Arrays.setAll(array3, (index)-> index*index);
        System.out.println(Arrays.toString(array3));
    }
}
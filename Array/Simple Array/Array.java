import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // declaring Array numbers
        int[] numbers = new int[3];
        // Print the length of the array
        System.out.println(numbers.length);
        // assigning values to Array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("hello");
    }
}
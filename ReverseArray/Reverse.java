package ReverseArray;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 12, 25, 36, 36, 18, 27 };
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Reversed Array");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }

}

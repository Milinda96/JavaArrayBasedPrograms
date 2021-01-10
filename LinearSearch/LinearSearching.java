package LinearSearch;

public class LinearSearching {
    public static int findIndex(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 78, 56, 89, 66, 99 };
        System.out.println(findIndex(a, 56));

    }
}
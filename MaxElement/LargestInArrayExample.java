package MaxElement;

public class LargestInArrayExample {
    public static void main(String[] args) {
        int a[] = {12, 33, 34, 22, 54};
        
        System.out.println(findLargest(a, 5));
    }

    public static int findLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 1];
    }
}
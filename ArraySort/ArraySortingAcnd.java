package ArraySort;

public class ArraySortingAcnd {
    public static void main(String[] args) {
        int[] a = new int[] {12, 23, 5, 8, 99};
        int temp = 0;
        System.out.println("Original Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp; 
                }
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

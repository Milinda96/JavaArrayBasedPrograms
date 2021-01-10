package ArraySort;

public class ArraySortDesed {
    public static void main(String[] args) {
        int[] a = new int[] {12, 1, 5, 3, 6, 9, 8, 5};
        int temp;

        System.out.println("Original Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("New Array");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

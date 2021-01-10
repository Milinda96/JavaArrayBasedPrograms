package MinElement;

public class FindMin {
    public static void main(String[] args) {
        int a[] = { 17, 23, 44, 4 };
        System.out.println(findMinValue(a, 4));
    }

    public static int findMinValue(int[] a, int num) {
        int temp;
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }
}

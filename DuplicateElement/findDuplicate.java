package DuplicateElement;

public class findDuplicate {
    public static void main(String[] args) {
        int[] a = new int[] { 12, 12, 25, 36, 36, 25, 6 };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println(a[j]);
                }
            }
        }
    }
}

package RemoveDuplicateArray;

import java.util.Arrays;

public class RemoveDuplicate {
    public static int removeDuplicateNum(int[] a, int num) {
        if (num == 0 || num == 1) {
            return num;
        }
        int[] temp = new int[num];
        int j = 0;
        for (int i = 0; i < num - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[num - 1];
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int a[] = { 12, 23, 23, 56, 56, 78 };
        Arrays.sort(a);
        int length = a.length;
        length = removeDuplicateNum(a, 6);
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
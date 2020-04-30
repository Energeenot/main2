package test;

public class mi_and_ma_in_array {
    public static void main(String[] args) {
        int maximum = 0;
        int minimum = 1;
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < array.length; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
            if (minimum > array[i]) {
                minimum = array[i];
            }
        }
        int n = array.length;
        int c;

        public static void shift( int array, n, c){
            reverse(array, c = n - minimum);
            reverse(array + c, minimum);
            reverse(array, n);
        }
        int[] a=array
}
    private static void reverse(int a, int n) {
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int m=a[i];
            a[i] = a[j];
            a[i] = m;
            ++i;
            --j;
        }
    }
    }

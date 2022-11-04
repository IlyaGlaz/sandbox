public class QuickSort {

    public static void main(String[] args) {

    }

    static void sort(int[] array, int from, int to) {
        if (from < to) {
            int pivot = partition(array, from, to);
            sort(array, from, pivot - 1);
            sort(array, pivot + 1, to);
        }
    }

    static int partition(int[] array, int from, int to) {
        return (int) (Math.random() * array.length);
    }
}

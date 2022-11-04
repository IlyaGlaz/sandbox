public class SimpleBinarySearch {

    public static void main(String[] args) {
        int[] ints = new int[1000];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }

        System.out.println(binarySearch(ints, 10));
    }

    public static int binarySearch(int[] array, int guess) {
        int min = array[0];
        int max = array[array.length - 1];
        while (min <= max) {
            int mid = (max + min) / 2;
            if (guess == array[mid]) {
                return mid;
            } else if (guess < array[mid]) {
                max = mid - 1;
            } else if (guess > array[mid]) {
                min = mid + 1;
            }
        }
        return -1;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(2, 3, 22, 45, 1202, 1, 50, 21, 105, 4, 23, 2342));
        System.out.println(selectionSort(integers));
    }

    public static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int index = 0;
        for (Integer integer : arr) {
            if (integer < smallest) {
                smallest = integer;
                index = arr.indexOf(integer);
            }
        }
        return index;
    }

    public static List<Integer> selectionSort(List<Integer> arr) {
        ArrayList<Integer> newArr = new ArrayList<>();
        while (!arr.isEmpty()) {
            int smallest = findSmallest(arr);
            newArr.add(arr.remove(smallest));
        }
        return newArr;
    }
}

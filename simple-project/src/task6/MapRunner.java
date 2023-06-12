package task6;

public class MapRunner {

    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(secondMin(array));
//        System.out.println(secondMin(null));
        System.out.println(secondMin(new int[]{1, 1, 1, 1, 1, 1}));
    }

    static int secondMin(int[] num) {
        if (num == null) {
            throw new RuntimeException("Array is null");
        }
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                secondMin = min;
                min = num[i];
            } else if (num[i] < secondMin && num[i] > min) {
                secondMin = num[i];
            }
        }

//        int secondMin = Integer.MAX_VALUE;
//        for (int i = 0; i < num.length; i++) {
//            if(num[i] < secondMin && num[i] > min)  {
//                 secondMin = num[i];
//            }
//        }
        return min;
    }
}

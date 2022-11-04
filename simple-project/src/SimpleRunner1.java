import java.util.ArrayList;
import java.util.List;

public class SimpleRunner1 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(166);
        nums.add(1);
        nums.add(23444444);
        nums.add(65);
        nums.add(66);
        nums.add(67);
        System.out.println(max(nums));
    }

    public static int sum(List<Integer> num) {
        if (num.isEmpty()) {
            return 0;
        } else {
            return num.remove(num.size() - 1) + sum(num);
        }
    }

    public static int count(List<Integer> num) {
        if (num.isEmpty()) {
            return 0;
        } else {
            num.remove(num.size() - 1);
            return 1 + count(num);
        }
    }

    public static int max(List<Integer> num) {
        if (num.isEmpty()) {
            return 0;
        } else {
            int left = num.remove(num.size() - 1);
            int right = max(num);
            return left > right ? left
                    : right;
        }
    }
}

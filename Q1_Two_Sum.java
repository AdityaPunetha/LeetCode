import java.util.HashMap;
import java.util.Map;

public class Q1_Two_Sum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = i;
                result[1] = map.get(nums[i]);
            } else {
                map.put(target - nums[i], i);
            }
        }
        System.out.println(result[0] + "    " + result[1]);
    }
}

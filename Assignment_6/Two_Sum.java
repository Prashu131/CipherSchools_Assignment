package Assignment_6;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class Two_Sum {
    static int[] findTwoSum(int[] nums, int target) {
            Map<Integer, Integer> numMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (numMap.containsKey(complement)) {
                    return new int[] { numMap.get(complement), i };
                } else {
                    numMap.put(nums[i], i);
                }
            }
            return new int[] {};
        }

    public static void main(String[] args) {
        int arr[] ={-9,3,2,4,10,7};
        int target = 5;
        int[] ans = findTwoSum(arr,target);
        for(int i:ans)
            System.out.print(i+ " ");

    }
}

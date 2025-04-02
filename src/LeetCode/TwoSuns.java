package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSuns {

    public static int[] solution1(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
    public static int[] solution2(int[] nums, int target){
        HashMap<Integer, Integer> complement = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            Integer exist = complement.get(nums[i]);
            if(exist != null){
                return new int[]{exist, i};
            }
            complement.put(target - nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] teste1 = {2, 3, 4, 1};

        System.out.println("Solução 1");
        System.out.println(Arrays.toString(solution2(teste1, 6)));

        System.out.println("Solução 2");
        System.out.println(Arrays.toString(solution1(teste1, 6)));
    }
}

import java.util.*;
class Solution{
    public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<List<Integer>>();
            Arrays.sort(nums);
            for(int first = 0;first<nums.length-2;first++){
                //exclude duplicates
                if(first>0 && nums[first]==nums[first-1]){
                    continue;
                }
                int second = first+1;
                int third = nums.length-1;
                while(second<third){
                    int sum = nums[first]+nums[second]+nums[third];
                    if(sum==0){
                        ans.add(Arrays.asList(nums[first],nums[second],nums[third]));

                        while(second<third && nums[second]==nums[second+1]){
                            second++;
                        }
                        while(second<third && nums[third]==nums[third-1]){
                            third--;
                        }
                        second++;
                        third--;
                    }
                    else if(sum<0){
                        second++;
                    }
                    else third--;
                } 
            }
            return ans;
    }
}
public class Three_sum_fullCode {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = Sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            nums[i] = Sc.nextInt();
        }
        Solution solution = new Solution();
        System.out.println(solution.threeSum(nums));
    }
}

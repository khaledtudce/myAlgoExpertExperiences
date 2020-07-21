package leetcodeContest;

public class SuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
    	int[] result = new int[nums.length];
    	int p = 0;
    	int q = n;
    	for(int i=0; i<n; i++){
            result[p] = nums[i];
            result[++p] = nums[q];
            p++;
            q++;
        }
        
        return result;
    }
}

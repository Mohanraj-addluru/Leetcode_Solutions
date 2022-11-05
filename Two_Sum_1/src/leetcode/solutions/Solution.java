package leetcode.solutions;

public class Solution 
{
	    public int[] twoSum(int[] nums, int target)
	    {
	        int[] index = new int[2];
	        int index_found = 0;
	        for (int i=0;i<nums.length;i++)
	        {
	            for (int j=i; j<nums.length; j++)
	            {


	                
	                if(i!=j && (nums[i] + nums[j] == target))
	                {
	                    index[0] = i;
	                    index[1] = j;
	                    index_found = 1;
	                    break; 
	                }
	            }
	            if (index_found == 1)
	            {
	                break;
	            }
	        }
	        return index;
	    }
	}

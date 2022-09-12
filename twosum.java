//学号：202002652
//姓名：杜焜

import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int key;
        int[] result=new int[2];
        Hashtable hash=new Hashtable();
        for(int i=0;i<nums.length;i++)
        {
            hash.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++)
        {
            key=target-nums[j];
            if(hash.containsKey(key)&&(int)hash.get(key)!=j)
            {
                result[0]=(int)hash.get(key);
                result[1]=j;
            }
        }
        return result;
    }
}

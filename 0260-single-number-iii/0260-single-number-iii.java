class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int xor=0;
        for(int i=0;i<n;i++){
             xor^=nums[i];
        }
        int d=0;
        while (((xor>>>d)&1)==0) {
            d++;
        }
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(((nums[i]>>d)&1)==1) a^=nums[i];
            else b^=nums[i];
        }
        int[] ans=new int[2];
        ans[0]=a;
        ans[1]=b;
        return ans;
    }
}
package LeetCode_Solutions;

import java.util.Arrays;
/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1. */

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1=m-1;
        int r2=n-1;
        int w=m+n-1;

        while(w>=0){
            if(r1>=0 && r2>=0 && nums2[r2] >= nums1[r1]){
                nums1[w]=nums2[r2];
                r2--;

            } else if(r1>=0){
                nums1[w]=nums1[r1--];
            }else{
                nums1[w]=nums2[r2--];
            }
            w--;
        }
        System.out.println(Arrays.toString(nums1));




















      /*  for(int i=m+n-1; i>=0;i--){
            if(u>k){
                nums1[i]=nums2[u];
                k--;
                u--;
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1)); */

       /* for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){

                if(nums2[j]<= nums1[i]){
                    nums1[i]=nums2[j];
                    nums1[i]=nums1[i+1];
                }
            }
        }
        System.out.println(Arrays.toString(nums1)); */
    }
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        int m=3;
        int n=3;

        Solution88 obj = new Solution88();
        obj.merge(num1,m,num2,n);



    }
}

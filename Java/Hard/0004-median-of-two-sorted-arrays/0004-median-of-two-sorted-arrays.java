import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int arr[] = new int [n];
        

        for(int i=0;i<nums1.length;i++)
        {
            arr[i]=nums1[i];
        }

        for(int i = nums1.length; i < nums1.length + nums2.length; i++)
        {
            arr[i] = nums2[i - nums1.length];
        }
        Arrays.sort(arr);


        int mid = arr.length/2;

        if(arr.length%2 == 0)
        {
            double x = (arr[mid] +arr[mid-1])/2.0;
            return x;
        }
        else
        {
            return arr[mid];
        }

    }
}
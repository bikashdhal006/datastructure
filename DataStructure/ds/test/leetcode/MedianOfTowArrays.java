/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 */
public class MedianOfTowArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median =0.0;
		
		int i =0;
		int j =0;
		int k=0;
		int[] nums3 =new int[nums1.length+nums2.length];
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j]) {
				nums3[k] = nums1[i];
				i++;
				k++;
			}else {
				nums3[k] = nums2[j];
				j++;
				k++;
			}
		}
		while(i<nums1.length)
		{
			nums3[k] = nums1[i];
			i++;
			k++;
		}
		while(j<nums2.length)
		{
			nums3[k] = nums2[j];
			j++;
			k++;
		}
		
		if(nums3.length%2==1)
			median = nums3[nums3.length/2];
		else
		median  = (nums3[nums3.length/2]+nums3[nums3.length/2-1])/2.0;
		return median;
    }
	
	
	public static void main(String[] args) {
		
		MedianOfTowArrays a = new MedianOfTowArrays();
		int[] nums1 = new int[]{1,3};
		int[]  nums2 = new int[]{2,4};
		
		a.findMedianSortedArrays(nums1, nums2);
	}

}

// 34. Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class Problem_34 {
    public static int firstOcc(int[] nums, int target){
        int low=0;
        int high= nums.length-1;
        int first=-1;

        while(low<= high){
            int mid= (low+high)/2;

            if(nums[mid]==target){
                first= mid;
                high= mid-1;
            }else if(nums[mid]<target){
                low= mid+1;
            }else{
                high= mid-1;
            }
        }
        return first;
    }

        public static int lastOcc(int[] nums, int target){
        int low=0;
        int high= nums.length-1;
        int last=-1;

        while(low<= high){
            int mid= (low+high)/2;

            if(nums[mid]==target){
                last= mid;
                low= mid+1;
            }else if(nums[mid]<target){
                low= mid+1;
            }else{
                high= mid-1;
            }
        }
        return last;
    }
    public static int[] searchRange(int[] nums, int target) {
    
    int first= firstOcc(nums, target);
    if(first==-1){
        return new int[]{-1,-1};
    }

    int last =lastOcc(nums ,target);
        return new int []{first, last};
    }

    public static void main(String[] args) {
        int nums[]={2,3,4,6,4,6,6,6,67};
        System.out.println(Arrays.toString(searchRange(nums, 6))); 
    }
}

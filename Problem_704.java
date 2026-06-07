// 704. Binary Search

public class Problem_704 {
        public static int search(int[] nums, int target) {
        
        int low=0, high= nums.length-1;

            while(low<= high){
                int mid= (low+ high)/2;

                if(nums[mid]== target) return mid;
                else if(target> nums[mid]){
                    low= mid+1;
                }else{
                    high= mid-1;
                }
            }
            return -1;
    }

    public static void main(String[] args) {
        int nums[]= {3,4,6,7,9,12,16,17};
        System.out.println(search(nums, 12));
    }
}

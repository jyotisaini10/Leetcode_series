
import java.util.Arrays;

// 2149. Rearrange Array Elements by Sign

public class Problem_2149{
    public static int[] rearrangeArray(int[] nums) {
         int n= nums.length;
        int ans []= new int [n];
       

        int posIdx=0; 
        int negIdx=1;

        for(int i=0; i<n; i++){
            if(nums[i]<0){
                ans[negIdx]= nums[i];
                negIdx+=2; 
            }else{

                ans[posIdx]= nums[i];
                posIdx+=2;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]= {2,-4,-1,5,7,8,-9,-6};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
package leetcode;

public class RemoveDuplicatesFromSortedArray {
	
	 public  int removeDuplicates(int[] nums) {
		    int j = 0;
		    int counter =0;
		    while (j < nums.length - 1) {
		        for (int i = j + 1; i < nums.length; i++) {
		            if (nums[j] == nums[i]) {
		                nums[i] = 999999;
			                                }
			                                               }
			            j++;
			                            }
		    int k =0;
		    while(k<nums.length) {
		        for(int i=0;i<nums.length;i++ ) {
		            int tmp;
		            if(nums[i]==999999 && i<nums.length - 1 ) {
		                tmp=nums[i+1];
		                nums[i+1]=999999;
		                nums[i]=tmp;
			        		                                    }
				                                }
					 k++;
				                    }
		    for(int h=0;h<nums.length;h++ ) {
						
		        if(nums[h]==999999) {
		            counter++;
		                            }
		                                    }
			return nums.length-counter;
	        
	    }
	 	
}

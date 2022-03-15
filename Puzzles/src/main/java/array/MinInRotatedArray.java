package array;

public class MinInRotatedArray {
	public static void main(String[] args) {
		System.out.println(findMin(new int[] {4,5,6,7,0,1,2}));
	}
	 public static int findMin(int[] nums) {
	        int start = 0, end = nums.length - 1, mid = 0;
	        System.out.println("length->"+(end+1));
	        while (start <= end) {
	            mid = (start + end) / 2;
	            if(nums[mid] < nums[mid - 1]) {
	                return nums[mid];
	            }
	            else if (nums[mid] > nums[end]) {
	                start = mid + 1;                
	            }
	            else {
	                end = mid - 1;
	            }
	        }
	        return nums[mid];
	    }

}

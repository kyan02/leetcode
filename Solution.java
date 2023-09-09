import java.util.*;

public class Solution{
	
	public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the size of the array");
	 int size = sc.nextInt();
	 int[] nums = new int[size];
	 System.out.println("Enter the value of array");
	 for (int i=0; i<size ; i++ ) {
	 	nums[i]= sc.nextInt();
	 	}

	 	int result[] = doubleDuplicateArray(nums);
	 	System.out.println("Here is Result:");
	 	for (int i=0; i<size ; i++ ) {
	 	 System.out.println(result[i]);
	 	}
	}

	 public static int[] doubleDuplicateArray(int[] arr){

	 	int [] result = new int[arr.length*2];
	 	for(int i=0;i<arr.length;i++){
	 		result[i] = arr[i];
	 		result[i + arr.length] = arr[i];
	 	}
	 	return result;
	 }

}
import java.util.*;

class containsDuplicate{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array: ");
		int size = sc.nextInt();
		int[] nums = new int[size];
		System.out.println("Enter Values Of Array: ");
		for(int i=0;i<size;i++){
			nums[i] = sc.nextInt();
		}

			System.out.println(checkDuplicates(nums));
	}

	public static Boolean checkDuplicates(int[] nums){
	HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num))
                return true;
        }
        return false;	
	}
}
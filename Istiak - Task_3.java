import java.util.HashMap;
import java.util.Map;

public class Task_3 {
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numInd = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int sub = target - nums[i];
			if (numInd.containsKey(sub)) {
				return new int[]{numInd.get(sub), i};
			}
			numInd.put(nums[i], i);
		}

		return null;
	}
  public static void main(String[] args) {
	  int[] list = {10, 25, 45, 51, 51, 73, 91, 103, 135, 139};
	  int target = 190;

	  int[] result = twoSum(list, target);

	  if (result != null) {
		  System.out.println("Two Indices: [" + result[0] + ", " + result[1] + "]");
		  System.out.println("Numbers are: [" + list[result[0]] + " + " + list[result[1]] + "] = " + target);
	  }
	  else {
		  System.out.println("No such Number in the List,");
	  }
  }
}

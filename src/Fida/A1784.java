package Fida;

import java.util.*;

public class A1784 {
	public static void main(String[] args) {
		int[] test = {1,2,3,2};
		System.out.println(new A1784().sumOfUnique(test));
	}
	public int sumOfUnique(int[] nums) {
		Map<Integer, Integer> countOfInts = new HashMap<>();

		for(int indivNum : nums){
			if(!countOfInts.containsKey(indivNum)){
				countOfInts.put(indivNum, 1);
			} else {
				int newCount = countOfInts.get(indivNum) + 1;
				countOfInts.put(indivNum, newCount);
			}
		}

		int totalSum = 0;
		for(int indivKey : countOfInts.keySet()){
			if(countOfInts.get(indivKey) == 1){
				totalSum += indivKey;
			}
		}

		return totalSum;
//		List<Integer> uniqueNums = new ArrayList<>();
//
//		for(int i = 0; i < nums.length; i++){
//			boolean numDNE = true;
//			for(int j = 0; j < nums.length; j++){
//				if(nums[j] == nums[i] && i != j){
//					numDNE = false;
//					break;
//				}
//			}
//			if(numDNE){
//				uniqueNums.add(nums[i]);
//			}
//		}
//
//		if(uniqueNums.size() == 0){
//			return 0;
//		}
//
//		int totalSum = 0;
//		for(int indivNum : uniqueNums){
//			totalSum += indivNum;
//		}
//
//		return totalSum;
	}
}

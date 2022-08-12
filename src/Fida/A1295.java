package Fida;

public class A1295 {
	public int findNumbers(int[] nums) {
		int counter = 0;
		for(int indivNum : nums){
			if(Integer.toString(indivNum).length() % 2 == 0){
				counter++;
			}
		}

		return counter;
	}
}

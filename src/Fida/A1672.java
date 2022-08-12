package Fida;

public class A1672 {
	public int maximumWealth(int[][] accounts) {
		int richestWealth = Integer.MIN_VALUE;

		for(int[] indivCustomer : accounts){
			int currentWealth = 0;
			for(int indivAcc : indivCustomer){
				currentWealth += indivAcc;
			}
			if(currentWealth > richestWealth){
				richestWealth = currentWealth;
			}
		}
		return richestWealth;
	}
}

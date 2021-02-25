package array_list;

import java.util.ArrayList;

public class Find_Largest_number {

	public static void main(String[] args) {
		ArrayList <Integer>num = new ArrayList<>();
		num.add(12);
		num.add(33);
		num.add(69);
		num.add(101);
		num.add(10);
		System.out.println(num);
		int great = num.get(0);
		for(int numb : num) {
			if(numb > great) {
				great = numb;
			}
		}
		System.out.println("Largest number = "+great);
		System.out.println("Extra statement to check git");
		
	}

}

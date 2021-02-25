package array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Search_a_name {

	public static void main(String[] args) {
		ArrayList <String>names = new ArrayList<>();
		names.add("sam");
		names.add("ram");
		names.add("pam");
		names.add("somu");
		names.add("raman");
		names.add("sham");
		System.out.println("Enter the name to search : ");
		Scanner sc = new Scanner(System.in);
		String name1 = sc.next();
		int match = 0;
		for(String str : names) {
			if(name1.equals(str)) {
				System.out.println("The name is in the list!");
				match = 1;
				break;
			}
		}
		if(match != 1) {
			System.err.println("Name not found in the list");
		}
	}
}

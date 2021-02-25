package emp_sort;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_ex {

	public static void main(String[] args) {
		HashMap <String,Integer>phoneBook = new HashMap<>();
		phoneBook.put("sam", 12345);
		phoneBook.put("ram", 22345);
		phoneBook.put("sham", 91345);
		phoneBook.put("cam", 33945);
		phoneBook.put("pam", 89345);
		System.out.println(phoneBook);
		Set set1 = phoneBook.entrySet();
		Iterator itr = set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Number of pam is :"+phoneBook.get("pam"));
		itr = set1.iterator();
		while(itr.hasNext()) {
			Map.Entry entry1 = (Entry) itr.next();
			System.out.println(entry1.getKey()+"-----"+entry1.getValue());
		}
	}

}

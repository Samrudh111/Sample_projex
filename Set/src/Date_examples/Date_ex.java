package Date_examples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ex {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		SimpleDateFormat sdf = new SimpleDateFormat("d/MM/YYYY");
		System.out.println(sdf.format(today));
		sdf = new SimpleDateFormat("d/MM/YYYY hh:mm:ss");
		System.out.println(sdf.format(today));
	}

}

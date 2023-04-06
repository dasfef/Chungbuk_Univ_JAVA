package day05;

public class M07_Week2 {

	public static void main(String[] args) {
		//name
		M07_Week today = M07_Week.MONDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal()
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo()
		M07_Week day1 = M07_Week.MONDAY;
		M07_Week day2 = M07_Week.TUESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf()
		M07_Week weekDay1 = M07_Week.valueOf("SUNDAY");
		
		if(weekDay1 == M07_Week.SATURDAY || weekDay1 == M07_Week.SUNDAY) {
			System.out.println("주말이군요");
		}
		else {
			System.out.println("평일이군요");
		}
		
		if(args.length == 1) {
			String strDay = args[0];
			M07_Week weekDay = M07_Week.valueOf(strDay);
			if(weekDay == M07_Week.SATURDAY || weekDay == M07_Week.SUNDAY) {
				System.out.println("**주말이군요");
			}
			else {
				System.out.println("**평일이군요");
			}
		}
		
	}

}

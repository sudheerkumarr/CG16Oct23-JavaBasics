package day11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
 * 
 * 
 * Quantifiers
 * '?' - 0-1 occurance of pattern 
 * '+' - 1 or more 
 * '*' - 0 or more
 * '{10}' - number of times to occur
 * '{5, 10}' - min 5 & upto 10
 * '{5, }' - min 5 & max can be any time
 * 
 * Metacharecters
 * \d - represents single digit
 * \D - represents single non-digit
 * \s - represents space
 * \S - represents non space char
 * \w - matches word chars [a-zA-Z_$]
 * \W - matches other than word chars
 *  . - single character
*/
 

public class Java8Features {

	public static void main(String[] args) {
		String ph = "091-044-456789";
		String[] strArr= ph.split("-"); // ["091", "044", "456789"]
		String stdCode = strArr[1];
		System.out.println(stdCode);
		
		String str 
			= String.join("", strArr[0], strArr[1], strArr[2]);
		System.out.println(str);
		
		// StringJoiner
		StringJoiner strJoiner 
				= new StringJoiner(" ");
		strJoiner.add("Hello").add("World");
		System.out.println(strJoiner);
		

		StringJoiner sj2 = 
				new StringJoiner(" ", "[", "]");
		sj2.add("Java").add("Programming");
		System.out.println(sj2);
		
		
		// Parallel Sort
		int[] intArr 
		   = {5, 20, 10, 15, 35, 7, 12, 3};
		
		System.out.println("Before sort: "+ Arrays.toString(intArr));
		//Arrays.sort(intArr);
		Arrays.parallelSort(intArr);
		
		System.out.println("After sort: "+Arrays.toString(intArr));
		
		
		// java.util.time
		//  LocalDate
		// LocalTime, 
		// LocalDateTime, Period, ZoneId, ZoneDateTime
		
		// Get current Date
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		// Custom date
		LocalDate dob = LocalDate.of(2000, 04, 21);
		System.out.println(dob);
		
		System.out.println(dob.getDayOfMonth());
		System.out.println(dob.getMonthValue());
		System.out.println(dob.getYear());
		LocalDate plusDays= dob.plusDays(5);
		System.out.println(plusDays);
		LocalDate minusDays= dob.minusDays(5);
		System.out.println(minusDays);
		
		// Period
		int years 
			= Period.between(dob, date).getYears();
		
		System.out.println(years+" years");
		
		//LocalTime
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		//LocalDateTime
		LocalDateTime dateTime 
		   = LocalDateTime.now();
		System.out.println(dateTime);
		
		// print date/time in specific format - printf
		System.out.printf("%d:%d:%d",t.getHour(), t.getMinute(), t.getSecond() );
		System.out.println();
		System.out.printf("%s", date.getDayOfWeek());
		
		// Zone
		System.out.println();
		System.out.println(ZoneId.systemDefault());
		
		
		// Regular Expressions
		
		
		
		
		ZoneId zid = ZoneId.of("Asia/Tokyo");
		ZonedDateTime lt1= ZonedDateTime.now(zid);
		System.out.println("ZonedDateTime : "+ lt1);
		
		
		
		// Regular expressions
		System.out.println(Pattern.matches(".a", "as")); //false
		System.out.println(Pattern.matches(".a", "%a"));// true
		System.out.println(Pattern.matches(".s", "as"));// true
		System.out.println();
		String contactNo = "1888 634 1407 (Toll Free)";
		System.out.println(Pattern.matches("\\d{4}\\s\\d{3}\\s\\d{4}\\s.*", contactNo));
		System.out.println();
		
		// ph = 091-044-345677
		// pattern = (\d{3})-(\d{3})-(\d{6})
		// group() - 091-044-345677
		// group(1) - 091
		// group(2) - 044
		// group(3) - 345678
		
		// create pattern using complie method
		Pattern pattern = Pattern.compile("(\\d{3})-(\\d{3})-(\\d{6})"); // pattern
		
		// Create Matcher using string
		String cNo = "091-044-345677";
		Matcher matcher = pattern.matcher(cNo); // string
		
		// validate
		System.out.println(matcher.matches()); // true
		System.out.println(matcher.group());
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
		System.out.println(matcher.group(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

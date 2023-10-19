package day9;

import java.util.Comparator;

public class SortByRollNo implements Comparator<Student> {

	// +ve/-ve/zero - asc
	// asc order
	// 1st value > 2nd value then return +ve
	// 1st value < 2nd value then return -ve
	// both values are same then return zero.
	@Override
	public int compare(Student std1, Student std2) {
		
		//return std1.getRollNo()>std2.getRollNo()?1:-1
		if(std1.getRollNo()>std2.getRollNo()) {
			return -1;
		} else if(std1.getRollNo()<std2.getRollNo()) {
			return 1;
		} else {
			return 0;
		}
	}

}

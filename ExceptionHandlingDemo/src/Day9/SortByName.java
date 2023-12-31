package day9;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		// sort - asc
		//return std1.getName().compareToIgnoreCase(std2.getName());
		// desc order
		return std2.getName().compareToIgnoreCase(std1.getName());
	}

}

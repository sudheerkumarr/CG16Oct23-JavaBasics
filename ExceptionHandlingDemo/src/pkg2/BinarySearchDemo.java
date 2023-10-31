package pkg2;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {
		BinarySearchDemo bsd = new BinarySearchDemo();
		int inx = bsd.binSearch(new int[]{10, 5, 20, 15}, 20);
		System.out.println(inx);
	}
	
	int binSearch(int[] intArr, int key) {
		Arrays.sort(intArr);
		
		int first = 0;
		int last = intArr.length-1;
		int mid = last/2;
		
		int indx = -1;
		
		if(intArr[mid]==key) {
			indx= mid;
		}
		System.out.println(intArr[mid] +" | "+ key);
		if(intArr[mid] < key) {
			System.out.println("mid>key");
			for(int i = mid+1; i<=last;i++) {
				if(intArr[i]==key) {
					System.out.println("i: "+i);
					indx = i;
				}
			}
		} else {
			for(int i = first; i<mid;i++) {
				if(intArr[i]==key) {
					indx =  i;
				}
			}
		}
		return indx;
	}

}

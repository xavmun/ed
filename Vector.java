package iessserpis.ed;

import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {
		
		
		
		
	//	for (int index = 0; index <5; index++)
	//		System.out.println(index);
		
		
		int[] v = new int[] {17, 12, 15, 9, 14};
		int x = 9;
		int index = indexOf(v, x);
		System.out.println("index=" + index);
		
		System.out.println("Fin");
		

	}
	public static int indexOf(int[] v, int x) {
//			int index = 0;
//			while (index < v.length && v[index] != x)
//				index++;
//			if (index == v.length)
//				return -1;
//			return index;
	
	for (int index = 0; index < v.length; index++)
		if (v[index] == x)
			return index;
	return -1;
	
	}

}

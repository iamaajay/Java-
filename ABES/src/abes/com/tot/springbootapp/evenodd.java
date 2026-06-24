package abes.com.tot.springbootapp;

import java.util.Arrays;
import java.util.List;

public class evenodd {

	public static void main(String[] args) {
		// ArrayList<Integer> list = new ArrayList<Integer>();
	}

	/*
	 * ArrayList<Integer> list = new ArrayList<Integer>(); list.add(10);
	 * list.add(11); list.add(12); list.add(13); list.add(14); list.add(15);
	 * System.out.println("Enev Numbers"); for (int n : list) { if (n % 2 == 0) {
	 * System.out.println("The Number is =" + n); } }
	 * System.out.println("Odd numbers"); for (int n : list) { if (n % 2 != 0) {
	 * System.out.println("The number is =" + n); } } }
	 */
	List<Integer> list1= Arrays.asList(1, 2, 3, 4, 5, 6);
	list1.stream().forEach(x)->System.out.println(list1);
}}

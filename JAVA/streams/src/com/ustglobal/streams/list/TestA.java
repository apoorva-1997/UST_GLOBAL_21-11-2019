package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(20);
		a.add(68);
		a.add(8);
		a.add(56);
		a.add(60);
		a.add(97);
		a.add(35);

		List<Integer> l = a.stream().filter(i -> (i%2) != 0).collect(Collectors.toList());			//odd num
//		List<Integer> l = a.stream().filter(i -> (i%2)==0.collect(Collectors.toList());	//even num
		for(Integer i : l) {
			System.out.println(i);
		}
	}

}

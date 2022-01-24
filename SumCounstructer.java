package com.hd.core;

public class SumCounstructer {
	
	int i = 10, j = 5, sum;
	public SumCounstructer() {
		sum = i + j;
	}

	public static void main(String args[]) {
		SumCounstructer sc = new SumCounstructer();
		System.out.println(sc.sum);		
	}

}
package com.hd.core;

public class BreakContinueExample {

	public static void main(String args[]) {
		int i;
		for (i = 1; i <= 10; i++) {
			if(i == 3)
				continue;
			
			{
				if (i == 8)
					break;
			
		
				{
					System.out.println(i);
			
				}
			}
		}
	}

}

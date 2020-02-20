package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

	@Override
	public void plus() {
		System.out.println("2+2=4");
		
	}

	@Override
	public void minus() {
		System.out.println("2-2=0");
		
	}

	@Override
	public void multiply() {
		System.out.println("2*2=4");
		
	}

	@Override
	public void devide() {
		System.out.println("4/2=2");
		
	}

}

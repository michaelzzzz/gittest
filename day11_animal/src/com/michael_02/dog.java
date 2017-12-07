package com.michael_02;
/**
 * @author zm
 * @version 1.0
 * 
 */
import com.michael.jump;

public class dog extends Animal implements jump {
	
	@Override
	public void Jump() {
		System.out.println("aaaaaa");
	}

	@Override
	public void eat() {
		System.out.println("bbbbbb");
	}

	@Override
	public void sleep() {
		System.out.println("ccccccccc");
	}

}

package com.ashwin.beans;

public class SonyPrinter implements IPrinter{
      
	public SonyPrinter() {
		  System.out.println("SonyPrinter Constructer called");
	}
	@Override
	public void print() {
		  System.out.println("printing by SonyPRINTER");
	}
	
}

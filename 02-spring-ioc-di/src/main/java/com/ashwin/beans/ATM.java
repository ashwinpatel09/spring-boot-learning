package com.ashwin.beans;

public class ATM {
        
	private IPrinter iprinter ;
	
	public ATM(IPrinter iprinter) {
		this.iprinter = iprinter;
	}
	
	public void setIprinter(IPrinter iprinter) {
		    this.iprinter = iprinter ;
	}
	
	public void call() {
		    iprinter.print();
	}
}

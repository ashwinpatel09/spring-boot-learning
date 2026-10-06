package com.ashwin.beans;

public class HPrinter implements IPrinter{
         public HPrinter() {
        	    System.out.println("HPrinter constructer called");
         }
         
         @Override
        public void print() {
           System.out.println(" printing by HPrinter");
        
        }
}

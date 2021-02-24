package com.app.cllent;

import java.util.Scanner;

import com.app.service.Addinter;

public class Client 
{
	 public static void main(String[] args)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	Addinter a=new Addinter();
	    	String s=" ";
	    	
	    	do {
	    	System.out.println("1] addProduct");
	    	System.out.println("2] viewProduct");
	    	System.out.println("3] addToCart");
	        System.out.println("4] creatBill");
	        
	        
	        System.out.println("Enter your choice: ");
	        int option=sc.nextInt();
	        
	        switch(option)
	        {
	        case 1:
	        	a.addProduct();
	        	break;
	        case 2:
	        	a.viewProduct();
	        	break;
	        case 3:
	        	a.addToCart();
	        	break;
	        case 4:
	        	a.creatBill();
	        	break;
	        	
	        default:
	        	System.out.println("Invalid selection");
	        }
	        System.out.println("Do you want to contineu (y/n)");
	        s=sc.next();
	    	}
	    	
	      while(s.equals("y"));
	    	System.exit(0);
	    }
}

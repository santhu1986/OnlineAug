package com.ebanking.master;

import java.io.IOException;

public class Exelib {

	public static void main(String[] args) throws IOException 
	{
		//Insatnce Class
		
		Library Lb=new Library();
		
		String Rval=Lb.openApp("http://183.82.100.55/ranford2");
		System.out.println(Rval);
		Lb.AdminLgn("Admin","M1ndq");
		Lb.Bcre();
	}

}

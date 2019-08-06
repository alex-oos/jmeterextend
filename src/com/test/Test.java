package com.test;

import com.util.DES3Util;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws Exception {
	    boolean a = true;
        while (a == true) {
            Scanner sc = new Scanner( System.in );
            String parm = sc.nextLine();
            String json = DES3Util.decrypt( parm );
            System.out.println( json);

        }

	}
}
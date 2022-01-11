package com.luni.dyp;

import java.util.HashMap;

public class Fibonacci {
	
		private static long getFib(int number, HashMap<Integer, Long> memonizer){
        if(!memonizer.containsKey(number)){
          memonizer.put(number, getFib(number -1, memonizer) + getFib(number -2, memonizer));
				}
				return memonizer.get(number);				
    }

    public static long fibonacci(int number){
        var memonizer = new HashMap<Integer, Long>();
        memonizer.put(0, 0L);
        memonizer.put(1,1L);

				return getFib(number, memonizer);
    }		
}
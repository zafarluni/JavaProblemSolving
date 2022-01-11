package com.luni.main;

import com.luni.dyp.*;

public class App 
{
	  public static void main( String[] args )
    {			
			var x  = new int[]{10, 15, 30, 5};
			System.out.println(getMinCost(x));
    }

		public static int getMinCost(int []array){			
			return getCost(array.length, array);
		}

		static int getCost(int n, int []arr){
			if (n < 0)
				return 0;

			var stepCost = (n >= arr.length)? 0 : arr[n];

			return stepCost + Math.min(getCost(n-2, arr),getCost(n-1, arr)); 			
		}
}
//				Fin
//			5
//		30
//	15
//10
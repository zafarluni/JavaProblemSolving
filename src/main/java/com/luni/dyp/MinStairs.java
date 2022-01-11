package com.luni.dyp;

public class MinStairs {
	
		public static int getMinSteps(int []array){			
			return getCost(array.length, array);
		}

		static int getCost(int n, int []arr){
			if (n < 0)
				return 0;

			var stepCost = (n >= arr.length)? 0 : arr[n];

			return stepCost + Math.min(getCost(n-2, arr),getCost(n-1, arr)); 			
		}
	
}
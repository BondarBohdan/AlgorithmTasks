package Tasks.olena;

import java.util.HashSet;
import java.util.Set;

public class SumOfSquares {
	
	public static Pair a(int n) throws NumberOutOfRangeException{
		
		if(n<2)
			throw new NumberOutOfRangeException("Number is too small." +
					"The smallest number that applies is 2");
		else {
			double bound = Math.sqrt(n);
			
			for(int x=1;x<=bound;x++) {
				Pair p = binarySearch(n, x, 1, (int)bound);
				if(p!=null)
					return p;
			}
		}
		return null;
	}
	
	
public static Set<Pair> b(int n) throws NumberOutOfRangeException{
		
		if(n<2)
			throw new NumberOutOfRangeException("Number is too small." +
					"The smallest number that applies is 2");
		else {
			double bound = Math.sqrt(n);
			Set<Pair> pairs = new HashSet<>();
			
			for(int x=1;x<=(int)bound;x++) {
				Pair p = binarySearch(n, x, 1, x);
				if(p!=null) {
					pairs.add(p);
				}
			}
			if(pairs.size()!=0)
				return pairs;
			
			return null;
		}
	}
	
	private static Pair binarySearch(int n, int x, int yA, int yB) {
		if(calculateN(x, yA) == n) 
				return new Pair(x, yA);
		else if(calculateN(x, yB) == n)
			return new Pair(x, yB);
		
		int eps = calculateEps(yA, yB);
		int middle = eps+yA;
		while(true){
			
			int result = calculateN(x, middle);
			
			if(result == n)
				return new Pair(x,middle);
			else if(result < n)
				yA = middle;
			else
				yB = middle;
			
			if(eps<=1) break;
			
			eps = calculateEps(yA, yB);
			middle = eps+yA;
		}
		
		return null;
	}

	private static int calculateEps(int a, int b) {
		double eps = ((double)b - (double)a)/ 2.0;
		return eps-Math.floor(eps)>0?(int)eps+1:(int)eps;
	}
	
	private static int calculateN(int x, int y) {
		return (int)(Math.pow(x, 2) + Math.pow(y, 2));
	}
}

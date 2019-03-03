package Tasks.olena;

public class Degree {
	
	public static int getDegree(int m) throws NumberOutOfRangeException{
		if(m<=1)
			throw new NumberOutOfRangeException("Number m must me bigger than 1");
		
		double k = logOfBase(m, 4);
		if(k-Math.floor(k)>0)
			return (int)k;
		else
			return (int)--k;
	}
	
	private static double logOfBase(int number, int base) {
	    return Math.log(number) / Math.log(base);
	}
}

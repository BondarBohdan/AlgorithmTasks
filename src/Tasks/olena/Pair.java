package Tasks.olena;

public class Pair{
	int x;
	int y;
	
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "x = "+x+"; y = "+y;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Pair)) return false;
		Pair p = (Pair)o;
		return (this.x == p.x && this.y == p.y) ||
				(this.y == p.x && this.x == p.y);
	}

	@Override
	public int hashCode() {
		return x * y + (int)((Math.pow(Math.abs(x - y), 2) - 1) / 4);
	}
}

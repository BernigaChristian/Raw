
public class Retta {
	private Punto a;
	private Punto b;
	//constructors
	public Retta() {
		a=new Punto();
		b=new Punto();
	}
	public Retta(double x,double y,double z,double w) {
		a=new Punto(x,y);
		b=new Punto(z,w);
	}
	public Retta(Retta r) {
		a=new Punto(r.a);
		b=new Punto(r.b);
	}
	//getters
	public Punto getA() {
		return a;
	}
	public Punto getB() {
		return b;
	}
	//setters
	public void setA(double x,double y) {
		a.setX(x);
		a.setY(y);
	}
	public void setB(double x,double y) {
		b.setX(x);
		b.setY(y);
	}
	//methods
	public double mComputation() {
		return ((a.getY()-b.getY())/(a.getX()-b.getX()));
	}
	public double qComputation() {
		double m=mComputation();
		return ((-(m*a.getX()))+a.getY());
	}
	public String toString() {
		if(qComputation()==0)
			return "y="+mComputation()+"x +"+qComputation();
		else 
			return "y="+mComputation()+"x "+qComputation();
	}
}

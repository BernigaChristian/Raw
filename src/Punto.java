public class Punto {
	// attributi
	private double x;
	private double y;

	// metodi
	// costruttore di default
	public Punto() {
		x = 0.0;
		y = 0.0;
	}

	// costruttore standard
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// costruttore di copia
	public Punto(Punto punto) {
		x = punto.x;
		y = punto.y;
	}
	
	//getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	//setters
	public void setX(double x) {
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
	}
	public double distance() {
		return Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2)));
	}
	public double distance(Punto p) {
		return Math.sqrt((Math.pow((p.x-x), 2))+(Math.pow((p.y-y), 2)));
	}
	public String toString() {
		return "("+x+";"+y+")";
	}

}

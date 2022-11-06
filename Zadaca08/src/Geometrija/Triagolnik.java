package Geometrija;

public class Triagolnik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public double a = 6;
    public double b = 3 ;
    public double c = 5;

    public double perimetar = a + b + c;
    public double h = java.lang.Math.sqrt((Math.pow(-a,4)+2*Math.pow((a*b),2)+Math.pow((a*c),2)-Math.pow(b,4)+2*Math.pow((b*c),2)-Math.pow(c,4))/2*b);
    public double plostina =(h*b/2);
    public Triagolnik(){

    }
    public Triagolnik (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
}

	
	
	
	


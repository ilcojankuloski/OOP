package Podatoci;

public class MainClass extends Covek {

	   public static void main(String[] args) {
	        Covek object1 = new Covek();
	        object1.firstName = "Ilco";
	        object1.lastName = "Jankuloski";
	        object1.maticen = "0208002440016";

	        System.out.println("Imeto na covekot e: " + object1.firstName);
	        System.out.println("Prezimeto na covekot e: " + object1.lastName);
	        System.out.println("Chovekot ima maticen broj: " + object1.maticen);
	    }
	}
package Proizvodi;

public class Main {

	public static void main(String[] args) {
		

        Proizvod object1 = new Proizvod();
        object1.proizvod = "Cokoladoto";
        object1.tezina = 100;
        object1.cena = 55;

        System.out.println ("Cenata na " + object1.proizvod + " so tezhina od " + object1.tezina + "g. iznesuva " + object1.cena + " denari.");
    }

	}



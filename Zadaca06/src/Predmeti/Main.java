package Predmeti;

public class Main {


	   public static void main(String[] args) {
		    Predmet object1 = new Predmet();
		    object1.imeNaPredmet = "Objektno Orientirano Programiranje";
		    object1.profesor = "Ilija Jolevski";
		    object1.krediti = 6.00;
		    object1.semestar = 3;

		    System.out.println("Ime na predmetot: " + object1.imeNaPredmet);
		    System.out.println("Profesor koj go predava predmetot: " + object1.profesor);
		    System.out.println("Broj na krediti: " + object1.krediti);
		    System.out.println("Semestar vo koj se predava toj predmet: " + object1.semestar);
		    }
		
	}



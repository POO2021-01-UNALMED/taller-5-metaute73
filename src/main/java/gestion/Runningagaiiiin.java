package gestion;
import zooAnimales.*;
public class Runningagaiiiin {

	public static void main(String[] args) {
		
		Zoologico zoo = new Zoologico("San Diego zoo", "San Diego, California");
		
		
		Zona zn1 = new Zona("gate1", zoo);
		
		Mamifero mammal = new Mamifero();
		Ave bird = new Ave();
		Reptil reptile = new Reptil();
		Pez fish = new Pez();
		Anfibio frog = new Anfibio();
	
		mammal.crearCaballo("Daisy", 2, "female");
		zn1.agregarAnimales(mammal.crearCaballo("Daisy", 2, "female"));
		
		zoo.agregarZonas(zn1);

		
		System.out.println(mammal.getListado()[0].getEdad());
	
		
	}

}

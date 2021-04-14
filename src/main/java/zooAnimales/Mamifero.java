package zooAnimales;


public class Mamifero extends Animal{
	
	private static Mamifero[] listado= {};
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		int m = 0;
		for (Mamifero ma : listado) {
			m += 1;
		}
		return m;
	}
	public Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero caballo = new Mamifero();
		this.pelaje = true;
		this.patas = 4;
		super.setHabitat("pradera");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Mamifero[] moreM = new Mamifero[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreM[m] = listado[m];
		}
		moreM[moreM.length-1] = caballo;
		this.listado = moreM;
		setTotalAnimales(1);
		this.caballos++;
		return caballo;
	}
	public Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero leon = new Mamifero();
		this.pelaje = true;
		this.patas = 4;
		super.setHabitat("selva");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Mamifero[] moreM2 = new Mamifero[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreM2[m] = listado[m];
		}
		moreM2[moreM2.length-1] = leon;
		this.listado = moreM2;
		setTotalAnimales(1);
		this.leones++;
		return leon;
	}
	public Mamifero[] getListado() {
		return this.listado;
	}
	public void setListado(Mamifero[] listado) {
		this.listado = listado;
	}
	public boolean getPelaje() {
		return this.pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return this.patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
}

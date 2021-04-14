package zooAnimales;


public class Reptil extends Animal{
	
	private static Reptil[] listado = {};
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	public String movimiento() {
		return "reptar";
	}
	public static int cantidadReptiles() {
		int r = 0;
		for (Reptil re: listado) {
			r += 1;
		}
		return r;
	}
	public Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil iguana = new Reptil();
		this.colorEscamas = "verde";
		this.largoCola = 3;
		super.setHabitat("humedal");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Reptil[] moreR = new Reptil[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreR[m] = listado[m];
		}
		moreR[moreR.length-1] = iguana;
		this.listado = moreR;
		setTotalAnimales(1);
		this.iguanas++;
		return iguana;
	}
	public Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil serpiente = new Reptil();
		this.colorEscamas = "blanco";
		this.largoCola = 1;
		super.setHabitat("jungla");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Reptil[] moreR = new Reptil[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreR[m] = listado[m];
		}
		moreR[moreR.length-1] = serpiente;
		this.listado = moreR;
		setTotalAnimales(1);
		this.serpientes++;
		return serpiente;
	}
	public Reptil[] getListado() {
		return this.listado;
	}
	public void setListado(Reptil[] listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return this.largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}

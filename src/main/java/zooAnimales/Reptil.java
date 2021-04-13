package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal{
	
	private static Reptil[] listado;
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
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
	public void crearIguana(String nombre, int edad, String genero, Zona[] zona) {
		Reptil iguana = new Reptil();
		this.colorEscamas = "verde";
		this.largoCola = 3;
		super.setHabitat("humedal");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		this.listado = new Reptil[this.listado.length + 1];
		listado[listado.length-1] = iguana;
		setTotalAnimales(1);
		this.iguanas++;
	}
	public void crearSerpiente(String nombre, int edad, String genero, Zona[] zona) {
		Reptil serpiente = new Reptil();
		this.colorEscamas = "blanco";
		this.largoCola = 1;
		super.setHabitat("jungla");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		super.setZona(zona);
		this.listado = new Reptil[this.listado.length + 1];
		listado[listado.length-1] = serpiente;
		setTotalAnimales(1);
		this.serpientes++;
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

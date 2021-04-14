package zooAnimales;


public class Pez extends Animal {
	
	private static Pez[] listado = {};
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
	
	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setHabitat(habitat);
		super.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	public static int cantidadPeces() {
		int p = 0;
		for (Pez pe: listado) {
			p += 1;
		}
		return p;
	}
	public Pez crearSalmon(String nombre, int edad, String genero) {
		Pez salmon = new Pez();
		this.colorEscamas = "rojo";
		this.cantidadAletas = 6;
		super.setHabitat("oceano");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Pez[] moreP = new Pez[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreP[m] = listado[m];
		}
		moreP[moreP.length-1] = salmon;
		this.listado = moreP;
		setTotalAnimales(1);
		this.salmones++;
		return salmon;
	}
	public Pez crearBacalao(String nombre, int edad, String genero) {
		Pez bacalao = new Pez();
		this.colorEscamas = "gris";
		this.cantidadAletas = 6;
		super.setHabitat("oceano");
		super.setNombre(nombre);
		super.setEdad(edad);
		super.setGenero(genero);
		Pez[] moreP = new Pez[this.listado.length + 1];
		for (int m = 0; m < this.listado.length; m++) {
			moreP[m] = listado[m];
		}
		moreP[moreP.length-1] = bacalao;
		this.listado = moreP;
		setTotalAnimales(1);
		this.bacalaos++;
		return bacalao;
	}
	public String movimiento() {
		return "nadar";
	}
	public Pez[] getListado() {
		return this.listado;
	}
	public void setListado(Pez[] listado) {
		this.listado = listado;
	}
	public String getColorEscamas() {
		return this.colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return this.cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

}

package calculadoracomida.builders;

import calculadoracomida.enums.Medida;

public class InformacionComida {
	private final String nombre;
	private final Medida unidadDeMedida;
	private int cantidadPorcion;
	private int porciones;
	private int calorias;
	private int grasa;
	private int sodio;
	private int carbohidratos;
    
	private InformacionComida(Builder builder) {
    		this.nombre = builder.nombre;
    		this.unidadDeMedida = builder.unidadDeMedida;
    		this.porciones = builder.porciones;
    		this.cantidadPorcion = builder.cantidadPorcion;
    		this.calorias = builder.calorias;
    		this.grasa = builder.grasa;
    		this.sodio = builder.sodio;
    		this.carbohidratos = builder.carbohidratos;
    }

	public String getNombre() {
		return nombre;
	}

	public int getCantidadPorcion() {
		return cantidadPorcion;
	}

	public Medida getUnidadDeMedida() {
		return unidadDeMedida;
	}

	public int getPorciones() {
		return porciones;
	}

	public int getCalorias() {
		return calorias;
	}

	public int getGrasa() {
		return grasa;
	}

	public int getSodio() {
		return sodio;
	}

	public int getCarbohidratos() {
		return carbohidratos;
	}
    
	public String toString() {
		String mensaje = "Informacion nutricional: \n";
		
		mensaje += "Nombre: " + this.nombre + "\n";
		mensaje += "Unidad de medida: " + this.unidadDeMedida + "\n";
		mensaje += "Porciones: " + this.porciones + "\n";
		mensaje += "Cantidad por porcion: " + this.cantidadPorcion + "\n";
		mensaje += "Grasa: " + this.grasa + "\n";
		mensaje += "Carbohidratos: " + this.carbohidratos + "\n";
		mensaje += "Sodio: " + this.sodio + "\n";
		mensaje += "Calorias: " + this.calorias + "\n";
		
		return mensaje;
	}
	
	public static class Builder {
		private final String nombre;
		private final Medida unidadDeMedida;
		private int cantidadPorcion;
		private int porciones;
		private int calorias;
		private int grasa;
		private int sodio;
		private int carbohidratos;
	    
		public Builder(String nombre, Medida unidadDeMedida) {
			this.nombre = nombre;
			this.unidadDeMedida = unidadDeMedida;
		}
		
		public Builder carbohidratosPorPorcion(int carbohidratos) {
			this.carbohidratos = carbohidratos;
			return this;
		}
		
		public Builder sodioPorPorcion(int sodio) {
			this.sodio = sodio;
			return this;
		}
	    
	    public Builder grasaPorPorcion(int grasa) {
	    		this.grasa = grasa;
	    		return this;
		}
	    	
	    public Builder caloriasPorPorcion(int calorias) {
	    		this.calorias = calorias;
	    		return this;
	    	}
	    
	    public Builder porciones(int porciones) {
	    		this.porciones = porciones;
	    		return this;
	    }
	    
	    public Builder cantidadPorPorcion(int cantidadPorcion) {
	    		this.cantidadPorcion = cantidadPorcion;
	    		return this;
	    	}
	    
	    public InformacionComida build() {
	    		InformacionComida user = new InformacionComida(this);
	    		return user;
	    }
	}
}

package calculadoracomida.entities;

import calculadoracomida.enums.Medida;

public class Comida {
	private String nombre; 
    private int cantidadPorcion;
    private Medida unidadDeMedida;
    private int porciones;
    private int calorias;
    private int grasa;
    private int sodio;
    private int carbohidratos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCantidadPorcion(int cantidadPorcion) {
        this.cantidadPorcion = cantidadPorcion;
    }

    public void setUnidadDeMedida(Medida unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setGrasa(int grasa) {
        this.grasa = grasa;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    public void setCarbohidratos(int carbohidratos) {
        this.carbohidratos = carbohidratos;
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
}

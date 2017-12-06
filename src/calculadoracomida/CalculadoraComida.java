package calculadoracomida;

import calculadoracomida.builders.InformacionComida;
import calculadoracomida.builders.InformacionComida.Builder;
import calculadoracomida.enums.Medida;

public class CalculadoraComida {

    public static void main(String[] args) {    		
    		InformacionComida porcionOllaDeCarne;
    		Builder builder;
    		
    		builder = new InformacionComida.Builder("Mariscada", Medida.G);
    		porcionOllaDeCarne = builder.build();
    		
    		System.out.println(porcionOllaDeCarne.toString());
    		
    		InformacionComida porcionPizza;
    		builder = new InformacionComida.Builder("Slide Pizza", Medida.G);
    		porcionPizza = builder
    						.porciones(1)
    						.caloriasPorPorcion(227)
    						.carbohidratosPorPorcion(33)
    						.build();
    		
    		System.out.println(porcionPizza.toString());
    		
    		InformacionComida cerveza;
    		builder = new InformacionComida.Builder("Cerveza", Medida.ML);
    		cerveza = builder
    						.porciones(1)
    						.caloriasPorPorcion(100)
    						.build();
    		
    		System.out.println(cerveza.toString());
    }
    
}

package calculadoracomida;

import calculadoracomida.builders.InformacionComida;
import calculadoracomida.builders.InformacionComida.Builder;
import calculadoracomida.enums.Medida;

public class CalculadoraComida {

    public static void main(String[] args) {    		
    		InformacionComida porcionOllaDeCarne;
    		Builder builder = new InformacionComida.Builder("Mariscada", Medida.G);
    		porcionOllaDeCarne = builder.build();
    		
    		System.out.println(porcionOllaDeCarne.toString());
    		
    		InformacionComida porcionPizza;
    		Builder builderA = new InformacionComida.Builder("Slide Pizza", Medida.G);
    		porcionPizza = builderA
    						.porciones(1)
    						.caloriasPorPorcion(227)
    						.carbohidratosPorPorcion(33)
    						.build();
    		
    		System.out.println(porcionPizza.toString());
    		
    		InformacionComida cerveza;
    		Builder builderB = new InformacionComida.Builder("Cerveza", Medida.ML);
    		cerveza = builderB
    						.porciones(1)
    						.build();
    		
    		System.out.println(cerveza.toString());
    }
    
}

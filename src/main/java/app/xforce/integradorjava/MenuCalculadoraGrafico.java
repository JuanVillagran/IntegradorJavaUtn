//Menu grafico de la calculadora
package app.xforce.integradorjava;


public class MenuCalculadoraGrafico {

    public MenuCalculadoraGrafico() {
    }
    
    public void menuCalculadoraGrafico(){
        System.out.println("");
        System.out.println("Menu Calculadora");
        System.out.println("Opción: #1 Suma");
        System.out.println("Opción: #2 Resta");
        System.out.println("Opción: #3 Multiplicación");
        System.out.println("Opción: #4 División");
        System.out.println("Opción: #5 Salir");
        System.out.println("");
    }
    
    public void ingresaropcion(){
        System.out.println("Ingresar una opción: ");
    }
    
    public void errorNumeroIncorrecto(Integer num){
        System.out.println("Numero de opcion incorrecto = "+ num );
    }

}

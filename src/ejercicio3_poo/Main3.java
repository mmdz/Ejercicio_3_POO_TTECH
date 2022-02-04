package ejercicio3_poo;

import ejercicio3_poo.entidades.Operacion; //importo para poder usar la clase operacion
import ejercicio3_poo.servicios.ServiciosOperacion;

/*Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
.*/
public class Main3 {

    public static void main(String[] args) {
        ServiciosOperacion so = new ServiciosOperacion();
        
        //creo la operacion
        Operacion op = so.crearOperacion();

        //llamo al metodo sumar
        System.out.println("La suma es: " + so.sumar(op));
        //llamo al metodo restar
        System.out.println("La resta es: " + so.restar(op));
        //llamo al metodo multi
        System.out.println("El producto es: " + so.multiplicar(op));
        //llamo al metodo division
        System.out.println("La división es: " + so.dividir(op));
    }

}

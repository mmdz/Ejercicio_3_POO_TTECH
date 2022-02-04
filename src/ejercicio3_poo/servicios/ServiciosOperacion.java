package ejercicio3_poo.servicios;

import ejercicio3_poo.entidades.Operacion;
import java.util.Scanner;


public class ServiciosOperacion {
    Scanner leer = new Scanner(System.in);

    /*d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.*/
    public Operacion crearOperacion() {

        Operacion op = new Operacion();
        System.out.println("Ingrese número A");
        op.setNumero1(leer.nextInt());

        System.out.println("Ingrese número B");
        op.setNumero2(leer.nextInt());
        return op;
    }

    /*e) Método sumar(): calcular la suma de los números y devolver el resultado al main.*/
    public double sumar(Operacion op) {
        Integer suma;
        suma = op.getNumero1() + op.getNumero2();
        return suma;
    }

    // f) Método restar(): calcular la resta de los números y devolver el resultado al main
        public double restar(Operacion op) {
        Integer resta;
        resta = op.getNumero1() - op.getNumero2();
        return resta;
    }
/*g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main*/
    public double multiplicar(Operacion op){

        double producto = 0;

            if(op.getNumero1() == 0 || op.getNumero2() ==0){
                producto = 0;
                System.out.println("No se puede multiplicar por 0");
            }else{
                producto = op.getNumero1()*op.getNumero2();
            }
       return producto;
    }
        
/*h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main*/        
    
    public double dividir(Operacion op){
        double division = 0;
        
            if(op.getNumero1() == 0 || op.getNumero2() ==0){
                division = 0;
                System.out.println("No se puede multiplicar por 0");
            }else{
                division = op.getNumero1()/op.getNumero2();
            }
        return division;
    }
}

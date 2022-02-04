package ejercicio3_poo.entidades;

import java.util.Scanner;

public class Operacion {

    private Integer numero1;
    private Integer numero2;

    // a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion() {
    }

    //b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion(Integer numero1, Integer numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

        
    //metodo toString
    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

    //c) Métodos get y set.
    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

}

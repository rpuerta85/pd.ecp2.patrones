package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;


public class Calculadora {
    protected int total;

    public Calculadora() {
        this.iniciar();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void sumar(int valor) {
        this.setTotal(this.total + valor);
        imprimir();
    }

    public void restar(int valor) {
        this.setTotal(this.total - valor);
        imprimir();
    }

    public void iniciar() {
        this.setTotal(0);
        imprimir();
    }

    public void imprimir() {
      IO.out.println("Resulado: "+getTotal());
    }
    public void multiplicar(int valor) {
        this.setTotal(this.total * valor);
        imprimir();
    }
    
}

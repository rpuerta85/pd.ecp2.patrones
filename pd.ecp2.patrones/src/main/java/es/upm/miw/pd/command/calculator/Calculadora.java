package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;


public class Calculadora {
    protected int total;

    public Calculadora() {
        
    }

    public int getTotal() {
        return 0;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void sumar(int valor) {
        this.setTotal(this.total + valor);
    }

    public void restar(int valor) {
        this.setTotal(this.total - valor);
    }

    public void iniciar() {
        this.setTotal(0);
    }

    public void imprimir() {
      IO.out.println("Resulado: "+getTotal());
    }
    public void multiplicar(int valor) {
       
    }
    
}

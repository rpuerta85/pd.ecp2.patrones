package es.upm.miw.pd.command.calculator.mementable;

import es.upm.miw.pd.command.calculator.ComandoImprimir;
import es.upm.miw.pd.command.calculator.ComandoIniciar;
import es.upm.miw.pd.command.calculator.ComandoMultiplicar;
import es.upm.miw.pd.command.calculator.ComandoRestar;
import es.upm.miw.pd.command.calculator.ComandoSumar;
import es.upm.miw.pd.command.calculator.GestorComandos;
import es.upm.miw.pd.command.calculator.mementable.ComandoGuardar;
//import es.upm.miw.pd.command.calculator.solution.ComandoImprimir;
//import es.upm.miw.pd.command.calculator.solution.ComandoIniciar;
//import es.upm.miw.pd.command.calculator.solution.ComandoRestar;
//import es.upm.miw.pd.command.calculator.solution.ComandoSumar;
import upm.jbb.IO;

public class MainCalculadoraMementable {
    private GestorComandos gestor;

    public MainCalculadoraMementable() {
        CalculadoraMementable calc = new CalculadoraMementable();
        this.gestor = new GestorComandos();
        this.gestor.add(new ComandoIniciar(calc));
        this.gestor.add(new ComandoSumar(calc));
        this.gestor.add(new ComandoRestar(calc));
        this.gestor.add(new ComandoMultiplicar(calc));
        this.gestor.add(new ComandoImprimir(calc));
        this.gestor.add(new ComandoGuardar(calc));
        this.gestor.add(new ComandoRestaurar(calc));
        
        
    }

    public void ejecutar() {
        String key = (String) IO.in.select(this.gestor.keys());
        this.gestor.execute(key);
    }

    public static void main(String[] args) {
        IO.in.addController(new MainCalculadoraMementable());
    }
}

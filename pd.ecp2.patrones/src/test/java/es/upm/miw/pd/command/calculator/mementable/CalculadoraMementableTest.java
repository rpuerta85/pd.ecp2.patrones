package es.upm.miw.pd.command.calculator.mementable;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraMementableTest {
    private CalculadoraMementable calculadora;
    private CalculadoraMementableMock calculadoraMock;
    private MementoCalculadora memento,memento2;
    
    @Before
    public void ini() {
        calculadora = new CalculadoraMementable();  
        calculadoraMock = new CalculadoraMementableMock();
        calculadora = calculadoraMock;
        memento = new MementoCalculadora(2, "prueba1");
        memento2 = new MementoCalculadora(4, "prueba2");
    }

    @Test
    public void testCalculadora() {
        assertEquals(0, calculadora.getTotal());
    }
    @Test
    public void testSumar() {
        calculadora.sumar(2);
        assertEquals(2, calculadora.getTotal());
        calculadora.sumar(3);
        assertEquals(5, calculadora.getTotal());
    }
    @Test
    public void testRestar() {
        calculadora.restar(2);
        assertEquals(-2, calculadora.getTotal());
        calculadora.setTotal(10);
        calculadora.restar(3);
        assertEquals(7, calculadora.getTotal());
    }
    @Test
    public void testMultiplicar() {
        calculadora.multiplicar(2);
        assertEquals(0, calculadora.getTotal());
        calculadora.setTotal(10);
        calculadora.multiplicar(10);
        assertEquals(100, calculadora.getTotal());
    }
    
    @Test
    public void testImpimir() {
        calculadora.sumar(2);
        calculadora.imprimir();
        assertEquals("Resulado: "+"2", calculadoraMock.getResultado());
    }
    @Test
    public void testGuardar() {
        calculadora.guardar(memento);
        assertEquals(memento, calculadoraMock.getMementoGuardado());
    }
    public void testDeshacer() {
        calculadora.guardar(memento);
        calculadora.guardar(memento2);
        calculadora.deshacer(memento);
        assertEquals(memento, calculadoraMock.getMementoRestaurado());
    }
    
}

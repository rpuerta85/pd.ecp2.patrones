package es.upm.miw.pd.command.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    private Calculadora calculadora;
    private CalculadoraMock calculadoraMock;
    
    @Before
    public void ini() {
        calculadora = new Calculadora();  
        calculadoraMock = new CalculadoraMock();
        calculadora = calculadoraMock;
    }

    @Test
    public void testCalculadora() {
        assertEquals(0, calculadora.total);
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
    
}

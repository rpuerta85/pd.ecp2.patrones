package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberFrTest {
    private NaturalNumberFr naturalNumberEs;
    
    @Before
    public void ini() {
        naturalNumberEs = new NaturalNumberFr(1);
    }

    @Test
    public void testConstructorInt() {
        assertNotNull(naturalNumberEs.getValue());
        assertEquals(naturalNumberEs.getValue(),1);
    }
    @Test
    public void testAdd() {
        naturalNumberEs.add(3);
        assertNotNull(new Integer(naturalNumberEs.getValue()));
        assertEquals(naturalNumberEs.getValue(),4);
    }
    @Test
    public void testTextValue() {
        assertEquals(naturalNumberEs.getTextValue(),NaturalNumberFr.textValue[1]);
    }
}

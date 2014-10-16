package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberEnTest {
    private NaturalNumberEn naturalNumberEn;
    
    @Before
    public void ini() {
        naturalNumberEn = new NaturalNumberEn(1);
    }

    @Test
    public void testConstructorInt() {
        assertNotNull(naturalNumberEn.getValue());
        assertEquals(naturalNumberEn.getValue(),1);
    }
    @Test
    public void testAdd() {
        naturalNumberEn.add(3);
        assertNotNull(new Integer(naturalNumberEn.getValue()));
        assertEquals(naturalNumberEn.getValue(),4);
    }
    @Test
    public void testTextValue() {
        assertEquals(naturalNumberEn.getTextValue(),NaturalNumberEn.textValue[1]);
    }
}

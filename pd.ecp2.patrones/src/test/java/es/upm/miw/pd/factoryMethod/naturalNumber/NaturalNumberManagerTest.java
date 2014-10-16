package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberManagerTest {

    private NaturalNumberManager naturalNumberManager;

    @Before
    public void ini() {
      naturalNumberManager = new NaturalNumberManager();

    }

    @Test
    public void testSetNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator) {
        NaturalNumberEsCreator naturalNumberEsCreator = new NaturalNumberEsCreator();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        assertSame(naturalNumberManager.getCreator(), naturalNumberEsCreator);
    }
    
    @Test
    public void testCreateNaturalNumber() {
        NaturalNumberEsCreator naturalNumberEsCreator = new NaturalNumberEsCreator();
        naturalNumberManager.setNaturalNumberCreator(naturalNumberEsCreator);
        NaturalNumber naturalNumber=naturalNumberManager.createNaturalNumber(2);
        assertEquals(naturalNumber.getValue(), 2);
        ;
    }

    
}

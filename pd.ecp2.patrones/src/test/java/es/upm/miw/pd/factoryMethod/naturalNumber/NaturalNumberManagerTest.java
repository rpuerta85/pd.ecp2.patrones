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
    public void testSetNaturalNumberCreator() {
        NaturalNumberEsCreator naturalNumberEsCreator = new NaturalNumberEsCreator();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberEsCreator());
        assertEquals(naturalNumberManager.getCreator().getClass().getSimpleName(),
                naturalNumberEsCreator.getClass().getSimpleName());
        assertNotNull(naturalNumberManager.getCreator());
    }
    
    @Test
    public void testCreateNaturalNumber() {
        NaturalNumberEsCreator naturalNumberEsCreator = new NaturalNumberEsCreator();
        naturalNumberManager.setNaturalNumberCreator(naturalNumberEsCreator);
        NaturalNumber naturalNumber=naturalNumberManager.createNaturalNumber(2);
        assertEquals(naturalNumber.getValue(), 2);
        
    }

    
}

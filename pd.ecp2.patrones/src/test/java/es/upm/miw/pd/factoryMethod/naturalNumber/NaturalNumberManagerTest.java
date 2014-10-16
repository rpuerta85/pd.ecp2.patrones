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
        naturalNumberEsCreator.setNaturalNumberCreator(new NaturalNumberEsCreator());
        assertSame(naturalNumberManager.getCreator(), naturalNumberEsCreator);
    }
    
    @Test
    public void testCreateNaturalNumber() {
        NaturalNumberEsCreator naturalNumberEsCreator = new NaturalNumberEsCreator();
        naturalNumberManager.setNaturalNumberCreator(naturalNumberEsCreator);
        assertSame(naturalNumberManager.createNaturalNumber(), naturalNumberEsCreator);
        ;
    }

    
}

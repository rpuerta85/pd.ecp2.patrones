package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NaturalNumberEnCreatorTest {
    
    private NaturalNumberEnCreator naturalNumberEnCreator;
    
    @Before
    public void ini() {
        naturalNumberEnCreator = new NaturalNumberEnCreator();
    }
    @Test
    public void testCreateFigure () {
        assertNotNull(naturalNumberEnCreator.createFigure(1));
        assertEquals(naturalNumberEnCreator.createFigure(5).getValue(),
                new NaturalNumberEn(5).getValue());
    }


}

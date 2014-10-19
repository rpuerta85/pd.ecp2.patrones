package es.upm.miw.pd.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class FactoriaCaracterTest {

    @Test
    public void testFactoryReferencesIsSingleton() {
        assertSame(FactoriaCaracter.getFactoria(), FactoriaCaracter.getFactoria());
    }

    @Test
    public void testFactoryReferencesSingletonNotNull() {
        assertNotNull(FactoriaCaracter.getFactoria());
    }

    @Test
    public void testFactoryReferences() {
        assertEquals("a", FactoriaCaracter.getFactoria().get('a'));
        assertEquals("A", FactoriaCaracter.getFactoria().get('A'));
        FactoriaCaracter.getFactoria().removeCaracter('A');
        assertEquals("A", FactoriaCaracter.getFactoria().get('A'));
    }
}

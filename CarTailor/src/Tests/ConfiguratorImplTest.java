package CarTailor.src.Tests;

import CarTailor.src.CarTailor.CategoryImpl;
import CarTailor.src.CarTailor.ConfiguratorImpl;
import CarTailor.src.CarTailor.PartTypeImpl;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test de ConfiguratorImpl
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public class ConfiguratorImplTest {

    private ConfiguratorImpl configurator = new ConfiguratorImpl();

    @Test
    public void testSize() throws SecurityException, IllegalArgumentException {

        assertEquals(4, configurator.getCategory().size());
    }

    @Test
    public void testExistCategory() throws SecurityException, IllegalArgumentException {

        assertTrue(configurator.existCategory("engine"));
        assertTrue(configurator.existCategory("transmission"));
        assertTrue(configurator.existCategory("exterior"));
        assertTrue(configurator.existCategory("interior"));

        assertFalse(configurator.existCategory("door"));
        assertFalse(configurator.existCategory("wheel"));
    }

    @Test
    public void testExistsPart() throws SecurityException, IllegalArgumentException {

        assertTrue(configurator.getCategory("engine").existPart("EG100"));
        assertTrue(configurator.getCategory("engine").existPart("EG133"));
        assertTrue(configurator.getCategory("engine").existPart("EG210"));
        assertTrue(configurator.getCategory("engine").existPart("ED110"));
        assertTrue(configurator.getCategory("engine").existPart("ED180"));
        assertTrue(configurator.getCategory("engine").existPart("EH120"));
        assertTrue(configurator.getCategory("transmission").existPart("TM5"));
        assertTrue(configurator.getCategory("transmission").existPart("TM6"));
        assertTrue(configurator.getCategory("transmission").existPart("TA5"));
        assertTrue(configurator.getCategory("transmission").existPart("TS6"));
        assertTrue(configurator.getCategory("transmission").existPart("TSF7"));
        assertTrue(configurator.getCategory("transmission").existPart("TC120"));
        assertTrue(configurator.getCategory("exterior").existPart("XC"));
        assertTrue(configurator.getCategory("exterior").existPart("XM"));
        assertTrue(configurator.getCategory("exterior").existPart("XS"));
        assertTrue(configurator.getCategory("interior").existPart("IN"));
        assertTrue(configurator.getCategory("interior").existPart("IH"));
        assertTrue(configurator.getCategory("interior").existPart("IS"));

        assertFalse(configurator.getCategory("engine").existPart("TC120"));
        assertFalse(configurator.getCategory("transmission").existPart("EG100"));
        assertFalse(configurator.getCategory("interior").existPart("XC"));

    }

    @Test
    public void testGetCategory() throws SecurityException, IllegalArgumentException {

        CategoryImpl category = configurator.getCategory("engine");
        assertEquals("engine", category.getName());
        assertNotEquals("transmission", category.getName());
    }

    @Test
    public void testGetPart() throws SecurityException, IllegalArgumentException {


        PartTypeImpl partType = configurator.getCategory("transmission").getPart("TC120");
        assertEquals("TC120", partType.getName());
        assertNotEquals("XS", partType.getName());
    }
}
package CarTailor.src.Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import CarTailor.src.CarTailor.ConfiguratorImpl;
import CarTailor.src.CarTailor.PartTypeImpl;
import org.junit.Test;

import CarTailor.src.CarTailor.ConfigurationImpl;

import java.lang.reflect.InvocationTargetException;

public class ConfiguratorImplTest {

    @Test
    public void testInit() throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException, InvocationTargetException
    {
        ConfiguratorImpl configurator = new ConfiguratorImpl();

        assertEquals(4, configurator.getCategory().size());
        assertTrue(configurator.existCategory("engine"));
        assertTrue(configurator.existCategory("transmission"));
        assertTrue(configurator.existCategory("exterior"));
        assertTrue(configurator.existCategory("interior"));
        assertFalse(configurator.existCategory("test"));

        assertTrue(configurator.getCategory("engine").existPart("EH120"));
        assertFalse(configurator.getCategory("engine").existPart("TC120"));

        PartTypeImpl p = configurator.getCategory("engine").getPart("EH120");
        // assertTrue(p.existRequirement("TC120"));
        p = configurator.getCategory("transmission").getPart("TC120");
        // assertTrue(p.existRequirement("EH120"));

        p = configurator.getCategory("transmission").getPart("TSF7");
        // assertTrue(p.existIncompatibilities("EG100"));
        // assertTrue(p.existIncompatibilities("ED110"));
        p = configurator.getCategory("transmission").getPart("TS6");
        // assertTrue(p.getIncompatibilities().isEmpty());
    }





}

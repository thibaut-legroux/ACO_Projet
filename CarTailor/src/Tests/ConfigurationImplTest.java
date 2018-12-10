package CarTailor.src.Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import CarTailor.src.CarTailor.*;
import CarTailor.src.Interface.Configuration;
import CarTailor.src.Interface.Observer;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class ConfigurationImplTest {

    private ConfigurationImpl config;
    private ConfiguratorImpl configurator;

    @Before
    public void setUp() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        this.configurator = new ConfiguratorImpl();
        this.config = this.configurator.getConfig();
    }

    @Test
    public void testAdd() {
        PartTypeImpl p = this.configurator.getCategory("engine").getPart("EH120");
        CategoryImpl c = this.configurator.getCategory("engine");
        this.config.addPart(p);
        assertEquals(p, this.config.getSelection(c));


        p = this.configurator.getCategory("transmission").getPart("TA5");
        c = this.configurator.getCategory("transmission");
        this.config.addPart(p);
        assertEquals(p, this.config.getSelection(c));

        p = this.configurator.getCategory("engine").getPart("EG133");
        c = this.configurator.getCategory("engine");
        this.config.addPart(p);
        assertEquals(p, this.config.getSelection(c));

        p = this.configurator.getCategory("interior").getPart("IN");
        c = this.configurator.getCategory("interior");
        this.config.addPart(p);
        assertEquals(p, this.config.getSelection(c));

        p = this.configurator.getCategory("exterior").getPart("XC");
        c = this.configurator.getCategory("exterior");
        this.config.addPart(p);
        assertEquals(p, this.config.getSelection(c));

        p = this.configurator.getCategory("exterior").getPart("XM");
        c = this.configurator.getCategory("exterior");
        this.config.addPart(p);
        assertEquals(p, this.config.getSelection(c));

        p = this.configurator.getCategory("exterior").getPart("XS");
        c = this.configurator.getCategory("exterior");
        this.config.addPart(p);
        assertEquals(p, this.config.getSelection(c));

    }

    @Test
    public void testRemove() {
        PartTypeImpl p = this.configurator.getCategory("engine").getPart("EH120");
        CategoryImpl c = this.configurator.getCategory("engine");
        this.config.removePart(p);
        assertEquals(this.config.getSelection(c), null);

        p = this.configurator.getCategory("transmission").getPart("TA5");
        c = this.configurator.getCategory("transmission");
        this.config.removePart(p);
        assertEquals(this.config.getSelection(c), null);

        p = this.configurator.getCategory("engine").getPart("EG133");
        c = this.configurator.getCategory("engine");
        this.config.removePart(p);
        assertEquals(this.config.getSelection(c), null);

        p = this.configurator.getCategory("interior").getPart("IN");
        c = this.configurator.getCategory("interior");
        this.config.removePart(p);
        assertEquals(this.config.getSelection(c), null);

        p = this.configurator.getCategory("exterior").getPart("XC");
        c = this.configurator.getCategory("exterior");
        this.config.removePart(p);
        assertEquals(this.config.getSelection(c), null);

        p = this.configurator.getCategory("exterior").getPart("XM");
        c = this.configurator.getCategory("exterior");
        this.config.removePart(p);
        assertEquals(this.config.getSelection(c), null);

        p = this.configurator.getCategory("exterior").getPart("XS");
        c = this.configurator.getCategory("exterior");
        this.config.removePart(p);
        assertEquals(this.config.getSelection(c), null);

    }

    @Test
    public void testExecption() {
        assertThrows(Exception.class, () -> this.config.addPart(null));
    }

    @Test
    public void testIsComplete() {
        CompatibleManagerImpl manager = this.configurator.getCompatibilityManager();
        PartTypeImpl p = this.configurator.getCategory("engine").getPart("EH120");
        this.config.addPart(p);
        assertFalse(manager.isComplete());

        p = this.configurator.getCategory("transmission").getPart("TA5");
        this.config.addPart(p);
        p = this.configurator.getCategory("exterior").getPart("XC");
        this.config.addPart(p);
        p = this.configurator.getCategory("interior").getPart("IN");
        this.config.addPart(p);
        assertTrue(manager.isComplete());
        this.config.removePart(p);
        assertFalse(manager.isComplete());
        this.config.removePart(p);
    }
}
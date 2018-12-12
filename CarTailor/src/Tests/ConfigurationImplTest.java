package CarTailor.src.Tests;

import static org.junit.Assert.*;

import CarTailor.src.CarTailor.*;
import org.junit.Test;

/**
 * Test de ConfigurationImpl
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public class ConfigurationImplTest {

    private ConfiguratorImpl configurator = new ConfiguratorImpl();
    private ConfigurationImpl config = this.configurator.getConfig();

    @Test
    public void testAddPart() {
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
    public void testRemovePart() {
        PartTypeImpl p = this.configurator.getCategory("engine").getPart("EH120");
        CategoryImpl c = this.configurator.getCategory("engine");
        this.config.removePart(p);
        assertNull(this.config.getSelection(c));

        p = this.configurator.getCategory("transmission").getPart("TA5");
        c = this.configurator.getCategory("transmission");
        this.config.removePart(p);
        assertNull(this.config.getSelection(c));

        p = this.configurator.getCategory("engine").getPart("EG133");
        c = this.configurator.getCategory("engine");
        this.config.removePart(p);
        assertNull(this.config.getSelection(c));

        p = this.configurator.getCategory("interior").getPart("IN");
        c = this.configurator.getCategory("interior");
        this.config.removePart(p);
        assertNull(this.config.getSelection(c));

        p = this.configurator.getCategory("exterior").getPart("XC");
        c = this.configurator.getCategory("exterior");
        this.config.removePart(p);
        assertNull(this.config.getSelection(c));

        p = this.configurator.getCategory("exterior").getPart("XM");
        c = this.configurator.getCategory("exterior");
        this.config.removePart(p);
        assertNull(this.config.getSelection(c));

        p = this.configurator.getCategory("exterior").getPart("XS");
        c = this.configurator.getCategory("exterior");
        this.config.removePart(p);
        assertNull(this.config.getSelection(c));

    }

    @Test
    public void testIsComplete() {
        CompatibleManagerImpl manager = this.configurator.getCompatibilityManager();
        PartTypeImpl p = this.configurator.getCategory("engine").getPart("EH120");
        this.config.addPart(p);
        assertTrue(manager.isComplete());

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
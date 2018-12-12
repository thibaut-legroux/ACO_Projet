package CarTailor.src.Tests;

import CarTailor.src.CarTailor.ConfiguratorImpl;
import CarTailor.src.CarTailor.PartTypeImpl;
import CarTailor.src.Interface.CompatibleManager;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test de CompatibilityManagerImplTest
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public class CompatibilityManagerImplTest {

    ConfiguratorImpl configurator = new ConfiguratorImpl();
    CompatibleManager compatibleManager = configurator.getCompatibilityManager();

    @Test
    public final void testAddInCompPartType(){
        PartTypeImpl partTypeAdd = new PartTypeImpl("TP100", "wheel");

        assertTrue(compatibleManager.addInCompPartType(configurator.getCategory("engine").getPart("EG133"), partTypeAdd));

        PartTypeImpl partTypeAdd2 = new PartTypeImpl("TP200", "backwheel");

        assertFalse(compatibleManager.addInCompPartType(partTypeAdd2, configurator.getCategory("engine").getPart("EG133")));
        assertTrue(compatibleManager.addInCompPartType(partTypeAdd, partTypeAdd2));
    }

    @Test
    public final void testGetIncompPart() {
        assertNotNull(compatibleManager.getIncompPart(configurator.getCategory("engine").getPart("EG100")));

        PartTypeImpl partTypeGet = new PartTypeImpl("TP100", "wheel");
        assertNull(compatibleManager.getIncompPart(partTypeGet));
    }

    @Test
    public final void testRemoveInCompPartType(){
        PartTypeImpl eg100 = configurator.getCategory("engine").getPart("EG100");
        PartTypeImpl eg133 = configurator.getCategory("engine").getPart("EG133");
        compatibleManager.addInCompPartType(eg100, eg133);

        assertTrue(compatibleManager.removeInCompPartType(eg100, eg133));

        PartTypeImpl partTypeRemove = new PartTypeImpl("TP100", "wheel");
        assertFalse(compatibleManager.removeInCompPartType(eg100, partTypeRemove));

    }

    @Test
    public final void testAddRequirementPart(){
        PartTypeImpl partTypeAdd = new PartTypeImpl("TP100", "wheel");

        assertTrue(compatibleManager.addRequirementPart(configurator.getCategory("engine").getPart("EG133"), partTypeAdd));

        PartTypeImpl partTypeAdd2 = new PartTypeImpl("TP200", "backwheel");

        assertFalse(compatibleManager.addRequirementPart(partTypeAdd2, configurator.getCategory("engine").getPart("EG133")));
        assertTrue(compatibleManager.addRequirementPart(partTypeAdd, partTypeAdd2));
    }

    @Test
    public final void testRemoveRequirementPart(){
        PartTypeImpl eg100 = configurator.getCategory("engine").getPart("EG100");
        PartTypeImpl eg133 = configurator.getCategory("engine").getPart("EG133");
        compatibleManager.addRequirementPart(eg100, eg133);

        assertTrue(compatibleManager.removeRequirementPart(eg100, eg133));

        PartTypeImpl partTypeRemove = new PartTypeImpl("TP100", "wheel");
        assertFalse(compatibleManager.removeRequirementPart(eg100, partTypeRemove));
    }

    @Test
    public final void testGetRequirements(){
        assertNotNull(compatibleManager.getRequirements(configurator.getCategory("engine").getPart("EH120")));
        assertNull(compatibleManager.getRequirements(configurator.getCategory("engine").getPart("EG100")));

        PartTypeImpl partTypeGet = new PartTypeImpl("TP100", "wheel");
        assertNull(compatibleManager.getRequirements(partTypeGet));
    }

    @Test
    public final void testIsComplete(){
        assertTrue(compatibleManager.isComplete());
    }

    @Test
    public final void testIsValid(){
        assertTrue(compatibleManager.isValid());
    }
}

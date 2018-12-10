package CarTailor.src.Tests;

import CarTailor.src.CarTailor.CompatibleManagerImpl;
import CarTailor.src.CarTailor.PartTypeImpl;
import CarTailor.src.CarTailor.CategoryImpl;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CompatibilityManagerImplTest {

   /* CompatibleManagerImpl compat = new CompatibleManagerImpl();


    CategoryImpl category = new CategoryImpl("Engine");
    Collection<PartTypeImpl> parts;
    PartTypeImpl pt = new PartTypeImpl(category,parts);

    Collection<PartTypeImpl> parts_it;
    Iterator<PartTypeImpl> it_pt = (Iterator<PartTypeImpl>) parts_it;

    @Test
    public final void testAddInCompPartType(){
        CompatibleManagerImpl compat_test = new CompatibleManagerImpl();

        CategoryImpl category_test = new CategoryImpl("Engine");
        Collection<PartTypeImpl> parts_test = null;
        PartTypeImpl pt_test = new PartTypeImpl(category_test,parts_test);

        Collection<PartTypeImpl> parts_it_test = null;
        Iterator<PartTypeImpl> it_pt_test = (Iterator<PartTypeImpl>) parts_it_test;

        assertEquals("Test d'ajout d'une incompatibilité : ",compat.addInCompPartType(pt, (Iterator<PartTypeImpl>) parts),compat_test.addInCompPartType(pt_test, (Iterator<PartTypeImpl>) parts_test));
    }

    @Test
    public final void testGetIncompPart() throws Exception {
        CompatibleManagerImpl compat_test = new CompatibleManagerImpl();

        CategoryImpl category_test = new CategoryImpl("Engine");
        Collection<PartTypeImpl> parts_test = null;
        PartTypeImpl pt_test = new PartTypeImpl(category_test,parts_test);

        assertEquals("Test de récuperation des part incompatibles : ",compat.getIncompPart(pt),compat_test.getIncompPart(pt_test));

    }

    @Test
    public final void testRemoveInCompPartType(){
        CompatibleManagerImpl compat_test = new CompatibleManagerImpl();

        CategoryImpl category_test = new CategoryImpl("Engine");
        Collection<PartTypeImpl> parts_test = null;
        PartTypeImpl pt_test = new PartTypeImpl(category_test,parts_test);

        assertEquals("Test de suppression de part incompatibles : ",compat.removeInCompPartType(pt,parts),compat_test.removeInCompPartType(pt_test,parts_test));

    }

    @Test
    public final void testAddRequirementPart(){
        CompatibleManagerImpl compat_test = new CompatibleManagerImpl();

        CategoryImpl category_test = new CategoryImpl("Engine");
        Collection<PartTypeImpl> parts_test = null;
        PartTypeImpl pt_test = new PartTypeImpl(category_test,parts_test);

        assertEquals("Test d'ajout d'une incompatibilité : ",compat.addRequirementPart(pt, (Iterator<PartTypeImpl>) parts),compat_test.addRequirementPart(pt_test, (Iterator<PartTypeImpl>) parts_test));
    }

    @Test
    public final void testRemoveRequirementPart(){
        CompatibleManagerImpl compat_test = new CompatibleManagerImpl();

        CategoryImpl category_test = new CategoryImpl("Engine");
        Collection<PartTypeImpl> parts_test = null;
        PartTypeImpl pt_test = new PartTypeImpl(category_test,parts_test);

        assertEquals("Test de suppression de part incompatibles : ",compat.removeRequirementPart(pt, (Iterator<PartTypeImpl>) parts),compat_test.removeInCompPartType(pt_test, parts_test));
    }

    @Test
    public final void testGetRequirements(){
        CompatibleManagerImpl compat_test = new CompatibleManagerImpl();

        CategoryImpl category_test = new CategoryImpl("Engine");
        Collection<PartTypeImpl> parts_test = null;
        PartTypeImpl pt_test = new PartTypeImpl(category_test,parts_test);

        assertEquals("Test de la récupération des test requierments : ",compat.getRequirements(pt),compat_test.getRequirements(pt_test));
    }*/
}

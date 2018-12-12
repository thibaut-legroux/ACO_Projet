package CarTailor.src.CarTailor;

import CarTailor.src.Interface.*;
import javafx.scene.chart.CategoryAxis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * The type Configurator.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public class ConfiguratorImpl implements Configurator, Observer<Configuration> {
    private ConfigurationImpl config;
    private Collection<CategoryImpl> catColl;
    private CompatibleManagerImpl compMan;

    /**
     * Creation du catalogue du configurateur.
     */
    public ConfiguratorImpl() {
        this.init();
        this.config.addObserver(this);
    }
    private void init() {
        this.compMan = new CompatibleManagerImpl(this);

        PartTypeImpl eg100 = new PartTypeImpl("EG100", "Gasoline, 100 Kw");
        PartTypeImpl eg133 = new PartTypeImpl("EG133", "Gasoline, 133 Kw");
        PartTypeImpl eg210 = new PartTypeImpl("EG210", "Gasoline, 210 Kw");
        PartTypeImpl ed110 = new PartTypeImpl("ED110", "Diesel, 110 kW");
        PartTypeImpl ed180 = new PartTypeImpl("ED180", "Diesel, 180 kW");
        PartTypeImpl eh120 = new PartTypeImpl("EH120", "Gasoline/electric hybrid 120 kW");

        PartTypeImpl tm5 = new PartTypeImpl("TM5", "Manual, 5 gears");
        PartTypeImpl tm6 = new PartTypeImpl("TM6", "Manual, 6 gears");

        PartTypeImpl ta5 = new PartTypeImpl("TA5", "Automatic, 5 gears");
        PartTypeImpl ts6 = new PartTypeImpl("TS6", "Sequential, 6 gears");
        PartTypeImpl tsf7 = new PartTypeImpl("TSF7", "Sequential, 7 gears, 4 wheels drive");
        PartTypeImpl tc210 = new PartTypeImpl("TC120", "Converter, 120 kW max");

        PartTypeImpl xc = new PartTypeImpl("XC", "Classic paint");
        PartTypeImpl xm = new PartTypeImpl("XM", "Metallic paint");
        PartTypeImpl xs = new PartTypeImpl("XS", "Red paint and sport decoration");
        PartTypeImpl in = new PartTypeImpl("IN", "Standard interior");
        PartTypeImpl ih = new PartTypeImpl("IH", "High-end interior");
        PartTypeImpl is = new PartTypeImpl("IS", "Sport finish");

        this.compMan.addRequirementPart(eh120, tc210);
        this.compMan.addRequirementPart(tc210, eh120);
        this.compMan.addRequirementPart(xs, is);
        this.compMan.addRequirementPart(is, xs);

        this.compMan.addInCompPartType(ta5, eg100);
        this.compMan.addInCompPartType(tsf7, eg100);
        this.compMan.addInCompPartType(tsf7, eg133);
        this.compMan.addInCompPartType(tsf7, ed110);
        this.compMan.addInCompPartType(xc, eg210);
        this.compMan.addInCompPartType(xm, eg100);
        this.compMan.addInCompPartType(xs, eg100);
        this.compMan.addInCompPartType(is, eg100);
        this.compMan.addInCompPartType(is, tm5);

        this.compMan.addInCompPartType(eg100, ta5);
        this.compMan.addInCompPartType(eg100, tsf7);
        this.compMan.addInCompPartType(eg133, tsf7);
        this.compMan.addInCompPartType(ed110, tsf7);
        this.compMan.addInCompPartType(eg210, xc);
        this.compMan.addInCompPartType(eg100, xm);
        this.compMan.addInCompPartType(eg100, xs);
        this.compMan.addInCompPartType(eg100, is);
        this.compMan.addInCompPartType(tm5, is);

        ArrayList<PartTypeImpl> temp = new ArrayList<PartTypeImpl>();
        temp.add(tm5);
        temp.add(tm6);
        temp.add(ta5);
        temp.add(ts6);
        temp.add(tsf7);
        temp.add(tc210);
        CategoryImpl transmission = new CategoryImpl("transmission", temp);

        temp = new ArrayList<>();
        temp.add(eg100);
        temp.add(eg133);
        temp.add(eg210);
        temp.add(ed110);
        temp.add(ed180);
        temp.add(eh120);
        CategoryImpl engine = new CategoryImpl("engine", temp);

        temp = new ArrayList<>();
        temp.add(xc);
        temp.add(xm);
        temp.add(xs);
        CategoryImpl exterior = new CategoryImpl("exterior", temp);

        temp = new ArrayList<>();
        temp.add(in);
        temp.add(ih);
        temp.add(is);
        CategoryImpl interior = new CategoryImpl("interior", temp);

        this.catColl = new ArrayList<>();
        this.catColl.add(transmission);
        this.catColl.add(engine);
        this.catColl.add(exterior);
        this.catColl.add(interior);

        this.newConfig();

    }

    /**
     * Creation d'un nouveau configurateur.
     */
    private void newConfig(){
        this.config = new ConfigurationImpl(catColl);
    }

    /**
     * Vérifier qu'une categorie existe.
     *
     * @param name Le nom de la catégorie
     * @return retourne vrai si elle existe, faux sinon
     */
    public boolean existCategory(String name)
    {
        boolean found = false;
        Iterator<CategoryImpl> it = this.catColl.iterator();
        while (it.hasNext() && !found) {
            found = it.next().getName().equals(name);
        }
        return found;
    }

    /**
     * Retirer une référence du configurateur.
     *
     * @param p la référence à retirer du configurateur
     */
    public void removePart(PartTypeImpl p){
        this.config.removePart(p);
    }

    @Override
    public Collection<CategoryImpl> getCategory() {
        return this.catColl;
    }

    @Override
    public CompatibleManagerImpl getCompatibilityManager() {
        return this.compMan;
    }

    @Override
    public ConfigurationImpl getConfig() {
        return this.config;
    }

    /**
     * Retourne le contenu dans la catégorie voulu.
     *
     * @param name Le nom de la catégorie
     * @return Le contenu de la catégorie
     */
    public CategoryImpl getCategory(String name)
    {
        CategoryImpl category = null;
        CategoryImpl temp;
        Iterator<CategoryImpl> it = this.catColl.iterator();
        while (it.hasNext() && category == null) {
            temp = it.next();
            if (temp.getName().equals(name))
                category = temp;
        }
        return category;
    }

    /**
     * Retourne le contenu de la référence voulu.
     *
     * @param name Le nom de la référence
     * @return La contenu de la référence
     */
    public PartTypeImpl getPart(String name)
    {
        PartTypeImpl part = null;
        CategoryImpl temp;
        Iterator<CategoryImpl> it = this.catColl.iterator();
        while (it.hasNext() && part == null) {
            temp = it.next();
            if (temp.existPart(name))
                part = temp.getPart(name);
        }
        return part;
    }

    @Override
    public void update(Observable o) { }
}

package CarTailor.src.CarTailor;

import CarTailor.src.Interface.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ConfiguratorImpl implements Configurator, Observer<Configuration> {
    private ConfigurationImpl config;
    private Collection<CategoryImpl> c;
    private CompatibleManagerImpl cm;
    
    public ConfiguratorImpl() {
        this.init();
        this.config.addObserver(this);
    }

    private void init() {
        this.c = new ArrayList<CategoryImpl>();
        this.cm = new CompatibleManagerImpl(this);
        this.newConfig();

        // Creation part engine
        PartTypeImpl eg100 = new PartTypeImpl("EG100", "Gasoline, 100 Kw");
        PartTypeImpl eg133 = new PartTypeImpl("EG133", "Gasoline, 133 Kw");
        PartTypeImpl eg210 = new PartTypeImpl("EG210", "Gasoline, 210 Kw");
        PartTypeImpl ed110 = new PartTypeImpl("ED110", "Diesel, 110 kW");
        PartTypeImpl ed180 = new PartTypeImpl("ED180", "Diesel, 180 kW");
        PartTypeImpl eh120 = new PartTypeImpl("EH120", "Gasoline/electric hybrid 120 kW");

        // Creation part transmission
        PartTypeImpl tm5 = new PartTypeImpl("TM5", "Manual, 5 gears");
        PartTypeImpl tm6 = new PartTypeImpl("TM6", "Manual, 6 gears");

        PartTypeImpl ta5 = new PartTypeImpl("TA5", "Automatic, 5 gears");
        PartTypeImpl ts6 = new PartTypeImpl("TS6", "Sequential, 6 gears");
        PartTypeImpl tsf7 = new PartTypeImpl("TSF7", "Sequential, 7 gears, 4 wheels drive");
        PartTypeImpl tc210 = new PartTypeImpl("TC120", "Converter, 120 kW max");

        // Creation part exterior
        PartTypeImpl xc = new PartTypeImpl("XC", "Classic paint");
        PartTypeImpl xm = new PartTypeImpl("XM", "Metallic paint");
        PartTypeImpl xs = new PartTypeImpl("XS", "Red paint and sport decoration");
        // Creation part interior
        PartTypeImpl in = new PartTypeImpl("IN", "Standard interior");
        PartTypeImpl ih = new PartTypeImpl("IH", "High-end interior");
        PartTypeImpl is = new PartTypeImpl("IS", "Sport finish");
        // creation requirement
        this.cm.addRequirementPart(eh120, tc210);
        this.cm.addRequirementPart(tc210, eh120);
        this.cm.addRequirementPart(xs, is);
        this.cm.addRequirementPart(is, xs);
        // creation incompatibilities
        this.cm.addInCompPartType(ta5, eg100);
        this.cm.addInCompPartType(tsf7, eg100);
        this.cm.addInCompPartType(tsf7, eg133);
        this.cm.addInCompPartType(tsf7, ed110);
        this.cm.addInCompPartType(xc, eg210);
        this.cm.addInCompPartType(xm, eg100);
        this.cm.addInCompPartType(xs, eg100);
        this.cm.addInCompPartType(is, eg100);
        this.cm.addInCompPartType(is, tm5);

        this.cm.addInCompPartType(eg100, ta5);
        this.cm.addInCompPartType(eg100, tsf7);
        this.cm.addInCompPartType(eg133, tsf7);
        this.cm.addInCompPartType(ed110, tsf7);
        this.cm.addInCompPartType(eg210, xc);
        this.cm.addInCompPartType(eg100, xm);
        this.cm.addInCompPartType(eg100, xs);
        this.cm.addInCompPartType(eg100, is);
        this.cm.addInCompPartType(tm5, is);

        // creation category
        ArrayList<PartTypeImpl> temp = new ArrayList<PartTypeImpl>();
        temp.add(tm5);
        temp.add(tm6);
        temp.add(ta5);
        temp.add(ts6);
        temp.add(tsf7);
        temp.add(tc210);
        CategoryImpl transmission = new CategoryImpl("transmission", temp);

        temp = new ArrayList<PartTypeImpl>();
        temp.add(eg100);
        temp.add(eg133);
        temp.add(eg210);
        temp.add(ed110);
        temp.add(ed180);
        temp.add(eh120);
        CategoryImpl engine = new CategoryImpl("engine", temp);

        temp = new ArrayList<PartTypeImpl>();
        temp.add(xc);
        temp.add(xm);
        temp.add(xs);
        CategoryImpl exterior = new CategoryImpl("exterior", temp);

        temp = new ArrayList<PartTypeImpl>();
        temp.add(in);
        temp.add(ih);
        temp.add(is);
        CategoryImpl interior = new CategoryImpl("interior", temp);

        this.c = new ArrayList<CategoryImpl>();
        this.c.add(transmission);
        this.c.add(engine);
        this.c.add(exterior);
        this.c.add(interior);

    }

    public void newConfig(){
        this.config = new ConfigurationImpl();
    }

    public boolean existCategory(String name)
    {
        boolean found = false;
        Iterator<CategoryImpl> it = this.c.iterator();
        while (it.hasNext() && !found) {
            found = it.next().getName() == name;
        }
        return found;
    }


    public void removePart(PartTypeImpl p){
        this.config.removePart(p);
    }

    @Override
    public Collection<CategoryImpl> getCategory() {
        return this.c;
    }

    @Override
    public CompatibleManagerImpl getCompatibilityManager() {
        return this.cm;
    }

    @Override
    public ConfigurationImpl getConfig() {
        return this.config;
    }

    @Override
    public PartTypeImpl getSelectionForCategory(CategoryImpl c) {
        return this.config.getSelection(c);
    }

    public CategoryImpl getCategory(String name)
    {
        CategoryImpl category = null;
        CategoryImpl temp;
        Iterator<CategoryImpl> it = this.c.iterator();
        while (it.hasNext() && category == null) {
            temp = it.next();
            if (temp.getName().equals(name))
                category = temp;
        }
        return category;
    }

    public PartTypeImpl getPart(String name)
    {
        PartTypeImpl part = null;
        CategoryImpl temp;
        Iterator<CategoryImpl> it = this.c.iterator();
        while (it.hasNext() && part == null) {
            temp = it.next();
            if (temp.existPart(name))
                part = temp.getPart(name);
        }
        return part;
    }

    @Override
    public void update(Observable o) {

    }
}

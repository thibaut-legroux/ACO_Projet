package CarTailor.src.CarTailor;

import com.sun.org.glassfish.gmbal.Description;

import java.util.HashMap;

public class Catalogue {

    public String[][] catalogue;

    public Catalogue() {
        this.catalogue = new String[18][5];
        HashMap<PartImpl, PartImpl> incomptatibility = new HashMap<>();
        HashMap<PartImpl, PartImpl> requirement = new HashMap<>();

        addPartTocatalogue(new CategoryImpl("Engine"), new Name("EG100"),
                new Description("Gasoline, 100 kW"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Engine"), new Name("EG133"),
                new Description("Gasoline, 133 kW"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Engine"), new Name("EG210"),
                new Description("Gasoline, 210 kW"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Engine"), new Name("ED110"),
                new Description("Diesel, 110 kW"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Engine"), new Name("EG180"),
                new Description("Diesel, 180 kW"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Engine"), new Name("EH120"),
                new Description("Gasoline/electric hybrid, 120 kW"), new Incomptatibility(incomptatibility,requirement), new Requirement());


        addPartTocatalogue(new CategoryImpl("Transmission"), new Name("TM5"),
                new Description("Manual, 5 gears"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Transmission"), new Name("TM6"),
                new Description("Manual, 6 gears"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Transmission"), new Name("TA5"),
                new Description("Automatic, 5 gears"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Transmission"), new Name("TS6"),
                new Description("Sequential, 6 gears"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Transmission"), new Name("TSF7"),
                new Description("Sequential, 7 gears, 4 wheels drive"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Transmission"), new Name("TC120"),
                new Description("Converter, 120 kW max"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Exterior"), new Name("XC"),
                new Description("Classic paint"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Exterior"), new Name("XM"),
                new Description("Metalic paint"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Exterior"), new Name("XS"),
                new Description("Red paint and sport decoration"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Interior"), new Name("IN"),
                new Description("Standard interior"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Interior"), new Name("IH"),
                new Description("high-end interior"), new Incomptatibility(incomptatibility,requirement), new Requirement());

        addPartTocatalogue(new CategoryImpl("Interior"), new Name("IS"),
                new Description("Sport finish"), new Incomptatibility(incomptatibility,requirement), new Requirement());

    }

    public boolean addPartTocatalogue(CategoryImpl cat, Name name, Description description, Incomptatibility compat, Requirement require) {
        int i =0;
        while(this.catalogue[i][0] != null) {
            i ++;
        }
        this.catalogue[i][0] = cat.getCategory();
        this.catalogue[i][1] = name.getName();
        this.catalogue[i][2] = description.getDescription();
        this.catalogue[i][3] = compat.getIncompatibility();
        this.catalogue[i][4] = require.getRequirement();
        return true;
    }

    public ArrayList<CategoryImpl> getCat(){
        ArrayList<CategoryImpl> res = new ArrayList<CategoryImpl>();
        boolean exist = false;
        for(int i = 0; i < catalogue.length; i++) {
            exist = false;
            CategoryImpl c = new CategoryImpl(catalogue[i][0]);
            for(int j = 0; j< res.size(); j++) {
                if(c.getCategory().equals(res.get(j).getCategory())) {
                    exist = true;
                }
            }
            if(!exist) {
                res.add(c);
            }
        }
        return res;
    }
}

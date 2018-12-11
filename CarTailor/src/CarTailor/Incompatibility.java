package CarTailor.src.CarTailor;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The type Incompatibility.
 */
public class Incompatibility {


    HashMap<PartImpl, PartImpl> incomptatibility = new HashMap<>();

    /**
     * Le constructeur de la classe.
     *
     * @param incomp La nouvelle incompatibilité
     */
    public Incompatibility(HashMap<PartImpl,PartImpl> incomp){

        this.incomptatibility=incomp;
    }


    public ArrayList<PartTypeImpl> Incompatibility;

    public PartTypeImpl part;


    /**
     * Retourne l'incompatibilité.
     *
     * @return Retourne l'incompatibilité
     */
    public String getIncompatibility() {
        if(this.Incompatibility != null)
            return this.Incompatibility.toString();
        return null;
    }

    /**
     * Définir incompatibilité.
     *
     * @param incompatibility Le nouveau contenu de l'incompatibilité
     */
    public void setIncompatibility(ArrayList<PartTypeImpl> incompatibility) {
        Incompatibility = incompatibility;
    }

    @Override
    public String toString() {
        return "Incompatibilities [Incompatibility=" + Incompatibility;
        //+ ", part=" + part + "]";
    }


}

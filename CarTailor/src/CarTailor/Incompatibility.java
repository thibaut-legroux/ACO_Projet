package CarTailor.src.CarTailor;

import java.util.ArrayList;
import java.util.HashMap;

public class Incompatibility {

    HashMap<PartImpl, PartImpl> incomptatibility = new HashMap<>();
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    public Incompatibility(HashMap<PartImpl,PartImpl> incomp){
        this.incomptatibility=incomp;
    }


    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public ArrayList<PartTypeImpl> Incompatibility;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public PartTypeImpl part;



    public String getIncompatibility() {
        if(this.Incompatibility != null)
            return this.Incompatibility.toString();
        return null;
    }

    public void setIncompatibility(ArrayList<PartTypeImpl> incompatibility) {
        Incompatibility = incompatibility;
    }

    @Override
    public String toString() {
        return "Incompatibilities [Incompatibility=" + Incompatibility;
        //+ ", part=" + part + "]";
    }


}

package CarTailor.src.CarTailorConfiguration;

import CarTailor.src.CarTailor.PartTypeImpl;

import java.util.ArrayList;

public class Incomptatibility extends IncompatibilityManager{


    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    public Incomptatibility(){
        super();
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

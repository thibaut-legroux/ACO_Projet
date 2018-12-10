package CarTailor.src.CarTailor;

import CarTailor.src.Interface.Part;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IncompatibilityManager {

    HashMap<Part, Part> incomptatibility = new HashMap<>();
    HashMap<Part, Part> requirement = new HashMap<>();

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */

    public IncompatibilityManager(HashMap<Part,Part> incomp,HashMap<Part, Part> require){
        this.incomptatibility=incomp;
        this.requirement=require;
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public void addincompatibilities(Part part, Part incompat){
        if(!incomptatibility.containsKey(part)&&incomptatibility.containsValue(incompat)){
            incomptatibility.put(part, incompat);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public void removeincompatibilities(Part part,Part incompat) {
        if(incomptatibility.containsKey(part)&&incomptatibility.containsValue(incompat)){
            incomptatibility.remove(part,incompat);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public void addrequirements(Part part,Part incompat) {
        if(!requirement.containsKey(part)&&requirement.containsValue(incompat)){
            requirement.put(part, incompat);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public void removerequirements(Part part,Part incompat) {
        if(requirement.containsKey(part)&&requirement.containsValue(incompat)){
            requirement.remove(part,incompat);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public Requirement getrequirements(Part part) {
        return this.requirement.values();
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public Incomptatibility getincompatibilities() {

        return null;
    }
}

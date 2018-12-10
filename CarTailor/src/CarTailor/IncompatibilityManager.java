package CarTailor.src.CarTailor;
package CarTailor.src.CarTailor;

import CarTailor.src.Interface.Configurator;
import CarTailor.src.Interface.Part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class IncompatibilityManager implements Configurator {

    HashMap<PartImpl, PartImpl> incomptatibility = new HashMap<>();
    HashMap<PartImpl, PartImpl> requirement = new HashMap<>();

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */

    public IncompatibilityManager(HashMap<PartImpl,PartImpl> incomp,HashMap<PartImpl, PartImpl> require){
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public void addincompatibilities(PartImpl part, PartImpl incompat){
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

    public void removeincompatibilities(PartImpl part,PartImpl incompat) {
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

    public void addrequirements(PartImpl part,PartImpl incompat) {
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

    public void removerequirements(PartImpl part,PartImpl incompat) {
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

    public Requirement getrequirements() {
        return (Requirement) this.requirement.values();
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    public Incomptatibility getincompatibilities() {
        return (Incomptatibility) this.incomptatibility.values();
    }
}

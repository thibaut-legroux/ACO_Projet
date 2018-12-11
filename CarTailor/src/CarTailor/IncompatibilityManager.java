package CarTailor.src.CarTailor;

import CarTailor.src.Interface.PartType;

import java.util.HashMap;

/**
 * The type Incompatibility manager.
 */
public class IncompatibilityManager {

    HashMap<PartTypeImpl, PartTypeImpl> incomptatibility = new HashMap<>();
    HashMap<PartTypeImpl, PartTypeImpl> requirement = new HashMap<>();

    /**
     * Constructeur de la classe.
     *
     * @param incomp  the incomp
     * @param require the require
     */
    public IncompatibilityManager(HashMap<PartTypeImpl,PartTypeImpl> incomp,HashMap<PartTypeImpl, PartTypeImpl> require){
        this.incomptatibility=incomp;
        this.requirement=require;
    }

    /**
     * Constructeur de classe vide.
     */
    public IncompatibilityManager(){}

    /**
     * Ajout d'une incompatibilité.
     *
     * @param part     la référence concerné
     * @param incompat La nouvelle incompatibilité
     */
    public void addincompatibilities(PartTypeImpl part, PartTypeImpl incompat){
        if(!incomptatibility.containsKey(part)&&incomptatibility.containsValue(incompat)){
            incomptatibility.put(part, incompat);
        }
    }

    /**
     * Suppression d'une incompatibilité.
     *
     * @param part     the part
     * @param incompat the incompat
     */
    public void removeincompatibilities(PartTypeImpl part,PartTypeImpl incompat) {
        if(incomptatibility.containsKey(part)&&incomptatibility.containsValue(incompat)){
            incomptatibility.remove(part,incompat);
        }
    }

    /**
     * Ajout d'un prérequis.
     *
     * @param part     la référence concerné
     * @param incompat Le nouveau prérequis
     */
    public void addrequirements(PartTypeImpl part,PartTypeImpl incompat) {
        if(!requirement.containsKey(part)&&requirement.containsValue(incompat)){
            requirement.put(part, incompat);
        }
    }

    /**
     * Suppression d'un prérequis.
     *
     * @param part     la référence concerné
     * @param incompat Le nouveau prérequis
     */
    public void removerequirements(PartTypeImpl part,PartTypeImpl incompat) {
        if(requirement.containsKey(part)&&requirement.containsValue(incompat)){
            requirement.remove(part,incompat);
        }
    }
}

package CarTailor.src.CarTailor;

import CarTailor.src.CarTailor.IncompatibilityManager;
import CarTailor.src.CarTailor.PartTypeImpl;
import CarTailor.src.Interface.Configurator;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The type Requirement.
 */
public class Requirement {


	public Configurator configurator;

	HashMap<PartImpl, PartImpl> requirement = new HashMap<>();

	/**
	 * Constructeur de la classe.
	 *
	 * @param require La liste des prérequis
	 */
	public Requirement(HashMap<PartImpl, PartImpl> require){
		this.requirement = require;
	}

	public ArrayList<PartTypeImpl> Requirement;


	public PartTypeImpl part;


	/**
	 * Obtenir les prérequis.
	 *
	 * @return Retourne la liste des prérequis
	 */
	public String getRequirement() {
		if(this.Requirement != null)
			return this.Requirement.toString();
		return null;
	}

	/**
	 * Définir les prérequis.
	 *
	 * @param requirement La liste de prérequis à définir.
	 */
	public void setRequirement(ArrayList<PartTypeImpl> requirement) {
		Requirement = requirement;
	}

	@Override
	public String toString() {
		return "Requirements [Requirement=" + Requirement;
		//+ ", part=" + part + "]";
	}




}


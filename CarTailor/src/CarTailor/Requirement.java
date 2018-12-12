package CarTailor.src.CarTailor;

import CarTailor.src.Interface.Configurator;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The type Requirement.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public class Requirement {

	private ArrayList<PartTypeImpl> requirementList;
	private HashMap<PartImpl, PartImpl> requirement;

	/**
	 * Constructeur de la classe.
	 *
	 * @param require La liste des prérequis
	 */
	public Requirement(HashMap<PartImpl, PartImpl> require){
		this.requirement = require;
	}

	/**
	 * Obtenir les prérequis.
	 *
	 * @return Retourne la liste des prérequis
	 */
	public String getRequirement() {
		if(this.requirementList != null)
			return this.requirementList.toString();
		return null;
	}

	/**
	 * Définir les prérequis.
	 *
	 * @param requirement La liste de prérequis à définir.
	 */
	public void setRequirement(ArrayList<PartTypeImpl> requirement) {
		requirementList = requirement;
	}

	@Override
	public String toString() {
		return "Requirements [Requirement=" + requirementList;
	}
}


package CarTailor.src.CarTailor;

import CarTailor.src.Interface.CompatibleManager;

import java.util.*;


/**
 * La classe principale de la V1, permet la vérification de la configuration
 */
public class CompatibleManagerImpl implements CompatibleManager {

	private ConfiguratorImpl configurator;
	private HashMap<PartTypeImpl, ArrayList<PartTypeImpl>> incompatibility;
	private HashMap<PartTypeImpl, ArrayList<PartTypeImpl>> requirement;

	/**
	 * Constructeur de la classe
	 *
	 * @param configurator the configurator
	 */
	CompatibleManagerImpl(ConfiguratorImpl configurator) {
		this.configurator = configurator;
		this.incompatibility = new HashMap<>();
		this.requirement = new HashMap<>();
	}

	/**
	 * Ajouter de nouvelles incompatibilités.
	 *
	 * @param partType La référence qui va recevoir de nouvelles incompatibilités
	 * @param partIncomp Les incompatibilités
	 * @return retourne vrai si l'ajout d'incompatibilité à réussi, faux sinon
	 */
	public boolean addInCompPartType(PartTypeImpl partType, PartTypeImpl partIncomp) {
		if (this.incompatibility.containsKey(partType)) {
			this.incompatibility.get(partType).add(partIncomp);
			return true;
		} else if(!this.incompatibility.containsKey(partType)&&!this.incompatibility.containsKey(partIncomp)){
			ArrayList<PartTypeImpl> temp = new ArrayList<>();
			temp.add(partIncomp);
			this.incompatibility.put(partType, temp);
			return true;
		}else {
			return false;
		}
	}

	/**
	 * Ajouter de nouveaux prérequis.
	 *
	 * @param partType La référence qui va recevoir de nouveaux prérequis
	 * @param partRequire Les nouveaux prérequis.
	 * @return retourne vrai si l'ajout de prérequis à réussi, faux sinon
	 */
	public boolean addRequirementPart(PartTypeImpl partType, PartTypeImpl partRequire) {
		if (this.requirement.containsKey(partType)) {
			this.requirement.get(partType).add(partRequire);
			return true;
		} else if(!this.incompatibility.containsKey(partType)&&!this.incompatibility.containsKey(partRequire)){
			ArrayList<PartTypeImpl> temp = new ArrayList<>();
			temp.add(partRequire);
			this.requirement.put(partType, temp);
			return true;
		}else {
			return false;
		}

	}


	/**
	 * Suppression de nouvelles incompatibilités.
	 *
	 * @param partType La référence qui va perdre de nouvelles incompatibilités
	 * @param partRequire Les incompatibilités
	 * @return retourne vrai si la suppression d'incompatibilité à réussi, faux sinon
	 */
	public boolean removeInCompPartType(PartTypeImpl partType, PartTypeImpl partRequire){
		if (this.incompatibility.containsKey(partType)) {
			this.incompatibility.get(partType).remove(partRequire);
			return true;
		}return false;
	}

	/**
	 * Suppression de nouveaux prérequis.
	 *
	 * @param partType La référence qui va perdre de nouveaux prérequis
	 * @param partRequire Les nouveaux prérequis.
	 * @return retourne vrai si la suppression de prérequis à réussi, faux sinon
	 */
	public boolean removeRequirementPart(PartTypeImpl partType, PartTypeImpl partRequire){
		if (this.requirement.containsKey(partType)) {
			this.requirement.get(partType).remove(partRequire);
			return true;
		}return false;
	}

	/**
	 * Verifie que la configuration est complète.
	 * @return retourne vrai si la configuration est complète, faux sinon
	 */
	public boolean isComplete() {
		return this.configurator.getConfig().size() == 4;
	}


	/**
	 * Verifie que la configuration est valide.
	 * @return retourne vrai si la configuration est valide, faux sinon
	 */
	public boolean isValid() {
		boolean correct = this.isComplete();
		if (correct) {
			PartTypeImpl p;
			Iterator<PartTypeImpl> it = this.configurator.getConfig().getConfig().values().iterator();
			while (it.hasNext() && correct) {
				p = it.next();
				correct = this.verifyNonAuthorized(this.incompatibility.get(p))
						&& this.verifyRequirement(this.requirement.get(p));
			}
		}
		return correct;
	}

	/**
	 * Récupère la collection de références incompatibles
	 *
	 * @param refPar La référence dont on veut connaitre la collection de références incompatibles
	 * @return renvoie la collection de références incompatible avec la pièce en question.
	 */
	public Collection<ArrayList<PartTypeImpl>> getIncompPart(PartTypeImpl refPar) throws Exception{
		return this.incompatibility.values();
	}

	/**
	 * Récupère la collection de références prérequis
	 *
	 * @param refPar La référence dont on veut connaitre la collection de références prérequis
	 * @return renvoie la collection de références prérequis à la selection de la pièce en question.
	 */
	public Collection<ArrayList<PartTypeImpl>> getRequirements(PartTypeImpl refPar){
		return this.requirement.values();
	}

	/**
	 * Vérifie que la collection de références séléctionner n'est pas contenu dans la configurateur de voiture
	 *
	 * @param auto La collection sur laquelle on veut faire une vérification
	 * @return retourne vrai si la collection n'est pas présente, faux sinon
	 */
	public boolean verifyNonAuthorized(Collection<PartTypeImpl> auto) {
		boolean correct = true;
		if (auto != null) {
			Iterator<PartTypeImpl> it = auto.iterator();
			Collection<PartTypeImpl> listPartType = this.configurator.getConfig().getConfig().values();
			while (it.hasNext() && correct) {
				correct = !listPartType.contains(it.next());
			}
		}
		return correct;
	}

	/**
	 * Vérifie si tous les prérequis défini par le constructeur de voiture sont contenu dans le configurateur.
	 *
	 * @param require la collection de prérequis
	 * @return retourne vrai si la collection est contenu dans le configurateur, faux sinon
	 */
	public boolean verifyRequirement(Collection<PartTypeImpl> require) {
		if (require != null) {
			return this.configurator.getConfig().getConfig().values().containsAll(require);
		} else {
			return true;
		}
	}


}
package CarTailor.src.CarTailor;

import CarTailor.src.Interface.CompatibilityChecker;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Classe de vérification des compatibilités des références.
 */
public class CompatibilityCheckerImpl implements CompatibilityChecker {


	CompatibleManagerImpl cmi;


	/**
	 * Récupérer les références incompatibles avec la référence voulu.
	 *
	 * @param refPar Le nom de la référence dont on veut avoir les incompatibilités
	 * @return les références incompatibles
	 */
	public Collection<ArrayList<PartTypeImpl>> getIncompPart(PartTypeImpl refPar) throws Exception {
		return cmi.getIncompPart(refPar);
	}

	/**
	 * Récupérer les références requises à la selection d'une référence.
	 *
	 * @param refPar Le nom de la référence dont on veut connaitre les prérequis
	 * @return les références prérequises
	 */
	public Collection<ArrayList<PartTypeImpl>> getRequirements(PartTypeImpl refPar) {

		return cmi.getRequirements(refPar);
	}


}
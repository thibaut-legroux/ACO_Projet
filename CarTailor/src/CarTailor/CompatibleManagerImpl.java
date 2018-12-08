package CarTailor.src.CarTailor;

import CarTailor.PartType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;


public class CompatibleManagerImpl implements CompatibleManager {

	@Override
	public void addInCompPartType(PartType refPart, Iterator<PartType> CollectPart) {
		Objects.requireNonNull(refPart);
		Objects.requireNonNull(CollectPart);
		refPart.addingIncompability(CollectPart);
	}

	public Iterator<PartType> getIncompPart(PartType refPar) throws Exception {
		return refPar.getIncompPartType();
	}

	@Override
	public void removeInCompPartType(PartType refPart, Collection<PartType> collectPartType) {
		List<PartType> listeIncompatiblity = new ArrayList<PartType>();
		//recupration de la collection de partType iincompatible;
		while(refPart.getIncompPartType().hasNext()) {
			listeIncompatiblity.add(refPart.getIncompPartType().next());
		}
		//suppression
		while(listeIncompatiblity.iterator().hasNext()) {
			
			if(collectPartType.contains(listeIncompatiblity.iterator().next())){		
				listeIncompatiblity.remove(listeIncompatiblity.iterator().next());
			}
		}	
	}

	@Override
	public void addRequirementPart(PartType refPart, Iterator<PartType> collectPartType) {
		List<PartType> listRequired = new ArrayList<PartType>() ;
		List<PartType> listPartType = new ArrayList<PartType>() ;;
		//recupration de la listRequirement du part
		while(refPart.getRequirement().hasNext()) {
			listRequired.add(refPart.getRequirement().next());
		}
		//recupration de la listRequirement  du part supprimer 
		while(collectPartType.hasNext()) {
			listPartType.add(collectPartType.next());
		}
		//l'ajout
		while(collectPartType.hasNext()) {
			if(!listRequired.contains(collectPartType.next())) {
				listRequired.add(collectPartType.next());
			}
		}	
	}
	@Override
	public void removeRequirementPart(PartType refPart, Iterator<PartType> collectPartType) {
		List<PartType> listRequired = new ArrayList<PartType>() ;
		List<PartType> listPartType = new ArrayList<PartType>() ;;
		//recupration de la listRequirement du part
		while(refPart.getRequirement().hasNext()) {
			listRequired.add(refPart.getRequirement().next());
		}
		//recupration de la listRequirement  du part supprimer 
		while(collectPartType.hasNext()) {
			listPartType.add(collectPartType.next());
		}
		//suppression
		while(collectPartType.hasNext()) {
			if(listRequired.contains(collectPartType.next())) {
				listRequired.remove(collectPartType.next());
			}
		}		
	}

	public Iterator<PartType> getRequirements(PartType refPart) {
		return refPart.getRequirement();
	}	
}
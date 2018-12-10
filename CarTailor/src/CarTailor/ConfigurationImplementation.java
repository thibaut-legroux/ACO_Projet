package CarTailor.src.CarTailor;

import CarTailor.src.Interface.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class ConfigurationImpl implements Configuration, Observer, CompatibilityChecker {
  
	public Collection<Part> listPart;
	@Override
	public void addPart(Part partType) {
		if(!listPart.contains(partType)) {
			listPart.add(partType);
		}
	}

	@Override
	public void removePart(Part part) {
		if(listPart.contains(part)) {
			listPart.remove(part);
		}
	}

	public void update(Observable o) {
		if(listPart.contains(o)){
			listPart.add((Part) o);
		}
	}

	@Override
	public Iterator<PartType> getIncompPart(PartType refPar) throws Exception {
		return refPar.getIncompPartType();
	}
	@Override
	public Iterator<PartType> getRequirements(PartType refPar) {
		return refPar.getRequirement();
	}
	@Override
	public boolean iSCompatible() {
		boolean test = true;
		List<PartType> courantListe = new ArrayList<PartType>();
		Iterator<Part> it = this.listPart.iterator();
		while(it.hasNext()) {
		Iterator<PartType> itCollectionPartType	= it.next().getPartType();
			while(itCollectionPartType.hasNext()) {
				PartType courant = itCollectionPartType.next(); 
				while(courant.getRequirement().hasNext()) {
						courantListe.add(courant.getRequirement().next());
				}
				while(courant.getIncompPartType().hasNext()) {
					if(courantListe.contains(courant.getIncompPartType().next())) {
						test = false;
					}else {
						test = true;
					}
				}			
			}
			courantListe.clear();
		}
		return test;
	}
	@Override
	public boolean iSValide() {
		boolean test = false;
		Iterator<Part> it = this.listPart.iterator();
		while(it.hasNext()) {
		//Iterator<PartType> itCollectionPartType	= it.next().getPart();

			 
		}
		// TODO Auto-generated method stub
		return false;
	}
}

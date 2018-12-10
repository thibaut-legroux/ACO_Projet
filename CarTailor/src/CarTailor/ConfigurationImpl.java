package CarTailor.src.CarTailor;

import CarTailor.src.Interface.*;
import CarTailor.src.Interface.Observable;
import CarTailor.src.Interface.Observer;

import java.util.*;

public class ConfigurationImpl implements Configuration, Observable<Configuration> {
  
	private Map<CategoryImpl, PartTypeImpl> config;
	private Collection<Observer<Configuration>> observer;

	public ConfigurationImpl(){
		this.config = new HashMap<CategoryImpl, PartTypeImpl>();
		this.observer = new ArrayList<>();
	}

	public Map<CategoryImpl, PartTypeImpl> getConfig(){
		return this.config;
	}

	@Override
	public void addPart(PartTypeImpl p) {
		if (p == null) {
			throw new NullPointerException();
		} else {
			this.config.put(p.getCategory(), p);
			this.notifyObservers();
		}
	}

	@Override
	public void removePart(PartTypeImpl p) {
		if(this.config.containsValue(p)) {
			this.config.remove(p.getCategory());
			this.notifyObservers();
		}
	}

	/*@Override
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
	}*/

	@Override
	public PartTypeImpl getSelection(CategoryImpl c) {
		return this.config.get(c);
	}

	public int size(){
		return this.config.size();
	}

	@Override
	public void addObserver(Observer<Configuration> o) {
		observer.add(o);
	}

	@Override
	public void deleteObserver(Observer<Configuration> o) {
		observer.remove(o);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer<Configuration>> it = observer.iterator();
		while(it.hasNext()){
			 it.next().update(this);
		}
	}

	@Override
	public boolean isRegistered(Observer<Configuration> o) {
		return observer.contains(o);
	}
}

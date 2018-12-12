package CarTailor.src.CarTailor;

import CarTailor.src.Interface.*;
import CarTailor.src.Interface.Observable;
import CarTailor.src.Interface.Observer;

import java.util.*;

/**
 * The type Configuration.
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public class ConfigurationImpl implements Configuration, Observable<Configuration> {
  
	private Map<CategoryImpl, PartTypeImpl> config;
	private Collection<Observer<Configuration>> observer;

	/**
	 * Constructeur de la classe Configuration.
	 */
	public ConfigurationImpl(Collection<CategoryImpl> catColl){
		this.config = new HashMap<>();
		this.observer = new ArrayList<>();

		Iterator<CategoryImpl> it = catColl.iterator();
		while(it.hasNext()){
			this.config.put(it.next(), null);
		}
	}

	/**
	 * Obtenir les configuration possible.
	 *
	 * @return la liste des incompatibilités et prérequis
	 */
	public Map<CategoryImpl, PartTypeImpl> getConfig(){
		return this.config;
	}

	/**
	 * Ajouter une référence au configurateur.
	 * @param p La référence à ajouter
	 */
	public void addPart(PartTypeImpl p) {
		if (p == null) {
			throw new NullPointerException();
		} else {
			this.config.put(p.getCategory(), p);
			this.notifyObservers();
		}
	}

	/**
	 * Supprimer une référence du configurateur.
	 * @param p La référence à supprimer
	 */
	public void removePart(PartTypeImpl p) {
		if(this.config.containsValue(p)) {
			this.config.remove(p.getCategory());
			this.notifyObservers();
		}

	}

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

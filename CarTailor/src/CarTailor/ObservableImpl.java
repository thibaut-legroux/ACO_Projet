package CarTailor.src.CarTailor;

import CarTailor.src.CarTailorConfiguration.Observer;

import java.util.List;
import java.util.ArrayList;

public class ObservableImpl<T> implements carTailorConfigurator.Observable {
	private List<Observer> observers = new ArrayList<>();
	private int etat;
	
	
	public int getEtat() {
		return etat;
	}
	
	@Override
	public void deleteObserver(Observer o) {
		observers.remove(o);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update(this);
		}

	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void setEtat(int etat) {
		this.etat = etat;
		notifyObservers();
	}
	
	@Override
	public boolean isRegistered(Observer o) {
		if(observers.contains(o)){
			return true;
		}else{
			return false;
		}
	}
}
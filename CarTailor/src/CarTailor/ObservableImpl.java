package CarTailor.src.CarTailor;

import CarTailor.src.Interface.Configuration;
import CarTailor.src.Interface.Observable;
import CarTailor.src.Interface.Observer;

import java.util.List;
import java.util.ArrayList;

public class ObservableImpl<T> implements Observable {
	private List<Observer<Configuration>> observers = new ArrayList<>();
	private int etat;

	@Override
	public void addObserver(Observer o) {

	}

	@Override
	public void deleteObserver(Observer o) {

	}

	@Override
	public void notifyObservers() {

	}

	@Override
	public boolean isRegistered(Observer o) {
		return false;
	}
	
	/*
	public int getEtat() {
		return etat;
	}
	
	@Override
	public void deleteObserver(Observer<Configuration> o) {
		observers.remove(o);
	}
	
	@Override
	public void notifyObservers() {
		for(Observer<Configuration> o : observers) {
			o.update(this);
		}

	}

	@Override
	public void addObserver(Observer<Configuration> o) {
		observers.add(o);
	}

	public void setEtat(int etat) {
		this.etat = etat;
		notifyObservers();
	}
	
	@Override
	public boolean isRegistered(Observer<Configuration> o) {
		if(observers.contains(o)){
			return true;
		}else{
			return false;
		}
	}*/
}
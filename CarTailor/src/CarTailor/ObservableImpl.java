package CarTailor.src.CarTailor;

import CarTailor.src.Interface.Configuration;
import CarTailor.src.Interface.Observable;
import CarTailor.src.Interface.Observer;

import java.util.List;
import java.util.ArrayList;

/**
 * Design Pattern ObservableImpl
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
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
	

}
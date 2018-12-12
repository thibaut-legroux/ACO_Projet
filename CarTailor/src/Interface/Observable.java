package CarTailor.src.Interface;

/**
 * Observable
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public interface Observable<T> {
	void addObserver(Observer<T> o);
	void deleteObserver(Observer<T> o);
	void notifyObservers();
	boolean isRegistered(Observer<T> o);

}
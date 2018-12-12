package CarTailor.src.Interface;

/**
 * Observer
 *
 * @author Legroux
 * @author Mande
 * @author Scrimali
 */
public interface Observer<C> {
	void update(CarTailor.src.Interface.Observable o);
}
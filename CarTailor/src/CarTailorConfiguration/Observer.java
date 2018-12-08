package CarTailor.src.CarTailorConfiguration;

public interface Observer {
	public void update(carTailorConfigurator.Observable o);

	void update(CarTailor.src.CarTailor.ObservableImpl<T> tObservable);
}
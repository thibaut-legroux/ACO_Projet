package carTailorConfigurator;

public interface Observable {
	//permet à l'observateur de s'inscrire
	public void addObserver(Observer o);
	//supprimer un observateur
	public void deleteObserver(Observer o);
	//notifier tous les observateurs
	public void notifyObservers();
	public boolean isRegistered(Observer o);
}
package tools;

public interface Observable {

	
	public void notifyObserver(Object object);
	
	public void addObserver(Observer observer);

}

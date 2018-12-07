package tools;

import java.util.LinkedList;
import java.util.List;

public abstract class ObservableAdapter implements Observable {

	private List<Observer> listObserver=new LinkedList<Observer>();
	
	@Override
	public void notifyObserver(Object object){
		for(Observer observer: listObserver){
			observer.update(object);
		}
	}
	
	@Override
	public void addObserver(Observer observer){
		this.listObserver.add(observer);
		//notifyObserver(observer);
	}

}

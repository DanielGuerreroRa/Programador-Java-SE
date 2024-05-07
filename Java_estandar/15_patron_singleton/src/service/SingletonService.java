package service;

public class SingletonService {
	private static SingletonService instance;
	private SingletonService() {
		instance=this;
	}
	public static SingletonService getInstance() {
		if(instance==null) {
			new SingletonService();
		}
		return instance;
	}
	
}

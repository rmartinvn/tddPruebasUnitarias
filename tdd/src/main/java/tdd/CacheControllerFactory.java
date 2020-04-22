package tdd;

public class CacheControllerFactory {
	
	private CacheControllerFactory() {
		
	}
	
	public static CacheController getInstance() {
		return new CacheController();
	}
}

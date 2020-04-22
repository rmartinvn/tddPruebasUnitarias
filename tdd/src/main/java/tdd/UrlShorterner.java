package tdd;

public class UrlShorterner {
	
	private CacheController cacheController;
	
	public UrlShorterner() {
		this.cacheController=CacheControllerFactory.getInstance();
	}
	
	public String shorter(String url) {
		return this.cacheController.shortUrl(url);
	}
	
	public String reverseUrl(String url) {
		return this.cacheController.reverseUrl(url);
	}
}

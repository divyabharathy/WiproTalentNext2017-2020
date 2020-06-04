public class Test1 {
	public static void main(String[] args){
		Country c = new Country();
		c.saveCountryNames("India");
		c.saveCountryNames("China");
		c.saveCountryNames("Pakistan");
		System.out.println("The set has the country:" + c.getCountry("China"));
	}
}

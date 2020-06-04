public class Test4{
	public static void main(String[] args){
		Country2 c = new Country2();
		c.saveCountryNames("India");
		c.saveCountryNames("China");
		c.saveCountryNames("Pakistan");
		System.out.println("The set has the country:" + c.getCountry("China"));
	}
}

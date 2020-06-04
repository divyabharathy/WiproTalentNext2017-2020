import java.util.*;
public class Country2 {
	TreeSet<String> ts = new TreeSet<>();
	public TreeSet<String> saveCountryNames(String CountryName){
		ts.add(CountryName);
		return ts;
	}
	public String getCountry(String CountryName){
		System.out.println(ts);
		Iterator<String> i = ts.iterator();
		while(i.hasNext()){
			if(i.next()==CountryName){
				return CountryName;
			}

		}
		return null;
	}
}

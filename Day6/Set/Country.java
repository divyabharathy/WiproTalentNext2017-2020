import java.util.*;
public class Country {
	HashSet<String> hs = new HashSet<>();
	public HashSet<String> saveCountryNames(String CountryName){
		hs.add(CountryName);
		return hs;
	}
	public String getCountry(String CountryName){
		System.out.println(hs);
		Iterator<String> i = hs.iterator();
		while(i.hasNext()){
			if(i.next()==CountryName){
				return CountryName;
			}

		}
		return null;
	}
}

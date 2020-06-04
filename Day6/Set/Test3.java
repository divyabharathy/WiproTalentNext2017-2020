import java.util.*;

public class Test3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		TreeSet<String> ts = new TreeSet<>();
		/*
		For reverse order
		Collection<String> ts = new TreeSet<>(Collections.reverseOrder());
		*/
		System.out.println("Enter no:of Names:");
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			ts.add(s.next());
		}
		String search ="John";
		Iterator<String> i = ts.iterator();
		while (i.hasNext())
			if(i.next().equals(search))
				System.out.println("Name found");
	}
}

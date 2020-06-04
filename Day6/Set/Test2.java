import java.util.*;

public class Test2 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		HashSet<String> hs = new HashSet<>();
		System.out.println("Enter no:of Employees:");
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			hs.add(s.next());
		}
		Iterator<String> i = hs.iterator();
		while (i.hasNext())
			System.out.println(i.next());

	}
}

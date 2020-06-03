import java.util.*;
public class Prog3 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Hi");
		l.add("Hello");
		l.add("Welome");
		printAll(l);
	}
	public static void printAll(List<String> list) {
		Iterator<String> i = list.iterator();
		while (i.hasNext())
			System.out.println(i.next());
	}
}

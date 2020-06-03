import java.util.*;
public class Prog1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		prog1 list = new prog1();
		System.out.println("Enter no:of even numbers:");
		int n=s.nextInt();
		list.saveEvenNumbers(n);
		list.printEvenNumbers();
	}
	private ArrayList<Integer> l = new ArrayList();
	public ArrayList<Integer> saveEvenNumbers(int n) {
			for (int i = 2; i <= n; i++) {
				if (i % 2 == 0)
					l.add(i);
			}
			return l;
	}
	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> l2 = new ArrayList<>();
		for (int i : l) {
			l2.add(i * 2);
			System.out.println(i * 2);
		}
		return l2;
	}
}

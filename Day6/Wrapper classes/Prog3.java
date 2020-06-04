import java.util.*;
public class Prog3{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s =String.format("%8s", Integer.toBinaryString(n));
		String s1 = s.replace(' ', '0');
		System.out.println(s1);

	}

}
© 2020 GitHub, Inc.

import java.util.*;
public class Prog4 {
	public static void main(String[] args) {
		List<Object> l = new NewArray<>();
		l.add(10);
		l.add(2.3f);
		l.add(12.34d);
		l.add("String");//throws exception

	}
}
class NewArray<E> extends ArrayList<E> {
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
				return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}

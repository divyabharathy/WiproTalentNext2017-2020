public class Student1 extends Person {
	private int myIdNum;
	public Student1(String name, int idNum) {
		super(name);
		myIdNum = idNum;
	}
	public int getIdNum(){
		return myIdNum;
	}
	public void setIdNum(int idNum){
		myIdNum = idNum;
	}
	public String toString(){
		return super.toString() + ", student id: " + myIdNum ;
	}

}

public class CollegeStudent extends Student1{
	private int yr;
	private String m;
	public CollegeStudent(String n, int id,int year,String major) {
		super(n,id);
		yr=year;
		m=major;
	}
	public int getYr(){
		return yr;
	}
	public void setYr(int year){
		yr = year;
	}
	public String getM()
	{
		return m;
	}
	public void setM(String major)

	{
		m=major;
	}
	public String toString(){
		return super.toString() + ", student id: " + super.toString()+", year:"+yr+", major:"+m;
	}
}

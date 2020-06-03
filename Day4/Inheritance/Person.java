public class Person{
    
        String name;
        public Person(String ne)
        {
           public void setName(String)
            {
                name=ne;
            }
            public String getName()
            {
                return name;
            }
            public String toString()
            {
                return name;
            }
    }
}
class Employee extends Person{
    super(ne);
        double annual_salary;
        int start_year;
        String national_number;
    public Employee(String ne,double a,int yr,String n)
    { 
        void setSalary(double){
            annual_salary=a;
        }
        void setYear(int){
            start_year=yr;
        }
        void setNumber(String){
            national_number=n;
        }
        public double getSalary(){
            return annual_salary;
        }
        public int getYear(){
            return start_year;
        }
        public double getNumber(){
            return natonal_number;
        }
        public String toString()
        {
            return super.toString()+""+annual_salary+""+start_year+""national_number;
        }
}
class TestEmployee{
    Person p =new Person("DB");
    Employee e= new Employee("Divya","40000","2020","qwdf");
    System.out.println(p);
    System.out.println(e);
}

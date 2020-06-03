public class Test1{
    public static void main(String[]args){
        Person p= new Person("John");
        Student1 s=new Student1("Jason",7005);
        Teacher t = new Teacher("Cerena",35000,"Chemistry");
        CollegeStudent cs = new CollegeStudent("Olivya",7020,3,"CSE");
        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        System.out.println(cs);
    }
}

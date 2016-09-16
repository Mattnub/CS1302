/************************************
            Matthew Whalley
                Lab #2
            August 22, 2016
 *************************************/
public class Student extends Person {
    /** Properties **/
    private int studentNum;
    private String major;
    private double gpa;

    /** Constructors **/
    public Student(){
        super();
        setStudentNum(0);
        setMajor("");
        setGpa(0.0);
    }
    public Student(String fn, String ln, Address ad, String em, int sn, String m, double g){
        super(fn, ln, ad, em);
        setStudentNum(sn);
        setMajor(m);
        setGpa(g);
    }

    /** Behaviors **/
    public void setStudentNum(int sNum){
        studentNum = sNum;
    }
    public int getStudentNum(){
        return studentNum;
    }
    public void setMajor(String m){
        major = m;
    }
    public String getMajor(){
        return major;
    }
    public void setGpa(double gr){
        gpa = gr;
    }
    public double getGpa(){
        return gpa;
    }

    public void display(){
        super.display();
        System.out.println("Student ID:\t" + getStudentNum());
        System.out.println("Major:\t" + getMajor());
        System.out.println("GPA:\t" + getGpa());
    }

    public static void main(String[] args){
        Student s1;
        s1 = new Student("Bob", "Joe", new Address("63 Deer", "Venison", "GA", 30205),
                "bobjoe@gmail.com", 12345, "Hunting", 3.2);
        s1.display();

        Address a1;
        a1 = new Address("666 Lucifer Way", "River Styx" , "Underworld" , 66666);

        Student s2;
        s2 = new Student();
        s2.setFirstName("Beelzebub");
        s2.setLastName("Jones");
        s2.setAddress(a1);
        s2.setEmail("Bjones666@gmail.com");
        s2.setStudentNum(54321);
        s2.setMajor("Religion");
        s2.setGpa(4.0);
        s2.display();
    }
}

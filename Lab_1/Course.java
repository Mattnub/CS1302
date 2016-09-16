/************************************
               Matthew Whalley
                  Lab #1_1
               August 22, 2016
*************************************/

public class Course{
   /* Constructors */
   public Course(){
      setCourseId(0);
      setCourseName("");
      setDescription("");
      setCreditHours(0);
   }
   
   public Course(int newCourseId, String newCourseName,
    String newDescription, int newCreditHours){
      setCourseId(newCourseId);
      setCourseName(newCourseName);
      setDescription(newDescription);
      setCreditHours(newCreditHours);               
   }
   /* Properties */
   private int courseId;
   private String courseName;
   private String description;
   private int creditHours;
   
   /* Behaviors */
   public void setCourseId(int cId){
      courseId = cId;
   }
   public int getCourseId(){
      return courseId;
   }
   public void setCourseName(String cName){
      courseName = cName;
   }
   public String getCourseName(){
      return courseName;
   }
   public void setDescription(String desc){
      description = desc;
   }
   public String getDescription(){
      return description;
   }
   public void setCreditHours(int cHour){
      creditHours = cHour;
   }
   public int getCreditHours(){
      return creditHours;
   }
   public void display(){
      System.out.println("Course ID = " + getCourseId());
      System.out.println("Course Name = " + getCourseName());
      System.out.println("Description = " + getDescription());
      System.out.println("Credit Hours = " + getCreditHours());
      System.out.println();
   }
   
   public static void main(String[] args){
   
      Course c1;
      c1 = new Course(1302, "Programming II", "Description", 4);
      c1.display();
      
      Course c2 = new Course();
      c2.display();
   }//end main
}//end class    
             
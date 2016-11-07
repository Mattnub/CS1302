/****************************
 Matthew Whalley
 Mini-Project 2
 18 October 2016
 ****************************/
public class AppointmentList {

    /** Properties **/
    private Appointment[] appointmentArr = new Appointment[10];
    private int count = 0;

    /** Constructors **/
    public AppointmentList(){
        setCount(0);
    }

    public Appointment[] getAppointmentArr() {
        return appointmentArr;
    }

    /** Behaviors **/
    public void setCount(int c){
        count = c;
    }
    public int getCount(){
        return count;
    }
    public void addAppointment(Appointment a){
            appointmentArr[count] = a;
            count++;
    }

    public void display(){
        for(int i = 0; i < count; i++){
            appointmentArr[i].display();
        }
    }

    public static void main(String[] args) throws Exception{
        Appointment appoint1;
        appoint1 = new Appointment("Dec 1, 2013, 9am", "P321", "D201", "A900");
        Appointment appoint2;
        appoint2 = new Appointment("1","2","3","4");

        AppointmentList apList;
        apList = new AppointmentList();
        apList.addAppointment(appoint1);
        apList.addAppointment(appoint2);

        apList.display();
    }
}

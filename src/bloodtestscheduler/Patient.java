/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author gregm
 */
public class Patient implements Comparable<Patient> {//patient class holds and declares all the needed variables and methods to let you compare patients based on priority

    private int appointmentNum;//var to hold onto the appointment number added
    private String Firstname;//var to hold onto the appointment number added
    private String surname;//var to hold onto the asurname added
    private String Email;//var to hold onto the email added
    private String bloodTestType;//var to hold onto theblood test type added
    private int priorityNum;////var to hold onto the priority number added
    private String gpEmailAddress;//var to hold onto the gp email address added
    private String gpNotes;//var to hold onto the gp notes added
    private String appointmentStatus;//var to hold onto the appointment statu
    private int age;////var to hold onto the \ge added

    public Patient(int appointmentNum, String Firstname, String surname, String Email,String bloodTestType, int priorityNum, String gpEmailAddress, String gpNotes, String appointmentStatus, int age) {//constructore for patient obj in order to save the corresponding data
        this.appointmentNum = appointmentNum;
        this.Firstname = Firstname;
        this.surname = surname;
        this.Email = Email;
        this.bloodTestType = bloodTestType;
        this.priorityNum = priorityNum;
        this.gpEmailAddress = gpEmailAddress;
        this.gpNotes = gpNotes;
        this.appointmentStatus = appointmentStatus;
        this.age = age;
    }

    public int getAppointmentNumber() {//getters and setters auto generated via nebeans
        return appointmentNum;
    }

    public void setAppointmentNumber(int appointmentNum) {
        this.appointmentNum = appointmentNum;
    }

    public String getfName() {
        return Firstname;
    }

    public void setfName(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return Email;
    }

    public void setEmailAddress(String Email) {
        this.Email = Email;
    }

    public String getBloodTestType() {
        return bloodTestType;
    }

    public void setBloodTestType(String bloodTestType) {
        this.bloodTestType = bloodTestType;
    }

    public int getPriority() {
        return priorityNum;
    }

    public void setPriority(int priorityNum) {
        this.priorityNum = priorityNum;
    }

    public String getGpEmailAddress() {
        return gpEmailAddress;
    }

    public void setGpEmailAddress(String gpEmailAddress) {
        this.gpEmailAddress = gpEmailAddress;
    }

    public String getGpNotes() {
        return gpNotes;
    }

    public void setGpNotes(String gpNotes) {
        this.gpNotes = gpNotes;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {//toString auto generated via netbeans
        return "Patient{" + "appointmentNum=" + appointmentNum + ", Firstname=" + Firstname + ", surname=" + surname
                + ", Email=" + Email + ", bloodTestType=" + bloodTestType + ", priorityNum=" + priorityNum
                + ", gpEmailAddress=" + gpEmailAddress + ", gpNotes=" + gpNotes + ", appointmentStatus=" + appointmentStatus
                + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Patient o) {//compare to method is used
        return Integer.compare(this.priorityNum, o.priorityNum);//compares this patients priority num eith another for sorting 
    }//end
}//end

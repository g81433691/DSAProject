/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author gregm
 */
public class Patient implements Comparable<Patient> {

    private int appointmentNumber;
    private String fName;
    private String surname;
    private String emailAddress;
    private String bloodTestType;
    private int priority;
    private String gpEmailAddress;
    private String gpNotes;
    private String appointmentStatus;
    private int age;

    public Patient(int appointmentNumber, String fName, String surname, String emailAddress, String bloodTestType, int priority, String gpEmailAddress, String gpNotes, String appointmentStatus, int age) {
        this.appointmentNumber = appointmentNumber;
        this.fName = fName;
        this.surname = surname;
        this.emailAddress = emailAddress;
        this.bloodTestType = bloodTestType;
        this.priority = priority;
        this.gpEmailAddress = gpEmailAddress;
        this.gpNotes = gpNotes;
        this.appointmentStatus = appointmentStatus;
        this.age = age;
    }

    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBloodTestType() {
        return bloodTestType;
    }

    public void setBloodTestType(String bloodTestType) {
        this.bloodTestType = bloodTestType;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
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
    public int compareTo(Patient o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

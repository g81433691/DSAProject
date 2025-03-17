/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.PriorityQueue;

/**
 *
 * @author gregm
 */
import java.util.ArrayList;

public class Appointment {

    private MyPriorityQ appointmentQueue;
    private ArrayList<Patient> patientList;

    public Appointment() {
        appointmentQueue = new MyPriorityQ();
        patientList = new ArrayList<>();
    }

    public void saveAppointment(int priority, Patient patient) {
        appointmentQueue.enqueue(priority, patient);
        patientList.add(patient); 

    }

    public void updateAppointment(int appointmentNumber, Patient patient) {
    }

    public void deleteAppointment(int appointmentNumber) {
        appointmentQueue.dequeue();
    }

    public Patient readAppointment(int appointmentNumber) {
        return null;
    }

    public Patient readNextAppointment() {
        return null;
    }

    public void populateTable() {
    }
}

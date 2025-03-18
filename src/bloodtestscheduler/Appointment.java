/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;
/**
 *
 * @author gregm
 */
public class Appointment {//start class appointmnet
    private PriorityQueueADT appointmentQueue;//declaring the pq for storage based on priority of patients 
    private QueueADT fcfsQ;//Queue that follows the fcfs approach      
    private ArrayList<Patient> patientList;   //arraylist in order to hold onto all parient   

    // Constructor
    public Appointment(PriorityQueueADT pq, QueueADT fcfsQ) {//using the constrcutor to init the apppointment with a pq, queue and empty storing spaces
        this.appointmentQueue = pq;
        this.fcfsQ = fcfsQ;
        this.patientList = new ArrayList<>();
    }//end constrcutor

    public void saveAppointment(int priorityNum, Patient patient) {//method in order to save one patient to 2 queues
        appointmentQueue.enqueue(priorityNum, patient);//enqueue and pass in the priority and also the patient obj

        fcfsQ.enqueue(patient.toString()); //add in the patient to the queue
        
        patientList.add(patient);//store them within the list of patients
    }

    public void deleteAppointment() {//method in order to save one patient to 2 queues
        appointmentQueue.dequeue();//returns the element at the front of he q and removes is
        fcfsQ.dequeue();//returns the element at the front of he q and removes is
    }//end delete appointment method
}//end class

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author EThornbury but i gregm will comment to thoroughly demonstrate my understanding
 */
public interface PQInterface {//start//this pqueue interface is for setting the rules for a pqueue based on the priority's value
    public void enqueue(int priority, Object element);//is used in order to add a new element to the pq and hold its priority given
    public int size();//is used to determin and returns the size of the pq
    public boolean isEmpty();//is used to determine weather the pq is empty
    public Object dequeue();//is used in order to remove and retrun the elem with the highest priority
    public String printPQueue();//is used to print our the content within the pq
}//end


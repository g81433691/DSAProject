/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author EThornbury but i gregm will comment to thoroughly demonstrate my understanding
 */
public interface QueueInterface {//start//this queue interface is for setting the rules for a queue with first in first out functionality or FCFS,
    public int size();//is used to determine the size of the queue
    public boolean isEmpty();//is used to determine if the queue is emppty
    public void enqueue(Object element);//adds a element to the end of the q
    public Object dequeue();//returns the element at the front of he q and removes is
    public Object frontElement();//used to get the first element in the queue without affecting it, it wont be removed
}//end

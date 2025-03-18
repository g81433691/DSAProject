/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 *
 * @author EThornbury but i gregm may have made some minor changes and comments to demonstrate a clear uderstanding
 */

public class PriorityQueueADT implements PQInterface {//implementing the interface to follow a traditonal queues function 
    private ArrayList<PQElement> thePQueue;//declarn the arraylist that will be used to hold the elemtnts from within the pqueue

    public PriorityQueueADT() {//a constructor to intialize 
        thePQueue = new ArrayList<>();//intiialize the empty array that will store the pqueue's elements
    }//end

    @Override
    public boolean isEmpty() { //start is empty
        return thePQueue.isEmpty();//is used to determine if the queue is empty 
    }//end is empty
    
    @Override
    public int size(){//start
        return thePQueue.size();//is used to determine the size of the q
    }//end
    
    private int findInsertPosition(int newkey){  
        PQElement temp;//make a temporary element in order to hold onto the item we get so we can retreive its key

        int currPosition = 0;//init here because its what will be returned when we get there

	//iterate over the priority queue and check the key of every elementby using a temp
        System.out.println("inside findInsertKey loop. newkey = " +newkey);
        for (currPosition = 0; currPosition < thePQueue.size(); currPosition++) {
            System.out.println("inside findInsertKey loop position = " +currPosition);//notify the end user the value of new key in the loop
            temp = thePQueue.get(currPosition); //store the elem at the current position into temp 
            if(temp.getPriority()< newkey){  //compare the priority's
                break; //if less then quit as you have it, gets returned below
            }//end if
        }//end for
         return currPosition;//return the insert position
    }//end
    
    // new element with a given key and object info will be added 
    @Override
    public void enqueue(int priorityKey, Object item){//start enqueue
        //make a instance of PQ Element for it be added to q from incoming data 
        PQElement temp = new PQElement(priorityKey, item);
        //use method to get the place the element is going to be added/inserted
        int index = findInsertPosition(priorityKey);

        if (index > size())//checking if the index has exceeded the size of the queue
            thePQueue.add(temp);//add the element to the end
        else//else 
            thePQueue.add(index, temp);//add it in at the specfic insertion point neccesary
    }//end

    @Override
    public Object dequeue(){//start
       return thePQueue.remove(0);//returns the element at the front of he q and removes is
    }//end
    
    @Override
    public String printPQueue(){//method used to print out the priority que
        PQElement temp;//a var to hold onto each elem of the pq we iterate over
        String txt = new String();//create an empty string
        for (int i = 0; i<thePQueue.size(); i++){//loop for the size of the PQ
            temp = thePQueue.get(i);//while we have it get the elem at index i in the q
            txt = txt.concat("Key = "+temp.getPriority()+" Element= "+temp.getElement()+ "\n");//concay the elems priority level to the string and skip to a next line soo theyre not concataneted themselfes
            
        }//end for
         return txt;//return 
    }//end method

}//end class

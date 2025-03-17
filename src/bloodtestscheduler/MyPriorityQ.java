/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 *
 * @author EThornbury
 */
import java.util.ArrayList;

public class MyPriorityQ implements PQInterface {

    private ArrayList<PQElement> thePQueue;//making the array list for priority Q

    public MyPriorityQ() {
        thePQueue = new ArrayList<>();//init the arraylist
    }

    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    @Override
    public int size() {
        return thePQueue.size();
    }

    private int findInsertPosition(int newkey) {
        PQElement temp; //create a temp elem to hold the item we find so we can see its key

        int currPosition = 0; //declare here as this is what we will send back

        //loop over the PQ and check the key of each elem by utilising a temp 
        System.out.println("inside findInsertKey loop. newkey = " + newkey);
        for (currPosition = 0; currPosition < thePQueue.size(); currPosition++) {
            System.out.println("inside findInsertKey loop position = " + currPosition);
            temp = thePQueue.get(currPosition); //store the elem at the current position into temp 
            if (temp.getPriority() < newkey) {  //compare the priority's
                break; //if less then quit as you have it, gets returned below
            }
        }
        return currPosition;

    }

    @Override
    public void enqueue(int priorityKey, Object item) {
        //create an instance of PQElement to be added to q from incoming data 
        PQElement temp = new PQElement(priorityKey, item);
        //use method to get the index the elem is to be added
        int index = findInsertPosition(priorityKey);

        if (index > size()) {
            thePQueue.add(temp);
        } else {
            thePQueue.add(index, temp);
        }
    }

    //the first element has the highest priority
    @Override
    public Object dequeue() {
        return thePQueue.remove(0);
    }

    @Override
    public String printPQueue() {
        PQElement temp;
        String txt = new String();
        for (int i = 0; i < thePQueue.size(); i++) {
            temp = thePQueue.get(i);
            txt = txt.concat("Key = " + temp.getPriority() + " Element= " + temp.getElement() + "\n");

        }
        return txt;
    }

}

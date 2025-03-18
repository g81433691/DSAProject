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
public class QueueADT implements QueueInterface{//implementing the interface to follow a traditonal queues function 
    
    private ArrayList<String> theQ; //declarn the arraylist that will be used to hold the elemtnts from within the queue
    
    public QueueADT(){//a constructor to intialize 
        theQ = new ArrayList<>(); //intiialize the empty array that will store the queue's elements
    }//end constrcr
    
    @Override
    public int size(){//used to determine the size of said queue
       return theQ.size(); //inside our own size() we are using the size() on our arraylist
    }//end size
    
    @Override
    public boolean isEmpty(){//is used to determine if the queue is empty
        return theQ.isEmpty();//return true or false , boolean, if the queue is empty or not
    }//end is empty
    
    @Override
    public void enqueue(Object element){//start enqueue
        theQ.add((String) element);//adds a element string to the end of the q
    }//end 
    
    @Override
    public Object dequeue(){//start dequeue
        return theQ.remove(0);//returns the element at the front of he q and removes is
    }
    @Override
    public Object frontElement(){//start front elemet
        if(!theQ.isEmpty()){ //determine if the queue is emptu
            return theQ.get(0);//if its not return the first n line 0 indec
        }else{ //nothing to return
            return null;//return nothing
        }//end else
    }//end 
    
    public String displayQueue(){
        String str = ""; //using this as its a bit more familiar
       if(theQ.isEmpty()){//determine if the queue is empty
           str = str.concat("Queue is empty"); //notify the end user the queue is empty
       }else{//else confisiton
           for (int i=0; i<theQ.size();i++){//loop iterate through the q
               str = str.concat(theQ.get(i));//get index of the q 
               str = str.concat(" ; "+ "\n");//and next line to stop each print from being concataneted (stuck together)
           }//end for
       }//end else 

        
       return str;//return the sttring
   }//end
    
}//end class



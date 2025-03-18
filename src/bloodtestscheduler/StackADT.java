/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Ethornbury but i gregm made some changes i learned in class and also implemented generic param to represent expecting any data type E in this case. learned Github.io. (2025). Page Restricted. [online] Available at: https://sbme-tutorials.github.io/2020/data-structure-FALL/notes/week06a.html [Accessed 18 Mar. 2025].
 */

public class StackADT<E> implements StackInterface<E> {//implementing the intergave using a generic param <E> to represent an obj and alot of flexibility in datatypes
    private ArrayList<E> noShowerStack;//an arraylist that will be used to hold the stack objects <E> which is patient obj in this program
    private static int Maximum = 5; //setting the maximum limit of objects within the stack using a simple integer set to 5

    public StackADT() {//start constrcutor
        noShowerStack = new ArrayList<>();//use constructor to init the stack to store no showers
    }

 @Override
    public boolean isEmpty(){//is empty is used to check if the stack is empty
        return noShowerStack.isEmpty();//returning boolen true or false weather the stack is empty
        
    }//end

  

    @Override
    public void push(E newItem) {//used to add a new item to the stack , the top of the stack
        noShowerStack.add(0, newItem);//adding a new item via the top of the stack by inserting it into 0
        if (noShowerStack.size() > Maximum) {//if the length or size of the stack exceed the maximum i have set which is 5 the bottom will be removed and the new one added to the top
            removeBottom();//used to remove from the very bottom
        }
    }

    @Override
    public E pop() {//start ////used to remove and retrun the data at the very top of the stack
        if (!noShowerStack.isEmpty()){//if the stack is empty
            return noShowerStack.remove(0);//removing whats in index 0 (which is the top of the stack)
        }//end if condition
        return null;//return null if there is nothing to pop
    }//end pop

    @Override
    public E peek() {//start////used to return the top item but keeping it untouched, not removing it
     if (noShowerStack.isEmpty()) {//if the stack is empty
          System.out.println("Empty stack");//notify the end user
          return null;//dont return anythign
      } else {    //else if theres sometthing in the stack
          return noShowerStack.get(0);//returning the top element from teh stack
      }//end else
    }//end peek

     @Override
    public int size(){//is used for determining the size of the stack represented by an integer
        return noShowerStack.size();//return the size
    }//end size

//---------------------------------------------------
    @Override
    public String displayStack() {//displayStack method start
        StringBuilder s = new StringBuilder();//creating using stringbuilder to to make the stack string and send it back it so i can show it to the user
        if (noShowerStack.isEmpty()) {//if statement to see if the stack is empty
            s.append("Nothing in the stack!");//tell the user there stacks empty
        } else {//else
            for (int i = 0; i < noShowerStack.size(); i++) {//start nested for within the else condition, in order to loop for the size of the stack iterating through all of them
                E item = noShowerStack.get(i); // I use E for the elements within the stack
                s.append(item.toString()).append("\n");//use the string builder to go to the next lein
            }//end for loop for the size of the stack
        }//end else
        return s.toString();
    }//end

    public void removeBottom() {//remove button method to start
        if (!noShowerStack.isEmpty()) {//determine if the stack is emopty
            noShowerStack.remove(noShowerStack.size() - 1);//removing the last one by getting the size and - 1 index
        }//end if condition
    }//end method
//----------------------------------------------------------
}//end class
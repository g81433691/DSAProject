/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author EThornbury//gregm added some comments
 */
public class PQElement {//PQ Element acts as an element in the priority queue withpatient and its specific priority
   
    //Each element has the object information and the key/priority assigned to that object

    private int priority;
    private Object element;

    public PQElement(int priority, Object element) {//constrcutor
        this.priority = priority;
        this.element = element;
    }//end

    public int getPriority() {//access priority
        return priority;
    }//end

    public void setPriority(int priority) {//set priotity
        this.priority = priority;
    }//end

    public Object getElement() {//get element
        return element;
    }//end

    public void setElement(Object element) {//set element
        this.element = element;
    }//end

    @Override
    public String toString() {//toString method to display back to the end user both the element and the priority
        return "PQElement{ " + ", priority= " + priority + ", element= " + element + '}';
    }//end to string
}
    
    

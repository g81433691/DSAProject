/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Ethornbury but i gregm made some changes i learned and implemented generic param or arg to represent expecting any data type E in this case. learned Github.io. (2025). Page Restricted. [online] Available at: https://sbme-tutorials.github.io/2020/data-structure-FALL/notes/week06a.html [Accessed 18 Mar. 2025].
 */
public interface StackInterface<E> {//start//this stack interface is for setting the rules for a stack with last in first out functionality, using <e> to expect any data type but in my scenario its an obj for patient 
    void push(E newItem);//is using default access modifier and is used to add a new item to the stack , the top of the stack
    E pop();//used to remove and retrun the data at the very top of the stack
    E peek();//used to return the top item but keeping it untouched, not removing it
    
    boolean isEmpty();//is used to determine if said stack is empty
    int size();//is used to determine the size of said stack
    String displayStack();//is used to display the content within said stack
}//end

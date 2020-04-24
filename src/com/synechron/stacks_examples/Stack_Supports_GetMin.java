package com.synechron.stacks_examples;

import java.util.*;


//Stack :- LIFO (Last In First Out)
//Insertion and Deletion in same way.

/*Stack<item-type> Operations
	push(new-item:item-type)
	      Adds an item onto the stack.
	top():item-type
	      Returns the last item pushed onto the stack.
	pop():
	     Removes the most-recently-pushed item from the stack.
	is-empty():  Boolean
	     True if no more items can be popped and there is no top item.
	is-full():   Boolean
	     True if no more items can be pushed.
	get-size():  Integer
	     Returns the number of elements on the stack.
	All operations except get-size() can be performed in O(1)time. get-size() runs in at worst O(N).*/

public class Stack_Supports_GetMin
{
	Stack<Integer> stack; 
    Integer minNumber; 
  
    // Constructor 
    public Stack_Supports_GetMin() 
    {
    	stack = new Stack<Integer>();
    } 
  
    // Prints minimum element of MyStack 
    public void getMin() 
    { 
        // Get the minimum number in the entire stack 
        if (stack.isEmpty()) 
            System.out.println("Stack is empty"); 
  
        // variable minEle stores the minimum element 
        // in the stack. 
        else
            System.out.println("Minimum Element in the " + 
                               " stack is: " + minNumber); 
    } 
  
    //Returns(Print) the last item pushed onto the stack.prints top element of MyStack
    public void peek() 
    { 
    	//True if no more items can be popped and there is no top item.
        if (stack.isEmpty()) 
        { 
            System.out.println("Stack is empty "); 
            return; 
        } 
  
        Integer t = stack.peek(); // Top element. 
  
        System.out.print("Top Element is: "); 
  
        // If t < minEle means minEle stores 
        // value of t. 
        if (t < minNumber) 
            System.out.println(minNumber); 
        else
            System.out.println(t); 
    } 
  
    // Removes the most-recently-pushed item from the stack.(Top elements in Stack)
    public void pop() 
    { 
        if (stack.isEmpty()) 
        { 
            System.out.println("Stack is empty"); 
            return; 
        } 
  
        System.out.print("Top Element Removed: "); 
        Integer t = stack.pop(); 
  
        // Minimum will change as the minimum element 
        // of the stack is being removed. 
        if (t < minNumber) 
        { 
            System.out.println(minNumber); 
            minNumber = 2*minNumber - t; 
        } 
  
        else
            System.out.println(t); 
    } 
  
    // Adds an item onto the stack.(Insert new number into MyStack) 
    public void push(Integer x) 
    { 
        if (stack.isEmpty()) 
        { 
        	minNumber = x; 
        	stack.push(x); 
            System.out.println("Number Inserted: " + x); 
            return; 
        } 
  
        // If new number is less than original minEle 
        if (x < minNumber) 
        { 
        	stack.push(x);
        	minNumber = x; 
        } 
  
        else
        	stack.push(x); 
  
        System.out.println("Number Inserted: " + x); 
    } 
    
    public int getSize()
    {
       return  stack.get(1);
    }
  
// Driver Code 
    public static void main(String[] args) 
    { 
       Stack_Supports_GetMin s = new Stack_Supports_GetMin(); 
       s.push(10);
       s.push(15);
       s.getMin();
       s.push(0);
       s.getMin();
       s.peek();
       s.pop();
       s.getMin();
      System.out.println(s.getSize());
        
        
    } 
}

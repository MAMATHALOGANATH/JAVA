/*Write a Java program to implement the Stack using arrays. Write Push(), Pop(), and 
Display() methods to demonstrate its working.*/

package lab1b;

import java.util.Scanner;

class stack1{
    private int arr[];
    private int top;
    private int size;
    
    stack1(int size)
    {
        arr=new int[size];
        top=-1;
        this.size=size;
    }
    
    void push(int i)
    {
        if(top>=size-1)
        {
            System.out.println("Stack overflow");
            return;
        }
        
        arr[++top]=i;
    }
    
    void pop()
    {
        if(top<0)
        {
            System.out.println("stack underflow");
            return;
            
        }
        System.out.println("the poped item is"+" "+arr[top--]);
    }
    
    void display()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
        }
        
        System.out.println("content of stack are");
        for(int i=top;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    
    
}


public class stack
{
	public static void main(String[] args) {
	    
	    Scanner input= new Scanner(System.in);
	    System.out.println("enter the size");
	    int n=input.nextInt();
	    stack1 stck=new stack1(n);
	    
	    while(true)
	    {
	       System.out.println("enter 1:push");
	       System.out.println("2:pop");
	       System.out.println("3:display");
	       System.out.println("4:exit");
	       
	       int choice=input.nextInt();
	       
	       switch(choice)
	       {
	           case 1:System.out.println("enter the itemto be pushed");
	                    stck.push(input.nextInt());
	                    break;
	           case 2:stck.pop();
	                    break;
	           case 3:stck.display();
	                    break;
	           case 4:System.exit(0);
	                    
	       }
	    }
		
	}
}

package lab1a;

import java.util.Scanner;
class student1{
    private String usn,name,branch,ph;
    public void accept(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter usn\n");
        usn=scanner.next();
        System.out.println("Enter name\n");
        name=scanner.next();
        System.out.println("Enter branch\n");
        branch=scanner.next();
        System.out.println("Enter ph\n");
        ph=scanner.next();
        
    }
    public void display(){
        System.out.println("student details\n");
        System.out.println("usn:\n"+usn);
        System.out.println("name:\n"+name);
        System.out.println("branch:\n"+branch);
        System.out.println("phone:\n"+ph);
        System.out.println();
    }
}
class student{
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the value for n");
        int n=scanner.nextInt();
        student1[] ob1=new student1[n];
        for(int i=0;i<n;i++)
        {
            ob1[i]=new student1();
            ob1[i].accept();
            
            
        }
        for(int i=0;i<n;i++){
            ob1[i].display();
        }
    }
}
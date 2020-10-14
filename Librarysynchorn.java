/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysynchorn;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
class library
{
    int id;
    public void getid()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the id to checked:");
        id=obj.nextInt();
    }
    public int get1id()
    {
        return id;
    }
}
public class Librarysynchorn implements Runnable
{

    /**
     * @param args the command line arguments
     */
    library lb=new library();
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Librarysynchorn l=new Librarysynchorn();
        //library lb=new library();
        Thread one =new Thread(l);
        one.start();
        Thread two =new Thread(l);
        //one.start();
        two.start();
    }
    public void run()
    {
        
        int i=12;
        lb.getid();
        checking(i);
        
    }

    public synchronized void checking(int id)
    {
        if(lb.get1id()==id)
        {
            System.out.println("the book is present you can lend it");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                
            }
        }
        else
        {
            System.out.println("the book is not present");
        }
    }
}




package sampleprg;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author ADMIN
 */
public class prg extends Thread
{
    String[] words=null;
    String s;
    int c1=0;
 FileReader f=new FileReader("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\sampleprg\\src\\sampleprg\\address.txt");
 BufferedReader b1=new BufferedReader(f);
    prg(String f) throws Exception
    {
      
        this.start();
    }
    public void run()
    {
        int i=0;
         while(i!=-1)
        {
            try
            {
                 while((s=b1.readLine())!=null)           
                 words=s.split(" ");
                 c1=c1+words.length;
                 System.out.println("address.txt:"+c1);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            try
            {
                b1.close();
            }
            catch(Exception e)
            {
                
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
     //FileReader f=new FileReader("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\sampleprg\\src\\sampleprg\\address.txt");
     FileReader f1=new FileReader("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\sampleprg\\src\\sampleprg\\homework.txt");
     FileReader f2=new FileReader("C:\\Users\\ADMIN\\Documents\\NetBeansProjects\\sampleprg\\src\\sampleprg\\report.txt");
     int c1=0,c2=0,c3=0;
     String[] words=null;
     int n=0;
     BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
     BufferedReader b2=new BufferedReader(f1);
     BufferedReader b3=new BufferedReader(f2);
     String s;
     //thread1 obj1=new thread1();
     //thread2 obj2=new thread2();
     //thread3 obj3=new thread3();
     /*while((s=b1.readLine())!=null)
             {
                 words=s.split(" ");
                 c1=c1+words.length;
             }
     f.close();*/
     
     try
     {
         n=Integer.parseInt(b1.readLine());
     }
     catch(Exception e)
     {
         
     }
     while((s=b2.readLine())!=null)
             {
                 words=s.split(" ");
                 c2=c2+words.length;
             }
     f1.close();
     while((s=b3.readLine())!=null)
             {
                 words=s.split(" ");
                 c3=c3+words.length;
             }
     f2.close();
     //System.out.println("address.txt="+c1);
     System.out.println("homework.txt="+c2);
     System.out.println("report.txt="+c3);
    }
    
}

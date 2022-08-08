package tracker;

import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.locks.ReentrantLock;  
  
class workerThread implements Runnable  
{  
    String name;  
    ReentrantLock lock;  
 
    public workerThread(ReentrantLock lock, String name)  
    {  
        this.lock = lock;  
        this.name = name;  
    }  
    
    public void run()  
    {  
        boolean execution = false;  
        while (!execution)  
        {  
            
            boolean result = lock.tryLock();  
             
            if(result)  
            {  
               
                try  
                {  
                    
                    Date dateObj = new Date();  
                      
                    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");  
                    System.out.println("Task : "+ name + " outer lock is acquired at "+ sdf.format(dateObj));  
                   
                    Thread.sleep(1500);  
                     
                    lock.lock();  
                    
                    try  
                    {  
                        dateObj = new Date();  
                        sdf = new SimpleDateFormat("hh:mm:ss");  
                        System.out.println("Task : "+ name+ " inner lock is acquired at "+ sdf.format(dateObj));  
 
System.out.println("The lock hold count of inner lock: "+ lock.getHoldCount());  
                          
                          
                        Thread.sleep(1500);  
                    }  
                      
                    
                    catch(InterruptedException e)  
                    {  
                        e.printStackTrace();  
                    }  
               
                    finally  
                    {  
                        
                        System.out.println("The inner lock is released by task : " + name);  
                        lock.unlock();  
                    }  
                      
                  
                    System.out.println("The lock hold count of inner lock: " + lock.getHoldCount());  
                    System.out.println("The work of the " + name + " task is done");  
                     
                    result = true;  
                }  
               
                catch(InterruptedException e)  
                {  
                    e.printStackTrace();  
                }  
                
                finally  
                {  
                     
                    System.out.println("The outer lock is released by task" + name);  
                    lock.unlock();  
                    System.out.println("The lock hold count of outer lock: " + lock.getHoldCount());  
                }  
            }  
            else  
            {  
              
                System.out.println("Task " + name +" is waiting for the lock");  
                try  
                {  
                    
                    Thread.sleep(1000);  
                }  
                catch(InterruptedException e)  
                {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
}

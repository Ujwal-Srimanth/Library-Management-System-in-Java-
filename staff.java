package Project;

import java.util.Scanner;

public class staff extends person implements Runnable
{   Scanner s1 = new Scanner(System.in);
	String type_of_staff;
	int salary;
	int id;
	static int staffnum;
	String password;
	int validity;
	public static void get_num_of_staff(int n)
	{
		staffnum= n;
	}
	public static int getstaffnum()
	{
		return staffnum;
	}
	public staff()
	{
            	 
            			System.out.println("enter the name:");
                 		this.name=s1.next();
                 
            		while(true)
            		{
            			System.out.println("enter the phone:");
            			phone=s1.next();
            			try
            			{
            				int a=phone.length();
            				if(a==10)
            				{
            					break;
            				}
            				else
            				{
            				  throw new  IllegalAccessException(" Not valid Phoneno");

            				}
            			}
            			catch(IllegalAccessException e)
            			{
            				  System.out.println(e);
            			}
            		}
            		
            	
               			System.out.println("enter the age:");
                		this.age=s1.nextInt();
                  
            		
                  			System.out.println("enter the gender:");
                    		this.Gender=s1.next().charAt(0);
                      
            		
                 			System.out.println("enter the type of staff:");
                    		this.type_of_staff=s1.next();
                     
            		
                			 System.out.println("enter the salary:");
                     		this.salary=s1.nextInt();
                    
		}
	void getDetails(int id1)
	{
		if(this.id==id1)
		{
			System.out.println("name: "+this.name);
			System.out.println("phone: "+this.phone);
			System.out.println("age: "+this.age);
			System.out.println("gender: "+this.Gender);
			System.out.println("type_of_staff: "+this.type_of_staff);
			System.out.println("salary: "+this.salary);
		}
	}
	
	void assignID(int id)
	   {
		   this.id=id;
		   System.out.println("the id assigned to you is:"+id);
		   
	   }
	public int returnid()
	{
		return id;
	}
    public void run()
    {
    	password=name+'@'+Gender;
    }
	@Override
	int searchperson(int id9) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	void setanyfine() {
		// TODO Auto-generated method stub
		
	}
	@Override
	boolean returnFine() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	void revanyfine() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void setbookTakenId(int id44) {
		// TODO Auto-generated method stub
		
	}
	@Override
	boolean validate(int id, String name) {
		// TODO Auto-generated method stub
		if(this.id==id && password.equals(name))
		{
			System.out.println("welcome "+this.name);
			return true;
		}
		return false;
	}
	class address
    {
    	address()
    	{
    		System.out.println("please enter the address");
    		Scanner s1=new Scanner(System.in);
    		address1=s1.nextLine();
    	}
    }
}

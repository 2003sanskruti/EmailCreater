
package emailapp;
import java.util.*;
public class Email {
	private  String firstName;
    private String lastName;
    private  String password;
    private int randomPasswordLength=10;
     private String department;
    // private int mailboxCapacity;
    // private String alternateName;
     private String email;
     private String company ="raisonicompany.com";
    //construtor  for last and fristname
    //ask->dep
    //generate-.pass
    //set->altername
    public Email(String FirstName,String lastName){
        this.firstName = FirstName;
        this.lastName = lastName;
        System.out.println("email create"+" "+this.firstName+" "+this.lastName);
        this.department =setDep();
        System.out.println("dep:"+this.department);
        this.password=randomPass(randomPasswordLength);
        	System.out.println("password"+" "+this.password);
        	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+ department+"."+company;
        		System.out.println("your Email is:"+email);
        			}
    private String setDep()
    {
        System.out.println("enter dep \n1 for sales\n2 for development\n3 for Accountiong\n0 for none ");

        Scanner sc =new Scanner(System.in);
      int depchoice=  sc.nextInt();
      if(depchoice == 1)
      {
          return "sales";

      }else if(depchoice == 2)
             {
                return "devel";
             }
      else if(depchoice == 3)
      {
          return "acc";
      }else
      {
          return " ";

      }


    }
    private String randomPass(int length)
    {
    	String passset="MNBVCXZZLKJHGFDSAPOIUYTREWQ0987654321!@#$%^&*";
    	char [] password =new char[length];
    	for(int i=0;i<length;i++)
    	{
    		int rand=(int) (Math.random()*passset.length());
    		password[i]=passset.charAt(rand);
    	}
    	return new String (password);
    	
    	
    }
//    public void setMailBoxCapacity(int capacity)
//    {
//    	this. mailboxCapacity=capacity;
//    }
//    public void setAlternateEmail(String altEamil)
//    {
//    	this.alternateName=altEamil;
//    }
//	public void changePass(String password)
//	{
//		this.password =password;
//	}
//	public int getMailCapacity()
//	
//	{
//		return mailboxCapacity;
//	}
// public Strin
}

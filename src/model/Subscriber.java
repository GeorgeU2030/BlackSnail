package model;

public class Subscriber{

private String id;
private String name;
private int age;
private int hours;
private boolean status;
private Typesub subsType;


/**
    * Constructor Method Subscriber class
    * parameters String id is the identification,
    * String name is the name of the user,
    * int age is the age of the age, 
    * int hours is the amount of the hours willing to user for watch
    */
public Subscriber (String id,String name, int age, int hours){
  this.id = id;
  this.name = name;
  this.age = age;
  this.hours = hours;
  status = true;
  subsType = Typesub.NORMAL;
}

/**
 * Method get of the id
 * @return id String of the name of the user
 */
public String getId (){
     return id;
	}
/**
 * Method get of the subsType
 * @return subsType Typesub is the type of the user
 */
public Typesub getSubsType(){
	return subsType;
	}
 /**
 * Method get of the status
 * @return status boolean is the state of the user
 */
public boolean getStatus(){
	return status;
	}
/**
 * Method set of the status
 * @param status boolean is the state of the user
 */
public void setStatus (boolean status){
    this.status = status;
	}
/**
 * Method set of the subsType
 * @param subsType String is the type of the user
 */	
public void setSubsType(String subsType){

	if (subsType == "NORMAL"){
     this.subsType = Typesub.NORMAL;
     }

	}
/**
 * Method get of the age
 * @return age int is the age of the user
 */	
public int getAge(){
    return age;
	}
 /**
 * Method get of the hours
 * @return hours int is the amount of the hours willing to user for watch
 */	
public int getHours(){
    return hours;
	}

	/**
 * Method toString of the Subscriber class
 * Show of the Subscriber data , without parameters
 * @return out String is the information message 
 */ 
public String toString(){
       String out ="";
       String state="";
       if (status == true){
          state ="ACTIVE";
       	}
       	else {
          state ="INACTIVE";
       	}
	    out = "***Suscriptor Information***\n";
	    out += " ID: " + id+ "\n";
		out += " NAME: "+ name + "\n";
		out += " AGE: " + age+ "\n";
		out += " HOURS WILLING: " + hours+ "\n";
		out += " STATUS: " + state+ "\n";
		out += " TYPE ACCOUNT: " + subsType+ "\n";
     return out;
	}

}
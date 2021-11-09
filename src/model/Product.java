package model;

public class Product{

protected String name;
protected Date creationDate;
protected String director;
protected String synopsis;



public Product(String name, int day, int month, int year, String director,String synopsis){
    this.name = name;
    creationDate = new Date(day, month, year);
	this.director = director;
	this.synopsis = synopsis;	

}
     

public String getName(){
	return name;
	}

	/**
 * Method toString of the Product class
 * Show of the Product data , without parameters
 * @return out String is the information message 
 */ 
public String toString(){
   String out="";
		out += "\nname: " + name+ "\n";
		out += "creationDate"+ creationDate.toString() + "\n";
		out += "Director: "+ director;
		out += "Synopsis: "+ synopsis;
		
		return out;
	}




	
}
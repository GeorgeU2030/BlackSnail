package model;
import model.Typemovie;
public class BlackSnail{


private String nit;
private String address;
private String website;
private Subscriber subscribers[]= new Subscriber[50];
private Product products[]= new Product[85];

/**
    * Constructor method BlackSnail class
    * parameters String nit, String address, String website
    */
public BlackSnail (String nit, String address, String website){
     this.nit = nit;
     this.address = address;
     this.website = website;
     
}


/**
    * Method to validate that the id has not been entered before
    * @param id String is the identification of the user
    * @return flag boolean is the validation of the id
    */


public boolean valideId(String id){
    boolean flag = true;

     for (int i =0; i < subscribers.length && flag;i++){
     if (subscribers[i]!=null){
     String valideId = subscribers[i].getId();
     if (valideId.equals(id)){
        flag = false;
     }
     }
     }
     return flag;
	}


/**
    * method to add a subscriber
    * @param id String is the identification of the user
    * @param name String is the name of the user
    * @param age int is the age of the user
    * @param hours int is the amount of the hours willing to user for watch
    */
public void addSuscriber (String id, String name,int age, int hours){
	boolean flag = false;
	int position =0;
	if (subscribers.length<=50){
    for (int i =0; i <subscribers.length && ! flag; i++){
    	if (subscribers[i]==null){
    		position = i;
    		flag = true;
    	}
    }
    subscribers[position] = new Subscriber(id,name,age,hours);
    }
    if (subscribers.length>50){
    System.out.println("No more subscribers can be added");
    }
}

/**
 * Method to deactivate a subscriber
 * @param id String is the identification of the user
 */

public void desactivateStatus (String id){
	boolean bool = false;
	boolean flag = false;
	String modifyType ="NORMAL";
    for (int i =0; i < subscribers.length && ! flag ;i++){
        String value = subscribers[i].getId();
        if (value.equals(id)){
        	subscribers[i].setStatus(bool);
        	subscribers[i].setSubsType(modifyType);
            flag = true;
        }
    }
    System.out.println("The subscriber has been deactivated");
	}	

/**
 * method to know the number of active users, by type of subscription
 * without parameters
 */

public void informationSubs(){
	int subsactive =0;
	int normal=0;
	int platinum=0;
	int gold=0;
	int diamond=0;
	for (int i =0; i < subscribers.length; i++){
		if (subscribers[i]!=null){
      if (subscribers[i].getStatus()==true){
      	 subsactive ++;
         }
      if (subscribers[i].getSubsType().toString().equals("NORMAL")){
      	 normal ++;
         }
      if (subscribers[i].getSubsType().toString().equals("PLATINUM")){
      	 platinum ++;
         }
      if (subscribers[i].getSubsType().toString().equals("GOLD")){
      	 gold ++;
         }
      if (subscribers[i].getSubsType().toString().equals("DIAMOND")){
      	 diamond ++;
         }
         }
     }
 
     System.out.println("The number of active subscribers are "+ subsactive);
     System.out.println("NORMAL: " + normal);
     System.out.println("PLATINUM: " + platinum);
     System.out.println("GOLD: " + gold);
     System.out.println("DIAMOND: "+ diamond);
    }


/**
 * Method to know the minor with the longest hours available to consume
 * without parameters
 */
    public void minusSubscriber(){
    	int ageM = 18;
    	int hours =0;
    	int pos = -1;
    for (int i =0; i <subscribers.length; i++){
    if (subscribers[i]!=null){
     if (subscribers[i].getAge() < ageM){
     if (subscribers[i].getHours() > hours){
     	 hours = subscribers[i].getHours(); 
         pos =i;
     	 }
    }
    }
    }

    System.out.println(subscribers[pos].toString());


 }  
    
 /**
 * Method toString of the BlackSnail class
 * Show of the BlackSnail data , without parameters
 * @return out String is the information message 
 */ 
public String toString(){
       String out ="";
       boolean flag = false;
	    out = "***BlackSnail Data***\n";
	    out += " NIT: " + nit+ "\n";
		out += " Address: "+ address + "\n";
		out += " WEBSITE: " + website+"\n" ;
     for(int i =0;i<subscribers.length ;i++){
				if (subscribers[i]!=null){
            out += subscribers[i].toString();
         }
	}
	return out;
}

/**
    * Method to validate that the name Product has not been entered before
    * @param name String is the identification of the Product
    * @return flag boolean is the validation of the name
    */
public boolean valideName(String name){
    boolean flag = true;

     for (int i =0; i < products.length && flag;i++){
     if (products[i]!=null){
     String valideName = products[i].getName();
     if (valideName.equals(name)){
        flag = false;
     }
     }
     }
     return flag;


    }

    /**
    * Method to Create a Product-Movie
    * @param name String is the name of the Product
    * @param day int is the day of the premiere
    * @param month int is the month of the premiere
    * @param year int is the year of the premiere
    * @param director String is the name of the director
    * @param synopsis String is the synopsis of the Product
    * @param nameOriginal String is the name original of Movie
    * @param producer String is the producer of the Movie
    * @param ageMin int is the minimum age to see
    * @param optionCategory int is the category of the Movie
    * @param trailer String is the url trailer of the Movie
    */
public void createProduct(String name,int day,int month,int year,String director,String synopsis,String 
                          nameOriginal,String producer,int ageMin,int optioncategory,String trailer){
    int position =0;
    boolean flag = false;
    for (int i =0; i < products.length && ! flag ;i++){
    if (products[i]== null){
         position =i; 
         flag = true;
    }
    }
     products[position] = new Movie(name,day,month,year,director,synopsis,nameOriginal,producer,ageMin,optioncategory,trailer);
    System.out.println("Product Created");
  }


   /**
    * Method to Create a Product-Movie
    * @param name String is the name of the Product
    * @param day int is the day of the premiere
    * @param month int is the month of the premiere
    * @param year int is the year of the premiere
    * @param director String is the name of the director
    * @param synopsis String is the synopsis of the Product
    * @param actors String are the actors of the Serie
    * @param statusSerie int is the status
    * @param motive String is the motive of the status
    * @param numberSeason int is the number of the Season
    * @param episodesProg int are the episodes scheduled
    * @param episodesPost int are the episodes published
    * @param dayS int is the premiere day of the Season
    * @param monthS int is the premiere month of the Season
    * @param yearS int is the premiere year of the Season
    * @param trailer String is the url trailer of the Season
    */
  public void createProduct(String name,int day,int month,int year,String director,String synopsis,String actors,int statusSerie,String 
                           motive,int numberSeason,int episodesProg,
                           int episodesPost,int dayS,int monthS,int yearS,String trailer){
   int position =0;
    boolean flag = false;
    for (int i =0; i < products.length && ! flag ;i++){
    if (products[i]== null){
         position =i; 
         flag = true;
    }
    }
     products[position] = new Serie(name,day, month,year,director,synopsis,actors,statusSerie,motive,numberSeason,episodesProg,
                           episodesPost,dayS,monthS,yearS,trailer);
    System.out.println("Product Created");

   }


/**
    * Method to search a Product, and show the information 
    * @param name String is the identification of the product
    */
   public void searchProduct(String name){
    boolean flag = false;
   for (int i =0; i < products.length && !flag ;i++){
   if (products[i]!= null){
        String valideName = products[i].getName();
     if (valideName.equals(name)){
        flag = true;
     if (products[i] instanceof Movie){
        System.out.println("\nMOVIE");
        System.out.println(products[i].toString());
    }
     if (products[i] instanceof Serie){
        System.out.println("\nSERIE");
        System.out.println(products[i].toString());
   }
   }
   }
   }
}

/**
    * Method to add a Season, to one Serie
    * @param name String is the identification of the Serie
    * @param numberSeason int is the number of the Season
    * @param episodesProg int are the episodes scheduled
    * @param episodesPost int are the episodes published
    * @param dayS int is the premiere day of the Season
    * @param monthS int is the premiere month of the Season
    * @param yearS int is the premiere year of the Season
    */
  public void addSeasonSerie(String name,int numberSeason,int episodesProg,int episodesPost,int dayS,int 
                        monthS,int yearS,String trailer){
        boolean flag = false;
   for (int i =0; i < products.length && !flag ;i++){
   if (products[i]!= null){
        String valideName = products[i].getName();
     if (valideName.equals(name)){
        flag = true;

     if (products[i] instanceof Serie){

        Serie temp = (Serie) products[i];

        temp.addSeason(numberSeason,episodesProg,episodesPost,dayS,monthS,yearS,trailer);

        products[i] = temp;
    }
    }
    }
    }
    }

/**
    * Method to search a Category movie, and show the information 
    * @param option int is the category of the product
    */
    public void searchCategory(int option){
    String categoryMovie="";
    String out ="";
    if (option ==1){
     categoryMovie = "ROMANTIC";
    }
    if (option ==2){
     categoryMovie = "ACTION";
    }
    if (option ==3){
     categoryMovie = "THRILLER";
    }
    if (option ==4){
     categoryMovie = "HORROR";
    }
    if (option ==5){
     categoryMovie = "COMEDY";
    }
    for (int i =0; i < products.length ;i++){
    if (products[i]!= null){
    if (products[i] instanceof Movie){

        Movie temp = (Movie) products[i];

        String value = temp.getTypeMovie().toString();
    if (value.equals(categoryMovie)){
     System.out.println(products[i].toString());
    }   
    }
    }
    }
    }

  /**
    * Method to search Series, and show the information 
    * without parameters
    */  
    public void searchSerie(){
    for (int i =0; i < products.length ;i++){
    if (products[i]!= null){
       if (products[i] instanceof Serie){
       System.out.println(products[i].toString());
    }
       
    }
    }
    }
}
package ui;
import java.util.Scanner;
import model.BlackSnail;


/**
 * Main class of the BlackSnail project
 * Developed by 
 * @author George Michael Trujillo
 * @version 1.0
 * @since October 2021
 */
public class MainBlackSnail {

/**
	 * main is the connection to the Shop class in the model package
	 */
private BlackSnail bschannel;
/**
	 * sc is the object that allows to read information entered by the user
	 */
private Scanner sc;



/**
	 * Constructor of the class, does not receive parameters 
	 * The method initializes the reader object
	 */
public MainBlackSnail() {
		sc= new Scanner(System.in);
	}


public static void main (String[] a){
		// creating a object of the principal class
		MainBlackSnail obj = new MainBlackSnail();
		int option =0;
		
		//cycle to execute the menu while the user does not enter 0
		do {
		    option =obj.showMenu();
		    obj.answerOption(option);
		}while (option !=0);
		if (option <0 && option>4){
		System.out.println ("Enter a valid number");
        }
}

/**
	 *Method that is in charge of calling the methods that solve each of the
	 * application requirements
	 * @param option, int is the number entered by the user 
	 */
  public void answerOption(int option) {
		switch(option) {
		case 0: 
			System.out.println("La Aplicacion se ha cerrado");
			break;
		case 1:
		    showMenuInformation();
			break;
		case 2:
		    showMenuSubscriber();
			break;
		case 3:
		    showMenuProducts();

	}
}
	/**
	 * Method that shows the application menu
	 * @return input, int is the option entered by the user
	 */
	public int showMenu() {
		int input;
		System.out.println("\n\nBlackSnail Menu\n"+ 
		                    "(1) Enter the information for BlackSnail\n" +
		                    "(2) Subscriber Data\n"+
		                    "(3) Products\n"+
		                    "(0) Exit"
		);
		input = sc.nextInt();
		return input;
	}

/**
	 * Method to enter blacksnail information and create blacksnail object
	 * without parameters
	 */
	public void informationBlackSnail(){
		String nit ="";
		String address="";
		String website="";
		System.out.println ("Enter the BlackSnail's nit");
        nit = sc.next();
        System.out.println ("Enter the address");
        address = sc.next();
        System.out.println ("Enter the BlackSnail's website");
        website = sc.next();
        bschannel = new BlackSnail(nit,address,website);
        System.out.println("Se ha registrado la informacion correctamente\n");
    
    }

   /**
	 * method that shows the menu about the subscriber options
	 * without parameters
	 */ 

    public void showMenuSubscriber() {
		int option=0;
		System.out.println(
				"Suscriber Menu\n" +
				"(1) Create a subscriber\n" +
				"(2) Deactivate a subscriber\n"+
				"(3) Number of subscribers\n"+
				"(4) Underage subscriber and longer hours to consume"
				);
		option= sc.nextInt();
		
		switch(option) {
		case 1:
		    createSubscriber();
			break;
		case 2:
		    deactivateSubscriber();
			break;
		case 3: 
		    bschannel.informationSubs();
			break;
		case 4:
		    bschannel.minusSubscriber();
		
		}
		
	}

 /**
	 * Method to create a subscriber
	 * without parameters
	 * with validations of the id, and finally calls method addSuscriber
	 */ 
    public void createSubscriber(){
    String id="";
    String name="";
    int age =0;
    int hours =0;
    System.out.println ("Create a subscriber");
    System.out.println ("Enter the id");
    id = sc.next();
    if (bschannel.valideId(id)){
    System.out.println ("Enter the name");
    name = sc.next();
    System.out.println("Enter the age");
    age = sc.nextInt();
    System.out.println("Enter number of hours willing to consume");
    hours = sc.nextInt();
    
    bschannel.addSuscriber(id,name,age,hours);
    System.out.println("Subscriber Registered");
    }
    else{
    System.out.println("This Id is registered");
     }
 }

/**
	 * method that shows the menu of the BlackSnail information
	 * without parameters
	 */ 


   public void showMenuInformation(){ 
    int option =0;
    System.out.println(
           "Information Menu\n" +
				"(1) Enter the Information\n" +
				"(2) Get the information subscriber"
            );
    option= sc.nextInt();
		
		switch(option) {
		case 1:
		    informationBlackSnail();
			break;
		case 2:
		    System.out.println(bschannel);
			break;

   }	
}

/**
  * Method to pass the id and deactivate a subscriber
  * without parameters
  */ 
  public void deactivateSubscriber(){
  	String id="";
   System.out.println ("Enter enter the id of the subscriber to deactivate ");
   id = sc.next();
   bschannel.desactivateStatus(id);
  
  }	

/**
	 * Method that shows the menu of the Products
	 * without parameters
	 */
  
  public void showMenuProducts(){
  	int option =0;
  	System.out.println("\nProducts Menu\n" + 
  		                 "(1) Create Product\n"+
  		                 "(2) Product Information\n"+
  		                 "(3) Create a Season\n"+
  		                 "(4) Search by Category\n"+
  		                 "(5) Show Series\n"+
  		                 "(0) Back");
    option = sc.nextInt();
  switch(option) {
  	case 0:
  	     showMenu();
		case 1:
		    optionCreateProduct();
		case 2:
		    informationProduct();
		case 3:
		    createSeason();
		case 4:
		    moviesCategory();
		case 5:
		    showSerie();
  }
  }

  
/**
	 * Method that shows the Information Product
	 * without parameters
	 */
   public void informationProduct(){
  System.out.println("\nProduct Information");
  System.out.println("Enter the Name");
  String name = sc.next();
  bschannel.searchProduct(name);
  showMenuProducts();
  }

/**
	 * Method to Create a Season, to Serie
	 * without parameters
	 */
    public void createSeason(){
  System.out.println("CREATE A SEASON");
  System.out.println("Enter the Serie's Name");
  String name = sc.next();
  System.out.println("Enter the number of the season");
  int numberSeason = sc.nextInt();
  System.out.println("Enter the number of scheduled episodes");
  int episodesProg = sc.nextInt();
  System.out.println("number of episodes published");
  int episodesPost = sc.nextInt();
  System.out.println("Release Date");
  System.out.println("Enter the day");
  int dayS = sc.nextInt();
  System.out.println("Enter the month");
  int monthS = sc.nextInt();
  System.out.println("Enter the year");
  int yearS = sc.nextInt();
  System.out.println("Enter the Url trailer");
  String trailer = sc.next();
  bschannel.addSeasonSerie(name,numberSeason,episodesProg,episodesPost,dayS,monthS,yearS,trailer);
  System.out.println("Season Created");
  showMenuProducts();
  }

  /**
	 * Method that enter the Movie Data
	 * without parameters
	 */
    public void enterMovie(){
  System.out.println("Enter the Movie name");
  String name = sc.next();
  if (bschannel.valideName(name)){
  System.out.println("World Premiere Date");
  System.out.println("Enter the day");
  int day = sc.nextInt();
  System.out.println("Enter the month");
  int month = sc.nextInt();
  System.out.println("Enter the year");
  int year = sc.nextInt();
  System.out.println("Enter the Director's name");
  String director = sc.next();
  System.out.println("Synopsis");
  String synopsis = sc.next();
  System.out.println("Original Title");
  String nameOriginal = sc.next();
  System.out.println("Enter the producer");
  String producer = sc.next();
  System.out.println("Enter the minimum recommended age");
  int ageMin = sc.nextInt();
  System.out.println("Choose the Movie Category");
  System.out.println("(1) ROMANTIC");
  System.out.println("(2) ACTION");
  System.out.println("(3) THRILLER");
  System.out.println("(4) HORROR");
  System.out.println("(5) COMEDY");
  int optioncategory = sc.nextInt();
  System.out.println("Enter the Url trailer");
  String trailer = sc.next();
  bschannel.createProduct(name,day,month,year,director,synopsis,nameOriginal,producer,ageMin,optioncategory,trailer);
  showMenuProducts();
  }
  else {
  	System.out.println("The Movie is registered");
  }
  }	
 /**
	 * Method that enter the Serie Data
	 * without parameters
	 */
    public void enterSerie(){
  String motive ="";
  System.out.println("Enter the Serie name");
  String name = sc.next();
  if (bschannel.valideName(name)){
  System.out.println("First broadcast date");
  System.out.println("Enter the day");
  int day = sc.nextInt();
  System.out.println("Enter the month");
  int month = sc.nextInt();
  System.out.println("Enter the year");
  int year = sc.nextInt();
  System.out.println("Enter the director");
  String director = sc.next();
  System.out.println("Synopsis");
  String synopsis = sc.next();
  System.out.println("Enter the actors");
  String actors = sc.next();
  System.out.println("the series was censored?");
  System.out.println("(1) Yes");
  System.out.println("(2) No");
  int statusSerie = sc.nextInt();
  if (statusSerie == 1){
  System.out.println("Enter the motive");
  motive = sc.next();
  }
  System.out.println("");
  System.out.println("SEASON");
  System.out.println("Enter the number of the Season");
  int numberSeason = sc.nextInt();
  System.out.println("Enter the number of scheduled episodes");
  int episodesProg = sc.nextInt();
  System.out.println("number of episodes published");
  int episodesPost = sc.nextInt();
  System.out.println("Release Date");
  System.out.println("Enter the day");
  int dayS = sc.nextInt();
  System.out.println("Enter the month");
  int monthS = sc.nextInt();
  System.out.println("Enter the year");
  int yearS = sc.nextInt();
  System.out.println("Enter the Url trailer");
  String trailer = sc.next();
  bschannel.createProduct(name,day, month,year,director,synopsis,actors,statusSerie,motive,numberSeason,episodesProg,
  	                       episodesPost,dayS,monthS,yearS,trailer);
  showMenuProducts();
  }
  else {
  	System.out.println("The Serie is registered");
  }

  }

   /**
	 * Method that show the option to create a Product, movie or Serie
	 * without parameters
	 */
   public void optionCreateProduct(){
  int option=0;
  System.out.println("\nCreate a Product");
  System.out.println("(1) Create a Movie");
  System.out.println("(2) Create a Serie");
  System.out.println("(0) Back");
  option = sc.nextInt();
   switch(option)	{
		case 1:
		    enterMovie();
		case 2:
		    enterSerie();
  }
  }

   /**
	 * Method that enter the Category to Seacrh
	 * without parameters
	 */
  public void moviesCategory(){
  System.out.println("Enter the Category Movie that you want know");
  System.out.println("(1) ROMANTIC");
  System.out.println("(2) ACTION");
  System.out.println("(3) THRILLER");
  System.out.println("(4) HORROR");
  System.out.println("(5) COMEDY");
  int option = sc.nextInt();
  bschannel.searchCategory(option);
  showMenuProducts();
  }	
 
   /**
	 * Method to Show Series
	 * without parameters
	 */
 public void showSerie(){
   bschannel.searchSerie();
   showMenuProducts();
 	}
}
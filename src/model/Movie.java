package model;

public class Movie extends Product {

private String nameOriginal;
private String producer;
private int ageMin;
private String trailer;
private Typemovie typemovies;

public Movie(String name, int day, int month, int year, String director, String synopsis, String nameOriginal, String producer,int ageMin,int optionCategory, String trailer) {

        super(name,day,month,year,director,synopsis);
        this.nameOriginal = nameOriginal;
        this.producer= producer;
        this.ageMin = ageMin;
        typemovies = setTypeMovies(optionCategory);
        this.trailer = trailer;
        
}


/**
 * Method toString of the Movie class
 * Show of the Movie data , without parameters
 * @return out String is the information message 
 */ 
@Override
public String toString(){
   String out="";
		out += "\n\nname: " + name+ "\n";
		out += "creationDate " + creationDate.toString() + "\n";
		out += "Director: " + director+ "\n";
		out += "Synopsis: " + synopsis+ "\n";
		out += "Name Original: "+ nameOriginal+"\n";
		out += "Producer: "+ producer+ "\n";
		out += "Age minimum: "+ ageMin+ "\n";
		out += "Category: " + typemovies+ "\n";
		out += "Trailer: "+ trailer;
		return out;
	}

/**
 * Method to change the category Movie
 * @param optionCategory int is the option of the category
 * @return out String is the information message 
 */ 
public Typemovie setTypeMovies(int optionCategory){
   switch(optionCategory){
   case 1:
   typemovies = Typemovie.ROMANTIC;
   break;
   case 2:
   typemovies = Typemovie.ACTION;
   break;
   case 3:
   typemovies = Typemovie.THRILLER;
   break;
   case 4:
   typemovies = Typemovie.HORROR;
   break;
   case 5:
   typemovies = Typemovie.COMEDY;
   }
   return typemovies;
	}	

 public Typemovie getTypeMovie(){
   return typemovies;
 	}

}


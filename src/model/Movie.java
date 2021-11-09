package model;

public class Movie extends Product {

private String nameOriginal;
private String producer;
private int ageMin;
private String trailer;
private String typemovies;

public Movie(String name, int day, int month, int year, String director, String synopsis, String nameOriginal, String producer,int ageMin,String
            typemovies, String trailer) {

        super(name,day,month,year,director,synopsis);
        this.nameOriginal = nameOriginal;
        this.producer= producer;
        this.ageMin = ageMin;
        this.typemovies = typemovies;
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
@Override
public String getTypeMovies(){
   return typemovies;
	}


		
}


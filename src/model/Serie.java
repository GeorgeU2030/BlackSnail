package model;

public class Serie extends Product{

private String actors;
private int statusSerie;
private Season seasons[]= new Season[35];
private String motive;

public Serie(String name, int day, int month, int year, String director, String synopsis, String actors,int statusSerie,String motive,
               int numberSeason,int episodesProg, int episodesPost, int dayS, int dayM, int dayY, String trailer){
   
   super(name,day,month,year,director,synopsis);
   this.actors = actors;
   this.statusSerie = statusSerie;
   this.motive = motive;
   seasons[0] = new Season(numberSeason,episodesProg,episodesPost,dayS,dayM,dayY,trailer);
}


/**
    * Method to add a Season, to one Serie
    * @param numberSeason int is the number of the Season
    * @param episodesProg int are the episodes scheduled
    * @param episodesPost int are the episodes published
    * @param dayS int is the premiere day of the Season
    * @param monthS int is the premiere month of the Season
    * @param yearS int is the premiere year of the Season
    */
@Override
public void addSeason(int numberSeason,int episodesProg,int episodesPost,int dayS,int 
                        monthS,int yearS,String trailer){
    boolean flag = false;
    int posSeason =numberSeason-1;
    for (int i =0; i < seasons.length && !flag; i++){
    if (seasons[i]!= null){
    if (posSeason!=i){
        flag = true;
        int position = posSeason;
        if (flag == true) {
        seasons[position] = new Season(numberSeason,episodesProg,episodesPost,dayS,monthS,yearS,trailer);
    }   
    }
    }
    }   
    }   
    
/**
 * Method toString of the Serie class
 * Show of the Serie data , without parameters
 * @return out String is the information message 
 */ 

    @Override
    public String toString(){
    String out="";
        out += "name: " + name+ "\n";
        out += "creationDate " + creationDate.toString() + "\n";
        out += "Director: " + director+ "\n";
        out += "Synopsis: " + synopsis+ "\n";
        out += "Actors: "+ actors+"\n";
        out += "Status Serie: "+ statusSerie+ "\n";
        out += "Motive: "+ motive+ "\n";
        for (int i =0; i< seasons.length;i++){
            if (seasons[i]!=null){
            out += seasons[i].toString();
        }
        }
        return out;
    }
}
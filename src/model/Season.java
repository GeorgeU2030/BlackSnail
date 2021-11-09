package model;

public class Season {

private int numberSeason;
private int episodesProg;
private int episodesPost;
private String trailer;
private Date creationDate;

public Season (int numberSeason,int episodesProg,int episodesPost,int day, int month,int year, String trailer) {
    this.numberSeason = numberSeason;
    this.episodesProg = episodesProg;
    this.episodesPost = episodesPost;
    this.trailer = trailer;
    creationDate = new Date(day,month,year);
    }
    public String toString(){
    String out="";
        out += "numberSeason: " + numberSeason+ "\n";
        out += "creationDate " + creationDate.toString() + "\n";
        out += "episodes Prog: " + episodesProg+ "\n";
        out += "episodes Post: " + episodesPost+ "\n";
        out += "trailer: "+ trailer+"\n";
        return out;
    }

}

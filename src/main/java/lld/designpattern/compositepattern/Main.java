package main.java.lld.designpattern.compositepattern;

public class Main {
  public static void main(String[] args) {
    Directory movieDirectory = new Directory("Movie");

    File borderMovie = new File("Border");
    movieDirectory.add(borderMovie);

    Directory comedyMovieDir = new Directory("ComedyMovie");
    File hulchulMovie = new File("Hulchul");
    comedyMovieDir.add(hulchulMovie);
    movieDirectory.add(comedyMovieDir);

    movieDirectory.ls();
  }
}

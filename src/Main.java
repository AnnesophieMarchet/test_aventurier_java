package src;

public class Main {
  public static void main(String[] args) {
    // instance de la map
    Map map = new Map();
    // instance de Hero
    Hero hero = new Hero(map, 3, 0);

    // affiche la carte initiale
    System.out.println("Initial map:");
    map.displayMap();

    String directions = "SSSSEEEEEENN";

    // deplacement du Hero
    hero.move(directions);
    map.displayMap();
  }
}

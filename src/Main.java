package src;

public class Main {
  public static void main(String[] args) {
    // instance de la map 1
    Map map1 = new Map();
    // instance de Hero 1
    Hero hero1 = new Hero(map1, 3, 0);

    // Affiche la carte initiale du Hero 1
    System.out.println("Initial map for hero 1:");
    map1.displayMap();

    String directions = "SSSSEEEEEENN";

    // deplacement du Hero 1
    hero1.move(directions);
    System.out.println("Map after movements for Hero 1:");
    map1.displayMap();

    // instance de la map 2
    Map map2 = new Map();
    // instance de Hero 2
    Hero hero2 = new Hero(map2, 6, 9);

    // affiche la carte initiale du hero 2
    System.out.println("Initial map for hero 2:");
    map2.displayMap();

    String directions2 = "OONOOOSSO";

    // Déplacement du hero 2 pour le deuxième test
    hero2.move(directions2);

    // Affiche la carte après les déplacements pour le deuxième test
    System.out.println("Map after movements for Hero 2:");
    map2.displayMap();
  }
}

package src;

public class Hero {

  private int posX;
  private int posY;
  private Map map;

  // constructeur pour initialiser le hero sur la map

  public Hero(Map map, int startX, int startY) {
    this.map = map;
    if (map.isValidPosition(startX, startY)) {
      this.posX = startX;
      this.posY = startY;
      this.map.setPosition(posX, posY, 'X');
    } else {
      System.out.println("Invalid initial position for character.");
    }
  }

  // méthode pour déplacer le personnage en fonction des directions spécifiées
  public void move(String directions) {
    for (char direction : directions.toCharArray()) {
      // remplacer la position actuelle par un espace
      map.setPosition(posX, posY, ' ');

      switch (direction) {
        case 'N' -> posY--;
        case 'S' -> posY++;
        case 'E' -> posX++;
        case 'O' -> posX--;
      }

      if (!map.isValidPosition(posX, posY)) {
        System.out.println("Move impossible to (" + posX + "," + posY + ")");
        break;
      }

      map.setPosition(posX, posY, 'X');
      System.out.println("Moved to (" + posX + "," + posY + ")");
    }
  }
}

package src;

public class Main {
  public static void main(String[] args) {
    // J' initialise la carte
    char[][] map = {
        "###    ######    ###".toCharArray(),
        "###      ##      ###".toCharArray(),
        "##     ##  ##     ##".toCharArray(),
        "#      ##  ##      #".toCharArray(),
        "##                ##".toCharArray(),
        "#####          #####".toCharArray(),
        "###### ##  ##  #####".toCharArray(),
        " #     ######     # ".toCharArray(),
        "     ########       ".toCharArray(),
        "    ############    ".toCharArray(),
        "    ############    ".toCharArray(),
        "     ########      #".toCharArray(),
        " #     ######     ##".toCharArray(),
        "###### ##  ## ######".toCharArray(),
        "#####          #####".toCharArray(),
        "##                ##".toCharArray(),
        "#   ## #    # ##   #".toCharArray(),
        "##   ##      ##   ##".toCharArray(),
        "###    #    #    ###".toCharArray(),
        "###    ######    ###".toCharArray(),
    };
    // Hero position sur la map

    int posX = 3;
    int posY = 0;

    map[posY][posX] = 'X';
    displayMap(map);

    String directions = "SSSSEEEEEENN";
    for (char direction : directions.toCharArray()) {
      map[posY][posX] = ' ';

      switch (direction) {
        case 'N' -> posY--;
        case 'S' -> posY++;
        case 'E' -> posX++;
        case 'O' -> posX--;
      }

      // Je regarde si les postitions du Hero sont valide
      if (posX < 0 || posX >= map[0].length || posY < 0 || posY >= map.length || map[posY][posX] == '#') {
        System.out.println("Move impossible to (" + posX + "," + posY + ")");
        break;
      }

      map[posY][posX] = 'X';
      // J' affiche la nouvelle position du Hero
      System.out.println("Moved to (" + posX + "," + posY + ")");

    }
    // J' utilise ma méthode pour afficher la carte avec la position final du Hero
    displayMap(map);
  }

  // Je défini la méthode afficherCarte()
  public static void displayMap(char[][] map) {
    for (char[] row : map) {
      System.out.println(new String(row));
    }
  }
}

package src;

public class Map {
  private char[][] map;

  // constrcuteur pour initialiser la carte
  public Map() {
    this.map = new char[][] {
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
        "###    ######    ###".toCharArray()
    };
  }

  // je défini la méthode afficherCarte()
  public void displayMap() {
    for (char[] row : map) {
      System.out.println(new String(row));
    }
    System.out.println();
  }

  // méthode pour vérifier si une position est valide sur la carte
  public boolean isValidPosition(int x, int y) {
    if (x < 0 || x >= map[0].length || y < 0 || y >= map.length || map[y][x] == '#') {
      return false;
    }
    return true;
  }

  // méthode montrer la position du Hero
  public void setPosition(int x, int y, char symbol) {
    map[y][x] = symbol;
  }
}

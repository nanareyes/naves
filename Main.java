

import Naves.Nave;
import Naves.NaveLanzadera;

public class Main {
  public static void main(String[] args) {
    Nave newNave = new NaveLanzadera("XXXPJ334980", "x34", "Serie # 2333", 8, true, true);
    System.out.println(newNave);
    System.out.println("\n\n");


    MenuDeEjecucion.showMenu();
  }
}

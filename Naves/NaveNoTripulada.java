package Naves;

public class NaveNoTripulada extends Nave{
  private boolean orbitar;

  public NaveNoTripulada(String modelEngine, String propeller, String chassis, int lights, boolean fullTank,
      boolean trackers) {
    super(modelEngine, propeller, chassis, lights, fullTank, trackers);
    this.orbitar = true;
  }

  @Override
  public void showDataNave() {
    System.out.println("Nave no tripulada");
  }

  @Override
  public void Navegar() {
    if(orbitar == true){
      System.out.println("La nave se encentra en órbita");
    } else {
      System.out.println("La nave no está en órbita");
    }
  }

  public boolean isOrbitar() {
    return orbitar;
  }

  public void setOrbitar(boolean orbitar) {
    this.orbitar = orbitar;
  }

}
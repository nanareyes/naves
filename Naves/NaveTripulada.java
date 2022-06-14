package Naves;

public class NaveTripulada extends Nave {
  private boolean orbitar;
  private int rockets;
  private boolean operatorCabin;

  public NaveTripulada(String modelEngine, String propeller, String chassis, int lights, boolean fullTank,
      boolean trackers) {
    super(modelEngine, propeller, chassis, lights, fullTank, trackers);
    NaveTripulada naveTripulada = this;
    naveTripulada.orbitar = orbitar;
    naveTripulada.rockets = rockets;
    naveTripulada.operatorCabin = true;
  }


  @Override
  public void Navegar() {
    if(operatorCabin == true && orbitar == true){
      System.out.println("La nave se encuentra tripulada");
    }else{
      System.out.println("La nave no tiene tripulantes");
    }
  }

  public int getRockets() {
    return rockets;
  }
  public void setRockets(int rockets) {
    this.rockets = rockets;
  }

  public boolean isOrbitar() {
    return orbitar;
  }

  public void setOrbitar(boolean orbitar) {
    this.orbitar = orbitar;
  }


  public boolean isOperatorCabin() {
    return operatorCabin;
  }

  public void setOperatorCabin(boolean operatorCabin) {
    this.operatorCabin = operatorCabin;
  }


  @Override
  public void showDataNave() {
    System.out.println("Nave tripulada");

  }

}


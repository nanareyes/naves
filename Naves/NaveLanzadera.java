package Naves;

public class NaveLanzadera extends Nave {
  private int wings;
  private int rockets;
  private boolean launch;

  public NaveLanzadera(String modelEngine, String propeller, String chassis, int lights, boolean fullTank,
      boolean trackers) {
    super(modelEngine, propeller, chassis, lights, fullTank, trackers);
    NaveLanzadera naveLanzadera = this;
    naveLanzadera.wings = wings;
    naveLanzadera.rockets= rockets;
    naveLanzadera.launch = true;
  }

  @Override
  public void showDataNave() {
    System.out.println("Nave tipo lanzadera");
  }

  @Override
  public void Navegar() {
    if(launch == true){
      System.out.println("La nave está lista para ser lanzada a órbita");
    }else{
      System.out.println("La nave no está lista");
    }
  }

  public int getWings() {
    return wings;
  }

  public void setWings(int wings) {
    this.wings = wings;
  }


  public int getRockets() {
    return rockets;
  }

  public void setRockets(int rockets) {
    this.rockets = rockets;
  }


  public boolean isLaunch() {
    return launch;
  }


  public void setLaunch(boolean launch) {
    this.launch = launch;
  }

}

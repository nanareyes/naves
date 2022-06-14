package Naves;

public abstract class Nave {
  static int id;
  private String modelEngine;
  private String propeller;
  private String chassis;
  private int lights;
  private boolean fullTank;
  private boolean trackers;


  public Nave(String modelEngine, String propeller, String chassis, int lights, boolean fullTank, boolean trackers) {
    this.modelEngine = modelEngine;
    this.propeller = propeller;
    this.chassis = chassis;
    this.lights = lights;
    this.fullTank = fullTank;
    this.trackers = true;
  }

  public static int getId() {
    return id;
  }

  public static void setId(int id) {
    Nave.id = id;
  }

  public String getModelEngine() {
    return modelEngine;
  }

  public void setModelEngine(String modelEngine) {
    this.modelEngine = modelEngine;
  }

  public String getChassis() {
    return chassis;
  }

  public void setChassis(String chassis) {
    this.chassis = chassis;
  }

  public int getLights() {
    return lights;
  }

  public void setLights(int lights) {
    this.lights = lights;
  }

  public boolean getFullTank() {
    return fullTank;
}

  public void setFullTank(boolean fullTank) {
    this.fullTank = fullTank;
  }

  public String getPropeller() {
    return propeller;
  }

  public void setPropeller(String propeller) {
    this.propeller = propeller;
  }

  public boolean isTrackers() {
    return trackers;
  }

  public void setTrackers(boolean trackers) {
    this.trackers = trackers;
  }

  @Override
  public String toString() {
    return "Nave [chassis= " + chassis + ", modelEngine= " + modelEngine +  ", propeller= " + propeller + "]";
  }

  public abstract void showDataNave();

  public abstract void Navegar();


}

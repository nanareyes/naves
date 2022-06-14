package Naves;
public class NaveDeExploracion extends Nave {
  private boolean inProject;

  public NaveDeExploracion(String modelEngine, String propeller, String chassis, int lights, boolean fullTank,
      boolean trackers) {
    super(modelEngine, propeller, chassis, lights, fullTank, trackers);
  }

  @Override
  public void showDataNave() {
    System.out.println("Nave de exploración");
  }

  @Override
  public void Navegar() {
    if(inProject == true){
    System.out.println("La nave se encuentra asignada a un projecto");
    } else {
    System.out.println("La nave no está asignada a ningún projecto");
    }
  }

  public boolean isInProject() {
    return inProject;
  }

  public void setInProject(boolean inProject) {
    this.inProject = inProject;
  }


}

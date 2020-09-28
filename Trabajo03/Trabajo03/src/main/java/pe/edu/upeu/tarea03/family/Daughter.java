package pe.edu.upeu.tarea03.family;

public class Daughter extends Father {
  private String hair;
  private String colorOjos;

  public Daughter(String hair, String colorOjos, String nombreCompleto, int edad){
    super(nombreCompleto,edad);
    this.hair = hair;
    this.colorOjos = colorOjos; 
  }

  public String getHair(){
      return hair;
  }

  public String getColorOjos(){
      return colorOjos;
  }
   
  public String mostrarDatos(){
    return "Color de pelo: "+hair+"\nColor de ojos: "+colorOjos+"\nNombre Completo: "+nombreCompleto+"\nEdad: "+edad;
  }
}

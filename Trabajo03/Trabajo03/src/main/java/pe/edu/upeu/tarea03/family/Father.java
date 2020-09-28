package pe.edu.upeu.tarea03.family;

public class Father {

  protected String nombreCompleto;
  protected int edad;

  public Father(final String nombreCompleto, final int edad){
    
    this.nombreCompleto = nombreCompleto;
    this.edad = edad;

  }

  public String getNombreCompleto(){
      return nombreCompleto;
  }

  public int getEdad(){
      return edad;
  }

  public String mostrarDatos(){
      return "Nombre Completo: "+nombreCompleto+"\nEdad: "+edad;
  }

}

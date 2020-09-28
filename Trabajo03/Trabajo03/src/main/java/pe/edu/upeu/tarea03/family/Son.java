package pe.edu.upeu.tarea03.family;

public class Son extends Father {
  private String hair; 
  
  public Son(String hair, String nombreCompleto, int edad){
    super (nombreCompleto,edad);
    this.hair = hair;
  }

  public String  getHair(){
      return hair; 
  }  

  public String mostrarDatos(){
    return "Color de pelo: "+hair+"\nNombre Completo: "+nombreCompleto+"\nEdad: "+edad;    
  }
}

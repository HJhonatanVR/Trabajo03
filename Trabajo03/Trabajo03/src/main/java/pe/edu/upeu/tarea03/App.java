package pe.edu.upeu.tarea03;

    import pe.edu.upeu.tarea03.family.Daughter;
    import pe.edu.upeu.tarea03.family.Father;
    import pe.edu.upeu.tarea03.family.Son;
    import pe.edu.upeu.tarea03.utils.LeerTeclado;
    
   
public class App {
  public static void main (String[] args){
   
   System.out.println("******************");
   System.out.println("*Datos Familiares*");
   System.out.println("******************");
   System.out.println();

   LeerTeclado teclado=new LeerTeclado();
  
   teclado.hjvr(" ","Ingrese su nombre o alias:");
   

   Father objDatos[] = new Father[3];

   objDatos[0] = new Father("Jhonatan Velasquez Rosas",40);
   objDatos[1] = new Son("Rubio","Saul Velasquez Cardenas",19);
   objDatos[2] = new Daughter("Negro","verdes","Ruth Velasquez Cardenas",15); 

   for(Father datos: objDatos){
     System.out.println(datos.mostrarDatos());  
     System.out.println();  
   }
 }
   
 

}
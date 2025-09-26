//importar scanner
import java.util.Scanner;
//CLASE TALLERES
public class Talleres {
    
//CONSTRUCTOR 
public Talleres(){
}
//instanciar scanner
Scanner leer =new Scanner(System.in);

//ATRIBUTOS
private int limite_participantes;
private int participantes_inscritos;
private int cupos_disponibles;
private String nombre;

//setters

    public void setLimite_participantes(int limite_participantes) {
        this.limite_participantes = limite_participantes;
    }

    public void setParticipantes_inscritos(int participantes_inscritos) {
        this.participantes_inscritos = participantes_inscritos;
    }

    public void setCupos_disponibles(int cupos_disponibles) {
        this.cupos_disponibles = cupos_disponibles;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//getters

    public int getLimite_participantes() {
        return limite_participantes;
    }

    public int getParticipantes_inscritos() {
        return participantes_inscritos;
    }

    public int getCupos_disponibles() {
        return cupos_disponibles;
    }

    public String getNombre() {
        return nombre;
    }
    


//METODO
public void inscribir_estudiantes(){
      System.out.println("Quedan "+cupos_disponibles+" cupos" +" en "+ nombre);
    
    
      
    System.out.println("Cuantos alumnos se van a inscribir en : "+nombre+": ");
    int participantes_a_inscribir = leer.nextInt();
 
cupos_disponibles= cupos_disponibles-participantes_a_inscribir;
 participantes_inscritos= participantes_a_inscribir-participantes_inscritos;
    
   if(((participantes_a_inscribir >= (limite_participantes+1)))   ){
       System.out.println("=====================");
       System.out.println("Ingrese valor valido");
        System.out.println("=====================");
   }
   
   if((cupos_disponibles) < 0){
        System.out.println("=====================");
       System.out.println("No hay cupos disponibles");
        System.out.println("=====================");
   }
   if(participantes_a_inscribir < 0){
       System.out.println("=====================================================");
       System.out.println("Los participantes a inscribir no pueden ser menor a 0");
       System.out.println("=====================================================");
   
   
   }
    
   
    
   
   
   
   
   
   
   }
   
    



public void visualizar_informacion(){
    
    System.out.println("==========================================================");

    System.out.println("Limite participantes: "+this.limite_participantes);
    System.out.println("Participantes inscritos: "+this.participantes_inscritos);
    System.out.println("Cupos disponibles: "+ this.cupos_disponibles);
    System.out.println("Nombre del taller: "+this.nombre);
    System.out.println("==========================================================");

}
        



        

}

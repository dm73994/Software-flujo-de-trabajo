package actividadestareas;
public class Actividad3 implements Tarea4, Tarea5 {
    
   @Override
   public  void Tareacinco(){
       System.out.println("bien");
   }
   @Override
   public  void Tareacuatro(){
       System.out.println("mal");
   }
   public  void condicional(){
       Actividad2 obj = new Actividad2();
       obj.TareaDos();
       if (obj.correcto()==2){
            Tareacinco();
       }else{
            Tareacuatro();
       }   
   }
}

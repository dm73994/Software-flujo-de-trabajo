package actividadestareas;
public class Actividad2 implements Tarea2, Tarea3{
    public int n=0;
    @Override
    public void TareaDos (){
        System.out.println("Principios");
        n++;
    }
    @Override
    public void TareaTres(){
        System.out.println("SOLID");
        n++;
    }
    public int correcto (){
        return n;
    }

}

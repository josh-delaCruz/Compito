
import java.util.Random;

//consumatore

public class Dipendente extends Thread {

    
    public Dipendente(String name) {
        super(name);
    }

    
    @Override
    public void run() {
        try {
            
            System.out.println("\n" + super.getName() + " attende il piatto");
            Bancone.semPieno.acquire();
            Bancone.prevela(); //il dipendente consuma il piatto
            System.out.println("\n" + super.getName() + " consuma il piatto " + Bancone.nPiattiprodotti);
            Bancone.semVuoto.release();
            
            sleep(new Random().nextInt(4)+1);
            
            
            
        } catch (Exception e) {}
    }
    
    
    
    
}

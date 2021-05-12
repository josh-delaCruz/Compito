
import java.util.Random;

//produttore

public class Cuoco extends Thread {

    protected static int nDipendentiDaServire; //n dipendenti per la pausa pranzo
    protected static int nPiatto = 0;
    
    public Cuoco(String name, int nDipendentiDaServire ) {
        super(name);
        this.nDipendentiDaServire = nDipendentiDaServire;
    }

    @Override
    public void run() {
        try {
           
         while(Bancone.nPiattiprodotti <= nDipendentiDaServire) { 
            nPiatto = Bancone.nPiattiprodotti;
            
            System.out.println("\nIl cuoco prepara il piatto n° " + nPiatto);
            Bancone.semVuoto.acquire();
            
            sleep(new Random().nextInt(4)+1); //preparazione piatto
            
            Bancone.doposita(); //il bancone diventa TRUE = pieno
            System.out.println("\nIl piatto n° " + nPiatto + " è pronto");
            Bancone.semPieno.release();
           }
            
            
            
        } catch (Exception e) {}
    }
    
    
    
}


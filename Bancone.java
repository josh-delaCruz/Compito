
import java.util.concurrent.Semaphore;


public class Bancone {
    
    //buffer
    protected static boolean bufferBancone = false;//TRUE = bancone pieno FALSE = bancone vuoto
    
    //semafori
    protected static Semaphore semVuoto = new Semaphore(1); 
    protected static Semaphore semPieno = new Semaphore(0);
   
    
    protected static int nPiattiprodotti = 1;
    
    //cuoco deposita il piatto
    protected synchronized static void doposita(){
        bufferBancone = true;
        nPiattiprodotti ++; //aumento numero piatti prodotti
    }
    
    //dipendente prende il piatto
    protected synchronized static void prevela(){
        bufferBancone = false;
    }
    
    
    //piatto da servire alle persone
   
}


import java.util.ArrayList;


public class Main {

    
    public static void main(String[] args) {
        
        ArrayList<Dipendente> listaDipendenti = new ArrayList<>();
        
        System.out.println("\n***Inizio pausa Pranzo***");
        
        listaDipendenti.add(new Dipendente("Francesco"));
        listaDipendenti.add(new Dipendente("Luisa"));
        listaDipendenti.add(new Dipendente("Ubaldo"));
        
        Cuoco c1 = new Cuoco("Carlo", listaDipendenti.size());
        
        for(Dipendente x : listaDipendenti){
            x.start();
        }
        
        c1.start();
        
        try {
            
            for(Dipendente y : listaDipendenti){
                y.join();
            }
            
            c1.join();
            
        } catch (Exception e) {}
        
        System.out.println("\n*** Fine pausa pranzo ***\n");
        
    }
    
}

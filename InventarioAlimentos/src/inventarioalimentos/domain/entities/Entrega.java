package inventarioalimentos.domain.entities;

import java.util.ArrayList;
import java.util.List;



public class Entrega {
   
    public String Fecha;

    
    public List<Alimento> alimento = new ArrayList<Alimento> ();

   
    public Beneficiario beneficiario;

    
    public Entrega() {
    }

}

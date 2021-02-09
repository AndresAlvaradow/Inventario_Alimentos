package inventarioalimentos.adaptadores;

import inventarioalimentos.domain.RegistroAlimentos;
import inventarioalimentos.domain.entities.Alimento;
import inventarioalimentos.persistencia.IOperacionDBAlimentos;



public class RegistrarAlimentoPortInt {
   
  private RegistroAlimentos registroAlimento;
  private IOperacionDBAlimentos ioperacionAlimento;

    public RegistrarAlimentoPortInt(RegistroAlimentos registroAimento, IOperacionDBAlimentos ioperacionAlimento) {
        this.registroAlimento = registroAimento;
        this.ioperacionAlimento = ioperacionAlimento;
    }
  
    public int registrarAlimentos(Alimento alimento){
        return this.registroAlimento.registrarAlimentos(alimento);
    }

}

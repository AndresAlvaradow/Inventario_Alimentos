package inventarioalimentos.adaptadores;

import inventarioalimentos.domain.RegistroAlimentos;
import inventarioalimentos.domain.entities.Alimento;
import inventarioalimentos.persistencia.IOperacionDBAlimentos;



public class RegistrarAlimentoPortInt {
   
  private RegistroAlimentos registroAimento;
  private IOperacionDBAlimentos ioperacionAlimento;

    public RegistrarAlimentoPortInt(RegistroAlimentos registroAimento, IOperacionDBAlimentos ioperacionAlimento) {
        this.registroAimento = registroAimento;
        this.ioperacionAlimento = ioperacionAlimento;
    }
  
    public int registrarAlimentos(Alimento alimento){
        return this.registroAimento.registrarAlimentos(alimento);
    }

}

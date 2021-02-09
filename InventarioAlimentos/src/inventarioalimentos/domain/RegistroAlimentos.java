package inventarioalimentos.domain;


import inventarioalimentos.domain.entities.Alimento;
import inventarioalimentos.persistencia.RepositorioAlimentos;


public interface RegistroAlimentos {
    
    
    
    public int registrarAlimentos(Alimento Alimento);

   
    boolean validarExistenciaA(String nombre);

}

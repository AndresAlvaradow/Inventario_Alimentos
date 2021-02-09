package inventarioalimentos.domain;


import inventarioalimentos.domain.entities.Entrega;
import inventarioalimentos.persistencia.RepositorioEntrega;


public interface RegistroEntregaX {
    
    void registrarEntrega(Entrega Entrega, RepositorioEntrega RepoEntrega);

  
    boolean ValidarExistenciaE(Entrega Entrega, String cedula, String nombreA);

}

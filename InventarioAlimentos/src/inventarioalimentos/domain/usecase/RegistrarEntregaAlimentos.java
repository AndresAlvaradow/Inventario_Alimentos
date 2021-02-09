package inventarioalimentos.domain.usecase;


import inventarioalimentos.domain.RegistroEntregaX;
import inventarioalimentos.domain.entities.Entrega;
import inventarioalimentos.persistencia.RepositorioEntrega;

public class RegistrarEntregaAlimentos implements RegistroEntregaX {
 
    public void registrarEntrega(Entrega Entrega, RepositorioEntrega RepoEntrega) {
    }

 
    public boolean ValidarExistenciaE(Entrega Entrega, String cedula, String nombreA) {
        return false;
    }

}

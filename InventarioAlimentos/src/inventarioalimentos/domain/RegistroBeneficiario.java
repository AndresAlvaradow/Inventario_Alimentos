package inventarioalimentos.domain;


import inventarioalimentos.domain.entities.Beneficiario;
import inventarioalimentos.persistencia.RepositorioBeneficiario;


public interface RegistroBeneficiario {
    
    void registrarBeneficiar(Beneficiario Beneficiario, RepositorioBeneficiario RepositorioB);

 
    boolean validarExistenciaB(Beneficiario Beneficiario, String cedula);

}

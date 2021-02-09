package inventarioalimentos.domain.usecase;


import inventarioalimentos.domain.RegistroBeneficiario;
import inventarioalimentos.domain.entities.Beneficiario;
import inventarioalimentos.persistencia.RepositorioBeneficiario;


public class RegistrarBeneficiario implements RegistroBeneficiario {

    public void registrarBeneficiar(Beneficiario Beneficiario, RepositorioBeneficiario RepositorioB) {
    }


    public boolean validarExistenciaB(Beneficiario Beneficiario, String cedula) {
        return false;
    }

}

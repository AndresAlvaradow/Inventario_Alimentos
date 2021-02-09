package inventarioalimentos.domain;


import inventarioalimentos.domain.entities.Beneficiario;



public interface RegistroBeneficiario {
    
    public int registrarBeneficiar(Beneficiario Beneficiario);

 
    boolean validarExistenciaB(String cedula);

}

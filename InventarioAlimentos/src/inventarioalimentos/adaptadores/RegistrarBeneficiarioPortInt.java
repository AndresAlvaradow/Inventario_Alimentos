package inventarioalimentos.adaptadores;


import inventarioalimentos.domain.RegistroBeneficiario;
import inventarioalimentos.domain.entities.Beneficiario;
import inventarioalimentos.persistencia.IOperacionDBBeneficiario;



public class RegistrarBeneficiarioPortInt {
 
    private RegistroBeneficiario registroBeneficiario;
   private IOperacionDBBeneficiario ioPeracionB;

    public RegistrarBeneficiarioPortInt(RegistroBeneficiario registroBeneficiario, IOperacionDBBeneficiario ioPeracionB) {
        this.registroBeneficiario = registroBeneficiario;
        this.ioPeracionB = ioPeracionB;
    }
   
    public int registrarBeneficiario(Beneficiario beneficiario){
        return this.registroBeneficiario.registrarBeneficiar(beneficiario);
    }


}

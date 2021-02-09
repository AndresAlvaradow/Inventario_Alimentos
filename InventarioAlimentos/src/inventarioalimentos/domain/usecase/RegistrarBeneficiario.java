package inventarioalimentos.domain.usecase;


import inventarioalimentos.domain.RegistroBeneficiario;
import inventarioalimentos.domain.entities.Alimento;
import inventarioalimentos.domain.entities.Beneficiario;
import inventarioalimentos.persistencia.IOperacionDBBeneficiario;



public class RegistrarBeneficiario implements RegistroBeneficiario {

    private IOperacionDBBeneficiario repositoryB;

    public RegistrarBeneficiario(IOperacionDBBeneficiario repositoryB) {
        this.repositoryB = repositoryB;
    }
    
    @Override
    public int registrarBeneficiar(Beneficiario Beneficiario) {
          Beneficiario objBeneficiario = new Beneficiario();
        int id= repositoryB.getAllBeneficiarios().size();
        if(!validarExistenciaB(Beneficiario.getCedula())){
            
            inventarioalimentos.persistencia.Beneficiario objBenef = new inventarioalimentos.persistencia.Beneficiario();
            objBenef.setNombre(Beneficiario.getNombres());
            objBenef.setApellido(Beneficiario.getApellidos());
            objBenef.setCedula(Beneficiario.getCedula());
            objBenef.setIdbeneficiario(id+1);
            repositoryB.insertar(objBenef);
            return 1;
            
        }
        return-1;
    }

    @Override
    public boolean validarExistenciaB(String cedula) {
         return repositoryB.validarExistencia(cedula);
    }

 

}

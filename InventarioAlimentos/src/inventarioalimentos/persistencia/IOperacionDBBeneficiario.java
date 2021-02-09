package inventarioalimentos.persistencia;

import java.util.List;

public interface IOperacionDBBeneficiario {

    public int insertar(Beneficiario BeneficiarioInsercion);

    public List<Beneficiario> getAllBeneficiarios();

    public boolean validarExistencia(String cedula);

}

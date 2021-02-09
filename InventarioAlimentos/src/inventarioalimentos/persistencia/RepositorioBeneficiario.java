package inventarioalimentos.persistencia;



import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class RepositorioBeneficiario implements IOperacionDBBeneficiario {
 
    public Beneficiario beneficiarios;

    @Override
    public int insertar(Beneficiario BeneficiarioInsercion) {
       try {
            BeneficiarioJpaController jpaObject = new BeneficiarioJpaController(Persistence.createEntityManagerFactory("InventarioAlimentosPU"));

            jpaObject.create(BeneficiarioInsercion);

        } catch (Exception ex) {
            Logger.getLogger(RepositorioAlimentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return BeneficiarioInsercion.getIdbeneficiario();
    }

    @Override
    public List<Beneficiario> getAllBeneficiarios() {
        EntityManager em= Persistence.createEntityManagerFactory("InventarioAlimentosPU").createEntityManager();
        //return em.createQuery("SELECT * FROM Cuenta ", Cuenta.class).getResultList();
        TypedQuery<Beneficiario> query =em.createNamedQuery("Beneficiario.findAll", Beneficiario.class);
        //List<Cuenta> results = query.getResultList();
        return query.getResultList();
    }

    @Override
    public boolean validarExistencia(String cedula) {
        List<Beneficiario> objBeneficiario = getAllBeneficiarios();
        for (int i = 0; i < objBeneficiario.size(); i++) {
            if (objBeneficiario.get(i).getCedula().compareTo(cedula) == 0 ) {
                return true;
            }
        }
        return false;
    }

  

   
   

}

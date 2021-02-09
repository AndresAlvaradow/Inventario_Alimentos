package inventarioalimentos.persistencia;



import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class RepositorioAlimentos implements IOperacionDBAlimentos {
  


 

    @Override
    public List<Alimento> getAllAlimentos() {
        EntityManager em= Persistence.createEntityManagerFactory("InventarioAlimentosPU").createEntityManager();
        //return em.createQuery("SELECT * FROM Cuenta ", Cuenta.class).getResultList();
        TypedQuery<Alimento> query =em.createNamedQuery("Alimento.findAll", Alimento.class);
        //List<Cuenta> results = query.getResultList();
        return query.getResultList();
    }

    @Override
    public boolean validarExistencia(String nombre) {
        List<Alimento> objAlimentos = getAllAlimentos();
        for (int i = 0; i < objAlimentos.size(); i++) {
            if (objAlimentos.get(i).getNombrealimento().compareTo(nombre) == 0 ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int insertarAlimentos(Alimento AlimentoIsercion) {
        try {
            AlimentoJpaController jpaObject = new AlimentoJpaController(Persistence.createEntityManagerFactory("InventarioAlimentosPU"));

            jpaObject.create(AlimentoIsercion);

        } catch (Exception ex) {
            Logger.getLogger(RepositorioAlimentos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AlimentoIsercion.getIdalimento();
    }

  




}

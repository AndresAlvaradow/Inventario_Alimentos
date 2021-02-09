package inventarioalimentos.persistencia;

import java.util.List;




public interface IOperacionDBAlimentos {

    public int insertarAlimentos(Alimento AlimentoIsercion);

  
    public List<Alimento> getAllAlimentos();

  
    public boolean validarExistencia(String nombre);

}

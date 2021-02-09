package inventarioalimentos.domain.usecase;

import inventarioalimentos.domain.RegistroAlimentos;
import inventarioalimentos.domain.entities.Alimento;
import inventarioalimentos.persistencia.IOperacionDBAlimentos;


public class RegistrarAlimentos implements RegistroAlimentos {

    private IOperacionDBAlimentos repository;

    public RegistrarAlimentos(IOperacionDBAlimentos repository) {
        this.repository = repository;
    }

    public boolean validarExistenciaA(String nombreAlimento) {

        return repository.validarExistencia(nombreAlimento);
    }

    @Override
    public int registrarAlimentos(Alimento Alimento) {
         Alimento objAlimento = new Alimento();
        int id= repository.getAllAlimentos().size();
        if(!validarExistenciaA(Alimento.getNombreAlimento())){
            
            inventarioalimentos.persistencia.Alimento objAlimP = new inventarioalimentos.persistencia.Alimento();
            objAlimP.setNombrealimento(Alimento.getNombreAlimento());
            objAlimP.setCategoria(Alimento.getCategoria());
            objAlimP.setTipo(Alimento.getTipo());
            objAlimP.setFecharecepcion(Alimento.getFechaRecepcion());
            objAlimP.setFechacaducidad(Alimento.getFechaCaducidad());
            objAlimP.setCantidad(Alimento.getCantidad());
            objAlimP.setIdalimento(id+1);
            repository.insertarAlimentos(objAlimP);
            return 1;
            
        }
        return-1;
    }



}

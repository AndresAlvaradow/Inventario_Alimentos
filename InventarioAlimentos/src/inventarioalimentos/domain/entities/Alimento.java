package inventarioalimentos.domain.entities;


public class Alimento {
   
    public String nombreAlimento;
    public String categoria;
    public String tipo;
    public String fechaRecepcion;
    public String fechaCaducidad;
    public int cantidad;
    
  
    public void notificacionAlimentoCaducar() {
    }


    public Alimento() {
    }

    public Alimento(String nombreAlimento, String categoria, String tipo, String fechaRecepcion, String fechaCaducidad, int cantidad) {
        this.nombreAlimento = nombreAlimento;
        this.categoria = categoria;
        this.tipo = tipo;
        this.fechaRecepcion = fechaRecepcion;
        this.fechaCaducidad = fechaCaducidad;
        this.cantidad = cantidad;
    }
    

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

}

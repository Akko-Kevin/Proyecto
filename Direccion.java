public class Direccion {
    private String calle;
    private String numero; //ext 1234 interior 12, 1234-11
    private String colonia;
    private String ciudad;
    private String estado;
    private String codigoPostal;

    public Direccion(String calle, String numero, String colonia, String ciudad, String estado, String codigoPostal){
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }
    public void setCalle(String calle){
        this.calle = calle;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setColonia(String colonia){
        this.colonia = colonia;
    }

    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }

    public void setCodigoPostal(String codigoPostal){
        this.codigoPostal = codigoPostal;
    }
    public String getCalle(){
        return calle;
    }

    public String getNumero(){
        return numero;
    }

    public String getColonia(){
        return colonia;
    }
  public String getCiudad(){
        return ciudad;
    }
    public String getEstado(){
        return estado;
    }
    public String getCodigoPostal(){
        return codigoPostal;
    }
    public String validar(String valor) {
        if(valor == null || valor.trim().isEmpty()) throw new IllegalArgumentException("Campo de direccion vacio");
        return valor.trim(); 
    }
    public String toString(){
        return calle+" #"+numero+ " "+colonia+ " "+ciudad+ " "+estado+" "+codigoPostal;
    }



}

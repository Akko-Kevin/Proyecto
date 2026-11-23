public class Cliente {
	private int idCliente;
    private String nombre;
	private String telefono;
	private String correo;
    private Direccion direccion;

    public Cliente(int idCliente, String nombre, String telefono,String correo, Direccion direccion){
        this.idCliente = idCliente;
		this.nombre = validar(nombre);
		this.telefono = validar(telefono);
		this.telefono = validar(correo);
        this.direccion =direccion;
    }
	
	public void setIdcliente(String idCliente){
        this.idCliente = idCliente;
    }
	
    public void setNombre(String nombre){
        this.nombre = validar(nombre);
    }
	
	public void setTelefono(String telefono){
        this.telefono = validar(telefono);
    }
	
	public void setCorreo(String correo){
        this.correo = validar(correo);
    }
	
    public void setDireccion(Direccion direccion){
        if(direccion==null) throw new IllegalArgumentException("Direccion requerida");
        this.direccion = direccion;
    }
    
	public String getIdcliente(){
        return idCliente;
    }
   
    public String getNombre(){
        return nombre;
    }
   
    public String getTelefono(){
        return telefono;
    }
	
	public String getCorreo(){
        return correo;
    }
	
	 public Direccion getDireccion(){
        return direccion;
    }
	
    public String validar(String s){
        if(s==null || s.trim().isEmpty()) throw new IllegalArgumentException("captura obligatoria");
        return s.trim();
    }
    public String toString(){
        return "ID del cliente: "+idCliente+"\nNombre:  "+nombre+"\nTelefono:  "+telefono+"\nCorreo:  "+correo+"\nDireccion:  "+direccion;
    }
}

public class Cita{
	private int idCita;
	private Citado Cliente;
	private String fecha;
	private estadoCita estado;
	
	public Cita(int idCita,Citado Cliente,String fecha,estadoCita estado){
		this.idCliente = idCliente;
		this.cliente = cliente;
		this.fecha = fecha;
		this.estado = estado;
	}
	
	public void setIdcita(String idCita){
        this.idCita = idCita;
    }
	
	public void setCliente(Citado Cliente){
        if(cliente==null) throw new IllegalArgumentException("Cliente requerido");
        this.cliente = cliente;
	}
	
	public void setFecha(String fecha){
        this.fecha = fecha;
    }
	
	public void setEstado(estadoCita estado){
        if(estado) throw new IllegalArgumentException("estado requerido");
        this.estado = estado;
	}
	
	public int getIdcita(){
        return idCita;
    }
	
	public Citado getCliente(){
        return cliente;
    }
	
	 public String getFecha(){
        return fecha;
    }
	
	public estadoCita getEstado(){
        return estado;
    }
	
	public String toString(){
        return "ID de la cita: "+idCita+"\Cliente:  "+cliente+"\nFecha:  "+fecha+"\nEstado:  "+estado;
    }
}

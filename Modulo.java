public abstract class Modulo <T>{
	
	protected T[] lista;
	protected int cantidad
	
	public Modulo(T[] lista) {
		this.lista = lista;
		this.cantidad = 0;
	}
	
    public void registrarElemento(T elemento) {
        if (cantidad < lista.length) {
			lista[cantidad] = elemento;
			cantidad++;
		}else{
			System.out.println("Lista llena")
    }

    public void eliminarElemento(int posicion) {

        if (posicion >= 0 && posicion < cantidad) {

            for (int i = posicion; i < cantidad - 1; i++) {
                lista[i] = lista[i + 1];
            }

            lista[cantidad - 1] = null;
            cantidad--;
        }
    }
	
    public void eliminarElemento(int posicion) {

        if (posicion >= 0 && posicion < cantidad) {

            for (int i = posicion; i < cantidad - 1; i++) {
                lista[i] = lista[i + 1];
            }

            lista[cantidad - 1] = null;
            cantidad--;
        }
    }
	
   public T obtenerDatos(int posicion) {

        if (posicion >= 0 && posicion < cantidad) {
            return lista[posicion];
        }
        return null;
    }

    public void mostrarTodo() {

        for (int i = 0; i < cantidad; i++) {
            System.out.println(lista[i]);
        }
    }
}

public class ControladorClientes {

    private ModuloCliente modulo;

    public ControladorClientes(ModuloCliente modulo) {
        this.modulo = modulo;
    }

    public void registrar(Cliente cliente) {
        modulo.registrarElemento(cliente);
    }

    public void eliminar(int posicion) {
        modulo.eliminarElemento(posicion);
    }

    public void modificar(int posicion, Cliente cliente) {
        modulo.modificarElemento(posicion, cliente);
    }

    public Cliente consultar(int posicion) {
        return modulo.obtenerDatos(posicion);
    }

    public void mostrar() {
        modulo.mostrarTodo();
    }
}

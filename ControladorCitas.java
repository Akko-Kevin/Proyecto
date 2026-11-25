public class ControladorCitas {

    private ModuloCita modulo;

    public ControladorCitas(ModuloCita modulo) {
        this.modulo = modulo;
    }

    public void registrar(Cita cita) {
        modulo.registrarElemento(cita);
    }

    public void eliminar(int posicion) {
        modulo.eliminarElemento(posicion);
    }

    public void modificar(int posicion, Cita cita) {
        modulo.modificarElemento(posicion, cita);
    }

    public Cita consultar(int posicion) {
        return modulo.obtenerDatos(posicion);
    }

    public void mostrar() {
        modulo.mostrarTodo();
    }
}

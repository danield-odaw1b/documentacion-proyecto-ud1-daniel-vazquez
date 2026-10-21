package es.centro.incidencias;

public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Recoge el error de buscarPorId si no existe ninguna Incidencia con el id recibido
     * @param id el comparador
     * Devuelve al método un String avisando que no existen Incidencias con ese id
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}

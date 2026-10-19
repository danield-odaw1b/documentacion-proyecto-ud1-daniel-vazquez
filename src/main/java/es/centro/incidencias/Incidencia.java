package es.centro.incidencias;

import java.util.Locale;

/**
 * Representa el modelo para una nueva incidencia
 *
 * @version 2.0
 * @since 1.0
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     * Crea una incidencia.
     *
     * @param id identificador positivo y único
     * @param titulo título descriptivo
     * @param prioridad prioridad de la incidencia en cuestión
     * @param abierta indica si la incidencia sigue abierta o no
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Devuelve el id de la incidencia
     *
     * @return id no vacío
     */
    public String getId() {
        return id;
    }

    /**
     * Devuelve el título de la incidencia actual
     *
     * @return titulo no vacío
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve el la prioridad de la tarea en cuestión
     *
     * @return prioridad no vacío
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Devuelve el estado de la incidencia, si sigue abierta o si no
     *
     * @return true o false
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprueba si el texto introducido es el id o el título de la incidencia
     *
     * @param texto
     * @return true o false
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }

}

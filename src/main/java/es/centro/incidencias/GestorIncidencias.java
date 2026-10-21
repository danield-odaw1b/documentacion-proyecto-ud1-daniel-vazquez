package es.centro.incidencias;

import java.util.List;

/**
 * El gestor que usa los objetos Incidencia para ciertas funciones
 *
 * @version 2.0
 * @since 1.0
 */
public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Devuelve el List entero de objetos Incidencia
     *
     * @return incidencias completo
     */
    public List<Incidencia> listar() { return incidencias; }

    /**
     * Devuelve la lista de incidencias guardadas, pero solo
     *
     * @return incidencias abiertas
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Filtra las incidencias de la lista según el texto que le pases
     * @param texto El texto con el que se comparan las incidencias
     *
     * @return incidencias Solo las que sen iguales a texto
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Devuelve aquella incidencia de la lista que tenga el mismo id que el pedido.
     * @param id El id que se va a comprarar.
     *
     * @return incidencia Solo la que coincida en su id con id
     *
     * @throws IncidenciaNoEncontradaException Salta si ningún id coincide con el parámetro id
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }


    /**
     * Devuelve la incidencia que coincida con el parámetro id
     *
     * @param id el valor que vamos a usar para comprarar
     *
     * @return Incidencia con su id igual al perámetro
     *
     * @deprecated Llama a otro método que ya hace lo mismo, buscarPorId, el cual está más ajustado para evitar errores.
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}

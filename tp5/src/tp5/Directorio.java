/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;

import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Directorio {

    private TreeMap<Long, Contacto> listaContactos;

    public Directorio() {
        listaContactos = new TreeMap<>();

    }

    public void agregarContacto(Long telefono, Contacto contacto) {
        listaContactos.put(telefono, contacto);
    }

    public Contacto buscarContacto(Long telefono) {
        return listaContactos.get(telefono);
    }

    public Set<Long> getTelefonos() {
        return listaContactos.keySet();
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new java.util.TreeSet<>();

        for (java.util.Map.Entry<Long, Contacto> entry : listaContactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public List<Contacto> buscarContactos(String ciudad) {
        List<Contacto> contactosCiudad = new ArrayList<>();
        for (Contacto c : listaContactos.values()) {
            if (c.getCiudad().equalsIgnoreCase(ciudad)) {
                contactosCiudad.add(c);
            }
        }
        return contactosCiudad;
    }

    public void borrarContacto(Long telefono) {
        listaContactos.remove(telefono);
    }
}

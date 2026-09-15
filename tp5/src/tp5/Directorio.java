/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
        
public class Directorio {

    private TreeMap<Long, Contacto> listaContactos;
    public Directorio(){
        listaContactos = new TreeMap<>();
        
    }
    public void agregarContacto(Long telefono,Contacto contacto){
        listaContactos.put(telefono, contacto);
    }
    public Contacto buscarContacto(Long telefono){
        return listaContactos.get(telefono);
    }
    public Set<Long> telefonos = new java.util.HashSet<>();
    //c
    
}


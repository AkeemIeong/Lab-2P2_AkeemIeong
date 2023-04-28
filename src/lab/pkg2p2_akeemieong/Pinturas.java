/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_akeemieong;

import java.util.Date;

/**
 *
 * @author surface pro
 */
public class Pinturas {
    private String nombre;
    private String autor;
    private Date fechapre;
    private Date dechaad;
    private boolean esta;
    
    public Pinturas(){
        
    }

    public Pinturas(String nombre, String autor, Date fechapre, Date dechaad, boolean esta) {
        this.nombre = nombre;
        this.autor = autor;
        this.fechapre = fechapre;
        this.dechaad = dechaad;
        this.esta = esta;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechapre() {
        return fechapre;
    }

    public void setFechapre(Date fechapre) {
        this.fechapre = fechapre;
    }

    public Date getDechaad() {
        return dechaad;
    }

    public void setDechaad(Date dechaad) {
        this.dechaad = dechaad;
    }

    public boolean isEsta() {
        return esta;
    }

    public void setEsta(boolean esta) {
        this.esta = esta;
    }

    @Override
    public String toString() {
        return "Pinturas{" + "nombre=" + nombre + ", autor=" + autor + ", fechapre=" + fechapre + ", dechaad=" + dechaad + ", esta=" + esta + '}';
    }
    
    
    
}

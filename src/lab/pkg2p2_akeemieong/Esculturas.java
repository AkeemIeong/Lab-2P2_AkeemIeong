/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_akeemieong;

/**
 *
 * @author surface pro
 */
public class Esculturas {
    private String nombre;
    private String material;
    private int ano;
    private String depar;
    
    public Esculturas(){
        
    }

    public Esculturas(String nombre, String material, int ano, String depar) {
        this.nombre = nombre;
        this.material = material;
        this.ano = ano;
        this.depar = depar;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDepar() {
        return depar;
    }

    public void setDepar(String depar) {
        this.depar = depar;
    }
    
    
}

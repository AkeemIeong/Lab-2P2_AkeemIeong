/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_akeemieong;

/**
 *
 * @author surface pro
 */
public class Escritos {
    private int totalpal;
    private int epoca;
    private String genero;
    private String autor;

    public Escritos(){
        
    }
    
    public Escritos(int totalpal, int epoca, String genero, String autor) {
        this.totalpal = totalpal;
        this.epoca = epoca;
        this.genero = genero;
        this.autor = autor;
    }

    
    
    public int getTotalpal() {
        return totalpal;
    }

    public void setTotalpal(int totalpal) {
        this.totalpal = totalpal;
    }

    public int getEpoca() {
        return epoca;
    }

    public void setEpoca(int epoca) {
        this.epoca = epoca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2p2_akeemieong;


public class Fotografias {
    private String dimen;
    private String res;
    private String color;
    
    public Fotografias(){
        
    }

    public Fotografias(String dimen, String res, String color) {
        this.dimen = dimen;
        this.res = res;
        this.color = color;
    }
    
    

    public String getDimen() {
        return dimen;
    }

    public void setDimen(String dimen) {
        this.dimen = dimen;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}

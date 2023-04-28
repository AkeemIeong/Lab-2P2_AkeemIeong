
package lab.pkg2p2_akeemieong;

import java.util.ArrayList;


public class Usuario {
    private String user;
    private String contra;
    private boolean admin;
    
    
    
    public Usuario(){
    
    }

    public Usuario(String user, String contra, boolean admin) {
        this.user = user;
        this.contra = contra;
        this.admin = admin;
    }
    
    
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


    
    
}

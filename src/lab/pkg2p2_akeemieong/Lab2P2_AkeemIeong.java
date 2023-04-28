
package lab.pkg2p2_akeemieong;

import java.util.ArrayList;
import java.util.Scanner;
public class Lab2P2_AkeemIeong {
    static Scanner read=new Scanner(System.in);
    static Usuario use=new Usuario();
    static ArrayList<Usuario> users=new ArrayList();
    static ArrayList<Pinturas> pinturas=new ArrayList();
    static ArrayList<Esculturas> escultura=new ArrayList();
    static ArrayList<Fotografias> foto=new ArrayList();
    static ArrayList<Escritos> escrito=new ArrayList();
    public static void main(String[] args) {
        int opuser=0;
        do{
            System.out.println("-------------Bienvenido------------");
            System.out.println("1<-Crear cuenta");
            System.out.println("2<-Login");
            opuser=read.nextInt();
            String user,contrasena,sn;
            boolean ad=false;
            
            int op;
            switch(opuser){
                case 1:
                    System.out.println("Ingrese su usuario: ");
                    user=read.next();
                    System.out.println("Ingrese su contrasena: ");
                    contrasena=read.next();
                    System.out.println("Escriba s si es admin y n sino es admin: ");
                    sn=read.next();
                    if(sn.equals("s")){
                        use.setAdmin(ad=true);
                    }else
                    if(sn.equals("n")){
                            use.setAdmin(ad=false);
                    }else
                        System.out.println("no es valido");
                    use.setUser(user);
                    use.setContra(contrasena);
                    use.setAdmin(ad);
                    users.add(new Usuario(user, contrasena, ad));
                    break;
                    
                case 2:
                    boolean temp;
                    System.out.println("Ingrese su usuario: ");
                    user=read.next();
                    System.out.println("Ingrese su contrasena: ");
                    contrasena=read.next();
                    System.out.println("Escriba s si es admin y n sino es admin: ");
                    sn=read.next();
                    if(sn.equals("s")){
                        temp=true;
                    }else
                    if(sn.equals("n")){
                           temp=false;
                    }else
                        System.out.println("no es valido");
                    
                    for (Usuario U : users) {
                        if(use.getContra().equals(contrasena) && use.getUser().equals(user)){
                            if(use.isAdmin()==true){
                                System.out.println("1<-pinturas");
                                System.out.println("2<-esculturas");
                                System.out.println("3<-fotografias");
                                System.out.println("4<-escritos");
                                op=read.nextInt();
                                switch(op){
                                    case 1:
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        break;
                                    case 2:
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        break;
                                    case 3:
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        break;
                                    case 4:
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        break;
                                }
                            }else{
                                System.out.println("1<-pinturas");
                                System.out.println("2<-esculturas");
                                System.out.println("3<-fotografias");
                                System.out.println("4<-escritos");
                                op=read.nextInt();
                                switch(op){
                                    case 1:
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        
                                        break;
                                    case 2:
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        
                                        break;
                                    case 3:
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        
                                        break;
                                    case 4:
                                        System.out.println("");
                                        System.out.println("");
                                        System.out.println("");
                                        
                                        break;
                                }
                            }
                        }
                    }
                    
                    break;
            }

        }while (opuser!=5);
    }
    
    
}

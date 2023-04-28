
package lab.pkg2p2_akeemieong;

import java.util.ArrayList;
import java.util.Date;
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
            
            int op,op2;
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
                                        System.out.println("1<-Crear");
                                        System.out.println("2<-Eliminar");
                                        System.out.println("3<-Listar");
                                        System.out.println("4<-Modificar");
                                        op2=read.nextInt();
                                        
                                        break;
                                    case 2:
                                        System.out.println("1<-Crear");
                                        System.out.println("2<-Eliminar");
                                        System.out.println("3<-Listar");
                                        System.out.println("4<-Modificar");
                                        op2=read.nextInt();
                                        
                                        break;
                                    case 3:
                                        System.out.println("1<-Crear");
                                        System.out.println("2<-Eliminar");
                                        System.out.println("3<-Listar");
                                        System.out.println("4<-Modificar");
                                        op2=read.nextInt();
                                        
                                        break;
                                    case 4:
                                        System.out.println("1<-Crear");
                                        System.out.println("2<-Eliminar");
                                        System.out.println("3<-Listar");
                                        System.out.println("4<-Modificar");
                                        op2=read.nextInt();
                                        
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
                                        System.out.println("1<-Listar");
                                        op2=read.nextInt();
                                        
                                        break;
                                    case 2:
                                        System.out.println("1<-Listar");
                                        op2=read.nextInt();
                                        
                                        break;
                                    case 3:
                                        System.out.println("1<-Listar");
                                        op2=read.nextInt();
                                        
                                        break;
                                    case 4:
                                        System.out.println("1<-Listar");
                                        op2=read.nextInt();
                                        
                                        
                                        break;
                                }
                            }
                        }
                    }
                    
                    break;
            }
        
        }while (opuser!=5);
    }
    public static void menu2(int op){
        switch(op){
            case 1:
                System.out.println("Ingrese el nombre de la pintura: ");
                String pint=read.next();
                System.out.println("Ingrese el nombre del autor :");
                String auto=read.next();
                System.out.println("Fecha de presentacion ingrese dd/mm/yyyy: ");
                String fecha=read.next();
                String []arrfecha=fecha.split("/");
                int dia=Integer.parseInt(arrfecha[0]);
                int mes=Integer.parseInt(arrfecha[1]);
                int ano=Integer.parseInt(arrfecha[2]);
                Date fechapre=new Date(ano, mes, dia);
                boolean ex;
                System.out.println("Ingrese si esta en exibicion s/n: ");
                char a=read.next().charAt(0);
                if(a=='s'){
                    ex=true;
                }else
                    if(a=='n'){
                        ex=false;
                        
                    }
                break;
            case 2:
                System.out.println("Ingrese el nombre del escultor: ");
                String escultor=read.next();
                System.out.println("Ingrese el material :");
                String mat=read.next();
                System.out.println("Fecha de inicio ingrese dd/mm/yyyy: ");
                String fechacom=read.next();
                String []arrfecha1=fechacom.split("/");
                int dia2=Integer.parseInt(arrfecha1[0]);
                int mes2=Integer.parseInt(arrfecha1[1]);
                int ano2=Integer.parseInt(arrfecha1[2]);
                Date feccom=new Date(ano2, mes2, dia2);
                System.out.println("1<-Arqueologia");
                System.out.println("2<-Artes");
                System.out.println("3<-Historia");
                String place;
                int lugar=read.nextInt();
                switch(lugar){
                    case 1:
                        place="Arqueologia";
                        break;
                    case 2:
                        place="Artes";
                        break;
                    case 3:
                        place="Historia";
                        break;
                }
                break;
            case 3:
                System.out.println("Ingrese el largo de la foto: ");
                int largo=read.nextInt();
                System.out.println("Ingrese el alto de la foto :");
                int alto=read.nextInt();
                System.out.println("Ingrese la resolucion de la foto: ");
                String res=
                System.out.println("Ingrese el color: ");
                

                break;
            case 4:
                System.out.println("Ingrese el nombre de la pintura: ");
                String pint=read.next();
                System.out.println("Ingrese el nombre del autor :");
                String auto=read.next();
                System.out.println("Fecha de presentacion ingrese dd/mm/yyyy: ");
                String fecha=read.next();
                String []arrfecha=fecha.split("/");
                int dia=Integer.parseInt(arrfecha[0]);
                int mes=Integer.parseInt(arrfecha[1]);
                int ano=Integer.parseInt(arrfecha[2]);
                Date fechapre=new Date(ano, mes, dia);
                boolean ex;
                System.out.println("Ingrese si esta en exibicion s/n: ");
                char a=read.next().charAt(0);
                if(a=='s'){
                    ex=true;
                }else
                    if(a=='n'){
                        ex=false;
                        
                    }

                break;
                                        }
    }
    
}

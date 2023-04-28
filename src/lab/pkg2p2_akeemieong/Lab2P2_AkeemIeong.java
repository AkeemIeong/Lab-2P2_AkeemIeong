
package lab.pkg2p2_akeemieong;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Lab2P2_AkeemIeong {
    static Scanner read=new Scanner(System.in);
    static Usuario use=new Usuario();
    static Pinturas pin=new Pinturas();
    static Esculturas escul=new Esculturas();
    static Fotografias fotos=new Fotografias();
    static Escritos escri=new Escritos();
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
            String res="n";
            
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
                                        if(op2==1){
                                            add(1);
                                        }
                                        if(op2==2){
                                            imprimir(1);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("1<-Crear");
                                        System.out.println("2<-Eliminar");
                                        System.out.println("3<-Listar");
                                        System.out.println("4<-Modificar");
                                        op2=read.nextInt();
                                        if(op2==1){
                                            add(2);
                                        }
                                        if(op2==2){
                                            imprimir(2);
                                        }
                                        break;
                                    case 3:
                                        System.out.println("1<-Crear");
                                        System.out.println("2<-Eliminar");
                                        System.out.println("3<-Listar");
                                        System.out.println("4<-Modificar");
                                        op2=read.nextInt();
                                        if(op2==1){
                                            add(3);
                                        }
                                        if(op2==2){
                                            imprimir(3);
                                        }
                                        break;
                                    case 4:
                                        System.out.println("1<-Crear");
                                        System.out.println("2<-Eliminar");
                                        System.out.println("3<-Listar");
                                        System.out.println("4<-Modificar");
                                        op2=read.nextInt();
                                       if(op2==1){
                                            add(4);
                                        }
                                       if(op2==2){
                                            imprimir(4);
                                        }
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
                                        if(op2==1){
                                            imprimir(1);
                                        }
                                        break;
                                    case 2:
                                        System.out.println("1<-Listar");
                                        op2=read.nextInt();
                                        if(op2==2){
                                            imprimir(2);
                                        }
                                        break;
                                    case 3:
                                        System.out.println("1<-Listar");
                                        op2=read.nextInt();
                                        if(op2==3){
                                            imprimir(3);
                                        }
                                        break;
                                    case 4:
                                        System.out.println("1<-Listar");
                                        op2=read.nextInt();
                                        if(op2==4){
                                            imprimir(4);
                                        }
                                        
                                        break;
                                }
                            }
                        }
                    }
                    
                    break;
                    
            }
                
        }while (opuser!=5);
    }
    public static void add(int op){
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
                System.out.println("Fecha de adquisicion ingrese dd/mm/yyyy: ");
                String fecha3=read.next();
                String []arrfecha3=fecha3.split("/");
                int dia3=Integer.parseInt(arrfecha3[0]);
                int mes3=Integer.parseInt(arrfecha3[1]);
                int ano3=Integer.parseInt(arrfecha3[2]);
                Date fechapre3=new Date(ano3, mes3, dia3);
                boolean ex=false;
                System.out.println("Ingrese si esta en exibicion s/n: ");
                char a=read.next().charAt(0);
                if(a=='s'){
                    ex=true;
                }else
                    if(a=='n'){
                        ex=false;
                    }
                pin.setAutor(auto);
                pin.setDechaad(fechapre3);
                pin.setEsta(ex);
                pin.setFechapre(fechapre);
                pin.setNombre(pint);
                pinturas.add(new Pinturas(pint, auto,fechapre,fechapre3, ex));
                break;
            case 2:
                System.out.println("Ingrese el nombre del escultor: ");
                String escultor=read.next();
                System.out.println("Ingrese el material :");
                String mat=read.next();
                System.out.println("Ingrese el ano de inicio: ");
                int ano2=read.nextInt();
                System.out.println("1<-Arqueologia");
                System.out.println("2<-Artes");
                System.out.println("3<-Historia");
                String place="";
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
                escul.setAno(ano2);
                escul.setDepar(place);
                escul.setMaterial(mat);
                escul.setNombre(escultor);
                escultura.add(new Esculturas(escultor, mat, ano2, place));
                break;
            case 3:
                System.out.println("Ingrese el largo de la foto: ");
                int largo=read.nextInt();
                System.out.println("Ingrese el alto de la foto :");
                int alto=read.nextInt();
                System.out.println("Ingrese la resolucion de la foto: ");
                String res=read.next();
                System.out.println("Ingrese el color B/N: ");
                String col=read.next();
                String dimen=largo+"cm X "+alto+"cm";
                fotos.setColor(col);
                fotos.setDimen(dimen);
                fotos.setRes(res);
                foto.add(new Fotografias(dimen, res, col) );
                break;
            case 4:
                System.out.println("Ingrese la cantidad de total de palabras: ");
                int cantpal=read.nextInt();
                System.out.println("Ingrese la epoca: ");
                String epoca=read.next();
                System.out.println("Ingrese el genero literario: ");
                String gen=read.next();
                System.out.println("Ingrese el  nombre del autor: ");
                String autor=read.next();
                escri.setAutor(autor);
                escri.setEpoca(epoca);
                escri.setGenero(gen);
                escri.setTotalpal(cantpal);
                escrito.add(new Escritos(cantpal, epoca, gen, autor));
                break;
                                        }
    }
    
    public static void imprimir(int op){
        switch(op){
            case 1:
                
                for (Pinturas p: pinturas){
                    System.out.println(Integer.toString(pinturas.indexOf(p)+1) + pinturas.get(op)) ;
                }
       
                
            case 2:
                for (Esculturas p: escultura){
                    System.out.println(Integer.toString(escultura.indexOf(p)+1) + escultura.get(op)) ;
                }
                break;
            case 3:
                for (Fotografias p: foto){
                    System.out.println(Integer.toString(foto.indexOf(p)+1) + foto.get(op)) ;
                }
                break;
            case 4:
                for (Escritos p: escrito){
                    System.out.println(Integer.toString(escrito.indexOf(p)+1) + escrito.get(op)) ;
                }
                break;
        }
    }
    
}

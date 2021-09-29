package turingsuma;
import javax.swing.JOptionPane;

public class TuringSuma {

    int a=0;
    int b=0;
    
    char cadena[]=new char[0];
    int longitud=0;
    
    int n=0;
    
    int total=0;
    
    public void ingresa(){
        cadena=new char[0];
        total=0;
        n=0;
        longitud=0;
        
        //try{
        a=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu primer número:"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu segundo número:"));
        //}catch(NumberFormatException e){
            //JOptionPane.showMessageDialog(null, "Debes introducir sólo números:\n"
                                              //+ "Prueba otra vez!!");
            //ingresa();
        //}
        longitud=2*(a+b);
        longitud=longitud+2;
        
        cadena=new char[longitud];
    
        rellena();
    }
    
    public void rellena(){
        int m=0;
        
        for(;m<a;m++){
           cadena[m]='0';    
        }
        
        cadena[m]='1';
        m++;
        
        for(;m<(a+b+1);m++){
            cadena[m]='0';
        }
        
        cadena[m]='1';
        m++;
        
        for(;m<cadena.length;m++){
            cadena[m]=' ';
        }
        //Imprimir
        for(int c=0;c<cadena.length;c++){
            System.out.print("["+cadena[c]+"]");
        }
        
        System.out.println("");
        System.out.println("Empezamos...");
        System.out.println("\n");
        q0();
    }
    
    //Empieza q0
    public void q0(){
        if(cadena[n]=='0'){
            System.out.print("q0 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='x';
            n=n+1;

            System.out.println("");
            q1();
        }else{
            System.out.print("q0 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='1';
            n=n+1;
            
            System.out.println("");
            q3();
        }
        
         
    }//Terminaq0
    
    //Empieza q1
       public void q1(){
        if(cadena[n]=='0'){
            
            System.out.print("q1 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='0';
            n=n+1;
            
            System.out.println("");
            q1();
        }else if(cadena[n]=='1'){
            
            System.out.print("q1 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='1';
            n=n+1;
            
            System.out.println("");
            q1();
        }else{
            
            System.out.print("q1 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='0';
            n=n-1;
            
            System.out.println("");
            q2();
        }
         
    }//Termina q1
    
       //Empieza q2
       public void q2(){
        if(cadena[n]=='0'){
            
            System.out.print("q2 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='0';
            n=n-1;
            
            System.out.println("");
            q2();
        }else if(cadena[n]=='1'){
            
            System.out.print("q2 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='1';
            n=n-1;
            
            System.out.println("");
            q2();
        }else{
            
            System.out.print("q2 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='x';
            n=n+1;
            
            System.out.println("");
            q0();
        }
           
    }//Termina q2
    
       //Empieza q3
    public void q3(){
         if(cadena[n]=='0'){
            
            System.out.print("q3 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            } 
            cadena[n]='y';
            n=n+1;
            
             System.out.println("");
            q4();
        }else{
            
            System.out.print("q3 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            } 
            cadena[n]='1';
            n=n+1;
            
             System.out.println("");
            q6();
        }
        
    }//Termina q3
    
    //Empieza q4
    public void q4(){
        if(cadena[n]=='0'){
           
            System.out.print("q4 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='0';
            n=n+1;
            
            System.out.println("");
            q4();
        }else if(cadena[n]=='1'){
            
            System.out.print("q4 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='1';
            n=n+1;
            
            System.out.println("");
            q4();
        }else{
            
            System.out.print("q4 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='0';
            n=n-1;
            
            System.out.println("");
            q5();
        }
           
    }//Termina q4
    
    //Empieza q5
    public void q5(){
        if(cadena[n]=='0'){
            
            System.out.print("q5 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='0';
            n=n-1;
            
            System.out.println("");
            q5();
        }else if(cadena[n]=='1'){
            
            System.out.print("q5 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='1';
            n=n-1;
            
            System.out.println("");
            q5();
        }else{
            
            System.out.print("q5 ");
            for(int z=0;z<cadena.length;z++){
                if(z==n){
                    System.out.print("("+cadena[z]+")");
                }else{
                    System.out.print(cadena[z]);
                }
            }
            cadena[n]='y';
            n=n+1;
            
            System.out.println("");
            q3();
        }
          
    }//Termina q5
    
    //Empieza q6
    public void q6(){
        
        for(int tot=0;tot<cadena.length;tot++){
            if(cadena[tot]=='0'){
                total=total+1;
            }
        }
        
        System.out.println("\nEl total de tu suma es \""+total+"\"");
        
        System.out.println("\n");
        System.out.println("Hemos terminado...\n"
                         + "Jeje: Nivel Masster!!");
    }//Termina q6
    
    public void ejecuta(){
        int elige=0;
        
        TuringSuma obj=new TuringSuma();
        
        do{
            try{
        elige=Integer.parseInt(JOptionPane.showInputDialog("ELIGE UNA DE LAS SIGUIENTES OPCIONES:\n"
                                                         + "1.-Hacer una suma\n"
                                                         + "0.-Salir"));
        
        switch(elige){
            
            case 1: obj.ingresa();break;
            
            case 0: System.exit(0);
            
            default: JOptionPane.showMessageDialog(null, "No es una opcion válida");
        }
        
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Cometiste un error del tipo: "+e);
                ejecuta();
            }
        
        }while(elige!=0);
        
    }
    
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO A LA MÁQUINA DE TURING\n"
                                          + "                   (SUMA)");
        
        TuringSuma obj=new TuringSuma();
        obj.ejecuta();
        
    }
    
}

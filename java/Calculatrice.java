/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;
/**
 *
 * @author safia
 */
import java.util.Scanner;

public class Calculatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        System.out.println("Choisir une opértion");
        System.out.println("1-Faire une addition:");
        System.out.println("2-Faire une soustration:"); 
        System.out.println("3-Faire une multiplication:"); 
        System.out.println("4-Faire une division:"); 
        System.out.println("5-Faire un modulo"); 
        System.out.println("6-Quitter");
        Scanner saisie=new Scanner(System.in); 
        int nombreSaisie=saisie.nextInt();
        
        switch(nombreSaisie){   
        case 1 :System.out.print("Saisir un nombre:");   
        Scanner nombre1=new Scanner(System.in);
        int a=nombre1.nextInt(); 
        System.out.print("Saisir un deuxieme nombre:");   
        Scanner nombre2=new Scanner(System.in);
        int b=nombre2.nextInt(); 
        int resultat=a+b;
        System.out.println(resultat);         
        break; 

        case 2 :System.out.print("Saisir un nombre:");   
        Scanner nbre1=new Scanner(System.in);
        int as=nbre1.nextInt(); 
        System.out.print("Saisir un deuxieme nombre:");   
        Scanner nbre2=new Scanner(System.in);
        int bs=nbre2.nextInt(); 
        int resultats=as-bs;
        System.out.println(resultats); 
        break; 

        case 3:System.out.print("Saisir un nombre:");   
        Scanner nbre1m=new Scanner(System.in);
        int am=nbre1m.nextInt(); 
        System.out.print("Saisir un deuxieme nombre:");   
        Scanner nbre2m=new Scanner(System.in);
        int bm=nbre2m.nextInt(); 
        int resultatm=am*bm;
        System.out.println(resultatm); 
        break;

        case 4:System.out.print("Saisir un nombre:");   
        Scanner nbre1d=new Scanner(System.in);
        int ad=nbre1d.nextInt(); 
        System.out.print("Saisir un deuxieme nombre:");   
        Scanner nbre2d=new Scanner(System.in);
        int bd=nbre2d.nextInt(); 
        int resultatd=ad/bd;
        System.out.println(resultatd); 
        break;
        case 5:System.out.print("Saisir un nombre:");   
        Scanner nbre1u=new Scanner(System.in);
        int au=nbre1u.nextInt(); 
        System.out.print("Saisir un deuxieme nombre:");   
        Scanner nbre2u=new Scanner(System.in);
        int bu=nbre2u.nextInt(); 
        int resultatu=au%bu;
        System.out.println(resultatu); 
        break;

        case 6:System.out.println("Quitter");
        break;

        default:System.out.println("Erreur"); 
        break;   
        }
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice;

/**
 *
 * @author HP
 */
public class Calculatrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

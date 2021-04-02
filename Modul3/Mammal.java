    package Modul3;

/**
 *
 * @author Niko Silabest
 */
class Mammal 
{
     
     String type()
     {
         System.out.println("Nama Hewan ini adalah Singa dan termasuk dalam jenis mamalia");
         return null;
     }
     void run(int a, int b)
     { 
         System.out.println("Bobot singa jantan bisa mencapai: "+a * b); 
     }
     String speed()
     {
         System.out.println("Dan Singa juga ahli dalam berburu");
         return null;
     }
     void run( double a, double b)
     {
         System.out.format("Mereka bisa berlari dengan kecepatan:%.2f KM/H\n",a * b);
     }         
}





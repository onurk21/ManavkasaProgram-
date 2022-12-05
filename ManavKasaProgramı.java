import java.util.Scanner;
public class ManavKasaProgramı {


       public static void main(String[] args) {
       double elma=3.67, armut=2.14,domates=1.11,muz=0.95,patlıcan=5.00;
       double armutkg,elmakg,muzkg,domateskg,patlıcankg;
       


       Scanner inp1 = new Scanner(System.in);
       System.out.print("Armut Kaç Kilo ? :");
       armutkg =inp1.nextDouble();
       System.out.print("Elma Kaç Kilo ? :");
       elmakg =inp1.nextDouble();
       System.out.print("Domates Kaç Kilo ? :");
       domateskg =inp1.nextDouble();
       System.out.print("Muz Kaç Kilo ? :");
       muzkg=inp1.nextDouble();
       System.out.print("Patlıcan Kaç Kilo ? :");
       patlıcankg =inp1.nextDouble();

       double toplam =(armut*armutkg)+(elma*elmakg)+(domates*domateskg)+(muz*muzkg)+(patlıcan*patlıcankg);
     
     
     
     
       System.out.println("Toplam Tuar :"+toplam+" TL"); 

    }

       

    
    
    
    
    
    
}



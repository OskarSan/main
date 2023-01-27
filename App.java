package main;


import java.util.Scanner;


public class App {
    
    public static void main( String[] args )
    {
        Hedgehog newSiili = new Hedgehog();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.print("\n1) Luo uusi siili\n2) Pistä siili puhumaan \n3) Juoksuta siiliä\n0) Lopeta ohjelma\nAnna valintasi: ");
            
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);
                
                switch(i) {
                    case 1:
                        System.out.print("Anna siilille nimi: ");
                        String name = sc.nextLine();
                        System.out.print("Anna siilille ikä: ");
                        int age = Integer.parseInt(sc.nextLine());

                        newSiili = new Hedgehog(name, age);
                        break;
                    case 2:
                        newSiili.speak();
                        break;
                    
                    case 3:
                        newSiili.Run();
                        break;
                    case 0:
                        System.out.println("Lopetetaan.\nKiitos ohjelman käytöstä!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Tuntematon valinta, yritä uudestaan.");
                        break;


                }       
            
            }
        }
        sc.close();
    }
}   

package main;

import java.util.Scanner;

public class Hedgehog {
    private String name;
    private int age;
    

    public Hedgehog(){
        name = "Pikseli";
        age = 5;
    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;


    }

    public void speak(Scanner sc){
        
        System.out.println("Mitä siili sanoo:");
        String speech = sc.nextLine();
        if(speech == ""){
            System.out.println("Olen "+ name + " ja ikäni on "+ age +", mutta antaisitko silti syötteen?");
            return;
        }
        System.out.println(name+": " + speech);

    }
    public void Run(Scanner sc){
        System.out.println("Kuinka monta kierrosta?");
        int laps = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < laps; i++){
            System.out.println(name + " Juoksee kovaa vauhtia!");
        }

    }
}

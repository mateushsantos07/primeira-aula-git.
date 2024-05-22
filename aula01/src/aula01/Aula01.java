
package aula01;

import java.util.Scanner;


public class Aula01 {

    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
                
        System.out.println("Digite a Quantidade de Gols");        
        int QG = leia.nextInt();
        System.out.println("Digite a Quantidade de passes certos");
        int PC = leia.nextInt();
        System.out.println("Digite a quantidade de Passes Errados");
        int PE = leia.nextInt();
        
        
        int PT = (QG * 50) + (PC* 10) + (PE *-5);
        System.out.println("Pontuação de " + PT);
        
        if(PT < 50){
            System.out.println("Pessima partida");
        }else if (PT >= 50 && PT < 100){
            System.out.println("Partida Ruim");
        }else if (PT >= 100 && PT < 150){
            System.out.println("Fez o  Básico");
        }else if (PT >= 150 && PT < 200){
            System.out.println("Foi Bem na partida");
        }else{
            System.out.println("Jogou Demais");
            
        }
        
        
    }
    
}

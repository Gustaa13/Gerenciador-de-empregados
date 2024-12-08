package util;

import java.util.Scanner;

public abstract class Leitor {
    static Scanner leitor = new Scanner(System.in);
    
    public static int DeInteiro(){

        if(leitor.hasNextInt()){
            return leitor.nextInt();
        }else{
            leitor.next();
            System.out.print("\nNúmero inválido! Digite novamente: ");
            return DeInteiro();
        }
    }

    public static Long DeLong(){
        
        if(leitor.hasNextLong()){
            return leitor.nextLong();
        }else{
            leitor.next();
            System.out.print("\nNúmero inválido! Digite novamente: ");
            return DeLong();
        }
    }

    public static void Fechar(){
        leitor.close();
    }
}

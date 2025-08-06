import java.util.Scanner;

public class Contador {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o parametro 1.");
        int parametroUm = scan.nextInt();
        System.out.println("Digite o parametro 2.");
        int partametroDois = scan.nextInt();

        try{
            contar(parametroUm,partametroDois);
        }catch(ParametrosInvalidosexpition e){
            System.out.println("O parametro 1 n pode ser menor que o  2");
        }



    }

    static void contar(int parametroUm,int parametroDois)throws ParametrosInvalidosexpition{
        if(parametroUm < parametroDois){
            throw new ParametrosInvalidosexpition();
        }else{
            int contagem = parametroUm - parametroDois;

            for(int cont = 1; cont <= contagem; cont++){
                System.out.println(cont);
            }
        }


    }
}
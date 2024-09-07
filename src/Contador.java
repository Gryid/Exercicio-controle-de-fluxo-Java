import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        boolean continuar = true;

        while(continuar){

            Scanner terminal = new Scanner(System.in);
            boolean parametrosValidos = false;

            while(!parametrosValidos){

                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro");
                int parametroDois = terminal.nextInt();

                try {
                    //chamando o método contendo a lógica de contagem
                    contar(parametroUm, parametroDois);
                    parametrosValidos = true;

                }catch (ParametrosInvalidosException e) {
                    //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                    System.out.println("O segundo parâmetro deve ser maior que o primeiro. Tente novamente");
                }
            }
            // Menu para continuar ou sair
            System.out.println("Deseja continuar? (s/n)");
            String resposta = terminal.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        System.out.println("Aplicação encerrada.");
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm>=parametroDois){
            throw new ParametrosInvalidosException();
        }
        //realizar o for para imprimir os números com base na variável contagem
        int contagem = parametroDois - parametroUm;
        for(int i =1;i<=contagem;i++){
            System.out.println("Imprimindo o número: "+i);
        }
    }
}

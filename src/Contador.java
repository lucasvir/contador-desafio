import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = sc.nextInt();
        sc.close();

        try {
            contador(primeiroParametro, segundoParametro);
        } catch(ParametroInvalidosException ex) {
            System.out.println(ex.getMessage());
        } 
    }

    static void contador(int primeiroParametro, int segundoParametro) {
        if(primeiroParametro > segundoParametro) 
            throw new ParametroInvalidosException("O segundo parametro deve ser maior que o primeiro.");

        int contagem = segundoParametro - primeiroParametro;
        for (int i = 0; i < contagem; i++) {
            primeiroParametro = primeiroParametro + 1;
            System.out.printf("Imprimindo o numero %d\n", primeiroParametro);
        }
    }
}

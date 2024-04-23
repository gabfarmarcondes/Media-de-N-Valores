import java.util.InputMismatchException;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int qtdeNum = 0, num, sum = 0;
        int div = 0;
        try {

            while (qtdeNum == div) {
                System.out.println("Digite a Quantidade de Numeros para Calcular a Media: ");
                qtdeNum = sc.nextInt();
                if (qtdeNum == 0) {
                    System.out.println("Nao Existe Media para 0 Numeros");
                    break;
                }
                for (int i = 0; i < qtdeNum; i++) {
                    System.out.printf("Digite os Valores:");
                    num = sc.nextInt();
                    sum += num;
                }

                if (qtdeNum != 0) {
                    div = sum / qtdeNum;
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Inserir Dados Validos");
        }
        System.out.println("Media: " + div);
        sc.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double notaFinal = nota1 + nota2;

        if (notaFinal > 200.0) {
            System.out.println("Erro: a soma das notas não pode ultrapassar 200.0.");
        } else {
            System.out.printf("NOTA FINAL = %.1f\n", notaFinal);
            if (notaFinal >= 60.0) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
        }

        sc.close();
    }
}

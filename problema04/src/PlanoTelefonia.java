import java.util.Locale;
import java.util.Scanner;

public class PlanoTelefonia {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

final double valorPlanoBasico = 50.0;
final int minutosInclusos = 100;
final double valorMinutoExtra = 2.0;

System.out.print("Digite a quantidade de minutos: ");
int minutosUsados = sc.nextInt();

double valorTotal;

if (minutosUsados <= minutosInclusos) {
valorTotal = valorPlanoBasico;
} else {
int minutosExcedentes = minutosUsados - minutosInclusos;
valorTotal = valorPlanoBasico + minutosExcedentes * valorMinutoExtra;
}

System.out.printf("Valor a pagar: R$ %.2f\n", valorTotal);

sc.close();
}
}
import java.util.Scanner;

public class MenorDeTres {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Primeiro valor: ");
int a = sc.nextInt();

System.out.print("Segundo valor: ");
int b = sc.nextInt();

System.out.print("Terceiro valor: ");
int c = sc.nextInt();

int menor = a;

if (b < menor) {
menor = b;
}

if (c < menor) {
menor = c;
}

System.out.println("MENOR = " + menor);

sc.close();
}
}
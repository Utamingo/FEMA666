import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);

System.out.print("Codigo do produto comprado: ");
int codigo = sc.nextInt();

System.out.print("Quantidade comprada: ");
int quantidade = sc.nextInt();

double preco;

switch (codigo) {
case 1:
preco = 5.00;
break;
case 2:
preco = 3.50;
break;
case 3:
preco = 4.80;
break;
case 4:
preco = 8.90;
break;
case 5:
preco = 7.32;
break;
default:
preco = 0.0;
System.out.println("Codigo invalido.");
sc.close();
return;
}

double total = preco * quantidade;
System.out.printf("Valor a pagar: R$ %.2f\n", total);

sc.close();
}
}
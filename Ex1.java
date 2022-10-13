import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        float nota;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        nota = ler.nextFloat();

        if (nota < 40)
            System.out.println("O aluno esta reprovado.");
        else if (nota >= 40 && nota < 60)
            System.out.println("O aluno esta de recuperação.");
        else
            System.out.println("O aluno esta aprovado!");
    }

}

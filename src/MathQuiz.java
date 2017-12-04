import java.util.Scanner;

public class MathQuiz {

    Scanner sc = new Scanner(System.in);

    public boolean question1() {
        int score = 0;
        boolean answer;
        System.out.println("Jaki jest wynik mnożenia 3*5 ?");
        score = sc.nextInt();
        return score == 15;
    }

    public boolean question2() {
        int score = 0;
        boolean answer;
        System.out.println("Jakie jest pole kwadratu o boku 12 ?");
        score = sc.nextInt();
        return score == 144;
    }

    public boolean question3() {
        int score = 0;
        boolean answer;
        System.out.println("Jaki jest pierwiastek kwadratowy z liczby 15129 ?");
        score = sc.nextInt();
        return score == 123;
    }
}

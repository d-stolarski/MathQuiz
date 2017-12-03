public class MathQuizTest {
    public static void main(String[] args) {
        int result = 0;
        MathQuiz mq = new MathQuiz();

        boolean q1 = mq.question1();
        boolean q2 = mq.question2();
        boolean q3 = mq.question3();

        System.out.println("Pytanie 1, odpowiedź poprawna?: " + q1);
        System.out.println("Pytanie 2, odpowiedź poprawna?: " + q2);
        System.out.println("Pytanie 3, odpowiedź poprawna?: " + q3);

        if(q1 == true) {
            result++;
        }
        if(q2 == true) {
            result++;
        }
        if(q3 == true) {
            result++;
        }

        System.out.println("Twój wynik to " + result + "/3 pkt.");
    }
}

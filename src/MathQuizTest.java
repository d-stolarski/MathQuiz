public class MathQuizTest {
    public static void main(String[] args) {

        MathQuiz mq = new MathQuiz();

        boolean q1 = mq.question1();
        boolean q2 = mq.question2();
        boolean q3 = mq.question3();

        System.out.println("Pytanie 1, odpowiedź poprawna?: " + q1);
        System.out.println("Pytanie 2, odpowiedź poprawna?: " + q2);
        System.out.println("Pytanie 3, odpowiedź poprawna?: " + q3);

        int result = 0;
        if(q1) {
            result++;
        }
        if(q2) {
            result++;
        }
        if(q3) {
            result++;
        }

        System.out.println("Twój wynik to " + result + "/3 pkt.");
    }
}

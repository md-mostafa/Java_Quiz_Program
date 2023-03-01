package quiz;

import java.util.Scanner;

public class QuizManager {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add Quiz");
        System.out.println("2. Start Quiz");
        String res = sc.nextLine();

        if(Integer.parseInt(res) == 1){
            while(true){
                AddQuiz.AddQuizQuestion();
                System.out.println("Do you want to add more?(y/n)");
                String r = sc.nextLine();

                if(!r.equalsIgnoreCase("y"))
                    break;
            }
        }else if(Integer.parseInt(res) == 2) {
            int totalQues= 5;
            int score = TakeQuiz.startQuiz(totalQues);
            System.out.println("\nYou got "+score+" out of "+totalQues);
        }
    }
}

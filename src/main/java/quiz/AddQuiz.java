package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class AddQuiz {
    private static HashMap<String, Object> quiz = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    public static void AddQuizQuestion(){
        System.out.println("Please add a ques here");
        String qs = sc.nextLine();
        quiz.put("Question", qs);
        System.out.println("Input options");
        for(int i =0; i<4; i++){
            char ch = 'a';
            int ascii = ch + i;
            System.out.print((char) ascii+" :  ");
            String op = sc.nextLine();
            quiz.put("option "+(char) ascii, op);
        }
        System.out.println("\nPlease input the correct ans");
        String answer = sc.nextLine();
        quiz.put("answer", answer);

        QuizWriter.saveToQuizBank(quiz);

    }

}

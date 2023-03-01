package quiz;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class TakeQuiz {


    public static boolean quizQuestion() {
        Scanner sc = new Scanner(System.in);
        List<HashMap<String, Object>> quizQues  = QuizReader.readQuizFromQuizBank();
        int idx = Utils.getRandomNum(quizQues.size());
        HashMap<String, Object> quiz = quizQues.get(idx);


        System.out.println("Question : "+quiz.get("Question"));
        System.out.println("a : "+quiz.get("option a"));
        System.out.println("b : "+quiz.get("option b"));
        System.out.println("c : "+quiz.get("option c"));
        System.out.println("d : "+quiz.get("option d"));

        String ans = sc.nextLine();
        if(!ans.equals(quiz.get("answer"))){
            System.out.println("Not correct\n");
            return false;
        }else{
            System.out.println("Correct!\n");
            return true;
        }
    }

    public static int startQuiz(int quesNum){
        int score = 0;
        for (int i = 0; i< quesNum; i++){
            boolean ans = quizQuestion();
            if(ans){
                score += 1;
            }
        }
        return score;
    }

}

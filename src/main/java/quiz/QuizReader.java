package quiz;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuizReader {

    public static List<HashMap<String, Object>> readQuizFromQuizBank() {
        List<HashMap<String, Object>> quizList = null;
        try {

            Type listType = new TypeToken<List<HashMap<String, Object>>>() {
            }.getType();
            quizList = new Gson().fromJson(new FileReader("./src/main/resources/quiz/quizBank.json"), listType);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return quizList;
    }

}

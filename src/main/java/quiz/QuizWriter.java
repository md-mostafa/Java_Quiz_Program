package quiz;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

public class QuizWriter {

    public static void saveToQuizBank(HashMap<String, Object> question) {
        try {
            FileReader reader = new FileReader("./src/main/resources/quiz/quizBank.json");


            Type listType = new TypeToken<List<HashMap<String, Object>>>() {
            }.getType();
            List<HashMap<String, Object>> quizList = new Gson().fromJson(reader, listType);

            quizList.add(question);

            JsonElement element = new Gson().toJsonTree(quizList);
            JsonArray jsonArray = element.getAsJsonArray();
            FileWriter file = new FileWriter("./src/main/resources/quiz/quizBank.json");
            file.write(jsonArray.toString());
            file.close();

            System.out.println("Quiz saved at the database\n");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

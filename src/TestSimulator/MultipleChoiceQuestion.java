package TestSimulator;
import java.util.ArrayList;


public class MultipleChoiceQuestion extends Question {
    char correctAnswer;
    char chosenAnswer;
    ArrayList<String> answers = new ArrayList<String>();

    @Override
    boolean isAnswerCorrect() {
        boolean answer;
        if (chosenAnswer == correctAnswer){
            answer = true;
    }else{
          answer = false;
        }
        return answer;
    }


}

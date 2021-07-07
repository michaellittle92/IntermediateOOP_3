package TestSimulator;

public class MultipleChoiceQuestion extends Question {
    String answers;
    char correctAnswer;
    char chosenAnswer;

    String answer1;
    String answer2;
    String answer3;
    String answer4;

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

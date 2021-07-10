package TestSimulator;

public class TrueFalseQuestion extends Question {
    boolean correctAnswer;
    boolean chosenAnswer;

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

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setChosenAnswer(boolean chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public boolean isChosenAnswer() {
        return chosenAnswer;
    }
}

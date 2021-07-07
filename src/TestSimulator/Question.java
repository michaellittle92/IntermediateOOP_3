package TestSimulator;

abstract class Question {
    String questionID;
    int chapterNumber;
    String questionText;

    public String getQuestionID() {
        return questionID;
    }

    public int getChapterNumber() {
        return chapterNumber;
    }

    public String getQuestionText() {
        return questionText;
    }

    abstract boolean isAnswerCorrect();


}

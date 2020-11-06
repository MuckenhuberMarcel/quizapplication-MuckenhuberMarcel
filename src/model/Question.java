package model;

public class Question {
    private String questionText;
    private boolean questionAnswer;

    public Question(String questionText, boolean questionAnswer) {
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public boolean isQuestionAnswer() {
        return questionAnswer;
    }
}

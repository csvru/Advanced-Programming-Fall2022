package exercise1.exam;

import java.util.ArrayList;

public class Test {
    private final String title;
    private final ArrayList<Question> questions;
    private final ArrayList<Integer> marks;
    private int answeredCount = 0;

    public Test(String title) {
        this.title = title;
        this.questions = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public Test addQuestion(Question question) {
        this.questions.add(question);
        this.marks.add(-1);
        return this;
    }

    public String getTitle() {
        return title;
    }

    public int questionCount() {
        return this.questions.size();
    }

    public Question getQuestion(int questionIndex) {
        if (questionIndex < 0 || questionIndex >= this.questions.size()) {
            return null;
        }
        return this.questions.get(questionIndex);
    }

    public String answerToQuestion(int questionIndex, int choice) {
        if (questionIndex < 0 || questionIndex >= this.questions.size()) {
            return "Question by index " + questionIndex + " not found";
        }

        Question question = this.getQuestion(questionIndex);
        // this condition is not required.
        if (question == null) {
            return "Question by index " + questionIndex + " not found";
        }

        if (this.marks.get(questionIndex) != -1) {
            return "You already answered this question";
        }

        int markResult = question.answer(choice);

        if (markResult == -1) {
            return "Please check your answer";
        }

        this.marks.set(questionIndex, markResult);
        this.answeredCount++;
        return "score: " + markResult;
    }

    public int[][] getMarks() {
        int[][] marks = new int[2][this.answeredCount];
        for (int index = 0, marksCounter = 0; index < this.marks.size(); index++) {
            int currentMark = this.marks.get(index);
            if (currentMark != -1) {
                marks[0][marksCounter] = index;
                marks[1][marksCounter] = currentMark;
                marksCounter++;
            }
        }
        return marks;
    }

    public int finalMark() {
        int sumMarks = 0;
        for (int mark : this.marks) {
            if (mark != -1) {
                sumMarks += mark;
            }
        }
        return sumMarks;
    }
}

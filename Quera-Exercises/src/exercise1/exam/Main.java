package exercise1.exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Question question1 = new Question("2*2?", new String[]{"4", "2", "3", "1"}, 0, 10);
        Question question2 = new Question("20+10?", new String[]{"40", "20", "30", "10"}, 2, 5);
        Question question3 = new Question("20-5?", new String[]{"9", "7", "15", "16"}, 2, 5);
        Question question4 = new Question("14/2?", new String[]{"8", "7", "5", "4"}, 1, 10);
        question3.inactive();
        Test mathTest = new Test("Math Test");
        mathTest.addQuestion(question1).addQuestion(question2).addQuestion(question3).addQuestion(question4);
        boolean showedTwoTimes = false;
        for (int index = 0; index < mathTest.questionCount(); index++) {
            Question question = mathTest.getQuestion(index);
            System.out.println(question.show());
            if(!question.isActive()){
                System.out.println("Warning: this question is not active!");
                continue;
            }
            System.out.print("Your answer: ");
            String answerResult = mathTest.answerToQuestion(index, input.nextInt());
            System.out.println("-------------------");
            System.out.println(answerResult);
            System.out.println("-------------------");
            // for showing a question two times
            if(!showedTwoTimes && index == 1){
                --index;
                showedTwoTimes = true;
            }
        }
        printMarks(mathTest.getMarks());
        System.out.println("final score: " + mathTest.finalMark());
    }

    private static void printMarks(int[][] marks) {
        System.out.println("Your Marks: ");
        for(int index = 0; index < marks[0].length; index++) {
            System.out.println(marks[0][index] + "):" + marks[1][index]);
        }
    }
}

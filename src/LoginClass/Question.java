package LoginClass;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Question {

    JFrame frame = new JFrame();
    JLabel questionLabel = new JLabel("questionLabel");

    Question (String quiz){


        questionLabel.setBounds(0,0,400,150);
        questionLabel.setFont(new Font(null,Font.BOLD,50));
        questionLabel.setText("Hello + userID");


        frame.add(questionLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,800);
        frame.setLayout(null);
        frame.setVisible(true);


    }

    String prompt;
    String answer;

    public Question(String prompt, String answer) {
        this.prompt = prompt;
        this.answer = answer;
    }





    String q1 = "What color are apples?/n" + "(a)red/green\n(b)Orange\n(c)Magnet\n";
    String q2 = "What color are bananas?/n" + "(a)red/green\n(b)Yellow\n(c)Blue\n";


    Question[] questions = {

            new Question(q1, "a"),
            new Question(q2, "b")
    };


    public static void takeTest(Question [] questions){

        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i = 0; i < questions.length; i++){

            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].answer)){
                score++;
            }


        }
        System.out.println("You got" + "/"+questions.length);


    }


}








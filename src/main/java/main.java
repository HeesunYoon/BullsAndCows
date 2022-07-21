import org.example.Bulls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Bulls bulls = new Bulls();
        int score = 0;

        List<String> ANSWER = bulls.generateNumbers();


        while (true){
            List<String> GUESS = bulls.guess();
            score = bulls.getScore(ANSWER, GUESS);
            System.out.println(ANSWER);
            System.out.println(score);
            if(score == 3){
                break;
            }
        }
        System.out.println("축하합니다." + ANSWER + " 숫자의 값을 맞추었습니다.");
    }



}

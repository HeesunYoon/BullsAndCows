package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bulls {

    public List<String> guess(){
        String number = null;
        List<String> numberList = new ArrayList<String>();

        while (numberList.size() < 3){
            Scanner sc = new Scanner(System.in);
            System.out.println("숫자 3개를 차례대로 입력하세요.");
            number = sc.next();

            if(Integer.parseInt(number) < 0 || Integer.parseInt(number) > 9){
                System.out.println("범위를 벗어나는 숫자입니다.");
            } else if (Arrays.asList(numberList).contains(number)) {
                System.out.println("중복되는 숫자입니다.");
            } else {
                numberList.add(number);
            }
        }

        return numberList;
    }

    public List<String> generateNumbers(){
        List<String> numbers = new ArrayList<String>();
        String newNumber = "";

        while (numbers.size() < 3){
            newNumber = String.valueOf((int)(Math.random()*9));
            if (!Arrays.asList(numbers).contains(newNumber)) {
                numbers.add(newNumber);
            }
        }
        return numbers;
    }

    public int getScore(List<String> generateNumbers, List<String> guess){
        int strikeCount = 0;

        for(int i=0; i < 3; i++){
            System.out.println(guess.get(i));
            if(generateNumbers.get(i) == guess.get(i)){
                System.out.println("맞음");
                strikeCount += 1;
            }
        }

        return strikeCount;
    }

}

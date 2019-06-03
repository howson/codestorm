package com.tencent.tdd.codestorm;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

  public Map<Integer, String> fizzbuzzMap = new HashMap<>();

  public int tellTwoSpecialNum(int x, int y) {
    return fizzbuzzMap.size();
  }

  public boolean isFizz(int number) {
    return false;
  }

  public boolean isBuzz(int number) {
    return false;
  }

  public boolean isFizzBuzz(int number) {
    return false;
  }

  public void sayYourSlogan(int number) {

    if (isFizzBuzz(number)) {
      System.out.println("FizzBuzz");
      return;
    }

    if (isFizz(number)) {
      System.out.println("Fizz");
      return;
    }

    if (isBuzz(number)) {
      System.out.println("Buzz");
      return;
    }

    System.out.println(number);
    return;
  }

  public void startGame(int studentNumber, int x, int y) {
    tellTwoSpecialNum(x, y);

    for (int i = 0; i < studentNumber; i++) {
      sayYourSlogan(i);
    }

  }

}

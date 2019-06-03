package com.tencent.tdd.codestorm;

public class FizzBuzz {

  private int firstNumber = 0;
  private int secondNumber = 0;

  public void tellTwoSpecialNum(int x, int y) {
    if (x == y) {
      System.out.println("this two number should not be the same");
      System.exit(1);
    }

    firstNumber = x;
    secondNumber = y;
  }

  public boolean isFizz(int number) {
    return number % firstNumber == 0 || String.valueOf(number).contains(String.valueOf(firstNumber));
  }

  public boolean isBuzz(int number) {
    return number % secondNumber == 0 || String.valueOf(number).contains(String.valueOf(secondNumber));
  }

  public boolean isFizzBuzz(int number) {
    return (number % firstNumber == 0) && (number % secondNumber == 0);
  }

  public String sayYourSlogan(int number) {

    if (isFizzBuzz(number)) {
      return "FizzBuzz";
    }

    if (isFizz(number)) {
      return "Fizz";
    }

    if (isBuzz(number)) {
      return "Buzz";
    }

    return String.valueOf(number);
  }

  public void startGame(int studentNumber, int x, int y) {
    tellTwoSpecialNum(x, y);

    for (int i = 0; i < studentNumber; i++) {
      System.out.println("student " + "i" + " says " + sayYourSlogan(i));
    }

  }

}

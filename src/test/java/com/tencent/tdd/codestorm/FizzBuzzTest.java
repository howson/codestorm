package com.tencent.tdd.codestorm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

  // 输入两个特殊数x和y
  // 遇到包含x或是x的倍数，输出Fizz
  // 遇到包含y或是y的倍数，输出Buzz
  // 同时是x和y的倍数，喊FizzBuzz
  // 同时满足上述多个条件，Fizz和Bizz只能出现一次
  // 否则输出数字

  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Before
  public void setUp() {
    fizzBuzz.tellTwoSpecialNum(3, 5);
  }

  /**
   * 测试Fizz是否正常
   */
  @Test
  public void testFizz() {
    Assert.assertTrue(fizzBuzz.isFizz(13));
    Assert.assertTrue(fizzBuzz.isFizz(39));
    Assert.assertFalse(fizzBuzz.isFizz(50));
    Assert.assertTrue("Fizz".equals(fizzBuzz.sayYourSlogan(33)));
    Assert.assertFalse("Fizz".equals(fizzBuzz.sayYourSlogan(30)));
  }

  /**
   * 测试Buzz是否正常
   */
  @Test
  public void testBuzz() {
    Assert.assertTrue(fizzBuzz.isBuzz(80));
    Assert.assertTrue(fizzBuzz.isBuzz(25));
    Assert.assertFalse(fizzBuzz.isBuzz(63));
    Assert.assertTrue("Buzz".equals(fizzBuzz.sayYourSlogan(55)));
    Assert.assertFalse("Buzz".equals(fizzBuzz.sayYourSlogan(15)));
  }

  /**
   * 测试FizzBuzz是否正常
   */
  @Test
  public void testFizzBuzz() {
    Assert.assertTrue(fizzBuzz.isFizzBuzz(15));
    Assert.assertTrue(fizzBuzz.isFizzBuzz(45));
    Assert.assertTrue("FizzBuzz".equals(fizzBuzz.sayYourSlogan(90)));
    Assert.assertFalse(fizzBuzz.isFizzBuzz(35));
  }

}

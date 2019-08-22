package se.ecutb.cheng;

import org.junit.Assert;
import org.junit.Test;

public class MiniTest {
        @Test
        public void test_addition(){
            //Arrange
            int expected = 7;

            //Act
            int actual = Minicalculator.addition(3,4);

            //Assert
            Assert.assertEquals(expected,actual,0);
        }

        @Test
        public void test_subtraction(){
            //Arrange
            int expected = 1;

            //Act
            int actual = Minicalculator.subtraction(4,3);

            //Assert
            Assert.assertEquals(expected,actual,0);
        }

        @Test
        public void test_multiplication(){
            //Arrange
            int expected = 12;

            //Act
            int actual = Minicalculator.multiplication(4,3);

            //Assert
            Assert.assertEquals(expected,actual,0);
        }

        @Test
        public void test_division(){
            //Arrange
            int expected = 2;

            //Act
            int actual = Minicalculator.division(4,2);

            //Assert
            Assert.assertEquals(expected,actual,0);
        }

    }

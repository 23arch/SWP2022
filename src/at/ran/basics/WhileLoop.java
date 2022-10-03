package at.ran.basics;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
                Random random = new Random();
                boolean isFinished = false;

                while (!isFinished) {
                    int randomNumber = random.nextInt(30);
                    System.out.println(randomNumber);

                    if ((randomNumber == 15) || (randomNumber == 25)) {
                        isFinished = true;

                        System.out.println("Finished");
                    }
                }
            }
    }


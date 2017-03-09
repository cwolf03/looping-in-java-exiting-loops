package com.theironyard;

/**
 * For this exercise you will write a simple main() method that prints out the
 * following text:
 *
 * 1
 * 2 2
 * 4 4 4 4
 * 5 5
 * 6 6 6 6 6 6
 *
 * Note the following facts:
 *
 * - 3 is not output at all
 * - 5 is only output twice
 * - You are required use nested for loops (not while loops)
 * - You will need to use both the "break" and continue "keywords"
 * - Each number is followed by a space. EG: 2_2_, not 2_2.
 *
 * The test is picky about formatting so make sure you get it right. Ask
 * questions if something is unclear.
 *
 */
public class Main {

    public static void main(String[] args) {

        /* Output the following text:
            1
            2 2
            4 4 4 4
            5 5
            6 6 6 6 6 6
         */
        // todo: output the expected text
        for (int row = 1; row <= 6; row++){
            if(row == 3){
                continue;
            }
            if(row != 1) {
                System.out.println();
            }

            for(int column = 1; column <= row; column++){
                if(row == 5 && column > 2){
                    break;
                }
                System.out.print(row + " ");
            }
        }
        System.out.println();
    }

}

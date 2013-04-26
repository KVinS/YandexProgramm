/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilites;

/**
 *
 * @author Эдуард
 */
public class Utilites {
    //Ну не сплитить же мне строку, чтобы узнать сколько пробелов?

    public static int spaceAmount(String string) {
        int amount = 0;
        for (int symNum = 0; symNum < string.length(); symNum++) {
            if (string.charAt(symNum) == ' ') {
                amount++;
            }
        }
        return amount;
    }
}

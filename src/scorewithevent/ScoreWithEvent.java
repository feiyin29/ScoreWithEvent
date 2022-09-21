/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorewithevent;

import java.util.Scanner;

/**
 *
 * @author feifei
 */
public class ScoreWithEvent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScoreSource src = new ScoreSource();
        Subscriber sub = new Subscriber();
        src.addScoreListener(sub);
        src.addScoreListener(sub);
        
        while(true){
            System.out.print("Enter Score : ");
            String data = sc.nextLine();
            if ( data.equalsIgnoreCase("") ) {
                break;
            }
            src.setSource(data);
        }
    }
}

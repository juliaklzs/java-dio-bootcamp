/**
 * <h1>Smart TV</h1>
 * Exemplo de uso de métodos com o objeto Smart Tv.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor
 *
 * @author Julia Kalazans
 * @version 1.0
 * @since 21/03/2023
 */
package edu.julia.synthax;

public class User {
    public static void main(String[] args) {
        SmartTV smartTv = new SmartTV();

        smartTv.on();
        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.setChannel(13);

        System.out.println("A tv está ligada? " + smartTv.isOn);
        System.out.println("Canal " + smartTv.channel);
        System.out.println("Volume "+smartTv.volume);
    }
}

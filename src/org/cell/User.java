package org.cell;
import org.cell.util.Iphone;

public class User {
    public static void main(String[] args) {
        Iphone cell = new Iphone();

        // Chamando alguns metodos ...
        cell.play();
        cell.call();
        cell.acceptCall();
        cell.sendVoiceMail();
        cell.setName("Iphone 14");
        System.out.print(cell.getName());
    }
}

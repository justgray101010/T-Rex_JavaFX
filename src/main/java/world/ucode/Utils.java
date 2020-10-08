package world.ucode;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Utils {

    public static void playSound(String fileName){
        Media m = new Media("file:///" + System.getProperty("user.dir").replace('\\', '/') + "/" + fileName);
        MediaPlayer player = new MediaPlayer(m);
        player.play();
    }

}
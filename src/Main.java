import javax.swing.*;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;

public class Main
{
    URL sound;
    AudioClip noise;

    public static void main(String[] args)
    {
        Main main = new Main();
        main.getGoing();
    }

    private void getGoing()
    {
        try
        {
            sound = new URL("file:src/bell.aiff") ;
            noise = JApplet.newAudioClip(sound);
            noise.play();
        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}

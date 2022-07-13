import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;


public class WebCam {
    public static void main(String[] args) {
        Webcam webcamc = Webcam.getDefault();
        webcamc.open();
        BufferedImage image = webcamc.getImage();
        try {
            ImageIO.write(image, "PNG", new File("Camera.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
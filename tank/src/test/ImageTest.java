package test;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertNotNull;


public class ImageTest {

    @Test
    public void testImage(){
        InputStream is;
        try {
            BufferedImage image = ImageIO.read(ImageTest.class.getClassLoader().getResourceAsStream("images/tankL.gif"));
            assertNotNull(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

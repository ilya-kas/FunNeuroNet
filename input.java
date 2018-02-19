import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class input {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("input.bmp"));

            for (int i=0;i<9;i++){
                for (int j=0;j<9;j++){
                    System.out.print(image.getRGB(i,j)+"RGB");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        result res = new result();
        res.main(null);
    }
}

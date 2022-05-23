import com.github.chen0040.objdetect.ObjectDetector;
import com.github.chen0040.objdetect.models.DetectedObj;
import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.List;

public class ObjectDetectorDemo {
    public static void main(String[] args) throws Exception {
        ObjectDetector detector = new ObjectDetector();

        detector.loadModel();
        Webcam webcam = Webcam.getDefault();
        webcam.open();



        for (int j = 0; j < 50; j++) {
            BufferedImage image = webcam.getImage();
            ImageIO.write(image,"jpg",new File("images/out.jpg"));
            BufferedImage img = ImageIO.read(new File("images/out.jpg"));
            List<DetectedObj> result = detector.detectObjects(img);

            System.out.println("There are " + result.size() + " objects detected");
            for(int i=0; i < result.size(); ++i){
                System.out.println("# " + (i + 1) + ": " + result.get(i));
            }
            Thread.sleep(2000);
        }
        webcam.close();

//        BufferedImage img2 = detector.drawDetectedObjects(img);
//        ImageIO.write(img2, "PNG", new File("images/test_output.png"));
    }
}
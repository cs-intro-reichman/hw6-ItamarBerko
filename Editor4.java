import java.awt.Color;

public class Editor4 {

    public static void main (String[] args) {
		String fileName = args[0];
		Color[][] imageIn = Runigram.read(fileName);
        Color[][] imageOut = null;	

        imageOut = Runigram.grayScaled(imageIn);

        Runigram.setCanvas(imageOut);
		Runigram.display(imageOut);
	}
}

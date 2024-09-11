import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    // creates a painter names PoopsAndGiggle to paint the background and then the painter looks at the instructions set for it in the Backgrounf painter method
    // similar concept for the others
BackgroundPainter PoopsAndGiggle = new BackgroundPainter();
   PoopsAndGiggle.paintBackground("black", 13);

    Wave zu = new Wave();

    zu.drawBigWave();

    RightWave BarnacleJohn = new RightWave();
     
    BarnacleJohn.drawRightWave();

    Ocean giggleFart = new Ocean();

    giggleFart.drawBottom();
    

    

  

     
    
    
    
  }
}

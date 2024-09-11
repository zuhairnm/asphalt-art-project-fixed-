import org.code.neighborhood.*;


public class BackgroundPainter extends PainterPlus {

 
  public void paintBackground(String color, int size) {
    while (canMove("south")) {
      paintRow(color, size);
      turnToWest();

      if (canMove("south")) {
        paintRow(color, size);
        turnToEast();
      }
    }

    paintRow(color, size);
    turnAround();
    moveToCorner();
  }


   public void paintRow(String color, int spaces) {
    setPaint(spaces);

    while (canMove()) {
      paint(color);

      if (canMove()) {
        move();
      }
    }
    paint(color);
  }


  
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      move();
      turnRight();
    }
  }


  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      move();
      turnLeft();
    }
  }

  
  public void turnAround() {
    turnLeft();
    turnLeft();
  }


  public void resetPosition() {
    if (isFacingEast()) {
      turnLeft();

      while (canMove()) {
        move();
      }

      turnLeft();

      while (canMove()) {
        move();
      }

      turnAround();
    }
  }


  public void moveToCorner() {
    while (canMove()) {
      move();
    }
    
    turnRight();

    while (canMove()) {
      move();
    }
  }
// code I added to make the painter paint a certin amount of lines iwth the 
   public void paintLine (String color, int spaces) {
    while (spaces > 0) {
      paint(color);
      move();
      spaces--;
    }
  }
  
}
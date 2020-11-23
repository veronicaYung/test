import java.lang.Math; 
import java.awt.Graphics;
/* Sqaure
 * Version 1.0
 * Veronica Yung
 * 5/04/2020
 * Square class extends Shape, unique attributes: length
 */
public class Square extends Shape {
  private int length;

  /**
   * Square
   * Constructor creates a square
   * @param x, X coordinate
   * @param y, Y coordinate
   * @param length
   */
  public Square(int length,int x, int y) {
    super("Square",x,y); 
    this.length = length;

  }
      /**
   * getLength
   * Returns length
   * @return int, length
   */
 
  public int getLength(){
    return length;
  }
   /**
   * setLength
   * Sets length
   * @param length
   * @return int, length of shape
   */
  public void setLength(int length){
    this.length = length;
  }
  /**
   * getArea
   * Returns area
   * @return int, area
   */
  @Override 
  public int getArea() {
    return (int)( Math.pow(length,2));
  }

   /**
   * getPerimeter
   * Returns perimeter
   * @return int, perimeter
   */
  @Override 
  public int getPerimeter() {
    return 4*length;
  }
    /**
   * draw
   * creates drawing of sqaure on jpanel
   * @return drawing
   */
  @Override 
    public void draw(Graphics g){
    g.drawRect(x,y,length,length);
  }
}
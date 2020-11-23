import java.lang.Math; 
import java.awt.Graphics;

/* Rectangle
 * Version 1.0
 * Veronica Yung
 * 5/04/2020
 * unique attributes: length, width
 */

public class Rectangle extends Shape {
  private int length;
  private int width;
  /**
   * Rectangle
   * Constructor creates a rectangle
   * @param x, X coordinate
   * @param y, Y coordinate
   * @param length
   * @param width
   */
  public Rectangle(int length, int width, int x, int y) {
    super("Rectangle",x,y); 
    this.length = length;
    this.width = width;
    
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
   * getWidth
   * Returns width
   * @return int, width
   */
 
  public int getWidth(){
    return width;
  }
   /**
   * setWidth
   * Sets width
   * @param width
   * @return int, width of shape
   */
  public void setWidth(int width){
    this.width = width;
  }
    /**
   * getArea
   * Returns area
   * @return int, area
   */
  @Override 
  public int getArea() {
    return length *width;
  }
  
   /**
   * getPerimeter
   * Returns perimeter
   * @return int, perimeter
   */
  @Override 
  public int getPerimeter() {
    return (2* length)+(2*width);
  }
      /**
   * draw
   * creates drawing of sqaure on jpanel
   * @return drawing
   */
  @Override 
  public void draw(Graphics g){
    g.drawRect(x,y,width,length);
  }
}
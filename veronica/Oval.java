import java.lang.Math; 
import java.awt.Graphics;
/* Oval
 * Version 1.0
 * Veronica Yung
 * 5/04/2020
 * unique attributes: radius, minorRadius
 */
public class Oval extends Shape {
  private int radius;
  private int minorRadius;

  public Oval(int radius, int minorRadius,int x, int y) {
    super("Oval",x,y); 
    this.radius = radius;
    this.minorRadius = minorRadius;
  }
   /**
   * getRadius
   * Returns radius
   * @return int, radius
   */
   public int getRadius(){
    return radius;
  }
 /**
   * setRadius
   * Sets radius
   * @param radius
   * @return int, radius
   */
  public void setRadius(int radius){
    this.radius= radius;
  }
   
    /**
   * getMinorRadius
   * Returns minorRadius
   * @return int, minorRadius
   */
  public int getMinorRadius(){
    return minorRadius;
  }
   /**
   * setMinorRadius
   * Sets minorRadius
   * @param minorRadius
   * @return int, minorRadius
   */
  public void setMinorRadius(int minorRadius){
    this.minorRadius= minorRadius;
  }
  /**
   * getArea
   * Returns area
   * @return int, area
   */
  @Override 
  public int getArea() {
    return (int)(radius*minorRadius* Math.PI);
  }

   /**
   * getPerimeter
   * Returns perimeter
   * @return int, perimeter
   */
  @Override 
  public int getPerimeter() {
    double perim = 2.0 * Math.PI * (Math.sqrt( (Math.pow(radius,2)+Math.pow(minorRadius,2))/2));
    return (int)(perim);
  }
   /**
   * draw
   * creates drawing of sqaure on jpanel
   * @return drawing
   */
  @Override 
    public void draw(Graphics g){
    g.drawOval(x,y,(radius*2),(minorRadius*2));
  }
}

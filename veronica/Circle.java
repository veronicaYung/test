import java.lang.Math; 
import java.awt.Graphics;
/*Circle
 * Version 1.0
 * Veronica Yung
 * 5/04/2020
 * unique attributes: radius
 */
public class Circle extends Shape {
  public int radius;
  public int diameter;
  public Circle( int radius, int x, int y, int diameter) {
    super("Circle",x, y);
    this.radius = radius;
    this.diameter= diameter;
    
  }
 /**
   * getDiameter
   * Returns diameter
   * @return int, diameter
   */
   public int getDiameter(){
    return diameter;
  }
 /**
   * setDiameter
   * Sets diameter
   * @param diameter
   * @return int, diameter
   */
  public void setDiameter(int diameter){
    this.diameter= diameter;
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
    this.radius = radius;
  }
    /**
   * getArea
   * Returns area
   * @return int, area
   */
  @Override 
  public int getArea() {
    return (int)(Math.pow(radius, 2) * Math.PI);
  }
  
   /**
   * getPerimeter
   * Returns perimeter
   * @return int, perimeter
   */
  @Override 
  public int getPerimeter() {
    return (int)(2 * Math.PI * radius);
  }
    /**
   * draw
   * creates drawing of sqaure on jpanel
   * @return drawing
   */
  @Override 
  public void draw(Graphics g){
    g.drawOval(x,y,diameter,diameter);
  }
  
  
}

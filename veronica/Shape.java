import java.awt.Graphics;

/* Shape
 * Version 1.0
 * Veronica Yung
 * 5/04/2020
 * Abstract shape shape class with all in common attributes; perimeter, area, x,y
 */

public abstract class Shape {
  public abstract void draw(Graphics g);
/**
 * Shape
 * includes perimeter,area and co-ordinates
 */
  private String name;
   int x;
   int y;
   int area;
   int perimeter;
   /**
   * Shape
   * Constructor makes a shape
   * @param x, x-coordinate
   * @param y, y-coordinate
   */  

  public Shape(String name, int x, int y) {
    this.name = name;
    this.x = x;
    this.y = y;

    if(name == null) {
        this.name = "null";
    }

  }
    /**
   * getName
   * Returns name
   * @return String, name of shape
   */
  public String getName() {
    return this.name;
  }
 /**
   * setName
   * Sets name
   * @param name
   * @return String, name of shape
   */
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * getX
   * Returns X coordinate
   * @return int x, X coordinate
   */
  public int getX(){
    return x;
  }
  
  /**
   * setX
   * Sets X coordinate
   * @param int x, x coordinate
   */
  public void setX(int x){
    this.x = x;
  }
  
  /**
   * getY
   * Returns Y coordinate
   * @return y, Y coordinate
   */
  public int getY(){
    return y;
  }
  
  /**
   * setY
   * Sets Y coordinate
   * @param int y, Y coordinate
   */
  public void setY(int y){
    this.y = y;
  }
    /**
   * getArea
   * gets area
   * @return area
   */
   public int getArea(){
    return area;
  }
  
  /**
   * setArea
   * Sets area
   * @param area
   */
    public void setArea(int area){
    this.area= area;
  }
      /**
   * getPerimeter
   * gets perimeter
   * @return int perimeter
   */
   public int getPerimeter(){
    return perimeter;
  }
  
  /**
   * setPerimeter
   * Sets perimeter
   * @param perimeter
   */
    public void setPerimeter(int perimeter){
    this.perimeter= perimeter;
    }
}



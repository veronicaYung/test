//You will need to use this file for your Geoometry Program
// The main method is here. You need to create user I/O and manage an arraylist of shapes
//The method responsible for drawing is here. You need to make sure all your shapes are drawn.
//You will need separate files for all the classes related to shapes
//Once complete you will submit this file as well, make sure it meets RHHS specifications!
//Version 1.0
//Veronica Yung
//May,4, 2020
//displaying, drawing, modifying, removing and translating shapes

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*; 

class GeometryDrawingProgram {
  static JFrame frame;
  //You need a create static ArrayList here
  static ArrayList <Shape>shapes = new ArrayList<Shape>();
  
  
  
  //The main method - you will need to add/modify code here
  public static void main(String[] args) {  
    GeometryScreen gs = new GeometryScreen();
    Scanner input = new Scanner(System.in);
    //Create a menu here to allow user to add new shapes to the scene
    //Adding a shape means adding an object to an arraylist of objects that contain
    //all items displayed on the screen
    
    
    boolean run = true;
    do {
      System.out.println("menu");
      System.out.println("Display all shapes [1]");
      System.out.println("Add a shape [2]");
      System.out.println("Remove [3]");
      System.out.println("Modify[4]");
      System.out.println("Translate[5]");
      System.out.println("Exit[6]");
      System.out.println("enter command");
      int option = input.nextInt();
      
      if(option ==1){
        //manual sorting attempt
        //   Shape tmp = new Shape();
//        for (int i =0; i< shapes.size(); i++){
//           for (int j =i; j< shapes.size(); j++){
        //System.out.println(i + " :" +  shapes.get(i).getName() + ", area: " +shapes.get(i).getArea()); 
//             if (shapes.get(j).getArea() > shapes.get(j+1).getArea() ){
//               
//               int tmp = shapes[j];
//              shapes[tmp] = shapes.get(j+1) ;
//               shapes[j+1] = shapes.get(j);
//
//             }   
        
//sorts the shapes while comparing area
        Collections.sort(shapes, new Comparator<Shape>() {
          @Override
          public int compare(Shape o1, Shape o2) {
            return Integer.compare(o1.getArea(), o2.getArea());
          }
        });
        
        for (int i =0; i< shapes.size(); i++){
          System.out.println(i + " :" +  shapes.get(i).getName() + ", area: " +shapes.get(i).getArea()); 
          System.out.println(" perimeter: " +shapes.get(i).getPerimeter()); 
          System.out.println(" co-ordinates: " + "x: " + shapes.get(i).getX()+" y: " + shapes.get(i).getY()); 
          System.out.println("**************************");
        }
        
      }else if(option == 2){
        System.out.println(" 1. circle   2. rectangle   3. oval   4. square ");
        System.out.println(" 5. rhombus  6. trapezoid   7. parallelogram   8. triangle ");   // note: only 1-4 work
        System.out.println("enter shape [number]: ");
        int shape = input.nextInt();
        
        
        if (shape == 1){
          System.out.println("enter radius: ");
          int radius = input.nextInt();
          System.out.println("please enter x co-ordinate: ");
          int x = input.nextInt();
          System.out.println("please enter y co-ordinate: ");
          int y= input.nextInt();
          System.out.println("please enter diameter:");
          int diameter= input.nextInt();
          Circle c = new Circle(radius,x,y,diameter);   
          shapes.add(c);         
          frame.repaint();
          
          
        }else if(shape == 2){
          System.out.println("enter length:");
          int length = input.nextInt();
          System.out.println("enter width:");
          int width = input.nextInt();
          System.out.println("please enter x co-ordinate: ");
          int x = input.nextInt();
          System.out.println("please enter y co-ordinate: ");
          int y= input.nextInt();
          Rectangle r = new Rectangle(length,width,x,y);
          shapes.add(r);
          frame.repaint();
        }
        else if(shape == 3){
          System.out.println("enter radius:");
          int radius = input.nextInt();
          System.out.println("enter minor radius:");
          int minorRadius = input.nextInt();
          System.out.println("please enter x co-ordinate: ");
          int x = input.nextInt();
          System.out.println("please enter y co-ordinate: ");
          int y= input.nextInt();
          Oval o = new Oval(radius,minorRadius,x,y);
          shapes.add(o);
          frame.repaint();
          
        }else if(shape == 4){
          System.out.println("enter length:");
          int length= input.nextInt();
          System.out.println("please enter x co-ordinate: ");
          int x = input.nextInt();
          System.out.println("please enter y co-ordinate: ");
          int y= input.nextInt();
          Square s = new Square(length,x,y);
          shapes.add(s);
          frame.repaint();
        }
        
//  ********  the drawing of these shapes took too long so I skipped it but I did make seperate classes
//    for all of these shapes so LOTS OF EFFORT!**************
        
//        }else if(shape == 5){
//          System.out.println("enter d1:");
//          int d1 = input.nextInt();
//          System.out.println("enter d2:");
//          int d2= input.nextInt();
//          System.out.println("please enter x co-ordinate: ");
//          int x = input.nextInt();
//          System.out.println("please enter y co-ordinate: ");
//          int y= input.nextInt();
//          Rhombus rh  = new Rhombus(d1,d2,x,y);
//          shapes.add(rh);
//          
//        }else if(shape == 6){
//          System.out.println("enter a:");
//          int a = input.nextInt();
//          System.out.println("enter b:");
//          int b= input.nextInt();
//          System.out.println("enter h:");
//          int h = input.nextInt();
//          System.out.println("enter c:");
//          int c = input.nextInt();
//          System.out.println("enter d:");
//          int d= input.nextInt();
//          System.out.println("please enter x co-ordinate: ");
//          int x = input.nextInt();
//          System.out.println("please enter y co-ordinate: ");
//          int y= input.nextInt();
//          Trapezoid t  = new Trapezoid(a,b,h,c,d,x,y);
//          shapes.add(t);
//          
//        }else if(shape == 7){
//          System.out.println("enter base:");
//          int b = input.nextInt();
//          System.out.println("enter height: ");
//          int h= input.nextInt();
//          System.out.println("enter side: ");
//          int a= input.nextInt();
//          System.out.println("please enter x co-ordinate: ");
//          int x = input.nextInt();
//          System.out.println("please enter y co-ordinate: ");
//          int y= input.nextInt();
//          Parallelogram p = new Parallelogram(b,h,a,x,y);
//          shapes.add(p);
//          
//        }else if(shape == 8){
//          System.out.println("enter base:");
//          int b = input.nextInt();
//          System.out.println("enter height: ");
//          int h= input.nextInt();
//          System.out.println("enter side1: ");
//          int s1= input.nextInt();
//          System.out.println("enter side2: ");
//          int s2= input.nextInt();
//          System.out.println("please enter x co-ordinate: ");
//          int x = input.nextInt();
//          System.out.println("please enter y co-ordinate: ");
//          int y= input.nextInt();
//          Triangle tri = new Triangle(b,h,s1,s2,x,y);
//          shapes.add(tri);
//        }
//****************************************************************************   
//option 3: removing shape --- works for all shapes        
      } else if( option == 3){
        System.out.println("which shape would you like to remove? ");
        for (int i =0; i< shapes.size(); i++){
          System.out.println(i + " :" +  shapes.get(i).getName() + ", area: " +shapes.get(i).getArea() );        
        }
        
        int target= input.nextInt();
        
        for (int i =0; i< shapes.size(); i++){
          if ( target == i )   {
            shapes.remove(i);
            frame.repaint();
          }
        }
        // option 4: modify shape-- I only did circle but I could have definitely done every shape if I was faster!      
      } else if (option == 4){
        System.out.println("which shape would you like to modify? ");
        //display all the options to chose from to modify
        for (int i =0; i< shapes.size(); i++){
          System.out.println(i + " :" +  shapes.get(i).getName() + ", area: " +shapes.get(i).getArea() );        
        }
        int choice = input.nextInt();
        
        //checks if shape is circle to ask for specific modifications
        // note radius can't be changed because it is not used when using the oval formula to draw.
        if ( shapes.get(choice) instanceof Circle )   {
          System.out.println("Would you like to modify [1]. diameter, [2].x-coordinate or [3].y-coordinate");
          int mod = input.nextInt();
          if (mod == 1){
            System.out.println("enter diameter: ");
            int diameter = input.nextInt();
            Circle c = new Circle( ((Circle)shapes.get(choice)).getRadius(),shapes.get(choice).getX(),shapes.get(choice).getY(), diameter);  
            shapes.set(choice,c);
            frame.repaint();
          }else if(mod == 2){
            System.out.println("enter x-coordinate: ");
            int x= input.nextInt();
            Circle c = new Circle( ((Circle)shapes.get(choice)).getRadius(),x,shapes.get(choice).getY(), ((Circle)shapes.get(choice)).getDiameter() );  
            shapes.set(choice,c);
            frame.repaint();
          }else if(mod ==3){
            System.out.println("enter y-coordinate: ");
            int y= input.nextInt();
            Circle c = new Circle( ((Circle)shapes.get(choice)).getRadius(),shapes.get(choice).getX(),y, ((Circle)shapes.get(choice)).getDiameter() );  
            shapes.set(choice,c);
            frame.repaint();
          }
        //modifying a rectangle 
        }else if(shapes.get(choice) instanceof Rectangle){
          System.out.println("Would you like to modify [1]. length, [2].width, [3] x-co-ordinate, or, [4].y-coordinate: ");
          int mod = input.nextInt();
           if (mod == 1){
            System.out.println("enter length: ");
            int length = input.nextInt();
            Rectangle r= new Rectangle( length,((Rectangle)shapes.get(choice)).getWidth(),shapes.get(choice).getX(),shapes.get(choice).getY());   
            shapes.set(choice,r);
            frame.repaint();
          }else if(mod == 2){
            System.out.println("enter width: ");
            int width= input.nextInt();
            Rectangle r= new Rectangle( ((Rectangle)shapes.get(choice)).getLength(),width,shapes.get(choice).getX(),shapes.get(choice).getY());   
            shapes.set(choice,r);
            frame.repaint();
          }else if(mod == 3){
            System.out.println("enter x-co-ordinate: ");
            int x= input.nextInt();
            Rectangle r= new Rectangle( ((Rectangle)shapes.get(choice)).getLength(), ((Rectangle)shapes.get(choice)).getWidth(),x,shapes.get(choice).getY());   
            shapes.set(choice,r);
            frame.repaint();
          }else if(mod == 4){
            System.out.println("enter y-co-ordinate: ");
            int y= input.nextInt();
            Rectangle r= new Rectangle( ((Rectangle)shapes.get(choice)).getLength(), ((Rectangle)shapes.get(choice)).getWidth(),shapes.get(choice).getX(),y);   
            shapes.set(choice,r);
            frame.repaint();
          }
          //modifying an oval
          }else if ( shapes.get(choice) instanceof Oval )   {
          System.out.println("Would you like to modify [1]. radius, [2].minorRadius, [3]. x-coordinate or [4].y-coordinate");
          int mod = input.nextInt();
          if (mod == 1){
            System.out.println("enter radius: ");
            int radius = input.nextInt();
            Oval o = new Oval( radius,((Oval)shapes.get(choice)).getMinorRadius(),shapes.get(choice).getX(),shapes.get(choice).getY());  
            shapes.set(choice,o);
            frame.repaint();
          }else if(mod == 2){
          System.out.println("enter minor radius: ");
            int mRadius = input.nextInt();
            Oval o = new Oval( ((Oval)shapes.get(choice)).getRadius(),mRadius,shapes.get(choice).getX(),shapes.get(choice).getY());  
            shapes.set(choice,o);
            frame.repaint();
          }else if (mod ==3){
            System.out.println("enter x- coordinate: ");
            int x = input.nextInt();
            Oval o = new Oval( ((Oval)shapes.get(choice)).getRadius(),((Oval)shapes.get(choice)).getMinorRadius(),x,shapes.get(choice).getY());  
            shapes.set(choice,o);
            frame.repaint();
          }else if (mod ==4){
            System.out.println("enter x- coordinate: ");
            int y = input.nextInt();
            Oval o = new Oval( ((Oval)shapes.get(choice)).getRadius(),((Oval)shapes.get(choice)).getMinorRadius(),shapes.get(choice).getX(),y);  
            shapes.set(choice,o);
            frame.repaint();
          }
          //modifying a square
          }else if(shapes.get(choice) instanceof Square ){
          System.out.println("Would you like to modify [1]. length, [2] x-co-ordinate, or, [3].y-coordinate: ");
          int mod = input.nextInt();
           if (mod == 1){
            System.out.println("enter length: ");
            int length = input.nextInt();
            Square s = new Square( length,shapes.get(choice).getX(),shapes.get(choice).getY());   
            shapes.set(choice,s);
            frame.repaint();
          }else if (mod == 2){
            System.out.println("enter x- coordinate: ");
            int x = input.nextInt();
            Square s = new Square( ((Square)shapes.get(choice)).getLength(),x,shapes.get(choice).getY());   
            shapes.set(choice,s);
            frame.repaint();
          }else if (mod == 3){
            System.out.println("enter y- coordinate: ");
            int y = input.nextInt();
            Square s = new Square( ((Square)shapes.get(choice)).getLength(),shapes.get(choice).getX(),y);   
            shapes.set(choice,s);
            frame.repaint();
          }
          }
        
//option 5: translating shapes      
      }else if(option == 5){
        System.out.println("How many spaces would you like to move? ");
        int space = input.nextInt();
        System.out.println("How would you like to move your shapes? [1] up, [2] down,[3] left, [4] right");
        int command = input.nextInt();
        
//translate all shapes up      
        if(command == 1){
          for(int i =0; i<shapes.size(); i++){ //loop through each object to set new co-ordinates
            int yUp =  shapes.get(i).getY() - space;    
              if(shapes.get(i)instanceof Circle){
              Circle c = new Circle( ((Circle)shapes.get(i)).getRadius(),shapes.get(i).getX(),yUp, ((Circle)shapes.get(i)).getDiameter() );  
              shapes.set(i,c);
              frame.repaint();
              
            }else if(shapes.get(i) instanceof Rectangle){
              Rectangle r= new Rectangle(  ((Rectangle)shapes.get(i)).getLength(),((Rectangle)shapes.get(i)).getWidth(),shapes.get(i).getX(),yUp);  
              shapes.set(i,r);
              frame.repaint();
              
            }else if(shapes.get(i)instanceof Oval){
              Oval o = new Oval( ((Oval)shapes.get(i)).getRadius(), ((Oval)shapes.get(i)).getMinorRadius(),shapes.get(i).getX(),yUp);  
              shapes.set(i,o);
              frame.repaint();
              
            }else if(shapes.get(i)instanceof Square){
              Square s = new Square(  ((Square)shapes.get(i)).getLength() ,shapes.get(i).getX(),yUp);  
              shapes.set(i,s);
              frame.repaint();
            }
          }
        //translating shapes down
        }else if(command == 2){
          for(int i =0; i<shapes.size(); i++){ //loop through each object to set new co-ordinates  
            int yDown = shapes.get(i).getY()+space;
            if(shapes.get(i)instanceof Circle){
              Circle c = new Circle( ((Circle)shapes.get(i)).getRadius(),shapes.get(i).getX(),yDown, ((Circle)shapes.get(i)).getDiameter() );  
              shapes.set(i,c);
              frame.repaint();
              
            }else if(shapes.get(i) instanceof Rectangle){
              Rectangle r= new Rectangle(  ((Rectangle)shapes.get(i)).getLength(),((Rectangle)shapes.get(i)).getWidth(),shapes.get(i).getX(),yDown);  
              shapes.set(i,r);
              frame.repaint();
              
            }else if(shapes.get(i)instanceof Oval){
              Oval o = new Oval( ((Oval)shapes.get(i)).getRadius(), ((Oval)shapes.get(i)).getMinorRadius(),shapes.get(i).getX(),yDown);  
              shapes.set(i,o);
              frame.repaint();
              
            }else if(shapes.get(i)instanceof Square){
              Square s = new Square(  ((Square)shapes.get(i)).getLength() ,shapes.get(i).getX(),yDown);  
              shapes.set(i,s);
              frame.repaint();
            }
          }
        //translating shapes left
        }else if(command == 3){
          for(int i =0; i<shapes.size(); i++){ //loop through each object to set new co-ordinates  
            int xLeft= shapes.get(i).getX()-space;
            if(shapes.get(i)instanceof Circle){
              Circle c = new Circle( ((Circle)shapes.get(i)).getRadius(),xLeft, shapes.get(i).getY(), ((Circle)shapes.get(i)).getDiameter() );  
              shapes.set(i,c);
              frame.repaint();
              
            }else if(shapes.get(i) instanceof Rectangle){
              Rectangle r= new Rectangle(  ((Rectangle)shapes.get(i)).getLength(),((Rectangle)shapes.get(i)).getWidth(),xLeft,shapes.get(i).getY());  
              shapes.set(i,r);
              frame.repaint();
              
            }else if(shapes.get(i)instanceof Oval){
              Oval o = new Oval( ((Oval)shapes.get(i)).getRadius(), ((Oval)shapes.get(i)).getMinorRadius(),xLeft, shapes.get(i).getY());  
              shapes.set(i,o);
              frame.repaint();
              
            }else if(shapes.get(i)instanceof Square){
              Square s = new Square(  ((Square)shapes.get(i)).getLength() ,xLeft, shapes.get(i).getY());  
              shapes.set(i,s);
              frame.repaint();
            }
          }
        //translating shapes to the right
        }else if(command == 4){
          for(int i =0; i<shapes.size(); i++){ //loop through each object to set new co-ordinates  
            int xRight= shapes.get(i).getX()+space;
            if(shapes.get(i)instanceof Circle){
              Circle c = new Circle( ((Circle)shapes.get(i)).getRadius(),xRight, shapes.get(i).getY(), ((Circle)shapes.get(i)).getDiameter() );  
              shapes.set(i,c);
              frame.repaint();
              
            }else if(shapes.get(i) instanceof Rectangle){
              Rectangle r= new Rectangle(  ((Rectangle)shapes.get(i)).getLength(),((Rectangle)shapes.get(i)).getWidth(),xRight,shapes.get(i).getY());  
              shapes.set(i,r);
              frame.repaint();
              
            }else if(shapes.get(i)instanceof Oval){
              Oval o = new Oval( ((Oval)shapes.get(i)).getRadius(), ((Oval)shapes.get(i)).getMinorRadius(),xRight, shapes.get(i).getY());  
              shapes.set(i,o);
              frame.repaint();
              
            }else if(shapes.get(i)instanceof Square){
              Square s = new Square(  ((Square)shapes.get(i)).getLength() ,xRight, shapes.get(i).getY());  
              shapes.set(i,s);
              frame.repaint();
            }
          }
        }
      }else if (option == 6){
        run = false;
      }
      
    }while(run);
    
    
  } 
  
  
//This is an inner class - it has access to the static variables defined above
  public static class GeometryScreen {
    
    //constructor - do no modify
    GeometryScreen() {
      frame = new JFrame("Geometry Drawing Program 1.0");
      
      //Create a new "custom" panel for graphics based on the inner class below
      JPanel graphicsPanel = new GraphicsPanel();
      
      //Add the panel and the frame to the window
      frame.getContentPane().add(graphicsPanel);
      
      // Set the frame to full screen
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(520,540);
      frame.setUndecorated(false);  //Set to true to remove title bar
      frame.setVisible(true);
      
    }
    
//This is an inner class which contains all the details about drawing to screen.
    public static class GraphicsPanel extends JPanel {
      
      
      //The method that draws to the screen - you will need to add.modify code here
      //  Graphics g = getGraphics();
      public void paintComponent(Graphics g) {          
        setDoubleBuffered(true);  
        g.setColor(Color.BLACK);
        //draw the X/Y Axis
        g.drawLine(250, 0, 250, 500);
        g.drawLine(0, 250, 500, 250);
        
        //Below is a demonstration of how to use graphics commands to draw on to the screen
        //Check the Java Graphics class
        //Note - These coordinates are not based on the x/y axis
        
        
        for(int i = 0; i < shapes.size(); i++) {
          shapes.get(i).draw(g);
          revalidate();
        }
        Color myCol = new Color(200,120,50); // You can creat your only colors based on RGB
        g.setColor(myCol);
        
        //You will need to draw each of the Shapes contained in your Arraylist here
        //This screen will update everytime the menu loop completes
        
      }
    }
  }
}
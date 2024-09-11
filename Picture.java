/**
 * 
 *This is a picture of a caslte with two guards standing on top of it.
 * 
 * 
 * @author  William Harvey
 * @version 2024.09.10
 */
public class Picture
{
    private Square backGround;
    private Square grass;
    private Circle sun;
    private Person manOne;
    private Person manTwo;
    private Square castleOne;
    private Square castleTwo;
    private Square stoneOne;
    private Square stoneTwo;
    private Triangle coneOne;
    private Triangle coneTwo;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        backGround = new Square();
        grass = new Square();
        sun = new Circle();
        manOne = new Person();
        manTwo = new Person();  
        castleOne = new Square();
        castleTwo = new Square();
        stoneOne = new Square();
        stoneTwo = new Square();
        coneOne = new Triangle();
        coneTwo = new Triangle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            backGround.changeColor("blue");
            backGround.changeSize(1000);
            backGround.moveHorizontal(-400);
            backGround.moveVertical(-200);
            backGround.makeVisible();
            
            grass.changeColor("green");
            grass.moveHorizontal(-400);
            grass.moveVertical(70);
            grass.changeSize(1000);
            grass.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(-250);
            sun.moveVertical(-120);
            sun.changeSize(100);
            sun.makeVisible();
            
            manOne.changeColor("yellow");
            manOne.moveHorizontal(-125);
            manOne.moveVertical(-125);
            manOne.changeSize(40, 20);
            manOne.makeVisible();
    
            manTwo.changeColor("yellow");
            manTwo.moveHorizontal(30);
            manTwo.moveVertical(-125);
            manTwo.changeSize(40, 20);
            manTwo.makeVisible();
    
            castleOne.changeColor("gray");
            castleOne.moveHorizontal(-210);
            castleOne.moveVertical(-40);
            castleOne.changeSize(150);
            castleOne.makeVisible();
            
            castleTwo.changeColor("gray");
            castleTwo.moveHorizontal(-75);
            castleTwo.moveVertical(-40);
            castleTwo.changeSize(150);
            castleTwo.makeVisible();
            
            stoneOne.changeColor("gray");
            stoneOne.moveHorizontal(55);
            stoneOne.moveVertical(-50);
            stoneOne.changeSize(20);
            stoneOne.makeVisible();
            
            stoneTwo.changeColor("gray");
            stoneTwo.moveHorizontal(-210);
            stoneTwo.moveVertical(-50);
            stoneTwo.changeSize(20);
            stoneTwo.makeVisible();
            
            coneOne.changeColor("gray");
            coneOne.moveHorizontal(165);
            coneOne.moveVertical(-100);
            coneOne.changeSize(30, 30);
            coneOne.makeVisible();
            
            coneTwo.changeColor("gray");
            coneTwo.moveHorizontal(-100);
            coneTwo.moveVertical(-100);
            coneTwo.changeSize(30, 30);
            coneTwo.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        backGround.changeColor("white");
        grass.changeColor("black");
        sun.changeColor("black");
        manOne.changeColor("black");
        manTwo.changeColor("black");
        castleOne.changeColor("black");
        castleTwo.changeColor("black");
        stoneOne.changeColor("black");
        stoneTwo.changeColor("black");
        coneOne.changeColor("black");
        coneTwo.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        backGround.changeColor("blue");
        grass.changeColor("green");
        sun.changeColor("yellow");
        manOne.changeColor("black");
        manTwo.changeColor("black");
        castleOne.changeColor("gray");
        castleTwo.changeColor("gray");
        stoneOne.changeColor("gray");
        stoneTwo.changeColor("gray");
        coneOne.changeColor("gray");
        coneTwo.changeColor("gray");
    }
}

import java.applet.Applet;
import java.awt.Graphics;

public class applet extends Applet {
    public void init (){
        resize(200,200);
    }
    public void Start(){}

    public void paint(Graphics g){
        g.drawString("hello", 180, 200);
    }
    
}

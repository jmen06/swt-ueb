package swt;

import java.awt.Point;
import java.awt.geom.Point2D;

public class Viereck {
//foobar	
	
	
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private Point2D a1;
    private Point2D b1;
    private Point2D c1;
    private Point2D d1;

    public Viereck(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public Viereck(Point2D a1, Point2D b1, Point2D c1, Point2D d1) {
        this.a1 = a1;
        this.b1 = b1;
        this.c1 = c1;
        this.d1 = d1;
    }

    public boolean isQuadrat() {
        if ((a.x == b.x) && (a.y == d.y) && (b.y == c.y) && (c.x == d.x)) {
            int ab = Math.abs(a.y - b.y);
            int bc = Math.abs(b.x - c.x);
            int cd = Math.abs(c.y - d.y);
            int da = Math.abs(d.x - a.x);
            if (ab == bc && cd == da && bc == cd) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isParallelogramm(){
    	if((d.x-a.x)==(c.x-b.x) && (b.y-a.y)==(c.y-d.y)){
    		return true;
    	}else{
		return false;}
    	
    }
    
    public boolean isViereck(){
    	if(this.a.x==this.b.x && this.b.y==this.c.y && (this.b.y-this.a.y)==(this.c.y-this.d.y)){ 
    				return true;
    	}else{ 
    				return false; 
    			}
    }
   // Freu mich aufs ski fahren :)
}

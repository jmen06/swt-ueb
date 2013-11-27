package swt;

import java.awt.Point;

public class Viereck {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Viereck(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
    	if(this.a.x==this.b.x && this.b.y==this.c.y && (this.b.y-this.a.y)==(this.c.y-this.d.y))
//    	if(this.isQuadrat()==false && this.isRechteck()==false && this.isParallelogramm()==false
//    			&& this.isTrapez()==false)
    		{ 
    				return true;
    			}else{ return false;}
    }
   
}
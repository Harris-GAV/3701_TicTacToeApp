
package tic.tac.toe;


public class Points {
    public Integer x,y;
    public char state;

    public char getState() {
       return state;
    }

    public void setState(char state) {
        this.state = state;
    }
    
    Points(Integer x,Integer y,char state){
        this.x=x;
        this.y=y;
        this.state=state;
    }
   
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }
    
    public void setY(Integer y) {
        this.y = y;
    }
    
    public void output(){
        System.out.print(this.getX()+" "+this.y+" "+this.getState());
    }

}

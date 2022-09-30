public class Point {

    //instance variables
    private int x;
    private int y;

    public Point (int coord1, int coord2) {
        x = coord1;
        y = coord2;

    }

    public Point(int both) {
        x = both;
        y = both;

    }

    public Point(){

        x = 0;
        y = 0;

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    public String coordinate(){
        String formattedXY = ("(" + x + "," + y + ")");
        return formattedXY;
    }

    public String quadrant() {
        String quad = "";

        if (x > 0 && y > 0) {
            quad = "I";
        }
        if (x > 0 && y < 0) {
            quad = "IV";
        }
        if (x < 0 && y > 0) {
            quad = "II";
        }
        if (x < 0 && y < 0) {
            quad = "III";
        }
        if (x == 0 && y == 0) {
            quad = "origin";
        }
        if (x == 0 && y > 0) {
            quad = "on an axis";
        }
        if (x == 0 && y < 0) {
            quad = "on an axis";
        }
        if (x > 0 && y == 0) {
            quad = "on an axis";
        }
        if (x < 0 && y == 0) {
            quad = "on an axis";
        }

        return quad;
    }

}

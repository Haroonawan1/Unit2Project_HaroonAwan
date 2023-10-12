public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    //coordinate points gotten from user input are split into the x and y for each using String methods
    public LinearEquation (String coordinate1, String coordinate2){
        x1 =  Integer.parseInt(coordinate1.substring(1, coordinate1.indexOf(",")));
        y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",") + 1, coordinate1.length()-1));
        x2 =  Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(",")));
        y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",") + 1, coordinate2.length()-1));
    }

    //rounds numbers to the hundredth place
    public double round(double x){
        return Math.round(x*Math.pow(10, 2))/Math.pow(10,2);
    }

    //finds the slope using the slope formula and the given points
    public double slope(){
        return (double) (y2 - y1) /(x2-x1);
    }

    //finds the y-intercept by altering y = mx + b into y - mx = b and using a given coordinate point
    public double yIntercept(){
        return y1 - (slope() * x1);
    }

    //displays the equation with the slope as an unsimplified fraction
    public String getEquation(){
        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + round(yIntercept());
    }

    //the coordinate points are put into the distance formula and then rounded
    public double distance(){
        return round(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2- y1), 2)));
    }

    //plugs the given x coordinate into the linear equation gotten from using above methods
    public String getY(double x){
        return "Solved coordinate is: (" + x + "," + (round((slope() * x) + yIntercept())) + ")";
    }

    //string created and returned to easily print information
    public String toString(){
        String str = "\nFirst Pair: (" + x1 + "," + y1 + ")\nSecond Pair: (" + x2 + "," + y2 + ")";
        str += "\nSlope of the line: " + round(slope()) + "\nY-Intercept: " + round(yIntercept());
        str += "\nSlope Intercept Form: " + getEquation() + "\nDistance between points: " + distance();
        return str;
    }
}

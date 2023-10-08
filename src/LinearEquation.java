public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation (String coordinate1, String coordinate2){
        x1 =  Integer.parseInt(coordinate1.substring(1, coordinate1.indexOf(",")));
        y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",") + 1, coordinate1.length()-1));
        x2 =  Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(",")));
        y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",") + 1, coordinate2.length()-1));
    }

    public double slope(){
        return (double) (y2 - y1) /(x2-x1);
    }

    public double yIntercept(){
        return y1 - (slope() * x1);
    }

    public String getEquation(){
        return "y = " + slope() + "x + " + yIntercept();
    }

    public double distance(){
        return Math.round((Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2- y1), 2))) * Math.pow(10, 2))/Math.pow(10,2);
    }

    public String getY(double x){
        return "Solved coordinate is: (" + x + "," + ((slope() * x) + yIntercept()) + ")";
    }

    public String toString(){
        String str = "\nFirst Pair: (" + x1 + "," + y1 + ")\nSecond Pair: (" + x2 + "," + y2 + ")";
        str += "\nSlope of the line: " + slope() + "\nY-Intercept: " + yIntercept();
        str += "\nSlope Intercept Form: " + getEquation() + "\nDistance between points: " + distance();
        return str;
    }
}

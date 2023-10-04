public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String p1;
    private String p2;

    public LinearEquation (String coordinate1, String coordinate2){
        x1 =  Integer.parseInt(coordinate1.substring(1, coordinate1.indexOf(",")));
        y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",") + 1, coordinate1.length()-1));
        x2 =  Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(",")));
        y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",") + 1, coordinate2.length()-1));
        p1 = coordinate1;
        p2 = coordinate2;
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
        double d =  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2- y1), 2));
        return Math.round(d * Math.pow(10, 2))/Math.pow(10,2);
    }

    public String getY(double x){
        double y = (slope() * x) + yIntercept();
        return "Solved coordinate is: (" + x + "," + y + ")";
    }

    public String toString(){
        String str = "\nFirst Pair: " + p1 + "\nSecond Pair: " + p2;
        str += "\nSlope of the line: " + slope() + "\nY-Intercept: " + yIntercept();
        str += "\nSlope Intercept Form: " + getEquation() + "\nDistance between points: " + distance();
        return str;
    }
}

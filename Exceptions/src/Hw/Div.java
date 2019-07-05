package Hw;

public class Div {
	
	public static double div(double d1, double d2) throws ArithmeticException {
        if (d2 != 0.0){
            return d1 / d2;
        }else{
            throw new ArithmeticException("Can not div by zero");
        }


}

}

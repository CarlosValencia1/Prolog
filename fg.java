public class fg{
	public static void main(String [] args){
		double a,b,c,x1,x2;
		
		a=1;
		b=3;
		c=-5;

		x1=(-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		x2=(-b - Math.sqrt(b*b - 4*a*c))/(2*a);

		System.out.println("["+x1+" , "+x2+"]");
	}
}
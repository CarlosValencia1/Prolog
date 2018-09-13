import java.util.Arrays;
public class SumaD {
	public static int suma(int lista[]){
		return (lista.length == 0) ? 0 : lista[0] + suma(Arrays.copyOfRange(lista,1,lista.length));
	}
	
	public static void main(String args[]){
		System.out.println(suma(new int[] {1,3,-1,7,0,8}));
	}
}


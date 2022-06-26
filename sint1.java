import java.util.Scanner;

public class sint1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
	int higher = max(a, b, c);//declaracao da funcao
	showResult(higher);
	}
	public static int max(int x, int y, int z) {//criação da função para exibir o maior número
		int aux;
		if (x>y && x>z) {
			aux = x;
		}
		else if (y>x && y>z) {
			aux = y;
		}else {
			aux = z;
		}
		return aux;// retorna o valor ao aux
	}
	public static void showResult(int value) {//função para mostrar o resultado
		System.out.println("Higher = " + value);
	}

}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] numeros = new int[4];
		String string = " 10 ";
		int numero;
		int a = 5;
		int n;
		try {
			numeros[10] = 4;
			numero = Integer.parseInt(string);
			int resul = a / 0;
			System.out.println("Introduce un numero entero mayor que 0:");
			n = scan.nextInt();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error de indice en un array");
		} catch (NumberFormatException e) {
			System.out.println("Este no es un numero");
		} catch (ArithmeticException e) {
			System.out.println("El divisor no debe ser 0");
		} catch (InputMismatchException e) {
			scan.nextLine();
			n = 0;
			System.out.println("Debe introducir un número entero");
		}

	}

}

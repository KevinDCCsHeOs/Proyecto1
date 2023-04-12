package EntradaSalida;

import javax.swing.JOptionPane;
import Metodos.Ejercicios;

public class Menu {
	public static String Desplegable(String menu) {
		String valores[]=menu.split(",");
		String res=(String)JOptionPane.showInputDialog(null,"M E N U","SELECCIONA TU ENTIDAD: ",
				JOptionPane.QUESTION_MESSAGE,null,valores,valores[0]);
		return res;
	}
	public static void menu_3(String menu) {
		String sel="";
		do {
			sel=Desplegable(menu);
			switch(sel){
				case "Armstrong":
					int valorArmstrong=Integer.parseInt(JOptionPane.showInputDialog("Introduce un Entero:"));
					if(valorArmstrong==Ejercicios.numArmstrong(valorArmstrong))
						JOptionPane.showMessageDialog(null, "Es un numero Armstrong");
					else
						JOptionPane.showMessageDialog(null, "No es un numero Armstrong");
					break;
				case "Decimales a Binario":
					int valorDecimal = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
					JOptionPane.showMessageDialog(null, Ejercicios.binario(valorDecimal));
					break;
				case "Contar Digitos":
					int valorDigitos = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));
					JOptionPane.showMessageDialog(null, "Numero de digitos "+Ejercicios.numDigitos(valorDigitos));
					break;
				case "Suma de pares":
					int primvalor= Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer entero: "));
					int limiteN = Integer.parseInt(JOptionPane.showInputDialog("Introduce el limite de la suma de los impares: "));
					JOptionPane.showMessageDialog(null, "El entero: "+primvalor+". La suma de sus pares es: "+Ejercicios.sumapares(primvalor)+
							" y la suma de sus impares con el limite de "+limiteN+" es "+Ejercicios.sumaimpares(primvalor, limiteN));
					break;
				case "Numeros Primos":
					int ent = Integer.parseInt(JOptionPane.showInputDialog("Introduce un entero: "));
					if(Ejercicios.numPrimo(ent)==2) {
						JOptionPane.showMessageDialog(null, "El entero "+ent+" es un numero primo.");
					}
					else {
						JOptionPane.showMessageDialog(null, "El entero "+ent+" no es un numero primo.");
					}
					break;
				case "Producto 2 numeros":
					int entero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el primer entero: "));
					int entero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el segundo entero: "));
					JOptionPane.showMessageDialog(null, "El producto de los enteros "+entero1+" y "+entero2+
						" es "+Ejercicios.sumaDeProductos(entero1, entero2));
					break;
				case "Dato mayor":
					int val1=ToolsPanel.leerEntero("Dame el primer numero: ");
					int val2=ToolsPanel.leerEntero("Dame el segundo numero: ");
					int val3=ToolsPanel.leerEntero("Dame el tercer numero: ");
					ToolsPanel.imprimePantalla(Ejercicios.tresDatos(val1, val2, val3));
					break;
				case "Suma digitos":
					Ejercicios.sumaDigitos(ToolsPanel.leerEntero("Escribe un valor entero"));
					break;
				case "Numero Perfecto":
					int valor=Integer.parseInt(JOptionPane.showInputDialog("Introduce un entero: "));
					JOptionPane.showMessageDialog(null, Ejercicios.numeroPerfecto(valor)?"Si es un numero perfecto":"No es un numero perfecto");
					break;
				case "Escasez de agua":
					double valorAgua=Double.parseDouble(JOptionPane.showInputDialog("Introduce el consumo de agua en metros cúbicos"));
					String nombre=JOptionPane.showInputDialog("Nombre del cosumidor:");
					JOptionPane.showMessageDialog(null, "El consumidor "+nombre+" debera pagar "+Ejercicios.consumoDeAgua(valorAgua));
					break;
				case "Pagos Estudiantes":
					String nombreEs=JOptionPane.showInputDialog("Escribe un nombre");
					String cat=JOptionPane.showInputDialog("Introduce la categoria");
					double prom=Double.parseDouble(JOptionPane.showInputDialog("Introduce tu promedio"));
					JOptionPane.showMessageDialog(null, "El estudiante: "+nombreEs+" debera pagar un monto de "+
								Ejercicios.pagosUniversidad(nombreEs, cat, prom)+" para la pensión");
					break;
				case "Multiplicación Rusa":
					int mul=Integer.parseInt(JOptionPane.showInputDialog("Escribe el divisor: "));
					int multi=Integer.parseInt(JOptionPane.showInputDialog("Escribe el multiplicador:" ));
					JOptionPane.showMessageDialog(null, Ejercicios.multiplicacionRusa(mul,multi));
					break;
				case "Imprime Frecuencias":
					byte n=Byte.parseByte(JOptionPane.showInputDialog("Introduce un numero:"));
					JOptionPane.showMessageDialog(null, Ejercicios.imprimeFrecuencia(n));
					break;
				case "Cuenta Vocales":
					String cadena=JOptionPane.showInputDialog("Dame la cadena:");
					Ejercicios.cuentaVocales(cadena);
					break;
				case "Salir":
					JOptionPane.showMessageDialog(null, "Hasta luego, que tenga un buen día");
					break;
				default: {ToolsPanel.salidaError(sel);
				}
		}
	}
		while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void main(String[] args) {
		menu_3("Armstrong,Decimales a Binario,"
				+ "Contar Digitos,Suma de pares,"
				+ "Numeros Primos,Producto 2 numeros,"
				+ "Suma digitos,Numero Perfecto,"
				+ "Escasez de agua,Pagos Estudiantes,"
				+ "Multiplicación Rusa,Imprime Frecuencias,"
				+ "Cuenta Vocales,Salir");
	}
}
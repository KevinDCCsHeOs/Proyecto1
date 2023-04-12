package Principal;

import javax.swing.JOptionPane;

public class menu3 {
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
				case "Agregar":JOptionPane.showMessageDialog(null, "Caso Agregar");;break;
				case "Imprimir":JOptionPane.showMessageDialog(null, "Caso Imprimir");break;
				case "Salir":JOptionPane.showMessageDialog(null, "Caso Salir");break;
			}
		}
		while(!sel.equalsIgnoreCase("Salir"));
	}
	public static void main(String[] args) {
		menu_3("Agregar,Imprimir,Salir");
	}
}
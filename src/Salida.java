import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Salida {
	public void generaTXT(String linea, String nombreArchivo){	
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(nombreArchivo, true));			
			out.write(linea);
			out.newLine();
		    out.close();
		} catch (IOException e) {System.out.println(e);}
	}	
	
	public String generaLinea(String linea){		
		String a1 = linea.substring(0, 8); //System.out.println("Rut: " + a1);		
		String a2 = linea.substring(8, 9); //System.out.println("DV: " + a2);
		String a3 = linea.substring(9, 49); //System.out.println("Nombre: " + a3);
		String a4 = linea.substring(49, 57);//System.out.println("Fecha Nacimiento: " + a4);
		String a5 = linea.substring(57, 59);//System.out.println("CodIns: " + a5);
		String a6 = linea.substring(59, 72);//System.out.println("NumIns: " + a6);
		String a7 = linea.substring(72, 73);//System.out.println("DVIns: " + a7);
		String a8 = linea.substring(73, 81);//System.out.println("Fecha Open: " + a8);
		String a9 = linea.substring(81, 88);//System.out.println("Monto: " + a9);
		String a10 = linea.substring(88, 90);//System.out.println("Cancar: " + a10);
		String a11 = linea.substring(90, 91);//System.out.println("TypeI: " + a11);
		String a12 = linea.substring(91, 93);//System.out.println("CodPag: " + a12);				  
		return a1+";"+a2+";"+a3+";"+a4+";"+a5+";"+a6+";"+a7+";"+a8+";"+a9+";"+a10+";"+a11+";"+a12;
	}
	
}

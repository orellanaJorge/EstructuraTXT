import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {
	
	public static void main(String[] args) {
		File file = new File("c:\\Loader\\archivo.csv");  
		file.delete(); 
		
		try{
		int delay = 50;
		Thread.sleep(delay);
		}catch(Exception e){}
		
		File f = new File( "C:\\inst26_dic2011.txt" );
		BufferedReader entrada = null;
		try {
			entrada = new BufferedReader( new FileReader( f ) );
			String linea;
			int a = 1;
			while(entrada.ready()){
				linea = entrada.readLine();			
												
				Salida j = new Salida();
				String lineaGenerada = j.generaLinea(linea);
				j.generaTXT(lineaGenerada, "c:\\Loader\\archivo.csv");
				
			}
			entrada.close();	
		}catch (IOException e) {System.out.println("Error : " + e);}
	}
	
}

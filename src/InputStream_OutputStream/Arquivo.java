package InputStream_OutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		InputStream properties = new FileInputStream(System.getProperty("user.dir") + File.separator + "src"+ File.separator + "main"+ File.separator + "resources" + File.separator + "caminhos.properties");
		
		Properties prop = new Properties();
		prop.load(properties);
		
		String caminho= prop.getProperty("caminho1");
		System.out.println(caminho);
		
		String caminho2= prop.getProperty("caminho2");
		System.out.println(caminho2);
		
		int data = properties.read();
		while(data != -1) {
			System.out.println(data);
			data = properties.read();
		}
		
		properties.close();
		
		
//		
//		final String NOME_ARQUIVO="escrita.txt";
//		
//		File meuArquivo = new File(caminho, NOME_ARQUIVO);
//		
		
	}

}

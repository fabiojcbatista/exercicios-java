package InputStream_OutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Arquivo {

	public static void main(String[] args) throws IOException {

		InputStream properties = new FileInputStream(System.getProperty("user.dir") + File.separator + "src"
				+ File.separator + "main" + File.separator + "resources" + File.separator + "caminhos.properties");

		Properties prop = new Properties();
		prop.load(properties);

		String caminho1 = prop.getProperty("caminho1");
		System.out.println(caminho1);

		String caminho2 = prop.getProperty("caminho2");
		System.out.println(caminho2);

		byte[] bytes = input(caminho1);
		output(caminho2, bytes);

	}

	@SuppressWarnings("null")
	public static byte[] input(String caminho) {
		InputStream inputstream;
		try {

			inputstream = new FileInputStream(caminho);
			byte[] lista = new byte[0];
			byte bytes = (byte) inputstream.read();

			while (bytes != -1) {
				// ----ler int
				// System.out.println("Int: "+String.valueOf(bytesInt));
				// ----ler converter int para string
				// bytesString +=String.valueOf(bytesInt);

				byte[] novaLista = new byte[lista.length + 1];
				System.arraycopy(lista, 0, novaLista, 0, lista.length);
				lista = novaLista;
				lista[lista.length - 1] = bytes;
				bytes = (byte) inputstream.read();
			}

			inputstream.close();
			return lista;
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void output(String caminho2, byte[] bytes) throws IOException {

		final String NOME_ARQUIVO = "escrita.txt";
		File meuArquivo = new File(caminho2, NOME_ARQUIVO);
		@SuppressWarnings("resource")
		OutputStream outputStream = new FileOutputStream(meuArquivo);
		outputStream.write(bytes);

	}

}

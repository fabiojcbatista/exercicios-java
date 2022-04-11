package InputStream_OutputStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Properties;
import java.util.Scanner;

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

		byte[] bytes = inputReal(caminho1);
		outputReal(caminho2, bytes);

	}

	@SuppressWarnings("null")
	public static byte[] inputReal(String caminho) {
		InputStream inputstream;
		try {
			inputstream = new FileInputStream(caminho);

			byte[] bytes = new byte[1];
			byte data = (byte) inputstream.read();
			bytes[bytes.length] = data;

			while (data != -1) {
				System.out.println(data);

				data = (byte) inputstream.read();
				bytes[bytes.length] = data;
			}

			inputstream.close();
			return bytes;
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void output(String caminho2) throws IOException {
		OutputStream fos = new FileOutputStream(caminho2);
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("asfasdfsafdas dfs sdf asf assdﬂ");

		bw.close();
	}

	public static void outputReal(String caminho2, byte[] bytess) throws IOException {

		final String NOME_ARQUIVO = "escrita.txt";
		File meuArquivo = new File(caminho2, NOME_ARQUIVO);

		@SuppressWarnings("resource")
		OutputStream outputStream = new FileOutputStream(meuArquivo);

		byte[] bytes = { 104, 111, 114, 117, 127 };// m·ximo 127

		outputStream.write(bytes);

	}

	public static void scanner() throws IOException {
		Scanner scanner = new Scanner(new File("lorem2.txt"));
		while (scanner.hasNextLine()) {
			String linhas = scanner.nextLine();
			System.out.println(linhas);
		}

		scanner.close();
	}

	public static void filewrite() throws IOException {

		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("teste escrita");
		bw.newLine();
		bw.newLine();
		bw.write("escreveu");

		bw.close();
	}

	public static void printWrite() throws IOException {
		PrintWriter ps = new PrintWriter("lorem2.txt");

		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.println("imprime");

		ps.close();
	}

}

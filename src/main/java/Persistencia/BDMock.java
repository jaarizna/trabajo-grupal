package main.java.Persistencia;

import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import main.java.Dominio.Respuesta;

public class BDMock implements BD {

	@Override
	public boolean createRespuesta(String token) {
		try {
			File f = new File(token+".txt");
			if (f.createNewFile()) {
				return true;
			} else {
				return false;
			}
		} catch (IOException e) {
			return false;
		}
	}

	@Override
	public String readRespuesta(String token) {
		File f = new File(token+".txt");

		try (Scanner myReader = new Scanner(f)) {
			String contenido = "";
			while (myReader.hasNextLine()) {
				contenido += myReader.nextLine();

			}
			System.out.print(contenido);
			return  contenido;

		} catch (FileNotFoundException e) {
			return null;
		}
	}

	@Override
	public boolean updateRespuesta(Respuesta r) {
		try (FileWriter myWriter = new FileWriter(r.getToken()+".txt")) {
			myWriter.write(r.getContenido());
			return true;
		} catch (IOException e) {
			return false;
		}
	}

	@Override
	public boolean deleteRespuesta(String token) {
		File f = new File(token+".txt");
		return f.delete();
	}

}

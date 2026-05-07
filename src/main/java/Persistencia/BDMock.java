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
            File f = new File(token);
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
    public Respuesta readRespuesta(String token) {
        File f = new File(token);

        try (Scanner myReader = new Scanner(f)) {
            String contenido="";
            while (myReader.hasNextLine()) {
                contenido += myReader.nextLine();

            }
            return new Respuesta(token, contenido);

        } catch (FileNotFoundException e) {
            return null;
        }
    }

    @Override
    public boolean updateRespuesta(Respuesta r) {
        try (FileWriter myWriter = new FileWriter(r.getToken())) {
            myWriter.write(r.getContenido());
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public boolean deleteRespuesta(String token) {
        File f = new File(token); 
        return f.delete();
    }
    
}

package Soru_6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class Runner<Object> {

	public void write(Object log, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream write = new ObjectOutputStream(file);
			write.writeObject(log);
			write.close();
		} catch (Exception e) {
			System.out.println("Hata Oluştu !!! " + e.toString());
		}
	}

	public Optional<Object> read(String filename) {
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream read = new ObjectInputStream(file);
			Object log = (Object) read.readObject();
			return Optional.of(log);
		} catch (Exception e) {
			System.out.println("Hata Oluştu !!!" + e.toString());
			return Optional.empty();
		}

	}

}

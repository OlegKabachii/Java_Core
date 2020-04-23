package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {
	
	
	public static void serialize(File file, Serializable object) throws IOException {
		OutputStream outSt = new FileOutputStream(file);
		ObjectOutputStream objOutSt = new ObjectOutputStream(outSt);
		objOutSt.writeObject(object);
		objOutSt.close();
		outSt.close();
	}

	public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
		InputStream inSt = new FileInputStream(file);
		ObjectInputStream objInSt = new ObjectInputStream(inSt);
		Serializable readObject = (Serializable) objInSt.readObject();
		objInSt.close();
		inSt.close();
		return readObject;
	}

}

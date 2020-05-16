package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;


public class App {
	
public static void main(String[] args) throws IOException {
	annotationToFile(Dog.class);
}

	

	public static void annotationToFile(Class<?> currentClass) throws IOException {

		Field[] fields = currentClass.getDeclaredFields();

		File fileTextFields = new File("Fields.txt");

		Writer writer = new FileWriter(fileTextFields);
		for (int i = 0; i < fields.length; i++) {
			if (fields[i].getAnnotation(MyAnnotation.class) != null)
				writer.write(fields[i].getName() + "\n");
		}
		writer.close();

	}
}

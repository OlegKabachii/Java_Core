package homework_16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class App {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
	IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {

		MyDog dog = new MyDog();
		System.out.println(dog.toString());

		Class dog1 = MyDog.class;

		String nameOfClass = dog1.getName();
		System.out.println(nameOfClass);

		String simoleName = dog1.getSimpleName();
		System.out.println(simoleName);

		int modifier = dog1.getModifiers();
		String modifierText = Modifier.toString(modifier);
		System.out.println(modifierText + " " + modifier);
		System.out.println(Modifier.isPublic(modifier));

		Package pac = dog1.getPackage();
		System.out.println(pac);

		Class supClass = dog1.getSuperclass();
		System.out.println(supClass);

		Class[] interf = dog1.getInterfaces();
		System.out.println(Arrays.toString(interf));

		Constructor<MyDog>[] dogConstr = dog1.getConstructors();
		for (int i = 0; i < dogConstr.length; i++) {
			Constructor<MyDog> constructor = dogConstr[i];
			System.out.println(constructor);
		}
		System.out.println(dogConstr.length);

		Constructor<MyDog> constructor = dogConstr[1];
		Class<?>[] parameterTypes = constructor.getParameterTypes();
		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> class1 = parameterTypes[i];
			System.out.println(class1);
		}
		Constructor<MyDog> singleConstructor = dog1.getConstructor(String.class, int.class, String.class);
		System.out.println(singleConstructor);
		MyDog newInstance = singleConstructor.newInstance("Eva", 4, "York");
		System.out.println(newInstance);

		Field[] fields = dog1.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		fields = dog1.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		
		System.out.println();
		Method [] methods = dog1.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);
		}
		methods [10].invoke(newInstance, "Evichka");
		System.out.println();
		System.out.println(newInstance);
	}
}

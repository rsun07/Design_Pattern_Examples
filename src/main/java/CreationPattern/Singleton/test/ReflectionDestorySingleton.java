package CreationPattern.Singleton.test;

import CreationPattern.Singleton.EagerInitialization;
import CreationPattern.Singleton.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class ReflectionDestorySingleton {
    public static void main(String[] args) throws ClassNotFoundException {

        Singleton singleton1 = EagerInitialization.getEagerInitialization();
        Singleton singleton2 = null;
        Singleton singleton3 = null;

        try {
            Constructor<?>[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                constructor.setAccessible(true);
                singleton2 = (EagerInitialization) constructor.newInstance("Reflection Initialization Destroy Singleton");
                singleton3 = (EagerInitialization) constructor.newInstance("Reflection Initialization Destroy Singleton");
            }
        } catch (IllegalAccessException | InstantiationException |  InvocationTargetException e) {
            e.printStackTrace();
        }

        System.out.printf(
                "1 : HashCode for singleton 1 : %d \n" +
                "2 : HashCode for singleton 2 : %d \n" +
                "3 : HashCode for singleton 3 : %d \n",
                singleton1.hashCode(),
                Objects.requireNonNull(singleton2).hashCode(),
                singleton3.hashCode()

        );
    }
}

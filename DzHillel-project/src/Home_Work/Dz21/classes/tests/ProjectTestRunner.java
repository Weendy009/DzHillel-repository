package Home_Work.Dz21.classes.tests;

import Home_Work.Dz21.classes.math.SimpleMathLibraryTest;

import java.lang.reflect.Method;
import java.util.Arrays;


public class ProjectTestRunner {
    private static final SimpleMathLibraryTest mathLibrary = new SimpleMathLibraryTest();
    private static final Method[] methods = mathLibrary.getClass().getDeclaredMethods();

    public static void runTestByClassName(String className) {
        for (Method method : methods) {
            String methodName = method.getName();
            if (methodName.equals(className)) {
                try {
                    method.invoke(mathLibrary);
                } catch (Exception e) {
                    System.out.println("Error executing method: " + methodName);
                }
                return;
            }
        }

        System.out.println("Method not found: " + className);
    }

    public void runTestByClassType(Class<?> classType) {
        System.out.println("Error executing classType: " + classType);
    }

    public void runTestsByClassNames(String[] classNames) {
        for (Method method : methods) {
            for (String className : classNames) {
                String methodName = method.getName();
                if (methodName.equals(className)) {
                    try {
                        method.invoke(mathLibrary);
                    } catch (Exception e) {
                        System.out.println("Error executing method: " + methodName);
                    }
                    return;
                }
            }
        }
    }

    public void runTestsByClassTypes(Class<?>... classTypes) {
        System.out.println("Error executing classTypes: " + Arrays.toString(classTypes));
    }

    public void runTestsByPackage(String packageName) {
        System.out.println("Error executing packageName: " + packageName);

    }
}
package Home_Work.Dz21.classes.tests;

public class TestRunner {
    public void runTests() {
        ProjectTestRunner projectTestRunner = new ProjectTestRunner();
        ProjectTestRunner.runTestByClassName("testPlus");
        projectTestRunner.runTestByClassType(String.class);
        projectTestRunner.runTestsByClassNames(new String[]{"testPlus", "testMinus"});
        projectTestRunner.runTestsByClassTypes(Integer.class, Double.class);
        projectTestRunner.runTestsByPackage("packageName");
    }
}


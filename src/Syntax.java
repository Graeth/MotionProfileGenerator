/**
 * Created by Julee on 2/5/2017.
 */
public class Syntax {
    public static final String packageName = "org.usfirst.team3238.robot";

    public static void GenerateClassHeader(String className) {
        System.out.println("package " + packageName + ";" +
                      "\n\npublic class " + className + " {\n");
    }
    public static void PostNumPoints(String name, int num) {
        System.out.println("public static final String " + name + " = " + num +";\n");
    }
    public static void newPointArray(String name) {
        System.out.println("public static double[][] " + name + " = new double[][] {");

    }
    public static void newPoint(double r, double rps, int s) {
        System.out.println("{" + r + ", " + rps + ", " + s + "},");
    }
    public static void GenerateArrayEnder(double r, double rps, int s) {
        System.out.println("{" + r + ", " + rps + ", " + s + "}};\n");
    }
    public static void endClass() {
        System.out.println("}");
    }
}

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * Created by Julee on 2/5/2017.
 */
public class Syntax {
    public static final String packageName = "org.usfirst.team3238.robot";
    public String classString = "";
    public Syntax() {

    }
    public void toClipboard() {
        StringSelection selection = new StringSelection(classString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
    public void GenerateClassHeader(String className) {
        classString+= "package " + packageName + ";" +
                "\n\npublic class " + className + " {\n";
    }

    public void PostNumPoints(String name, int num) {
        classString += "public static final String " + name + " = " + num + ";\n";
    }

    public void newPointArray(String name) {
        classString += "public static double[][] " + name + " = new double[][] {";

    }

    public void newPoint(double r, double rps, int s) {
        classString += "{" + r + ", " + rps + ", " + s + "},";
    }

    public void GenerateArrayEnder(double r, double rps, int s) {
        classString += "{" + r + ", " + rps + ", " + s + "}};\n";
    }

    public void endClass() {
        classString += "}";
    }
}

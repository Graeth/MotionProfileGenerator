/**
 * Necessary to generate a class because creating this array on the
 * roborio requires a long time because of its low processing power
 */
public class Generator {
    public static void main(String[] args) {
        Syntax.GenerateClassHeader("leftProfile");

        Syntax.PostNumPoints("kNum", 2);
        Syntax.newPointArray("Straight");
        Syntax.newPoint(0,0,0);
        Syntax.GenerateArrayEnder(1,1,1);
        Syntax.endClass();

    }
}

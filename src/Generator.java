import java.util.Scanner;

/**
 * Necessary to generate a class because creating this array on the
 * roborio requires a long time because of its low processing power
 */
public class Generator {
    static Syntax leftProfile, rightProfile;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String which = "";
        genLeftProfile();
        genRightProfile();
        while(!which.equals("end")) {

            which = s.next();
            if(which.equals("right")) rightProfile.toClipboard();
            else if(which.equals("left")) leftProfile.toClipboard();
        }
    }
    public static void genRightProfile() {
        rightProfile = new Syntax();
        rightProfile.GenerateClassHeader("rightProfile");
        rightProfile.PostNumPoints("kNum", 2);
        rightProfile.newPointArray("Straight");
        rightProfile.newPoint(0,0,0);
        rightProfile.GenerateArrayEnder(1,1,1);
        rightProfile.endClass();
        rightProfile.toClipboard();
    }
    public static void genLeftProfile() {

        leftProfile = new Syntax();
        leftProfile.GenerateClassHeader("leftProfile");
        leftProfile.PostNumPoints("kNum", 2);
        leftProfile.newPointArray("Straight");
        leftProfile.newPoint(0,0,0);
        leftProfile.GenerateArrayEnder(1,1,1);
        leftProfile.endClass();
        leftProfile.toClipboard();
    }
}


import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println("matthew's nickname is " + nicknames.get("matthew"));
        System.out.println("michael's nickname is " + nicknames.get("michael"));
        System.out.println("arthur's nickname is " + nicknames.get("arthur"));
    }

}

import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";


    }

    public static String vowelReplacer(String userInput) {
      char[] userCharArray = userInput.toCharArray();
      String replaceWithDashes = "";

      HashMap<Character, String> vowelToDash = new HashMap<Character, String>();
          vowelToDash.put('a', "-");
          // vowelToDash.put('e', "-");
          // vowelToDash.put('i', "-");
          // vowelToDash.put('o', "-");
          // vowelToDash.put('u', "-");


      for (char eachChar : userCharArray) {
        String dashReplace = vowelToDash.get(eachChar);
      }
    }
}

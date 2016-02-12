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
      String[] userStringArray = userInput.split("");
      String replaceWithDashes = "";

      for (int i = 0; i < userStringArray.length; i++) {
        if (userStringArray[i].contains("a")) {
          replaceWithDashes += "-";
        } else if (userStringArray[i].toLowerCase().contains("e")) {
          replaceWithDashes += "-";
        } else if (userStringArray[i].toLowerCase().contains("i")) {
          replaceWithDashes += "-";
        } else if (userStringArray[i].toLowerCase().contains("o")) {
          replaceWithDashes += "-";
        } else if (userStringArray[i].toLowerCase().contains("u")) {
          replaceWithDashes += "-";
        } else {
          replaceWithDashes += userStringArray[i];
        }
      } return replaceWithDashes;
    }
  }



// TEST 1, try to loop through charArray and compare to HashMap
// HashMap<Character, String> vowelToDash = new HashMap<Character, String>();
//     vowelToDash.put('a', "-");
//     vowelToDash.put('e', "-");
//     vowelToDash.put('i', "-");
//     vowelToDash.put('o', "-");
//     vowelToDash.put('u', "-");

// TEST 2, make two arrays of Strings, test equality, still running into issue with nested for loops that is completely throwing off output.
// String[] vowels = {"a", "e", "i", "o", "u"};

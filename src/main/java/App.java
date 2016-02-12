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
      String[] vowels = {"a", "e", "i", "o", "u"};

      String replaceWithDashes = "";


          // loop through char array of userInput String
      for (int i = 0; i < userStringArray.length; i++) {
        if (userStringArray[i].contains("a")) {
          replaceWithDashes += "-";
        } else if (userStringArray[i].contains("e")) {
          replaceWithDashes += "-";
        } else if (userStringArray[i].contains("i")) {
          replaceWithDashes += "-";
        } else if (userStringArray[i].contains("o")) {
          replaceWithDashes += "-";
        } else if (userStringArray[i].contains("u")) {
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

//   // if value is vowel, insert Dash or append original char
// if (eachChar = )
//
// append.scoreHash.get(eachChar);

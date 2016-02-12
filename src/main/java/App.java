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
      char[] vowels = {'a', 'e', 'i', 'o', 'u'};

      char[] replacedCharArray = {};
      String replaceWithDashes = "";


          // loop through char array of userInput String
      for (int i = 0; i < userCharArray.length; i++) {
          // loop through vowel char array, look for matches
        for (int v = 0; v < vowels.length ; v++) {

          if (vowels[v] == userCharArray[i]) {
            replaceWithDashes += '-';
            break;
          } else {
            replaceWithDashes += userCharArray[i];
            break;

          }
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

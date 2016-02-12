import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        String layout = "templates/layout.vtl";

        get("/", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/home.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        get("/results", (request, response) -> {
          HashMap<String, Object> model = new HashMap<String, Object>();
          model.put("template", "templates/results.vtl");

          String userinput = request.queryParams("input");
          String inputVowelRemoved = vowelReplacer(userinput);
          model.put("inputVowelRemoved", inputVowelRemoved);
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());


    }

    public static String vowelReplacer(String userInput) {
      String[] userStringArray = userInput.split("");
      String replaceWithDashes = "";

      for (int i = 0; i < userStringArray.length; i++) {
        if (userStringArray[i].contains("a")) {
          replaceWithDashes += " - ";
        } else if (userStringArray[i].toLowerCase().contains("e")) {
          replaceWithDashes += " - ";
        } else if (userStringArray[i].toLowerCase().contains("i")) {
          replaceWithDashes += " - ";
        } else if (userStringArray[i].toLowerCase().contains("o")) {
          replaceWithDashes += " - ";
        } else if (userStringArray[i].toLowerCase().contains("u")) {
          replaceWithDashes += " - ";
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

// TEST 3, how to refactor? I know that I could have done this entire challenge using String operators and a regex statement, however I wanted to use a for loop. I know that the long if/else conditional can be refactored, I'm just not sure how to go about.. I thought I could have done something with comparing the two (first char, then string) arrays.. but then I settled on this approach b/c I couldn't figure out how to get out of nested for loops..

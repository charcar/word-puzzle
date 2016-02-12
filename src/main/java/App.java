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

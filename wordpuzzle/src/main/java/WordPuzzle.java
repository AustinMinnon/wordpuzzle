import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.ArrayList;


public class WordPuzzle {
  public static void main(String[] args) {
    // String layout = "templates/layout.vtl";
    //
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
    //
    // get("/detector", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/detector.vtl");
    //
    //   int changeDue = Integer.parseInt(request.queryParams("changeDue"));
    //   String results = makeChange(changeDue);
    //
    //   model.put("results", results);
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());
  }

  public static String convertAnagram(String phrase) {
    ArrayList<String> returnAllergy = new ArrayList<String>();
    if ( score % 2 == 1) {
      returnAllergy.add("eggs");
      score -= 1;
    }
      return returnAllergy;
  }
}

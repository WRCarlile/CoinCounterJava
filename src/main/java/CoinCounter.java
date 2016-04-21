import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;

public class CoinCounter {
  public static void main(String[] args) {
    // get("/", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/home.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
    //
    // get("/detector", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //
    //   String userInput = request.queryParams("number");
    //   CoinCounter newCount = new CoinCounter();
    //   String count = newCount.coinCombo(userInput);
    //   model.put("count", count);
    //
    //   model.put("template", "templates/detector.vtl");
    //   return new ModelAndView(model, "templates/layout.vtl");
    // }, new VelocityTemplateEngine());
  }

  public static Integer[] coinCombo(Integer inputVar) {
    Integer penny = 1;
    Integer quarter = 25;
    Integer nickel = 5;
    Integer dime = 10;
    Integer machinePennies = 100;
    Integer machineNickels = 50;
    Integer machineDimes = 20;
    Integer machineQuarters = 10;
    Integer[] total = {0,0,0,0};

    while(inputVar >= 25){
      total[0] = inputVar / quarter;
      inputVar = inputVar - (total[0] * quarter);
    }

System.out.println(inputVar);
    while(inputVar >= 10 && inputVar < 25){
      total[1] = inputVar / dime;
      inputVar = inputVar - (total[1] * dime);
    }
System.out.println(inputVar);
    while(inputVar >= 5 && inputVar < 10){
      total[2] = inputVar / nickel;
      inputVar = inputVar - (total[2] * nickel);
    }
System.out.println(inputVar);
    while(inputVar >= 1 && inputVar < 5){
      total[3] = inputVar / penny;
      inputVar = inputVar - (total[3] * penny);
    }
System.out.println(total);
    return total;
  }
}

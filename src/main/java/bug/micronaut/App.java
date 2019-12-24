package bug.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.Micronaut;

public class App {

  @MyAnot
  @Controller("/service")
  static class Control {

    @Get
    String bar() {
      System.out.println("BAR INVOKED");
      return "bar";
    }
  }

  public static void main(String[] args) {
    Micronaut.run(App.class, args);
  }
}

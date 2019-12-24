package bug.micronaut;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class AppTest {

  @Inject EmbeddedServer server;

  @Inject
  @Client("/")
  HttpClient client;

  @Test
  void test_bug() {
    String str = client.toBlocking().retrieve("/simple-test");
    System.out.println(str);
  }

  @MyAnot
  @Controller("/simple-test")
  static class MyController {

    @Get
    String foo() {
      return "foo";
    }
  }
}

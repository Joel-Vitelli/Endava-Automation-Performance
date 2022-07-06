package example.simulations;

import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class ExampleSimulation extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://www.facebook.com")
      .inferHtmlResources(AllowList(), DenyList())
    ;
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36");
    headers_0.put("sec-ch-ua", " Not A;Brand\";v=\"99\", \"Chromium\";v=\"102\", \"Google Chrome\";v=\"102");
    headers_0.put("sec-ch-ua-mobile", "?0");
    headers_0.put("sec-ch-ua-platform", "macOS");


    String uri08 = "https://cdn.retently.com/public/components/embed/sdk.min.js";
    String uri12 = "https://cdn.clientsuccess.com/csTrack.min.js";

    ScenarioBuilder scn = scenario("RecordedSimulation")
      .pause(1)
      .exec(
        http("request_616")
          .get("/tr/?id=473120943447503&ev=Microdata&dl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%2F258521%2Fdashboard%3Fpage%3D1%26archived%3D2&rl=https%3A%2F%2Fdemo-sp.cor-staging-1.xyz%2Fprojects%3Fpage%3D1%26archived%3D2&if=false&ts=1655228018946&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22(3)%20COR%20%7C%201A%20-%20Cliente%20Dio%22%7D&cd[OpenGraph]=%7B%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1440&sh=900&ud[external_id]=495905ffa1314565844202a2ec0f0171&v=2.9.62&r=stable&a=tmhubspot&ec=1&o=30&fbp=fb.1.1642534104092.1825265756&it=1655228017406&coo=false&es=automatic&tm=3&exp=p1&rqm=GET")
          .headers(headers_0)
          .resources(
            http("request_618")
              .get(uri12),
            http("request_619")
              .get(uri12)
              .headers(headers_0),
            http("request_620")
              .get(uri08)
              .headers(headers_0),
            http("request_621")
              .get(uri08)
          )
      )
      ;

	setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
    /*
    setUp(
            scn.injectOpen(
                    nothingFor(4),
                    atOnceUsers(10),
                    rampUsers(10).during(5),
                    constantUsersPerSec(20).during(15),
                    rampUsersPerSec(1).to(20).during(15),
                    constantUsersPerSec(20).during(15),
                    rampUsersPerSec(20).to(11).during(15),
                    stressPeakUsers(1000).during(20)
            ).protocols(httpProtocol)
    );
    */
  }
}

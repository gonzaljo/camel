package ch.pepigonzalez.camel;

import org.apache.camel.builder.RouteBuilder;

import javax.enterprise.context.ApplicationScoped;

import static org.apache.camel.builder.endpoint.StaticEndpointBuilders.timer;

@ApplicationScoped
public class TimerRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from(timer("hallo").period(1000))
                .log("Hellöle Peppone");
    }
}

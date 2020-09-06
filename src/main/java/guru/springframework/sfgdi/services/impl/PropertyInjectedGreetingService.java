package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}

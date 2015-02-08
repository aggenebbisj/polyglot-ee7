package nl.rdj.control

import javax.ejb.Stateless
import javax.ejb.LocalBean

@Stateless
class GroovyGreetingService implements GreetingService {
    
    String greeting() { "Hello from Groovy!" }
    
}


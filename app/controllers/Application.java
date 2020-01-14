
package controllers;

import drools.Message;
import models.Person;
import play.mvc.*;

import plugins.Drools;

import javax.inject.Inject;

public class Application extends Controller {

    @Inject
    Drools drools;

    public Result index() {

        final Message message = new Message();
        message.setMessage("hello, world");
        message.setStatus(Message.HELLO);
//        drools.kieSession.insert(message);
        drools.kieSession.insert("Hello");
        drools.kieSession.fireAllRules();

        return ok("rules are running... check the console.");
    }

    public Result setTitle() {
        final Person person = new Person("Mr", "Raj", "Male");
        System.out.println(person.getMetadata());
        drools.kieSession.insert(person);
        drools.kieSession.fireAllRules();
        System.out.println(person.getMetadata());
        return ok("rules are running... check the console.");
    }


}
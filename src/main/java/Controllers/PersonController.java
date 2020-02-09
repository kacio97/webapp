package Controllers;

import Models.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @RequestMapping(value = "/newPerson")
    public String hello() {
        return "createNewPerson";
    }

    @RequestMapping(value = "/create")
    public ModelAndView create(String name, String surname, int iD) {
        ModelAndView modelAndView = new ModelAndView("details");
        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setiD(iD);
        modelAndView.getModel().put("person", person);

        return modelAndView;
    }
}

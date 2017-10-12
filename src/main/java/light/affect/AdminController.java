package light.affect;


import light.affect.dao.LightAffectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author John Smith
 */
@Controller
@RequestMapping("/light/affect")
public class AdminController {

    private final LightAffectDao lightAffectDao;

    @Autowired
    public AdminController(LightAffectDao lightAffectDao) {
        this.lightAffectDao = lightAffectDao;
    }

    @RequestMapping("/admin")
    public ModelAndView toAdminPage() {

        return new ModelAndView("index");
    }

}

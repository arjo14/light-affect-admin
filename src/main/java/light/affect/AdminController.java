package light.affect;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author John Smith
 */
@RestController
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/homePage")
    public ModelAndView toAdminPage() {
        return new ModelAndView("index");
    }

}

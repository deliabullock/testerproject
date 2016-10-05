package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChoiceController {

    @RequestMapping("/choice")
    public String greeting(@RequestParam(value="prefers", required=false, defaultValue="World") String preference) {
        if (preference.equals("cats")) {
		return "cat";
	}
        return "dog";
    }

}

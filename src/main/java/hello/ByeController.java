package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ByeController {

    @RequestMapping("/aa")
    public String index() {
        return getEmployees();
    }

    private static String getEmployees()
    {
        final String uri = "https://api.github.com/users?since=135";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
        return result;
    }
    
}

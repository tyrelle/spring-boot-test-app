package testapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by tyrelle on 2017/05/06.
 */
@RestController
public class TestAPI {

    @RequestMapping(value="test",
            method= RequestMethod.GET,
            produces="application/json")
    @ResponseBody
    String test(){
        try {
            return InetAddress.getLocalHost().getCanonicalHostName() + " - " + InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return "DEFAULT HOST";
        }
    }
    
    @RequestMapping(value="test2",
            method= RequestMethod.GET,
            produces="application/json")
    @ResponseBody
    String test2(){
             System.out.println("logging out");
            return "new version - cloud build";

    }
    
}

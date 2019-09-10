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
    
    @RequestMapping(value="hello",
            method= RequestMethod.GET,
            produces="application/json")
    @ResponseBody
    String hello(){
            System.out.println("hello endpoint called");
            return "hello v2";

    }
    
}

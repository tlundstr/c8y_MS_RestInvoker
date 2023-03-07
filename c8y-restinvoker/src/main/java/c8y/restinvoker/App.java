package c8y.restinvoker;

import org.springframework.boot.SpringApplication;

import com.cumulocity.microservice.autoconfigure.MicroserviceApplication;

/**
 * 
 *
 */
@MicroserviceApplication
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
}

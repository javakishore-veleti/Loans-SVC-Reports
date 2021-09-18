package loans.reports;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoansReportsApp 
{
    public static void main( String[] args )
    {
        SpringApplication app = new SpringApplication(LoansReportsApp.class);
        
        app.run(args);
    }
}

package Configuration;
import khan.riaz.mohammed.CollectionsInterface;
import khan.riaz.mohammed.Profile;
import khan.riaz.mohammed.Profile2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean(name="allCollectionsStartingAt1")
    public CollectionsInterface getCollectionInterfaceAgain(){
        return new Profile2();
    }
}

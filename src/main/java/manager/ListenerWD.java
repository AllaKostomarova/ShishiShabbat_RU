package manager;

import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class ListenerWD extends AbstractWebDriverEventListener {
    //add logger variable
    Logger logger = LoggerFactory.getLogger(ListenerWD.class);

    // generate constructor
    public ListenerWD(Logger logger) {
        this.logger = logger;
    }
}

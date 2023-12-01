package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theWikipediaHomePage() {
        String baseUrl ="https://wikipedia.org";

        return Task.where("{0} opens the Wikipedia home page",
                Open.url(baseUrl));
    }
}

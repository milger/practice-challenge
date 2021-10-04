package demo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class PracticePage extends PageObject {
    public void searchFor(String searchText) {
        find(PracticeWebPage.SEARCH_TEXT).type(searchText);
    }
}

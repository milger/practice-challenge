package demo.queries;

import demo.pages.PracticeWebPage;
import net.serenitybdd.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class ProductList extends PageObject {
    public List<String> itemsDisplayed() {
        return findAll(PracticeWebPage.PRODUCT_LIST_ITEMS).stream()
                .map(item -> item.getText().trim())
                .collect(Collectors.toList());
    }
}

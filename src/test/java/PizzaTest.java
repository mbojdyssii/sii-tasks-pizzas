import org.example.Main;
import org.example.Pizza;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PizzaTest {

    /*
    Mając listę pizz, zwróć srednią ceną za pizzę
    Dopisz asercję, która sprawdzi, czy wynik metody jest prawidłowy
    */

    @Test
    public void pizzaAvgPrice(){
        // given
        var pizzaRomana = new Pizza("romana", 5.20);
        var pizzaSiciliana = new Pizza("siciliana", 2.30);
        var pizzaBianca = new Pizza("bianca", 2.10);

        // when
        var avgPrice = Main.getAvgPizzaPrice(List.of(pizzaRomana, pizzaSiciliana, pizzaBianca));

        // then
        // TODO
    }

    /*
    Mając listę pizz, zwróć 3 nazwy pizz, które są najdroższe.
    */

    @Test
    public void threeTheMostExpensivePizzaNames(){
        // given
        var pizzaRomana = new Pizza("gourmet", 5.20);
        var pizzaNy = new Pizza("ny", 10.50);
        var pizzaSiciliana = new Pizza("siciliana", 2.30);
        var pizzaBianca = new Pizza("bianca", 2.10);
        var pizzaGourmet = new Pizza("romana", 8.20);
        var pizzas = List.of(pizzaRomana, pizzaNy, pizzaSiciliana, pizzaBianca, pizzaGourmet);

        // when
        var result = Main.getThreeTheMostExpensivePizzaNames(pizzas);

        // then
        Assertions.assertEquals(3, result.size());
        Assertions.assertTrue(List.of("gourmet", "ny", "romana").containsAll(result));
    }
}

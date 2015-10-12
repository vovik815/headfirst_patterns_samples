import com.designpatterns.pizzasf.Pizza;
import com.designpatterns.pizzasf.PizzaStore;
import com.designpatterns.pizzasf.PizzaType;
import com.designpatterns.pizzasf.SimplePizzaFactory;


public class PizzaSFTestDrive {

    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        Pizza pizza = store.orderPizza(PizzaType.CHEESE);
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza(PizzaType.VEGGIE);
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}

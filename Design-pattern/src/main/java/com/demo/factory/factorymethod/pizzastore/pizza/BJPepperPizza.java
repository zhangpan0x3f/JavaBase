import com.demo.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @author 张攀
 * @date 2021/2/10 17:36
 * 描述：
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨pizza");
        System.out.println("北京的胡椒披萨准备原材料");
    }
}

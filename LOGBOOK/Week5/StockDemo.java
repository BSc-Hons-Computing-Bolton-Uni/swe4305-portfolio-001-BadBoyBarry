package Week5;

public class StockDemo {


    public void run()
    {
        test_stock_demo();
    }

    public void test_stock_demo()
    {
        Product product_t1 = new Product(0001 , "test_1", 55);
        Product product_t2 = new Product(0002, "test_2", 42);
        Product product_t3 = new Product(0003, "test_3", 63);
        StockList stock_list = new StockList();

        stock_list.add_product(product_t2);
        stock_list.add_product(product_t1);
        stock_list.add_product(product_t3);

        stock_list.print_stock_list();

    }
}

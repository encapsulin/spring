package comexample.demo.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemBootstrap implements CommandLineRunner {
    @Autowired
    ItemRepo repo;

    @Override
    public void run(String... args)  {
//        repo.deleteAll();
        List<Item> items =new ArrayList<>();
        for(int i=1;i<=3;i++) {
            Item item = new Item(null,"Item"+i);
//            repo.save(item);
            items.add(item);
        }
        repo.saveAll(items);
    }
}

package comexample.demo.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@CrossOrigin(origins = "*")
public class ItemController {

    @Autowired
    ItemRepo repo;

    @GetMapping({""})
    public List<Item> root(@RequestParam(required = false) List<Long> ids){
        if (ids != null && !ids.isEmpty()) {
            return repo.findAllById(ids);
        }
//        throw new RuntimeException("Some error");
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Item getById(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @GetMapping("/")
    public Item getByIdParam(@RequestParam Long id) {
        return repo.findById(id).orElse(null);
    }


}

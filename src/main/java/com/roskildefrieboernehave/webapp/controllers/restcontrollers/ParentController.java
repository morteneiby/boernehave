package com.roskildefrieboernehave.webapp.controllers.restcontrollers;
import com.roskildefrieboernehave.webapp.helpers.ReturnEntity;
import com.roskildefrieboernehave.webapp.models.Parent;
import com.roskildefrieboernehave.webapp.services.ParentService;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class ParentController implements IController {

    ParentService ps = ParentService.getInstance();

    @Override
    @GetMapping("/parents")
    public ReturnEntity<Parent[]> getAll() {
        return ps.getAll();
    }

    @Override
    @GetMapping("/parents/{id}")
    public ReturnEntity<Parent> get(
            @PathVariable("id") int id
    ) {
        return ps.get(id);
    }

    @Override
    @PutMapping("/parents/{id}")
    public ReturnEntity<Parent> edit(
            @PathVariable("id") int id,
            @RequestBody String s
            ) {
        JSONObject o = new JSONObject(s);
        return ps.edit(id, o);
    }

    @Override
    @PostMapping("/parents")
    public ReturnEntity<Parent> create(
            @RequestBody String s
    ) {
        JSONObject o = new JSONObject(s);
        return ps.create(o);
    }

    @Override
    @DeleteMapping("/parents/{id}")
    public ReturnEntity<Boolean> delete(
            @PathVariable("id") int id
    ) {
        return ps.delete(id);
    }
}

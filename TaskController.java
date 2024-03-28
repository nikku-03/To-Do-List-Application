import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/tasks")
public class TaskController {
  private List<String> tasks = new ArrayList<>();
  @GetMapping
  public List<String> getTasks() {
    return tasks;
 }
 @PostMapping
 public void addTask(@RequestBody String task) {

   tasks.add(task);
 }
 @DeleteMapping("/{index}")
 public void deleteTask(@PathVariable int index) {
   if (index >= 0 && index < tasks.size()) {
     tasks.remove(index);
   }
 }
}

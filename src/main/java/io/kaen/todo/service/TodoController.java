package io.kaen.todo.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class TodoController {

    private List<Todo> todoList = new ArrayList<>();

    @GetMapping
    public String home(Model model){
        model.addAttribute("todos",todoList);
        model.addAttribute("todoForm",new Todo());
        return "home";
    }

    @PostMapping
    public String createTodo(@ModelAttribute Todo todo){
        if(todoList.stream().noneMatch(t -> t.getTask().equalsIgnoreCase(todo.getTask()))) {
            todoList.add(todo);
        }
        return "redirect:/";
    }
}

package com.example.bankmanagementsystem.BankController;

import com.example.bankmanagementsystem.BankApiResponse.ApiResponse;
import com.example.bankmanagementsystem.BankModel.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/bank")
public class BController {

    Date date = new Date();
    ArrayList<Model> models = new ArrayList<>();

    @GetMapping("/get")
    public ArrayList<Model> getBank()
    {
        return models;
    }

    @PostMapping("/add")
    public ApiResponse addBank(@RequestBody Model model)
    {
        models.add(model);
        return new ApiResponse("bank added",date.toString());
    }

    @PutMapping("/update/{index}")
    public ApiResponse updateBank(@PathVariable int index,@RequestBody Model model)
    {
        models.set(index,model);
        return new ApiResponse("bank updated",date.toString());
    }

    @DeleteMapping("/delete/{index}")
    public ApiResponse deleteBank(@PathVariable int index)
    {
        models.remove(index);
        return new ApiResponse("bank deleted",date.toString());
    }

    @PutMapping("/deposit/{index}/{b}")
    public ApiResponse depositBank(@PathVariable int index,@PathVariable double b)
    {
        models.get(index).setBalance(models.get(index).getBalance() + b);
        return new ApiResponse("bank deposited",date.toString());
    }

    @PutMapping("/withdraw/{index}/{b}")
    public ApiResponse withdrawBank(@PathVariable int index,@PathVariable double b)
    {
        models.get(index).setBalance(models.get(index).getBalance() - b);
        return new ApiResponse("bank done withdraw",date.toString());
    }

}

package com.example.demo.controller;

import com.example.demo.feedback.FeedbackMailSender;
import com.example.demo.feedback.FeedbackSender;
import com.example.demo.pojos.FeedbackViewModel;
import com.example.demo.pojos.Restaurant;
import com.example.demo.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.ValidationException;
import java.util.List;


@RestController
@CrossOrigin("*")
public class RestaurantController {
    @Autowired
    private FeedbackMailSender feedbackSender;
    @Autowired
    private RestaurantService service;
    @GetMapping("/restaurants")
    private List<Restaurant> getRestaurants()
    {
        return service.getRestaurants();
    }
    @DeleteMapping("/restaurants/delete/{id}")
    private void deleteRestaurant(@PathVariable Long id)
    {
    service.deleteRestaurant( id );
    }

    @PostMapping("restaurants/feedback")
    public void sendFeedback(@RequestBody FeedbackViewModel feedbackViewModel,
                             BindingResult bindingResult) throws ValidationException {
        if(bindingResult.hasErrors()){
            throw new ValidationException("Feedback has errors; Can not send feedback;");
        }

        this.feedbackSender.sendFeedback(
                feedbackViewModel.getEmail(),
                feedbackViewModel.getName(),
                feedbackViewModel.getFeedback());
    }

    /*Client*/




}

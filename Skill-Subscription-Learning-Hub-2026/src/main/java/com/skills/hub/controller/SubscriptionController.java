package com.skills.hub.controller;

import com.skills.hub.service.SubscriptionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/*
=========================================================
WHAT IS THIS FILE?
Handles subscription between user and skill pack
=========================================================
*/

@Controller
public class SubscriptionController {

    public String subscribe(@RequestParam Long userId,
                            @RequestParam Long packId) {

        // =========================
        // TASK
        // =========================
        // STEP 1: call subscriptionService.subscribe(userId, packId)
        // STEP 2: redirect to subscriptions page
        
        subscriptionService.subscribe(userId, packId);

        return null;
        
        return "redirect:/subscriptions/" + userId;
    }

    @GetMapping("/subscriptions/{userId}")
    public String viewSubscriptions(@PathVariable Long userId) {
    public String viewSubscriptions(@PathVariable Long userId,
                                    Model model) {

        var list = subscriptionService.getUserSubscriptions(userId);

        // =========================
        // TASK
        // =========================
        // STEP 1: list = subscriptionService.getUserSubscriptions(userId)
        // STEP 2: model.addAttribute("subs", list)
        // STEP 3: return subscriptions.jsp
        
        model.addAttribute("subs", list);

        return null;
        
        return "subscriptions";
    }

	public SubscriptionService getSubscriptionService() {
		return subscriptionService;
	}
}
    public SubscriptionService getSubscriptionService() {
        return subscriptionService;
    }
}

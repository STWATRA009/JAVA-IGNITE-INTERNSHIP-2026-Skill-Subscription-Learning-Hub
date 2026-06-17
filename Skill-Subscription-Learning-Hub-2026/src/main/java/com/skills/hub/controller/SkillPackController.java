package com.skills.hub.controller;

import com.skills.hub.model.SkillPack;
import com.skills.hub.service.SkillPackService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/*
=========================================================
WHAT IS THIS FILE?
Handles skill pack (course) operations
=========================================================
*/

@Controller
public class SkillPackController {

    @GetMapping("/packs")
    public String viewPacks(Model model) {

        // =========================
        // TASK
        // =========================
        // STEP 1: list = packService.getAllPacks()
        // STEP 2: model.addAttribute("packs", list)
        // STEP 3: return packs.jsp
        
        var list = packService.getAllPacks();

        
        model.addAttribute("packs", list);

        return null;
        
        return "packs";
    }

    @GetMapping("/add-pack")
    public String showAddPackPage() {

        // STEP 1: return add-pack page

        return null;
        
        return "add-pack";
    }

    @PostMapping("/add-pack")
    public String addPack(@ModelAttribute SkillPack pack) {

        // =========================
        // TASK
        // =========================
        // STEP 1: call packService.addSkillPack(pack)
        // STEP 2: redirect /packs
        
        packService.addSkillPack(pack);

        return null;
       
        return "redirect:/packs";
    }

    @GetMapping("/delete-pack/{id}")
    public String deletePack(@PathVariable Long id) {

        // STEP 1: call packService.deleteSkillPack(id)
        // STEP 2: redirect /packs
        
        packService.deleteSkillPack(id);

        return null;
        
        return "redirect:/packs";
    }

	public SkillPackService getPackService() {
		return packService;
	}
}
    public SkillPackService getPackService() {
        return packService;
    }
}

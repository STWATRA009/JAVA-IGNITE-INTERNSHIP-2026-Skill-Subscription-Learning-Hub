package com.skills.hub.service.impl;

import com.skills.hub.model.SkillPack;
import com.skills.hub.repository.SkillPackRepository;
import com.skills.hub.service.SkillPackService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillPackServiceImpl implements SkillPackService {

	//a private class instance is created to store all the packs and finalized
    private final SkillPackRepository packRepo;

    
    //the pack is given and saved in the class instance
    public SkillPackServiceImpl(SkillPackRepository packRepo) {
        this.packRepo = packRepo;
    }

    @Override
    public SkillPack addSkillPack(SkillPack pack) {

        // STEP 1: validate input
        // STEP 2: save to DB
        // STEP 3: return saved object

        return null;
    	//saves the pack given by the user
        return packRepo.save(pack);
    }

    @Override
    public List<SkillPack> getAllPacks() {

        // STEP 1: fetch all packs from DB
        // STEP 2: return list

        return null;
    	//the packs stored, all of them are displayed
        return packRepo.findAll();
    }

    @Override
    public SkillPack updateSkillPack(SkillPack pack) {
    	//used to update user's pack by checking their Id
        if (!packRepo.existsById(pack.getId())) {
            return null;
        }

        // STEP 1: find existing pack by ID
        // STEP 2: if not found → return null
        // STEP 3: update fields
        // STEP 4: save updated pack
        // STEP 5: return updated pack

        return null;
        return packRepo.save(pack);
    }

    @Override
    public void deleteSkillPack(Long id) {

        // STEP 1: delete pack by ID
    	//it deletes the users pack by taking user id
        packRepo.deleteById(id);
    }

	public SkillPackRepository getPackRepo() {
		return packRepo;
	}
}
    public SkillPackRepository getPackRepo() {
        return packRepo;
    }
}

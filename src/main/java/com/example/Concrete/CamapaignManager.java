package com.example.Concrete;

import com.example.Abstract.CampaignService;
import com.example.Entity.concretes.Camapaign;

public class CamapaignManager implements CampaignService {
    @Override
    public void add(Camapaign camapaign) {
        System.out.println(camapaign.getName()+ "added..");
    }

    @Override
    public void delete(Camapaign camapaign) {
        System.out.println(camapaign.getName()+ "deleted..");
    }

    @Override
    public void update(Camapaign camapaign) {
        System.out.println(camapaign.getName()+ "updated..");
    }
}

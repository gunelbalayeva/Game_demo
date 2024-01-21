package com.example.Concrete;

import com.example.Abstract.CampaignService;
import com.example.Abstract.SalesService;
import com.example.Entity.concretes.Camapaign;
import com.example.Entity.concretes.Gamer;

public class SalesManager implements SalesService {
    private CampaignService campaignService;
    private Camapaign camapaign;

    public SalesManager(CampaignService campaignService, Camapaign camapaign) {
        this.campaignService = campaignService;
        this.camapaign = camapaign;
    }

    @Override
    public void add(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" your payment added..");
               campaignService.add(camapaign);

    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" your payment deleted..");
        campaignService.delete(camapaign);
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getFirstName()+" yor payment updated..");
        campaignService.update(camapaign);
    }
}

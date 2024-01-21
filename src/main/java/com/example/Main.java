package com.example;
import com.example.Abstract.UserCheckService;
import com.example.Concrete.CamapaignManager;
import com.example.Concrete.SalesManager;
import com.example.Concrete.UserManager;
import com.example.Entity.concretes.Camapaign;
import com.example.Entity.concretes.Game;
import com.example.Entity.concretes.Gamer;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Game pubg = new Game(1, "PUBG ", "Mobile Game", 3000);
        Gamer gamer = new Gamer(1, "", "", new Date(1999, 10, 14), "12345");
        Camapaign camapaign = new Camapaign(1, "TheWlkingDead", "Flux Games"
                , new Date(5, 5, 2023), new Date(8, 20, 2023), 120);
        CamapaignManager camapaignManager = new CamapaignManager();
        SalesManager salesManager = new SalesManager(camapaignManager, camapaign);
        UserManager userManager = new UserManager(new UserCheckService() {
            @Override
            public boolean checkUser() {
                // return false; - Invalid national id...
                return true;
            }
        });
        userManager.add(gamer);
        salesManager.add(gamer);
    }
}
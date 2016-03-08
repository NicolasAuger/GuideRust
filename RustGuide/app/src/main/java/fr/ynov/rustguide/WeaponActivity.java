package fr.ynov.rustguide;

import android.content.Intent;
import android.graphics.ImageFormat;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Nicolas on 01/03/2016.
 */
public class WeaponActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weapon_activity);

        ImageView assaultRiflePl, assaultRifleGl;
        ImageView boltActionRiflePl, boltActionRifleGl;
        ImageView crossbowPl,crossbowGl;
        ImageView customSmgPl, customSmgGl;
        ImageView m249Pl, m249Gl;
        ImageView pumpShotgunPl, pumpShotgunGl;
        ImageView revolverPl, revolverGl;
        ImageView rocketLauncherPl, rocketLauncherGl;
        ImageView semiAutomaticRiflePl, semiAutomaticRifleGl;
        ImageView thompsonPl, thompsonGl;


        // Assignation des grands layouts
        assaultRifleGl = (ImageView) findViewById(R.id.assaultRifleGl);
        boltActionRifleGl = (ImageView) findViewById(R.id.boltActionRifleGl);
        crossbowGl = (ImageView) findViewById(R.id.crossbowGl);
        customSmgGl = (ImageView) findViewById(R.id.customSmgGl);
        m249Gl = (ImageView)findViewById(R.id.m249Gl);
        pumpShotgunGl = (ImageView)findViewById(R.id.pumpShotgunGl);
        revolverGl = (ImageView)findViewById(R.id.revolverGl);
        rocketLauncherGl = (ImageView)findViewById(R.id.rocketLauncherGl);
        semiAutomaticRifleGl = (ImageView)findViewById(R.id.semiAutomaticRifleGl);
        thompsonGl = (ImageView)findViewById(R.id.thompsonGl);


        // ***********************   Assignation des petits layouts + méthodes onClick() pour changer la visibilité des grands layouts *******************************************

        //Assault Rifle
        assaultRiflePl = (ImageView) findViewById(R.id.assaultRiflePl);
        ajoutImage(assaultRiflePl,assaultRifleGl);

        // Bolt Action Rifle
        boltActionRiflePl = (ImageView) findViewById(R.id.boltActionRiflePl);
        ajoutImage(boltActionRiflePl, boltActionRifleGl);

        // Crossbow
        crossbowPl = (ImageView) findViewById(R.id.crossbowPl);
        ajoutImage(crossbowPl, crossbowGl);

        // Custom SMG
        customSmgPl = (ImageView) findViewById(R.id.customSmgPl);
        ajoutImage(customSmgPl,customSmgGl);

        // M249
        m249Pl = (ImageView) findViewById(R.id.m249Pl);
        ajoutImage(m249Pl,m249Gl);

        // Pump Shotgun
        pumpShotgunPl = (ImageView) findViewById(R.id.pumpShotgunPl);
        ajoutImage(pumpShotgunPl,pumpShotgunGl);

        // Revolver
        revolverPl = (ImageView) findViewById(R.id.revolverPl);
        ajoutImage(revolverPl,revolverGl);

        // Rocket Launcher
        rocketLauncherPl = (ImageView) findViewById(R.id.rocketLauncherPl);
        ajoutImage(rocketLauncherPl,rocketLauncherGl);

        // Semi Automatic Rifle
        semiAutomaticRiflePl = (ImageView) findViewById(R.id.semiAutomaticRiflePl);
        ajoutImage(semiAutomaticRiflePl,semiAutomaticRifleGl);

        // Thompson
        thompsonPl = (ImageView) findViewById(R.id.thompsonPl);
        ajoutImage(thompsonPl,thompsonGl);

    }


    // Méthode ajout de l'image qui gère aussi la fonction onClick
    private void ajoutImage(ImageView imagePl, final ImageView imageGl) {

        imagePl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                changeVisibility(imageGl);
            }
        });
    }


    //méthode pour changer la visiblité des images
    private void changeVisibility(ImageView view){
        if(view.getVisibility() == View.GONE){
            view.setVisibility(View.VISIBLE);
        }else {
            view.setVisibility(View.GONE);
        }
    }


}

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
public class ToolsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tools_activity);

        ImageView rock_p, rock_g;
        ImageView torch_p, torch_g;
        ImageView stone_hatchet_p,stone_hatchet_g;
        ImageView stone_pick_axe_p, stone_pick_axe_g;
        ImageView hatchet_p, hatchet_g;
        ImageView pick_axe_p, pick_axe_g;
        ImageView salvaged_axe_p, salvaged_axe_g;
        ImageView salvaged_icepick_p, salvaged_icepick_g;
        ImageView salvaged_hammer_p, salvaged_hammer_g;
        ImageView hammer_p, hammer_g;


        // Assignation des grands layouts
        rock_g = (ImageView) findViewById(R.id.rock_g);
        torch_g = (ImageView) findViewById(R.id.torch_g);
        stone_hatchet_g = (ImageView) findViewById(R.id.stone_hatchet_g);
        stone_pick_axe_g = (ImageView) findViewById(R.id.stone_pick_axe_g);
        hatchet_g = (ImageView)findViewById(R.id.hatchet_g);
        pick_axe_g = (ImageView)findViewById(R.id.pick_axe_g);
        salvaged_axe_g = (ImageView)findViewById(R.id.salvaged_axe_g);
        salvaged_icepick_g = (ImageView)findViewById(R.id.salvaged_icepick_g);
        salvaged_hammer_g = (ImageView)findViewById(R.id.salvaged_hammer_g);
        hammer_g = (ImageView)findViewById(R.id.hammer_g);


        // ***********************   Assignation des petits layouts + méthodes onClick() pour changer la visibilité des grands layouts *******************************************

        //Assault Rifle
        rock_p = (ImageView) findViewById(R.id.rock_p);
        ajoutImage(rock_p,rock_g);

        // Bolt Action Rifle
        torch_p = (ImageView) findViewById(R.id.torch_p);
        ajoutImage(torch_p, torch_g);

        // Crossbow
        stone_hatchet_p = (ImageView) findViewById(R.id.stone_hatchet_p);
        ajoutImage(stone_hatchet_p, stone_hatchet_g);

        // Custom SMG
        stone_pick_axe_p = (ImageView) findViewById(R.id.stone_pick_axe_p);
        ajoutImage(stone_pick_axe_p,stone_pick_axe_g);

        // M249
        hatchet_p = (ImageView) findViewById(R.id.hatchet_p);
        ajoutImage(hatchet_p,hatchet_g);

        // Pump Shotgun
        pick_axe_p = (ImageView) findViewById(R.id.pick_axe_p);
        ajoutImage(pick_axe_p,pick_axe_g);

        // Revolver
        salvaged_axe_p = (ImageView) findViewById(R.id.salvaged_axe_p);
        ajoutImage(salvaged_axe_p,salvaged_axe_g);

        // Rocket Launcher
        salvaged_icepick_p = (ImageView) findViewById(R.id.salvaged_icepick_p);
        ajoutImage(salvaged_icepick_p,salvaged_icepick_g);

        // Semi Automatic Rifle
        salvaged_hammer_p = (ImageView) findViewById(R.id.salvaged_hammer_p);
        ajoutImage(salvaged_hammer_p,salvaged_hammer_g);

        // Thompson
        hammer_p = (ImageView) findViewById(R.id.hammer_p);
        ajoutImage(hammer_p,hammer_g);

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

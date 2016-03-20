package fr.ynov.rustguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Nicolas on 01/03/2016.
 */
public class AmmoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ammo_activity);

        ImageView arrowPl, arrowGl;
        ImageView higharrowPl, higharrowGl;
        ImageView rocketPl,rocketGl;
        ImageView bulletPl, bulletGl;
        ImageView gaugePl, gaugeGl;
        ImageView slugPl, slugGl;
        ImageView riflePl, rifleGl;
        ImageView explosivePl, explosiveGl;
        ImageView shellPl, shellGl;
        ImageView thompsonPl, thompsonGl;


        // Assignation des grands layouts
        arrowGl = (ImageView) findViewById(R.id.arrowGl);
        higharrowGl = (ImageView) findViewById(R.id.higharrowGl);
        rocketGl = (ImageView) findViewById(R.id.rocketGl);
        bulletGl = (ImageView) findViewById(R.id.bulletGl);
        gaugeGl = (ImageView)findViewById(R.id.gaugeGl);
        slugGl = (ImageView)findViewById(R.id.slugGl);
        rifleGl = (ImageView)findViewById(R.id.rifleGl);
        explosiveGl = (ImageView)findViewById(R.id.explosiveGl);
        shellGl = (ImageView)findViewById(R.id.shellGl);
        thompsonGl = (ImageView)findViewById(R.id.thompsonGl);


        // ***********************   Assignation des petits layouts + méthodes onClick() pour changer la visibilité des grands layouts *******************************************

        //Fleche
        arrowPl = (ImageView) findViewById(R.id.arrowPl);
        ajoutImage(arrowPl,arrowGl);

        // Fleche haute velocité
        higharrowPl = (ImageView) findViewById(R.id.higharrowPl);
        ajoutImage(higharrowPl, higharrowGl);

        // Fusée
        rocketPl = (ImageView) findViewById(R.id.rocketPl);
        ajoutImage(rocketPl, rocketGl);

        // balle
        bulletPl = (ImageView) findViewById(R.id.bulletPl);
        ajoutImage(bulletPl,bulletGl);

        // Gauge
        gaugePl = (ImageView) findViewById(R.id.gaugePl);
        ajoutImage(gaugePl,gaugeGl);

        // Slug
        slugPl = (ImageView) findViewById(R.id.slugPl);
        ajoutImage(slugPl,slugGl);

        // Balle de rifle
        riflePl = (ImageView) findViewById(R.id.riflePl);
        ajoutImage(riflePl,rifleGl);

        // Balle explosive
        explosivePl = (ImageView) findViewById(R.id.explosivePl);
        ajoutImage(explosivePl,explosiveGl);

        // Handmade Shell
        shellPl = (ImageView) findViewById(R.id.shellPl);
        ajoutImage(shellPl,shellGl);

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

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
 * Created by Lucas on 01/03/2016.
 */
public class RessourcesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resources_activity);

        ImageView woodPl, woodGl;
        ImageView stonesPl, stonesGl;
        ImageView metalPl,metalGl;
        ImageView metalfPl, metalfGl;
        ImageView sulfurePl, sulfureGl;
        ImageView sulfurefPl, sulfurefGl;
        ImageView clothPl, clothGl;
        ImageView leatherPl, leatherGl;
        ImageView fatPl, fatGl;
        ImageView bonePl, boneGl;


        // Assignation des grands layouts
        woodGl = (ImageView) findViewById(R.id.woodGl);
        stonesGl = (ImageView) findViewById(R.id.stonesGl);
        metalGl = (ImageView) findViewById(R.id.metalGl);
        metalfGl = (ImageView) findViewById(R.id.metalfGl);
        sulfureGl = (ImageView)findViewById(R.id.sulfureGl);
        sulfurefGl = (ImageView)findViewById(R.id.sulfurefGl);
        clothGl = (ImageView)findViewById(R.id.clothGl);
        leatherGl = (ImageView)findViewById(R.id.leatherGl);
        fatGl = (ImageView)findViewById(R.id.fatGl);
        boneGl = (ImageView)findViewById(R.id.boneGl);


        // ***********************   Assignation des petits layouts + méthodes onClick() pour changer la visibilité des grands layouts *******************************************

        //Wood
        woodPl = (ImageView) findViewById(R.id.woodPl);
        ajoutImage(woodPl,woodGl);

        // Stone
        stonesPl = (ImageView) findViewById(R.id.stonesPl);
        ajoutImage(stonesPl, stonesGl);

        // Metal
        metalPl = (ImageView) findViewById(R.id.metalPl);
        ajoutImage(metalPl, metalGl);

        // Metal fondu
        metalfPl = (ImageView) findViewById(R.id.metalfPl);
        ajoutImage(metalfPl,metalfGl);

        // Sulfur
        sulfurePl = (ImageView) findViewById(R.id.sulfurePl);
        ajoutImage(sulfurePl,sulfureGl);

        // Sulfur fondu
        sulfurefPl = (ImageView) findViewById(R.id.sulfurefPl);
        ajoutImage(sulfurefPl,sulfurefGl);

        // Cloth
        clothPl = (ImageView) findViewById(R.id.clothPl);
        ajoutImage(clothPl,clothGl);

        // Leather
        leatherPl = (ImageView) findViewById(R.id.leatherPl);
        ajoutImage(leatherPl,leatherGl);

        // Fat
        fatPl = (ImageView) findViewById(R.id.fatPl);
        ajoutImage(fatPl,fatGl);

        // Bone
        bonePl = (ImageView) findViewById(R.id.bonePl);
        ajoutImage(bonePl,boneGl);

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

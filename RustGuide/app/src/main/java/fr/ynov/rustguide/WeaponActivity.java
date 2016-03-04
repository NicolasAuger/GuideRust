package fr.ynov.rustguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Nicolas on 01/03/2016.
 */
public class WeaponActivity extends AppCompatActivity {

    private ImageView assaultRiflePl;
    private ImageView assaultRifleGl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weapon_activity);

        assaultRifleGl = (ImageView)findViewById(R.id.assaultRifleGl);

        assaultRiflePl = (ImageView)findViewById(R.id.assaultRiflePl);
        assaultRiflePl.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                changeVisibility(assaultRifleGl);
            }
        });
    }

    private void changeVisibility(ImageView view){
        if(view.getVisibility() == View.GONE){
            view.setVisibility(View.VISIBLE);
        }else {
            view.setVisibility(View.GONE);
        }
    }


}

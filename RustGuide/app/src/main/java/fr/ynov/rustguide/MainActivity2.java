package fr.ynov.rustguide;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity2 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView list;
    String[] articleTitles;
    String[] articleDescriptions;
    String[] buttonText;
    int [] images = {R.drawable.rustmenu, R.drawable.header, R.drawable.dev96, R.drawable.accueil2, R.drawable.entre_bouton,R.drawable.accueil3};
    private Button access_guide1;
    private Button access_guide2;
    private Button detail_article_button;
    private Button site_officiel_button;
    private Button acces_guide_complet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/


        Resources res = getResources();
        articleTitles = res.getStringArray(R.array.titles);
        articleDescriptions = res.getStringArray(R.array.descriptions);
        buttonText = res.getStringArray(R.array.buttons);

        list = (ListView)findViewById(R.id.listView);
        AdapterMain adapter = new AdapterMain(this, articleTitles,images,articleDescriptions,buttonText);
        list.setAdapter(adapter);




       /* access_guide1 = (Button)findViewById(R.id.access_guide1);
        access_guide1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity2.this, GuideVideoActivity.class);
                startActivity(i);
            }
        });

        access_guide2 = (Button)findViewById(R.id.access_guide2);
        access_guide2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity2.this, GuideVideoActivity2.class);
                startActivity(i);
            }
        });

        acces_guide_complet = (Button)findViewById(R.id.acces_guide_complet);
        acces_guide_complet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity2.this,GuideCompletActivity.class );
                startActivity(i);
            }
        });

        detail_article_button = (Button)findViewById(R.id.detail_article_button);
        detail_article_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity2.this,DevBlogWebActivity.class );
                startActivity(i);
            }
        });

        site_officiel_button = (Button)findViewById(R.id.site_officiel_button);
        site_officiel_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(MainActivity2.this, SiteOfficielActivity.class);
                startActivity(i);
            }
        });*/

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_weapon) {
            // Handle the weapon action
        } else if (id == R.id.nav_resource) {

        } else if (id == R.id.nav_ammunition) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_minimap) {

        } else if (id == R.id.nav_game_description) {

        } else if (id == R.id.nav_a_propos) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

class AdapterMain extends ArrayAdapter<String>{

    Context context;
    int [] images;
    String[] titleArray;
    String[] descriptionArray;
    String[] buttonArray;

    AdapterMain(Context c,String[] articleTitles, int imgs[], String[] desc, String[] button){
        super(c,R.layout.single_row_test,R.id.textView4, articleTitles);
        this.context = c;
        this.images = imgs;
        this.titleArray = articleTitles;
        this.descriptionArray = desc;
        this.buttonArray = button;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_row_test, parent, false);
        TextView myTitle = (TextView)row.findViewById(R.id.textView4);
        ImageView myImage =(ImageView)row.findViewById(R.id.imageView2);
        TextView myDescription = (TextView)row.findViewById(R.id.textView5);
        Button myButton = (Button)row.findViewById(R.id.button);

        myImage.setImageResource(images[position]);
        myTitle.setText(titleArray[position]);
        myDescription.setText(descriptionArray[position]);
        myButton.setText(buttonArray[position]);

        row.setBackgroundColor(Color.parseColor("#2a2a2a"));


        return  row;
    }
}




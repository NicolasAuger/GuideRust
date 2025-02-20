package fr.ynov.rustguide;

/**
 * Created by Nicolas on 01/02/2016.
 */


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

public class GuideVideoActivity2 extends YouTubeBaseActivity implements
        YouTubePlayer.OnInitializedListener{

    public static final String API_KEY = "AIzaSyDJL1iDB9vBFVq2dnunqQyhlOmhARM0oaw";
    public static final String VIDEO_ID = "vY7-NWYWlws";


    private YouTubePlayer youTubePlayer;
    private YouTubePlayerView youTubePlayerView;

    private TextView textVideoLog;
    private Button btnViewFullScreen;

    private static final int RQS_ErrorDialog = 1;

    private MyPlayerStateChangeListener myPlayerStateChangeListener;
    private MyPlaybackEventListener myPlaybackEventListener;


    String log = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_video_activity2);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar();*/

        youTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtubeplayerview);
        youTubePlayerView.initialize(API_KEY, this);

        textVideoLog = (TextView)findViewById(R.id.videolog);

        myPlayerStateChangeListener = new MyPlayerStateChangeListener();
        myPlaybackEventListener = new MyPlaybackEventListener();

        btnViewFullScreen = (Button)findViewById(R.id.btnviewfullscreen);
        btnViewFullScreen.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View arg0) {
                youTubePlayer.setFullscreen(true);
            }});
    }

    @Override
    public void onInitializationFailure(Provider provider,
                                        YouTubeInitializationResult result) {

        if (result.isUserRecoverableError()) {
            result.getErrorDialog(this, RQS_ErrorDialog).show();
        } else {
            Toast.makeText(this,
                    "YouTubePlayer.onInitializationFailure(): " + result.toString(),
                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player,
                                        boolean wasRestored) {

        youTubePlayer = player;


        Toast.makeText(getApplicationContext(),
                "YouTubePlayer.onInitializationSuccess()",
                Toast.LENGTH_LONG).show();

        youTubePlayer.setPlayerStateChangeListener(myPlayerStateChangeListener);
        youTubePlayer.setPlaybackEventListener(myPlaybackEventListener);


        if (!wasRestored) {
            player.cueVideo(VIDEO_ID);
        }

    }



    private final class MyPlayerStateChangeListener implements PlayerStateChangeListener {

        private void updateLog(String prompt){
            log +=  "MyPlayerStateChangeListener" + "\n" +
                    prompt + "\n\n=====";
            textVideoLog.setText(log);
        };

        @Override
        public void onAdStarted() {
            updateLog("onAdStarted()");
        }

        @Override
        public void onError(
                YouTubePlayer.ErrorReason arg0) {
            updateLog("onError(): " + arg0.toString());
        }

        @Override
        public void onLoaded(String arg0) {
            updateLog("onLoaded(): " + arg0);
        }

        @Override
        public void onLoading() {
            updateLog("onLoading()");
        }

        @Override
        public void onVideoEnded() {
            updateLog("onVideoEnded()");
        }

        @Override
        public void onVideoStarted() {
            updateLog("onVideoStarted()");
        }

    }

    private final class MyPlaybackEventListener implements PlaybackEventListener {

        private void updateLog(String prompt){
            log +=  "MyPlaybackEventListener" + "\n-" +
                    prompt + "\n\n=====";
            textVideoLog.setText(log);
        };

        @Override
        public void onBuffering(boolean arg0) {
            updateLog("onBuffering(): " + String.valueOf(arg0));
        }

        @Override
        public void onPaused() {
            updateLog("onPaused()");
        }

        @Override
        public void onPlaying() {
            updateLog("onPlaying()");
        }

        @Override
        public void onSeekTo(int arg0) {
            updateLog("onSeekTo(): " + String.valueOf(arg0));
        }

        @Override
        public void onStopped() {
            updateLog("onStopped()");
        }

    }

    public void OnBackButtonClick(View v) {
        if(v.getId() == R.id.buttonBack){
            Intent i = new Intent(GuideVideoActivity2.this, MainActivity.class);
            startActivity(i);
        }
    }
}

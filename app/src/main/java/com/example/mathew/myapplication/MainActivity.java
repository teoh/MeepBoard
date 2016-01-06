package com.example.mathew.myapplication;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout background;
    Button btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08;

    SoundPool sp;
    int meep01_soundID = 0;
    int meep02_soundID = 0;
    int meep03_soundID = 0;
    int meep04_soundID = 0;
    int meep05_soundID = 0;
    int meep06_soundID = 0;
    int meep07_soundID = 0;
    int meep08_soundID = 0;

    int meep01_streamID = 0;
    int meep02_streamID = 0;
    int meep03_streamID = 0;
    int meep04_streamID = 0;
    int meep05_streamID = 0;
    int meep06_streamID = 0;
    int meep07_streamID = 0;
    int meep08_streamID = 0;
    

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (RelativeLayout) findViewById(R.id.background);

        btn01 = (Button) findViewById(R.id.button01);
        btn02 = (Button) findViewById(R.id.button02);
        btn03 = (Button) findViewById(R.id.button03);
        btn04 = (Button) findViewById(R.id.button04);
        btn05 = (Button) findViewById(R.id.button05);
        btn06 = (Button) findViewById(R.id.button06);
        btn07 = (Button) findViewById(R.id.button07);
        btn08 = (Button) findViewById(R.id.button08);

        btn01.setOnTouchListener(ButtonTouchListener);
        btn02.setOnTouchListener(ButtonTouchListener);
        btn03.setOnTouchListener(ButtonTouchListener);
        btn04.setOnTouchListener(ButtonTouchListener);
        btn05.setOnTouchListener(ButtonTouchListener);
        btn06.setOnTouchListener(ButtonTouchListener);
        btn07.setOnTouchListener(ButtonTouchListener);
        btn08.setOnTouchListener(ButtonTouchListener);

        sp = new SoundPool(10,AudioManager.STREAM_MUSIC,0);

        meep01_soundID = sp.load(this,R.raw.meep01,1);
        meep02_soundID = sp.load(this,R.raw.meep02,1);
        meep03_soundID = sp.load(this,R.raw.meep03,1);
        meep04_soundID = sp.load(this,R.raw.meep04,1);
        meep05_soundID = sp.load(this,R.raw.meep05,1);
        meep06_soundID = sp.load(this,R.raw.meep06,1);
        meep07_soundID = sp.load(this,R.raw.meep07,1);
        meep08_soundID = sp.load(this,R.raw.meep08,1);


    }

    private View.OnTouchListener ButtonTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            int action = event.getAction();
            switch(v.getId()){
                // BUTTON 01
                case R.id.button01:
                    if(action == MotionEvent.ACTION_DOWN){
                        background.setBackgroundColor(Color.parseColor("#ff0000"));
                        meep01_streamID = sp.play(meep01_soundID,1,1,0,0,1);
                        return true;
                    }else if(action == MotionEvent.ACTION_UP){
                        background.setBackgroundColor(Color.parseColor("#ffffff"));
                        sp.stop(meep01_streamID);
                        return true;
                    }else{
                        return false;
                    }
                // BUTTON 2
                case  R.id.button02:
                    if(action == MotionEvent.ACTION_DOWN){
                        background.setBackgroundColor(Color.parseColor("#ff9900"));
                        meep02_streamID = sp.play(meep02_soundID,1,1,0,0,1);
                        return true;
                    }else if(action == MotionEvent.ACTION_UP){
                        background.setBackgroundColor(Color.parseColor("#ffffff"));
                        sp.stop(meep02_streamID);
                        return true;
                    }else{
                        return false;
                    }
                // BUTTON 03
                case  R.id.button03:
                    if(action == MotionEvent.ACTION_DOWN){
                        background.setBackgroundColor(Color.parseColor("#ffff00"));
                        meep03_streamID = sp.play(meep03_soundID,1,1,0,0,1);
                        return true;
                    }else if(action == MotionEvent.ACTION_UP){
                        background.setBackgroundColor(Color.parseColor("#ffffff"));
                        sp.stop(meep03_streamID);
                        return true;
                    }else{
                        return false;
                    }
                // BUTTON 04
                case  R.id.button04:
                    if(action == MotionEvent.ACTION_DOWN){
                        background.setBackgroundColor(Color.parseColor("#009900"));
                        meep04_streamID = sp.play(meep04_soundID,1,1,0,0,1);
                        return true;
                    }else if(action == MotionEvent.ACTION_UP){
                        background.setBackgroundColor(Color.parseColor("#ffffff"));
                        sp.stop(meep04_streamID);
                        return true;
                    }else{
                        return false;
                    }
                // BUTTON 05
                case  R.id.button05:
                    if(action == MotionEvent.ACTION_DOWN){
                        background.setBackgroundColor(Color.parseColor("#33ccff"));
                        meep05_streamID = sp.play(meep05_soundID,1,1,0,0,1);
                        return true;
                    }else if(action == MotionEvent.ACTION_UP){
                        background.setBackgroundColor(Color.parseColor("#ffffff"));
                        sp.stop(meep05_streamID);
                        return true;
                    }else{
                        return false;
                    }
                // BUTTON 06
                case  R.id.button06:
                    if(action == MotionEvent.ACTION_DOWN){
                        background.setBackgroundColor(Color.parseColor("#0000ff"));
                        meep06_streamID = sp.play(meep06_soundID,1,1,0,0,1);
                        return true;
                    }else if(action == MotionEvent.ACTION_UP){
                        background.setBackgroundColor(Color.parseColor("#ffffff"));
                        sp.stop(meep06_streamID);
                        return true;
                    }else{
                        return false;
                    }
                // BUTTON 07
                case  R.id.button07:
                    if(action == MotionEvent.ACTION_DOWN){
                        background.setBackgroundColor(Color.parseColor("#6600ff"));
                        meep07_streamID = sp.play(meep07_soundID,1,1,0,0,1);
                        return true;
                    }else if(action == MotionEvent.ACTION_UP){
                        background.setBackgroundColor(Color.parseColor("#ffffff"));
                        sp.stop(meep07_streamID);
                        return true;
                    }else{
                        return false;
                    }
                // BUTTON 08
                case  R.id.button08:
                    if(action == MotionEvent.ACTION_DOWN){
                        background.setBackgroundColor(Color.parseColor("#ff0000"));
                        meep08_streamID = sp.play(meep08_soundID,1,1,0,0,1);
                        return true;
                    }else if(action == MotionEvent.ACTION_UP){
                        background.setBackgroundColor(Color.parseColor("#ffffff"));
                        sp.stop(meep08_streamID);
                        return true;
                    }else{
                        return false;
                    }
                default:
                    return false;
            }
        }
    };

    private void stopPlaying(){
        if(mp != null){
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}

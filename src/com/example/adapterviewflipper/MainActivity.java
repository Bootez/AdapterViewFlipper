package com.example.adapterviewflipper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterViewFlipper;
import android.widget.Button;

public class MainActivity extends Activity {
    private AdapterViewFlipper flipper;
    private Button prev;
    private Button auto;
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        flipper = (AdapterViewFlipper)findViewById(R.id.flipper);
        prev = (Button)findViewById(R.id.prev);
        next = (Button)findViewById(R.id.next);
        auto = (Button)findViewById(R.id.auto);
        
        flipper.setAdapter(new MyAdapter(this));
        prev.setOnClickListener(new prevButtonListener());
        next.setOnClickListener(new nextButtonListener());
        auto.setOnClickListener(new autoButtonListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    class prevButtonListener implements OnClickListener {

        @Override
        public void onClick(View v) {
            flipper.showPrevious();
            flipper.stopFlipping();
        }
        
    }
    
    class nextButtonListener implements OnClickListener {

        @Override
        public void onClick(View v) {
            flipper.showNext();
            flipper.stopFlipping();
        }
        
    }
    
    class autoButtonListener implements OnClickListener {

        @Override
        public void onClick(View v) {
            if (flipper.isFlipping()) {
                flipper.stopFlipping();
            } else {
                flipper.startFlipping();
            }
        }
        
    }

}

/*
package nikita.melyanov.s301099466;

// Nikita Melyanov 301099466 Sec002

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NikitaAnimationActivity extends Activity {
    AnimationDrawable mframeAnimation = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dashboard);
        //
        // Handle Start Button
        final Button onButton = (Button) findViewById(R.id.buttonStart);
        onButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startAnimation();
            }
        });

        // Handle Stop Button
        final Button offButton = (Button) findViewById(R.id.buttonStop);
        offButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopAnimation();
            }

        });
    }

    //

    public  void startAnimation()
    {

        ImageView img = (ImageView)findViewById(R.id.imageViewBird);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.frame2);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.frame3);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.frame4);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.frame5);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.frame6);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.frame7);

        // Get the background, which has been compiled to an AnimationDrawable object.
        int reasonableDuration = 250;
        mframeAnimation = new AnimationDrawable();
        mframeAnimation.setOneShot(false);	// loop continuously
        mframeAnimation.addFrame(frame1, reasonableDuration);
        mframeAnimation.addFrame(frame2, reasonableDuration);
        mframeAnimation.addFrame(frame3, reasonableDuration);
        mframeAnimation.addFrame(frame4, reasonableDuration);
        mframeAnimation.addFrame(frame5, reasonableDuration);
        mframeAnimation.addFrame(frame6, reasonableDuration);
        mframeAnimation.addFrame(frame6, reasonableDuration);
        mframeAnimation.addFrame(frame6, reasonableDuration);

        img.setBackground(mframeAnimation);

        mframeAnimation.setVisible(true,true);
        mframeAnimation.start();
    }
    private void stopAnimation()
    {
        mframeAnimation.stop();
        mframeAnimation.setVisible(false,false);

    }

}
*/

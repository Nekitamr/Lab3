package nikita.melyanov.s301099466.ui.dashboard;

// Nikita Melyanov 301099466 Sec002

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import nikita.melyanov.s301099466.R;

public class MelyanovFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    AnimationDrawable mframeAnimation = null;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        //final TextView textView = root.findViewById(R.id.text_dashboard);

        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

                final Button onButton = root.findViewById(R.id.buttonStart);
                onButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        startAnimation();
                    }
                });
                // Handle Stop Button
                final Button offButton = root.findViewById(R.id.buttonStop);
                offButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        stopAnimation();
                    }
                });
            }
                public void startAnimation ()
                {
                    final ImageView img = root.findViewById(R.id.imageViewBird);

                    //ImageView img = (ImageView)findViewById(R.id.imageViewBird);

                    BitmapDrawable frame1 = (BitmapDrawable) getResources().getDrawable(R.drawable.frame2);
                    BitmapDrawable frame2 = (BitmapDrawable) getResources().getDrawable(R.drawable.frame3);
                    BitmapDrawable frame3 = (BitmapDrawable) getResources().getDrawable(R.drawable.frame4);
                    BitmapDrawable frame4 = (BitmapDrawable) getResources().getDrawable(R.drawable.frame5);
                    BitmapDrawable frame5 = (BitmapDrawable) getResources().getDrawable(R.drawable.frame6);
                    BitmapDrawable frame6 = (BitmapDrawable) getResources().getDrawable(R.drawable.frame7);

                    // Get the background, which has been compiled to an AnimationDrawable object.
                    int reasonableDuration = 250;
                    mframeAnimation = new AnimationDrawable();
                    mframeAnimation.setOneShot(false);    // loop continuously
                    mframeAnimation.addFrame(frame1, reasonableDuration);
                    mframeAnimation.addFrame(frame2, reasonableDuration);
                    mframeAnimation.addFrame(frame3, reasonableDuration);
                    mframeAnimation.addFrame(frame4, reasonableDuration);
                    mframeAnimation.addFrame(frame5, reasonableDuration);
                    mframeAnimation.addFrame(frame6, reasonableDuration);
                    mframeAnimation.addFrame(frame6, reasonableDuration);
                    mframeAnimation.addFrame(frame6, reasonableDuration);

                    img.setBackground(mframeAnimation);

                    mframeAnimation.setVisible(true, true);
                    mframeAnimation.start();
                }
            private void stopAnimation()
            {
                mframeAnimation.stop();
                mframeAnimation.setVisible(false,false);

            }

        });

        return root;
    };




}
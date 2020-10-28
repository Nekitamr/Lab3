package nikita.melyanov.s301099466.ui.home;

// Nikita Melyanov 301099466 Sec002

import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import nikita.melyanov.s301099466.R;

public class NikitaFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private Canvas mCanvas;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final View canvas = root.findViewById(R.id.view4);

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

                final Button onButton = root.findViewById(R.id.buttonClear);
                onButton.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        clearCanvas();
                    }
                });
            }
            public void clearCanvas() {
                mCanvas.drawColor(Color.WHITE);
            }
        });


        return root;
    }



}
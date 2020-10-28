package com.example.utsdwikisulthon.ui.home;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.utsdwikisulthon.MainActivity2;
import com.example.utsdwikisulthon.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    Integer counter = 0;
    TextView textView;
    Toolbar toolbar;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        textView = root.findViewById(R.id.textCounter);
        Button buttonTambah = root.findViewById(R.id.buttonTambah);
        Button buttonKurang = root.findViewById(R.id.buttonKurang);
        toolbar = root.findViewById(R.id.toolbar);

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter += 1;
                textView.setText(String.valueOf(counter));
            }
        });

        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter -= 1;
                textView.setText(String.valueOf(counter));
            }
        });

        return root;
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_reset :
//                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getContext());
//                builder.setCancelable(true);
//                builder.setMessage("Do you really want reset this counter");
//                builder.setPositiveButton("Reset", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        counter = 0;
//                        textView.setText(String.valueOf(counter));
//                    }
//                });
//                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                });
//                AlertDialog dialog = builder.create();
//                dialog.show();
//                return true;
//            case R.id.action_edit:
//                return true;
//        }
//        return  false;
//    }
}
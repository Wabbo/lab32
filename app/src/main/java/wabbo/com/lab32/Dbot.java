package wabbo.com.lab32;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Dbot extends Fragment {

    Button buttonShow;
    int x;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dbot, container, false);
        buttonShow = v.findViewById(R.id.showNum);
        //buttonShow.setText(String.valueOf(x));
        if (savedInstanceState == null) {
            buttonShow.setText("?");
        } else {
            x = savedInstanceState.getInt("x");
            buttonShow.setText(x+"");
        }

        return v;
    }


    public void shangData(int a) {
        x=a ;
        buttonShow.setText(String.valueOf(a));
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("x", x);
    }
}

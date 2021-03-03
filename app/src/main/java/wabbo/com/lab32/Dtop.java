package wabbo.com.lab32;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Dtop extends Fragment {

    int count;
    Button buttonCount;
    Kobry kobry;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState!=null){
            count = savedInstanceState.getInt("COUNT") ;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dtop, container, false);
        buttonCount = v.findViewById(R.id.count);
        kobry = (Kobry) getActivity();

        buttonCount.setOnClickListener(v1 -> {
            count++;
            kobry.comm(count);
        });
        return v;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        kobry = null ;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("COUNT", count);
    }

}
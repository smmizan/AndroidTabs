package me.smmizan.androidtabs;


import android.media.MediaPlayer;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentTwo extends Fragment {

    View view;
    MediaPlayer mediaPlayer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_two,container,false);

//        mediaPlayer= MediaPlayer.create(getActivity(),R.raw.hattimatimtim);
//        mediaPlayer.start();

        return view;
    }

}

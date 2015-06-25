package br.com.hisamoto.fragmentAndroid.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import br.com.hisamoto.fragmentAndroid.R;

/**
 * @author Leandro Shindi
 * @version 1.0 24/06/15.
 */
public class Hisamoto2Fragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragment2, null);

        return view;
    }
}
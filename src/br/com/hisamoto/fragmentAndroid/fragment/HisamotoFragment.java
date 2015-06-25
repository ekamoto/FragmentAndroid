package br.com.hisamoto.fragmentAndroid.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import br.com.hisamoto.fragmentAndroid.R;

/**
 * @author Leandro Shindi
 * @version 1.0 23/06/15.
 */
public class HisamotoFragment extends Fragment {

    private View view;
    private Button buttonCliqueAqui;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        Log.i("Hisamoto", "Setando fragment");

        // Vira objeto
        view = inflater.inflate(R.layout.layout_fragment, null);

        buttonCliqueAqui = (Button) view.findViewById(R.id.button_clique_aqui);

        buttonCliqueAqui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(container.getContext(), "Clicou no botão do fragment", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    public View getView() {

        return view;
    }
}
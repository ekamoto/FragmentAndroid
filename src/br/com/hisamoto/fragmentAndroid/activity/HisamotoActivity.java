package br.com.hisamoto.fragmentAndroid.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import br.com.hisamoto.fragmentAndroid.R;
import br.com.hisamoto.fragmentAndroid.fragment.Hisamoto2Fragment;
import br.com.hisamoto.fragmentAndroid.fragment.HisamotoFragment;

public class HisamotoActivity extends FragmentActivity {

    private Button btFrag1;
    private Button btFrag2;

    /**
     * É super importante adicionar suporte v4 e importar no Fragment e o FragmentActivity
     *
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hisamoto);

        Log.i("Hisamoto","Inicio activity principal");

        getComponentesView();
        setActionComponentes();
    }

    private void getComponentesView() {

        btFrag1 = (Button) findViewById(R.id.frag1);
        btFrag2 = (Button) findViewById(R.id.frag2);
    }

    private void setActionComponentes() {

        btFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment frag2 = getSupportFragmentManager().findFragmentByTag("frag2");
                Fragment frag1 = getSupportFragmentManager().findFragmentByTag("frag1");

                FragmentManager fm = getSupportFragmentManager();

//                if(frag1 == null) {

                Fragment hisamotoFragment = new HisamotoFragment();
                FragmentTransaction ft = fm.beginTransaction();

//                    if(frag2 != null) {

                //getSupportFragmentManager().beginTransaction().remove(frag2).commit();
                ft.replace(R.id.layout_direito, hisamotoFragment);
                ft.addToBackStack(null);
                ft.commit();
//                    } else if(frag1 == null) {
//
//                        ft.add(R.id.layout_direito, hisamotoFragment, "frag1");
//                        ft.commitAllowingStateLoss();
//                    }else {
//
//                        Toast.makeText(getApplicationContext(), "Fragmento 1 já existe", Toast.LENGTH_SHORT).show();
//                    }


//                } else {
//
//                    Toast.makeText(getApplicationContext(), "Fragmento 1 já existe", Toast.LENGTH_SHORT).show();
//                }
            }
        });

//        btFrag2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Fragment fragment = getSupportFragmentManager().findFragmentByTag("frag1");
//
//                if(fragment != null) {
//
//                    getSupportFragmentManager().beginTransaction().remove(fragment).commit();
//                }
//
//                fragment = getSupportFragmentManager().findFragmentByTag("frag2");
//
//                if(fragment==null) {
//
//                    FragmentManager fm = getSupportFragmentManager();
//
//                    Hisamoto2Fragment frag2 = new Hisamoto2Fragment();
//                    FragmentTransaction ft = fm.beginTransaction();
//
//                    ft.add(R.id.layout_direito, frag2, "frag2");
//                    ft.commitAllowingStateLoss();
//                } else {
//
//                    Toast.makeText(getApplicationContext(), "Fragmento 2 já existe", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
        btFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment frag2 = getSupportFragmentManager().findFragmentByTag("frag2");
                Fragment frag1 = getSupportFragmentManager().findFragmentByTag("frag1");

                FragmentManager fm = getSupportFragmentManager();

//                if(frag2 == null) {

                Fragment hisamoto2Fragment = new Hisamoto2Fragment();
                FragmentTransaction ft = fm.beginTransaction();

//                    if(frag1 != null) {

                //getSupportFragmentManager().beginTransaction().remove(frag2).commit();
                ft.replace(R.id.layout_direito, hisamoto2Fragment);
                ft.addToBackStack(null);
                ft.commit();
//                    } else if(frag2 == null) {
//
//
//                        ft.add(R.id.layout_direito, hisamoto2Fragment, "frag2");
//                        ft.commitAllowingStateLoss();
//                    } else {
//
//                        Toast.makeText(getApplicationContext(), "Fragmento 2 já existe", Toast.LENGTH_SHORT).show();
//                    }


//                } else {
//
//                    Toast.makeText(getApplicationContext(), "Fragmento 2 já existe", Toast.LENGTH_SHORT).show();
//                }
            }
        });
    }

    private void setComponent(Fragment frag) {

        Fragment fragment = getSupportFragmentManager().findFragmentByTag("frag2");

        if(fragment != null) {

            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        }

        fragment = getSupportFragmentManager().findFragmentByTag("frag1");

        if(fragment == null) {

            FragmentManager fm = getSupportFragmentManager();

            FragmentTransaction ft = fm.beginTransaction();

            ft.add(R.id.layout_direito, frag, "frag1");
            ft.commitAllowingStateLoss();
        }

    }
}
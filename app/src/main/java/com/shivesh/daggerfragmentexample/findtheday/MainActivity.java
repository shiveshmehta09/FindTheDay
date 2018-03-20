package com.shivesh.daggerfragmentexample.findtheday;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Shivesh on 1/27/2018.
 */
public class MainActivity extends AppCompatActivity implements DayFragment.OnFragmentInteractionListener {
    @BindView(R.id.etIndex)
    EditText etIndex;
    @BindView(R.id.btnView)
    Button btnView;

    private int input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @OnClick(R.id.btnView)
    public void onViewClicked() {

        if (!etIndex.getText().toString().equals("")) {
            input = Integer.parseInt(etIndex.getText().toString());

            FragmentManager fragmentManager = getSupportFragmentManager();
            DayFragment dayFragment = DayFragment.newInstance(input);
            dayFragment.show(fragmentManager, "Sample Fragment");
        }
    }

}

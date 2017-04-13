package com.frame.huxh.huxhrxretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.commont_rxretrofit)
    Button mCommontRxretrofit;
    @BindView(R.id.one_rxretrofit)
    Button mOneRxretrofit;
    @BindView(R.id.two_rxretrofit)
    Button mTwoRxretrofit;
    @BindView(R.id.three_rxretrofit)
    Button mThreeRxretrofit;
    @BindView(R.id.four_rxretrofit)
    Button mFourRxretrofit;
    @BindView(R.id.fifth_rxretrofit)
    Button mFifthRxretrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.commont_rxretrofit, R.id.one_rxretrofit, R.id.two_rxretrofit, R.id.three_rxretrofit, R.id.four_rxretrofit, R.id.fifth_rxretrofit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.commont_rxretrofit:
                break;
            case R.id.one_rxretrofit:
                break;
            case R.id.two_rxretrofit:
                break;
            case R.id.three_rxretrofit:
                break;
            case R.id.four_rxretrofit:
                break;
            case R.id.fifth_rxretrofit:
                break;
        }
    }
}

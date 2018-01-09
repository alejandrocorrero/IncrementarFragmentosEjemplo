package es.saladillo.alejandro.incrementarfragmentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements IncrementFragment.callback {
    private static final String TAG_INCREMENT_FRAGMENT = "TAG_INCREMENT_FRAGMENT";
    private static final String TAG_RESULT_FRAGMENT = "TAG_RESULT_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportFragmentManager().findFragmentByTag(TAG_INCREMENT_FRAGMENT) == null) {
            FragmentUtils.replaceFragment(getSupportFragmentManager(), R.id.frameUp,
                    new IncrementFragment(), TAG_INCREMENT_FRAGMENT);
        }
        if (getSupportFragmentManager().findFragmentByTag(TAG_RESULT_FRAGMENT) == null) {
            FragmentUtils.replaceFragment(getSupportFragmentManager(), R.id.frameDown,
                    new ResultFragment(), TAG_RESULT_FRAGMENT);
        }


    }

    @Override
    public void onButtonPress() {
        ((ResultFragment) getSupportFragmentManager().findFragmentByTag(TAG_RESULT_FRAGMENT)).increment();
    }
}

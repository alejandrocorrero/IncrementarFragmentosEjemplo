package es.saladillo.alejandro.incrementarfragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResultFragment extends Fragment {

    int cont=0;
    private TextView txtResult;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setRetainInstance(true);
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_result, container, false);
        txtResult=view.findViewById(R.id.txtResult);
        txtResult.setText(String.valueOf(cont));

        return view;
    }


    public void increment() {
        txtResult.setText(String.valueOf(++cont));
    }

}

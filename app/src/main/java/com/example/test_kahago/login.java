package com.example.test_kahago;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class login extends Fragment {

    public login() {

    }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.login_form, container, false);
        return view;
    }
}

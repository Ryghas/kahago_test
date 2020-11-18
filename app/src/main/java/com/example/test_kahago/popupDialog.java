package com.example.test_kahago;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class popupDialog extends DialogFragment {

    public popupDialog() {

    }

    private TabLayout tab;
    private SectionsPagerAdapter selection;
    private ViewPager viewPager;

    @Override
    public Dialog onCreateDialog(final Bundle saveInstanceState) {
        Dialog dialog = super.onCreateDialog(saveInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Window window = dialog.getWindow();
        window.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        return dialog;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.popup_form,container,false);

        selection = new SectionsPagerAdapter(getChildFragmentManager());

        tab = view.findViewById(R.id.sliding_tabs);
        viewPager = view.findViewById(R.id.viewpager);
        viewPager.setAdapter(selection);
        tab.setupWithViewPager(viewPager);

        return view;
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter
    {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                login login = new login();
                return login;
            }
           else if (position == 1) {
                daftar daftar = new daftar();
                return daftar;
            }
           return null;
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Login";
                case 1:
                    return "Daftar";
            }
            return null;
        }
    }
}

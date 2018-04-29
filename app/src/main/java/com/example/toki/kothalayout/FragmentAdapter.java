package com.example.toki.kothalayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentPagerAdapter {

    Context context;

    ArrayList<String> list=new ArrayList<>();
    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;

        list.add( MainActivity.read);
        list.add( MainActivity.severe);
        list.add( MainActivity.mortality);
       // Toast.makeText(context, String.valueOf( WorkingActivity.read), Toast.LENGTH_SHORT).show();*/
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1:
                ChatFragment chatFragment=new ChatFragment();
                return chatFragment;
            case 0:
                ContactFragment contactFragment=new ContactFragment();
                return contactFragment;
            case  2:
                HistoryFragment historyFragment=new HistoryFragment();
                return historyFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public  String getPageTitle(int position){
        return list.get(position);
    }

}

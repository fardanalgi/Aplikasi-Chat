package com.example.asus.chat.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.chat.Contact;
import com.example.asus.chat.R;
import com.example.asus.chat.RecyclearViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {

    View v;

    private RecyclerView myrecyclearview;
    private List<Contact> lstContact;

    public FragmentContact() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.contact_fragment, container, false);
        myrecyclearview = (RecyclerView) v.findViewById(R.id.contact_recyclearview);
        RecyclearViewAdapter recyclearAdapter = new RecyclearViewAdapter(getContext(), lstContact);
        myrecyclearview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclearview.setAdapter(recyclearAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Angel Karamoy", "08121373737", R.drawable.angel1));
        lstContact.add(new Contact("Ariana Grande", "08878767868", R.drawable.ariana1));
        lstContact.add(new Contact("Ariel Tatum", "087786786858", R.drawable.ariel1));
        lstContact.add(new Contact("Fardan Alghipari", "081315338398", R.drawable.fardan1));
        lstContact.add(new Contact("Pevita Pearce", "0813153767866", R.drawable.pevita1));
        lstContact.add(new Contact("Thea Bernice", "0813187897689", R.drawable.thea1));
        lstContact.add(new Contact("Angel Karamoy", "08121373737", R.drawable.angel1));
        lstContact.add(new Contact("Ariana Grande", "08878767868", R.drawable.ariana1));
        lstContact.add(new Contact("Ariel Tatum", "087786786858", R.drawable.ariel1));
        lstContact.add(new Contact("Angel Karamoy", "08121373737", R.drawable.angel1));
        lstContact.add(new Contact("Ariana Grande", "08878767868", R.drawable.ariana1));
        lstContact.add(new Contact("Ariel Tatum", "087786786858", R.drawable.ariel1));
        lstContact.add(new Contact("Ariel Tatum", "087786786858", R.drawable.ariel1));
        lstContact.add(new Contact("Pevita Pearce", "0813153767866", R.drawable.pevita1));
        lstContact.add(new Contact("Thea Bernice", "0813187897689", R.drawable.thea1));
        lstContact.add(new Contact("Angel Karamoy", "08121373737", R.drawable.angel1));
        lstContact.add(new Contact("Ariana Grande", "08878767868", R.drawable.ariana1));
        lstContact.add(new Contact("Ariel Tatum", "087786786858", R.drawable.ariel1));
        lstContact.add(new Contact("Angel Karamoy", "08121373737", R.drawable.angel1));
        lstContact.add(new Contact("Ariana Grande", "08878767868", R.drawable.ariana1));
        lstContact.add(new Contact("Ariel Tatum", "087786786858", R.drawable.ariel1));


    }
}

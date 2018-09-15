package com.app.paul.guidetour.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.paul.guidetour.adapter.AdapterRecyclerView;
import com.app.paul.guidetour.R;
import com.app.paul.guidetour.logic.Repository;

public class FragmentCofee extends MyBaseFragment {


    public FragmentCofee() {
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_places_es, container,false);
        Repository repository = new Repository();
        mList = repository.getCoffee();

        RecyclerView mRecyclerCofee = v.findViewById(R.id.recycler_es);
        adapterRecyclerView = new AdapterRecyclerView(mList, this);
        mRecyclerCofee.setAdapter(adapterRecyclerView);
        mRecyclerCofee.setLayoutManager(new LinearLayoutManager(getContext()));

        setHasOptionsMenu(true);

        return v;
    }

}

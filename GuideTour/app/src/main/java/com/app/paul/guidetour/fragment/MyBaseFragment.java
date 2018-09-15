package com.app.paul.guidetour.fragment;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;

import com.app.paul.guidetour.activity.ActivityShowDetail;
import com.app.paul.guidetour.adapter.AdapterRecyclerView;
import com.app.paul.guidetour.logic.PlacesES;
import com.app.paul.guidetour.R;

import java.util.ArrayList;
import java.util.List;

import static com.app.paul.guidetour.activity.ActivityShowDetail.ITEM_FROM_RECYCLER_PLACES;
import static com.app.paul.guidetour.activity.ActivityShowDetail.LIST_FROM_RECYCLER;

/**
 * Base fragment for all the tabs
 */
public class MyBaseFragment extends Fragment implements AdapterRecyclerView.OnItemClickListener{

    private SearchView searchView;
    AdapterRecyclerView adapterRecyclerView;
    List<PlacesES> mList;

    /**
     * Searchview implementation
     * @param menu menu from the view
     * @param inflater view inflated
     */
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem searchItem = menu.findItem(R.id.search);

        if (searchItem != null) {
            searchView = (SearchView) searchItem.getActionView();
        }
        if (searchView != null) {

            SearchView.OnQueryTextListener queryTextListener = new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextChange(String newText) {
                    adapterRecyclerView.getFilter().filter(newText);
                    return true;
                }

                @Override
                public boolean onQueryTextSubmit(String query) {
                    adapterRecyclerView.getFilter().filter(query);
                    return true;
                }
            };
            searchView.setOnQueryTextListener(queryTextListener);
        }
    }


    /**
     * Action to do on click of item from recycler
     * @param position position of the item in recycler
     */
    @Override
    public void onItemClick(Integer position) {
        Intent intent = new Intent(getContext(), ActivityShowDetail.class);
        intent.putExtra(ITEM_FROM_RECYCLER_PLACES,position);
        intent.putParcelableArrayListExtra(LIST_FROM_RECYCLER, (ArrayList<? extends Parcelable>) mList);
        startActivity(intent);
    }
}

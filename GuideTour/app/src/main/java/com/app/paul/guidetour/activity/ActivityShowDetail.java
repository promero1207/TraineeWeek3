package com.app.paul.guidetour.activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.app.paul.guidetour.adapter.AdapterRecyclerGallery;
import com.app.paul.guidetour.logic.PlacesES;
import com.app.paul.guidetour.R;

import java.util.List;

public class ActivityShowDetail extends AppCompatActivity {
    //Constants for reading intent data
    public static final String ITEM_FROM_RECYCLER_PLACES = "ITEM_FROM_RECYCLER_PLACES";
    public static final String LIST_FROM_RECYCLER = "LIST_FROM_RECYCLER";
    public static final String WEB_EXTRA = "WEB_EXTRA";
    //Views
    private TextView mAddress;
    private TextView mWebSite;
    private TextView mPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        Intent showIntent = getIntent();
        int item = showIntent.getIntExtra(ITEM_FROM_RECYCLER_PLACES,0);

        List<PlacesES> listOfRecycler = showIntent.getParcelableArrayListExtra(LIST_FROM_RECYCLER);

        TextView mName = findViewById(R.id.text_name_show);
        mAddress = findViewById(R.id.text_address_show);
        mWebSite = findViewById(R.id.text_mail_show);
        mPhone = findViewById(R.id.text_phone_show);
        TextView mCity = findViewById(R.id.text_city_show);
        RecyclerView mRecycler = findViewById(R.id.recycler_gallery);

        mName.setText(listOfRecycler.get(item).getName());
        mAddress.setText(listOfRecycler.get(item).getAddress());

        mWebSite.setText(listOfRecycler.get(item).getWeb());

        mPhone.setText(listOfRecycler.get(item).getPhone());
        mCity.setText(listOfRecycler.get(item).getCity());

        AdapterRecyclerGallery adapter = new AdapterRecyclerGallery(this, listOfRecycler.get(item).getImg());
        mRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        mRecycler.setAdapter(adapter);

        mPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialPhoneNumber(mPhone.getText().toString());
            }
        });

        mWebSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mWebSite.getText().toString().equals("NO WEB PAGE")) {
                    Intent intent = new Intent(ActivityShowDetail.this, WebViewContent.class);
                    intent.putExtra(WEB_EXTRA, mWebSite.getText().toString());
                    startActivity(intent);
                }
            }
        });

        mAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMap(Uri.parse("geo:0,0?q=" + mAddress.getText().toString()));
            }
        });


        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    /**
     * Intent for make a phone call
     * @param phoneNumber phone number in String format
     */
    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    /**
     * Intent to open navigation
     * @param geoLocation Address to be searched on navigation
     */
    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW, geoLocation);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Method for toolbar back arrow
     * @param item item in toolbar
     * @return item selected
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}

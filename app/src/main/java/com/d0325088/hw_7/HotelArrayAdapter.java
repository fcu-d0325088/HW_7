package com.d0325088.hw_7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 2017/6/6.
 */

public class HotelArrayAdapter extends ArrayAdapter<Hotel> {
    Context context;
    public HotelArrayAdapter(Context context, List<Hotel> items) {
        super(context, 0, items);
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if (convertView == null)
            itemlayout = (LinearLayout) inflater.inflate(R.layout.hotel_item, null);
        else {
            itemlayout = (LinearLayout) convertView;
        }
        Hotel item = (Hotel) getItem(position);
        TextView tvName = (TextView) itemlayout.findViewById(R.id.tv_name);
        tvName.setText(item.getName());
        TextView tvAddress = (TextView) itemlayout.findViewById(R.id.tv_address);
        tvAddress.setText(item.getAddress());
        ImageView ivHotel = (ImageView) itemlayout.findViewById(R.id.iv_hotel);
        ivHotel.setImageBitmap(item.getImgUrl());
        return itemlayout;
    }

}

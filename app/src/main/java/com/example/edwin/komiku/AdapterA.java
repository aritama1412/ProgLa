package com.example.edwin.komiku;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Edwin on 25/05/2018.
 */

public class AdapterA extends BaseAdapter {

    private static LayoutInflater inflater = null;

    Context konteks;
    String[][] data;
    int dataImg;

    public AdapterA(Context konekto, String[][] data, int GambarList){
        this.konteks = konekto;
        this.data = data;
        this.dataImg = GambarList;
        inflater = (LayoutInflater)konekto.getSystemService(konekto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        final View vista = inflater.inflate(R.layout.elemen_list, null);
        TextView judul = (TextView) vista.findViewById(R.id.tv_judul);
        TextView pengarang = (TextView) vista.findViewById(R.id.tv_Pengarang);
        ImageView gambarsampul = (ImageView) vista.findViewById(R.id.iv_GambarSampul);

        judul.setText(data[1][0]);
        pengarang.setText(data[1][1]);

        gambarsampul.setTag(i);

//        gambarsampul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent Gambarnya = new Intent(konteks, Gambarnya.class);
//                Gambarnya.putExtra("IMG", dataImg[(Integer)v.getTag()]);
//                konteks.startActivities(Gambarnya);
//            }
//        };
        return vista;
    }

    @Override
    public int getCount() {
        return dataImg;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


}

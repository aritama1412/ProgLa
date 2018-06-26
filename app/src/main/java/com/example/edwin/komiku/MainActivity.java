package com.example.edwin.komiku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_flipper;
    ListView lv_komik;

    String[][] data = {
//            {"judul", "pengarang", "tahun", "10"},
            {"Naruto Vol.1", "Masashi Kishimoto", "2003", "10"},
            {"Naruto Vol.2", "Masashi Kishimoto", "2004", "7"},
            {"Naruto Vol.3", "Masashi Kishimoto", "2005", "8"},
            {"Naruto Vol.4", "Masashi Kishimoto", "2006", "9"},
            {"Naruto Vol.5", "Masashi Kishimoto", "2007", "5"},
            {"Naruto Vol.6", "Masashi Kishimoto", "2008", "8"},
            {"Naruto Vol.7", "Masashi Kishimoto", "2009", "10"},
    };

    int[] dataImg = {R.drawable.naruto1,R.drawable.naruto2,R.drawable.naruto3,R.drawable.naruto4, R.drawable.naruto5, R.drawable.naruto6, R.drawable.naruto7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //slidder / flipper
        int images[] = {R.drawable.slidder1, R.drawable.slidder2, R.drawable.slidder3};
        //list komik
        lv_komik = (ListView)findViewById(R.id.lv_komik);
//        lv_komik.setAdapter(new AdapterA(this, data, dataImg));


        v_flipper.findViewById(R.id.v_flipper);

        //forloop
        for (int image: images){
            flipperImages(image);
        }

    }

    public void flipperImages(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000); //3 detik
        v_flipper.setAutoStart(true);
        //animasi
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }


}

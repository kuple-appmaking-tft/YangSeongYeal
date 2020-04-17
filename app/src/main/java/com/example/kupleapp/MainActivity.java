package com.example.kupleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kupleapp.Model.SliderItem;
import com.google.android.material.tabs.TabLayout;
import com.like.LikeButton;
import com.like.OnAnimationEndListener;
import com.like.OnLikeListener;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity  {
    ImageButton go;
    LikeButton likeButton;
    LikeButton dislikeButton;
    SliderView sliderView;
    private SliderAdapterExample adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // TextView.setText(Html.fromHtml(getResources.getString(R.string.whree)));



        go=findViewById(R.id.imageButton1);

        go.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
        /////////////이미지 슬라이딩
        sliderView = findViewById(R.id.imageSlider);

        adapter = new SliderAdapterExample(this);
        sliderView.setSliderAdapter(adapter);

        sliderView.setIndicatorAnimation(IndicatorAnimations.THIN_WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(false);

       ////////
        ///이미지 넣는작업
        int[] img={R.drawable.one,R.drawable.two,R.drawable.three};
        for(int i=0;i<3;i++){
            SliderItem sliderItem = new SliderItem();
            sliderItem.setDescription("Slider Item"+i);
            sliderItem.setImageUrl(img[i]);
           // sliderItemList.add(sliderItem);
            adapter.addItem(sliderItem);
        }
        //////
        ///////////밑줄
        TextView t=(TextView)findViewById(R.id.nameOfcomunity);
        t.setText(Html.fromHtml("<u><b>게시판이름찾기</b></u>"));
        TextView t1=(TextView)findViewById(R.id.nameOfsub);
        t1.setText(Html.fromHtml("<b>가나다라마바사아자차카파하가나다라</b>"));
        ////좋아요버튼
        //버튼클릭하면 실행


        likeButton=findViewById(R.id.thumb_up);
        likeButton.setOnLikeListener(new OnLikeListener() {
            TextView good=(TextView) findViewById(R.id.number_good);
            int goodnum=0;
            @Override
            public void liked(LikeButton likeButton) {
                goodnum++;
                good.setText(""+goodnum);
            }

            @Override
            public void unLiked(LikeButton likeButton) {
                goodnum--;
                good.setText(""+goodnum);
            }
        });
        dislikeButton=findViewById(R.id.thumb_down);
        dislikeButton.setOnLikeListener(new OnLikeListener() {
            TextView bed=(TextView) findViewById(R.id.number_bed);
            int bednum=0;
            @Override
            public void liked(LikeButton likeButton) {
                bednum++;
                bed.setText(""+bednum);
            }

            @Override
            public void unLiked(LikeButton likeButton) {
                bednum--;
                bed.setText(""+bednum);
            }
        });
////////////////////////////////////////////////



    }




}

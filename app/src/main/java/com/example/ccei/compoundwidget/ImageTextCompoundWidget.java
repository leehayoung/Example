package com.example.ccei.compoundwidget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ccei on 2016-07-06.
 */
public class ImageTextCompoundWidget extends LinearLayout {

    /*인플레이션이 되었을 때 속성값이 AttributeSet으로 들어감
    * defStyleAttr 스타일값으로 준 속성이 들어감
    * 속성들의 집합 관리 , 해쉬테이블*/

    Context context;
    ImageView imageIcon;
    TextView textTitle;
    ImageTextData data;

    public ImageTextCompoundWidget(Context context) {
        super(context);
        this.context = context;
        init(null);
    }

    public ImageTextCompoundWidget(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);//초기화
    }

    public ImageTextCompoundWidget(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init(attrs);
    }

    //속성갑을 파라미터러 주고 초기화하는 메소드
    private void init(AttributeSet attrs) {
        this.setOrientation(HORIZONTAL);//리니어레이아웃을 상속받았기 때문에 그냥 HORIZONTAL로 사용 가능

        //인플레이션, 리사이클러뷰 사용할때는 세번째 파라미터 보통 this로 지금은 리니어레이아웃을 붙이는 거라서 this
        View root = inflate(context, R.layout.image_view_compound_widget, this);
        findViewById(R.id.image_icon);
        imageIcon = (ImageView) root.findViewById(R.id.image_icon); //엑티비티에서 찾는게 아니라 리니어레이아웃에서 찾음
        textTitle = (TextView) root.findViewById(R.id.text_title);
    }


    public void setImageText(ImageTextData data) {
        this.data = data;
        imageIcon.setImageResource(data.iconID);
        textTitle.setText(data.title);
    }


    public void setTextTitle(String title) {
        if (data == null) {
            data = new ImageTextData();
        }
        data.title = title;
    }
}

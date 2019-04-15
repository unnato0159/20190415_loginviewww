package com.example.a20190415_loginview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView headLineTxt;
    TextView checkBoxTxt1;
    TextView checkBoxTxt2;
    TextView checkBoxTxt3;
    TextView checkBoxTxt4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headLineTxt = findViewById(R.id.headLineTxt);
        checkBoxTxt1 = findViewById(R.id.checkBoxTxt1);
        checkBoxTxt2 = findViewById(R.id.checkBoxTxt2);
        checkBoxTxt3 = findViewById(R.id.checkBoxTxt3);
        checkBoxTxt4 = findViewById(R.id.checkBoxTxt4);

        /*String str = "<span style='#7848d5'>●</span>";
        SpannableStringBuilder ssb = new SpannableStringBuilder(str);
        String htmlText = str.replace("span style=\"color:","font color=\"").replace("</span>","</font>");

        ssb.setSpan(new ForegroundColorSpan(Color.parseColor("#7848d5")),0,str.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);*/

        headLineTxt.setText(Html.fromHtml("<b>카카오 계정으로 회원가입</b>하시면 지상파 포함 50여개 LIVE 채널을 <b>무료</b>로 즐길 수 있어요<font color='#7848d5'>●</font>"));
        checkBoxTxt1.setText(Html.fromHtml("서비스 이용약관<font color='#7848d5'>(필수)</font>"));
        checkBoxTxt2.setText(Html.fromHtml("개인정보처리방침<font color='#7848d5'>(필수)</font>"));
        checkBoxTxt3.setText(Html.fromHtml("유료상품 이용약관<font color='#7848d5'>(필수)</font"));
        checkBoxTxt4.setText(Html.fromHtml("이벤트 마케팅 수신동의(선택)"));


    }
}

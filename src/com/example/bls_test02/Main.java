package com.example.bls_test02;


import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidbangladesh.bengali.support.BengaliUnicodeString;

public class Main extends Activity {
String text;
TextView tview;
Button button;
CheckBox checkbox;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        tview = (TextView)findViewById(R.id.test_textview);
        button = (Button)findViewById(R.id.test_button);
        checkbox = (CheckBox)findViewById(R.id.test_checkbox);
		try{
			
			//read from file
			
//			Resources res = getResources();
//			InputStream in_s = res.openRawResource(R.raw.bangladoc);
//			byte[] b = new byte[in_s.available()];
//			in_s.read(b);
//			text = new String(b);
			
			
			text = "নিঝুম দ্বীপে ৯টি গুচ্ছ গ্রাম রয়েছে। এই গুচ্ছ গ্রাম ছাড়াও বিভিন্ন জায়গায় ছড়িয়ে ছিটিয়ে রয়েছে ছোটখাটো ঝুপড়ি ঘর।";
//			tview.setText("");
			BengaliUnicodeString.getBengaliUTF(Main.this,text,tview);
			
			text = "আইনশৃঙ্খলা পরিস্থিতি law and order condition";
//			text = BengaliUnicodeString.getBengaliUTF(text);
			BengaliUnicodeString.getBengaliUTF(Main.this,text,button);
			
			text ="বনবিভাগ নিঝুম দ্বীপের উন্নয়নের জন্য বিভিন্ন পদক্ষেপ নিয়েছেন, বন্যপ্রাণী"
//			text = BengaliUnicodeString.getBengaliUTF(text);
			BengaliUnicodeString.getBengaliUTF(Main.this,null,checkbox);
			
			char[] t = text.toCharArray();
			for(int i=0;i<text.length();i++){
    			Log.d("TEXT",Integer.toHexString(t[i])+"  -> "+t[i]);
//    			text+=nativelib.shapeText(temp[i]); 
//    			text2+=gsub.text[i];
    		}
		}catch(Exception e){
			
		}
    }

}

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
			
			
			text = "তত্ত্বাবধায়ক সরকারের পুরো দুই বছর দেশের আইনশৃঙ্খলা পরিস্থিতি ভালো ছিল। বিচ্ছিন্ন কিছু ঘটনা ছাড়া দেশে বড় ধরনের কোনো সহিংস ঘটনা সে সময় ঘটেনি। সেই অবস্থা ধরে রাখার চ্যালেঞ্জ নিয়ে শুরু হয় আওয়ামী লীগের নেতৃত্বাধীন মহাজোট সরকারের যাত্রা।";
//			tview.setText("");
			BengaliUnicodeString.getBengaliUTF(Main.this,text,tview);
			
			text = "আইনশৃঙ্খলা পরিস্থিতি law and order condition";
//			text = BengaliUnicodeString.getBengaliUTF(text);
			BengaliUnicodeString.getBengaliUTF(Main.this,text,button);
			
			text = "‘ক্রসফায়ার-এনকাউন্টার’-এর নামে বিচারবহির্ভূত হত্যাকাণ্ড বন্ধ হয়নি। cross-fire, tishum tishum :D";
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

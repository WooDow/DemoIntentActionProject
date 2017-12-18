package tw.leonchen.demointentaction;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
 * Intent 用法
 * 顯示網頁
 * Uri uri = Uri.parse("http://google.com");
 * 顯示地圖
 * Uri uri = Uri.parse("geo:38.899533,-77.036476");
 * 路徑規劃
 * Uri uri = Uri.parse("http://maps.google.com/maps?f=d&saddr=startLat%20startLng&daddr=endLat%20endLng&hl=en");
 * 撥打電話
 * 1.叫出撥號程式
        Uri uri = Uri.parse("tel:0800000123");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);
   2.直接打電話出去
        Uri uri = Uri.parse("tel:0800000123");
        Intent it = new Intent(Intent.ACTION_CALL, uri);
        startActivity(it);
        用這個，要在 AndroidManifest.xml 中，加上
        <uses-permission id="android.permission.CALL_PHONE" />
 * ......還有一大堆
 * intent git test
 */

public class DemoIntentActionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_intent_action);

        //Uri uri = Uri.parse("http://tw.yahoo.com");
        Uri uri = Uri.parse("geo:29.979436, 31.134228");
        //ACTION_VIEW: Display the data to the user.
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}

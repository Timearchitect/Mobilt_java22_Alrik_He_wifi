package se.gritacademy.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectivityManager  cm =  (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();

        WifiManager wm = (WifiManager) getSystemService(WIFI_SERVICE);
        WifiInfo wi= wm.getConnectionInfo();

        Log.d("alrik", String.valueOf(ni));
        Log.d("alrik", String.valueOf(ni));
        Log.d("alrik", String.valueOf(ni));
        Log.d("alrik", String.valueOf(ni));


        String foo = "Hejsan";
        Test alrik = new Test();
        TextView text2 = findViewById(R.id.text1);
        text2.setText("ALRIk He heter jag");
        Button btn = findViewById(R.id.button);
        /*ctrl + alt + l document format*/
          btn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(MainActivity.this, "Hello", Toast.LENGTH_SHORT).show();
              }
          });

        foo = "Tjenare";
        foo = "yo";
        foo = "Hej";

        /* system.out.println(); funkar ej*/
        Log.d("Alrik", "funkar detta?");
        Toast.makeText(this, "Hello World!!", Toast.LENGTH_LONG).show();
    }
}
package ir.msamandari.implicitintentreceiver;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();

        //Get the Intent data, Intent data is always a URI object.
        Uri uri = intent.getData();

        //Check to see if data is not empty.
        if(uri!=null){
            String uri_string= getString(R.string.uri_label) + uri.toString();
            TextView textView=findViewById(R.id.text_uri_message);
            textView.setText(uri_string);

        }
    }
}

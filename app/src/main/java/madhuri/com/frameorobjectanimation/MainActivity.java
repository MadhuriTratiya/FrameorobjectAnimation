package madhuri.com.frameorobjectanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable wifianimation;

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //To start Animation
        wifianimation.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imageview);
        //Set Image in imageview
        imageView.setBackgroundResource(R.drawable.wifianimation);

        //wifi animation get imageview object or image
        wifianimation = (AnimationDrawable) imageView.getBackground();


    }
}
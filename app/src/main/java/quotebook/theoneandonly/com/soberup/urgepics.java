package quotebook.theoneandonly.com.soberup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import static quotebook.theoneandonly.com.soberup.R.id.number;

public class urgepics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final int[] addictionArray = {R.drawable.addictionquote1,
                R.drawable.addictionquote2,
                R.drawable.addictionquote3,
                R.drawable.addictionquote4,
                R.drawable.addictionquote5,
                R.drawable.addictionquote6,
                R.drawable.addictionquote7,
                R.drawable.addictionquote8,
                R.drawable.addictionquote9,
                R.drawable.addictionquote10,
                R.drawable.addictionquote11,
                R.drawable.addictionquote12,
                R.drawable.addictionquote13,
                R.drawable.addictionquote14,
                R.drawable.addictionquote15,
                R.drawable.addictionquote16,
                R.drawable.addictionquote17,
                R.drawable.addictionquote18,
                R.drawable.addictionquote19,
                R.drawable.addictionquote20

        };


        setContentView(R.layout.activity_urgepics);

        Intent activityThatCalled = getIntent();


        int number_provided = activityThatCalled.getExtras().getInt("randomnum");


        final ImageView addictpicture = (ImageView) findViewById(R.id.addictionquote1);

        addictpicture.setImageResource(addictionArray[number_provided]);






    }
}

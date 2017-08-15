package quotebook.theoneandonly.com.soberup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class records extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        Intent activityThatCalled = getIntent();


        long number_provided = activityThatCalled.getExtras().getLong("tohigh");

        TextView text = (TextView) findViewById(R.id.highest_streak);

        TextView text2 = (TextView) findViewById(R.id.average_streak);

        text.append(Long.toString(number_provided));

        long average_provided = activityThatCalled.getExtras().getLong("toaverage");

        text2.append(Long.toString(average_provided));

        long current_provided = activityThatCalled.getExtras().getLong("tocurrent");

        TextView text3 = (TextView) findViewById(R.id.current_streak);

        text3.append(Long.toString(current_provided));

        long total_provided = activityThatCalled.getExtras().getLong("tototal");

        TextView text4 = (TextView) findViewById(R.id.total_streak);

        text4.append(Long.toString(total_provided));

    }
}

package quotebook.theoneandonly.com.soberup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static android.text.TextUtils.concat;
import static quotebook.theoneandonly.com.soberup.R.id.tracker;

public class records extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        Intent activityThatCalled = getIntent();


        long number_provided = activityThatCalled.getExtras().getLong("tohigh");

        TextView text = (TextView) findViewById(R.id.highest_streak);

        TextView text2 = (TextView) findViewById(R.id.average_streak);

        text.append(convert(number_provided));

        long average_provided = activityThatCalled.getExtras().getLong("toaverage");

        text2.append(convert(average_provided));

        long current_provided = activityThatCalled.getExtras().getLong("tocurrent");

        TextView text3 = (TextView) findViewById(R.id.current_streak);

        text3.append(convert(current_provided));

        long total_provided = activityThatCalled.getExtras().getLong("tototal");

        TextView text4 = (TextView) findViewById(R.id.total_streak);

        text4.append(convert(total_provided));

    }




    String convert(long time) {



        //courtesy of https://stackoverflow.com/questions/19667473/
        // how-to-show-milliseconds-in-dayshoursminseconds

        long seconds = time / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;
        String returned = days + ":" + hours % 24 + ":" + minutes % 60 + ":" + seconds % 60;


        return returned;
    }




    }

package quotebook.theoneandonly.com.soberup;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Random;

import java.io.Console;

import static android.R.attr.key;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static quotebook.theoneandonly.com.soberup.R.id.day1progressBar;
import static quotebook.theoneandonly.com.soberup.R.id.number;

public class MainActivity extends AppCompatActivity {

    private Button Relapse;

    private Chronometer tracker;

    private int days;

    time_node head;

    long time;

    ProgressBar dayy1;

    ProgressBar day7;

    ProgressBar day14;

    ProgressBar day30;

    ProgressBar day60;

    ProgressBar day90;

    ProgressBar day180;

    ProgressBar day365;


    MainActivity(){

        head = null;

    }


    void add_chron(){

        if (head == null) {

            head = new time_node();
            return;
        }

        time_node temp = new time_node();
        temp.setNext(head);
        head = temp;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dayy1 = (ProgressBar) findViewById(R.id.day1progressBar);

        day7 = (ProgressBar) findViewById(R.id.day7progressBar);

        day14 = (ProgressBar) findViewById(R.id.day14progressBar);

        day30 = (ProgressBar) findViewById(R.id.day30progressBar);

        day60 = (ProgressBar) findViewById(R.id.day60progressBar);

        day90 = (ProgressBar) findViewById(R.id.day90progressBar);

        day180 = (ProgressBar) findViewById(R.id.day180progressBar);

        day365 = (ProgressBar) findViewById(R.id.day365progressBar);

        Relapse = (Button) findViewById(R.id.relapse_button);

        tracker = (Chronometer) findViewById(R.id.tracker);

       /* dayy1.setMax(1);


        day7.setMax(7);


        day14.setMax(14);

        day30.setMax(30);


        day60.setMax(60);


        day90.setMax(90);


        day180.setMax(90);


        day365.setMax(90); */

        Relapse = (Button) findViewById(R.id.relapse_button);

        tracker = (Chronometer) findViewById(R.id.tracker);

        tracker.start();

        tracker.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {


                int count1 = 0;

                int count7 = 0;

                int count14 = 0;

                int count30 = 0;

                int count60 = 0;

                int count90 = 0;

                int count180 = 0;

                int count365 = 0;

                TextView numb = (TextView) findViewById(R.id.number);
                Integer.toString(days);
                numb.setText(Integer.toString(days));

                int key = 0;

               // if (key == 0) {

                    numb.append(" day(s)");
                //    key += 1;

              //  }

                time = SystemClock.elapsedRealtime() - tracker.getBase();

                int h = (int) (time / 3600000);

                int m = (int) (time - h * 3600000) / 60000;

                int s = (int) (time - h * 3600000 - m * 60000) / 1000;

                String hh = h < 10 ? "0" + h : h + "";

                String mm = m < 10 ? "0" + m : m + "";

                String ss = s < 10 ? "0" + s : s + "";

                tracker.setText(hh + ":" + mm + ":" + ss);


                //if(time == 86400000) {
                if (m == 0) {
                    // tracker.stop();
                    //   tracker.setBase(SystemClock.elapsedRealtime());
                    //  tracker.start();
                    days += 1;


                    final Button badges = (Button) findViewById(R.id.badges_button);
                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent nobadges = new Intent(MainActivity.this, badges.class);
                            startActivity(nobadges);


                        }

                    });

                }

                int count2 = 0;

                if (m == 1) {

                    if(count1 < 1)
                       dayy1.setProgress(count2);

                    if(count7 < 7)
                    day7.setProgress(count2);

                    if(count14 < 14)
                    day14.setProgress(count2);

                    if(count30 < 30)
                    day30.setProgress(count2);

                    if(count60 < 60)
                    day60.setProgress(count2);

                    if(count90 < 90)
                    day90.setProgress(count2);

                    if(count180 < 180)
                    day180.setProgress(count2);

                    if(count365 < 365)
                    day365.setProgress(count2);

                    count2 += 1;

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day1badge = new Intent(MainActivity.this, badgesday1.class);
                            startActivity(day1badge);

                        }


                    });


                }


                if (m == 2) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day7badge = new Intent(MainActivity.this, badgesday7.class);
                            startActivity(day7badge);

                        }


                    });


                }

                if (m == 3) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent day14badge = new Intent(MainActivity.this, badgesday14.class);
                            startActivity(day14badge);


                        }


                    });


                }


                if (m == 4) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day30badge = new Intent(MainActivity.this, badgesday30.class);
                            startActivity(day30badge);

                        }


                    });


                }


                if (m == 5) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day60badge = new Intent(MainActivity.this, day60badge.class);
                            startActivity(day60badge);

                        }

                    });


                }

                if (m == 6) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day90badge = new Intent(MainActivity.this, day90badge.class);
                            startActivity(day90badge);

                        }


                    });


                }

                if (m == 7) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day180badge = new Intent(MainActivity.this, badgesday180.class);
                            startActivity(day180badge);

                        }


                    });

                }

                if (m == 8) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day365badge = new Intent(MainActivity.this, day365badge.class);
                            startActivity(day365badge);

                        }

                    });


                }

            }


        });


        Relapse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                add_chron();
                head.setTime(time);

                tracker.stop();

                Intent start_pop = new Intent(MainActivity.this, relapsepop.class);
                Random randomNumberGenerator = new Random();
                int num = randomNumberGenerator.nextInt(15);
                start_pop.putExtra("randomnum", num);
                startActivity(start_pop);


                tracker.setBase(SystemClock.elapsedRealtime());
                tracker.start();

            }
        });


    }


    public void onsendnumber(View view) {

        Intent geturgescreen = new Intent(this, urgepics.class);

        Random randomNumberGenerator = new Random();

        int num = randomNumberGenerator.nextInt(20);

        geturgescreen.putExtra("randomnum", num);

        startActivity(geturgescreen);

    }


    public void sendhistory(View view){

        Intent getrecordsscreen = new Intent(this, records.class);

        long high = get_highest();

        long average = get_average();

        long current = get_current();

        long total = get_total();

        getrecordsscreen.putExtra("tohigh", high);

        getrecordsscreen.putExtra("toaverage", average);

        getrecordsscreen.putExtra("tocurrent", current);

        getrecordsscreen.putExtra("tototal", total);

        startActivity(getrecordsscreen);


    }

    long get_highest(){

        long high = 0;
        time_node temp;
        if(head == null) {
            return 0;

        }

        temp = head;

        while(temp != null) {

            if (temp.getTime() > high) {
                high = temp.getTime();
            }

            temp = temp.getNext();

        }

        return high;

        }

    long get_current(){


        return time;


    }


    long get_average(){


        long average = 0;

        long divider = 0;

        time_node temp;

        if(head == null) {
            return 0;

        }

        temp = head;

        while(temp != null) {

            average += temp.getTime();

            divider += 1;

            temp = temp.getNext();

        }

        return average/divider;

    }


    long get_total(){


        long total = 0;

        time_node temp;

        if(head == null) {
            return 0;

        }

        temp = head;

        while(temp != null) {

            total += temp.getTime();

            temp = temp.getNext();

        }

        return total;

    }

}







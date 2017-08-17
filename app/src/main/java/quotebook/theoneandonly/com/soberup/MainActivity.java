package quotebook.theoneandonly.com.soberup;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

    private Button my_journal;

    private Chronometer tracker;

    private int days;

    time_node head;

    long time;




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

        Relapse = (Button) findViewById(R.id.relapse_button);

        tracker = (Chronometer) findViewById(R.id.tracker);

        Relapse = (Button) findViewById(R.id.relapse_button);

        tracker = (Chronometer) findViewById(R.id.tracker);

        my_journal = (Button) findViewById(R.id.journal_button);

        tracker.start();


        tracker.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {


                long day = SystemClock.elapsedRealtime() - tracker.getBase();
                day /= 3600000;

                long minute = SystemClock.elapsedRealtime() - tracker.getBase();
                minute /= 1000;

                TextView numb = (TextView) findViewById(R.id.number);

                numb.setText(Integer.toString(days));

                numb.append(" day(s)");



                time = SystemClock.elapsedRealtime() - tracker.getBase();

                int h = (int) (time / 3600000);

                int m = (int) (time - h * 3600000) / 60000;

                int s = (int) (time - h * 3600000 - m * 60000) / 1000;

                String hh = h < 10 ? "0" + h : h + "";

                String mm = m < 10 ? "0" + m : m + "";

                String ss = s < 10 ? "0" + s : s + "";

                tracker.setText(hh + ":" + mm + ":" + ss);




                if(day % 24 == 0 && day != 0) {
                    days += 1;
                    tracker.stop();
                    tracker.setBase(SystemClock.elapsedRealtime());
                    tracker.start();



                }



                if (days == 0) {

                    final Button badges = (Button) findViewById(R.id.badges_button);
                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent nobadges = new Intent(MainActivity.this, badges.class);
                            startActivity(nobadges);


                        }

                    });

                }

                if (days == 1) {



                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day1badge = new Intent(MainActivity.this, badgesday1.class);
                            startActivity(day1badge);

                        }


                    });


                }


                if (days == 7) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day7badge = new Intent(MainActivity.this, badgesday7.class);
                            startActivity(day7badge);

                        }


                    });


                }

                if (days == 14) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent day14badge = new Intent(MainActivity.this, badgesday14.class);
                            startActivity(day14badge);


                        }


                    });


                }


                if (days == 30) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day30badge = new Intent(MainActivity.this, badgesday30.class);
                            startActivity(day30badge);

                        }


                    });


                }


                if (days == 60) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day60badge = new Intent(MainActivity.this, day60badge.class);
                            startActivity(day60badge);

                        }

                    });


                }

                if (days == 90) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day90badge = new Intent(MainActivity.this, day90badge.class);
                            startActivity(day90badge);

                        }


                    });


                }

                if (days == 180) {

                    final Button badges = (Button) findViewById(R.id.badges_button);

                    badges.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            Intent day180badge = new Intent(MainActivity.this, badgesday180.class);
                            startActivity(day180badge);

                        }


                    });

                }

                if (days == 365) {

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


        my_journal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent go_journal = new Intent(MainActivity.this, journal.class);
                startActivity(go_journal);


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







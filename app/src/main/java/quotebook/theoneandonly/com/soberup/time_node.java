/*
 * Copyright (c) Victor Ochia
 *    This work is available under the "MIT License".
 *    Please see the file LICENSE for license terms
 */

package quotebook.theoneandonly.com.soberup;

import android.widget.Chronometer;

/**
 * Created by fvf on 8/13/17.
 */

public class time_node {

    private long time;
    private time_node next;


    time_node() {


        this.next = null;
        this.time = 0;


    }


    void setTime(long time_sent_in) {

        this.time = time_sent_in;

    }


    long getTime() {


        return this.time;

    }


    time_node getNext() {

        return this.next;
    }


    void setNext(time_node to_set) {


        this.next = to_set;


    }


}

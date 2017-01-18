package com.example.jayrathod.app1;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Jay Rathod on 19-01-2017.
 */


public class VolleySingleton {
    private static RequestQueue queue;

    private VolleySingleton(Context c) {
        queue = Volley.newRequestQueue(c);
    }

    public static RequestQueue getRequestQueue(Context c) {
        if (queue == null) new VolleySingleton(c);
        return queue;
    }

}

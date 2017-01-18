package com.example.jayrathod.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginRequest request = new LoginRequest("jay", "12345", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                handleResponse(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("qwerty", error.getMessage());
            }
        });
        VolleySingleton.getRequestQueue(getBaseContext()).add(request);


    }

    private void handleResponse(String response) {
        Toast.makeText(getBaseContext(),response,Toast.LENGTH_LONG).show();
    }
}

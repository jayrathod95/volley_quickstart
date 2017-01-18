package com.example.jayrathod.app1;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jay Rathod on 19-01-2017.
 */

public class LoginRequest extends StringRequest {
    static String url = "http://httpbin.org/post";
    private String username;
    private String password;

    public LoginRequest(String username, String password, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, url, listener, errorListener);
        this.username = username;
        this.password = password;
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        Map<String, String> map = new HashMap<>();
        map.put("username", username);
        map.put("password", password);
        return map;
    }
}

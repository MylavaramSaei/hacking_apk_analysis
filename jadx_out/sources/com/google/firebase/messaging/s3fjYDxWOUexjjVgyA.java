package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s3fjYDxWOUexjjVgyA {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final SharedPreferences f5543lEeR5KfoEr4xU5yHH7;

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public static final long f5544zZKhbgvUfsK4AEX3r0 = TimeUnit.DAYS.toMillis(7);

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final long f5545HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final String f5546lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final String f5547s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(String str, String str2, long j) {
            this.f5546lEeR5KfoEr4xU5yHH7 = str;
            this.f5547s3fjYDxWOUexjjVgyA = str2;
            this.f5545HJFh0TGMpafqLE9haL = j;
        }

        public static lEeR5KfoEr4xU5yHH7 HJFh0TGMpafqLE9haL(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new lEeR5KfoEr4xU5yHH7(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new lEeR5KfoEr4xU5yHH7(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }

        public static String lEeR5KfoEr4xU5yHH7(String str, String str2, long j) throws JSONException {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        public boolean s3fjYDxWOUexjjVgyA(String str) {
            return System.currentTimeMillis() > this.f5545HJFh0TGMpafqLE9haL + f5544zZKhbgvUfsK4AEX3r0 || !str.equals(this.f5547s3fjYDxWOUexjjVgyA);
        }
    }

    public s3fjYDxWOUexjjVgyA(Context context) {
        this.f5543lEeR5KfoEr4xU5yHH7 = context.getSharedPreferences("com.google.android.gms.appid", 0);
        lEeR5KfoEr4xU5yHH7(context, "com.google.android.gms.appid-no-backup");
    }

    public synchronized void HJFh0TGMpafqLE9haL() {
        this.f5543lEeR5KfoEr4xU5yHH7.edit().clear().commit();
    }

    public synchronized void KYHag8HRDlnO3X9zmZ(String str, String str2, String str3, String str4) {
        String strLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(str3, str4, System.currentTimeMillis());
        if (strLEeR5KfoEr4xU5yHH7 == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f5543lEeR5KfoEr4xU5yHH7.edit();
        editorEdit.putString(s3fjYDxWOUexjjVgyA(str, str2), strLEeR5KfoEr4xU5yHH7);
        editorEdit.commit();
    }

    public synchronized boolean husNiw3snxdgZPAGJm() {
        return this.f5543lEeR5KfoEr4xU5yHH7.getAll().isEmpty();
    }

    public final void lEeR5KfoEr4xU5yHH7(Context context, String str) {
        File file = new File(LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || husNiw3snxdgZPAGJm()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            HJFh0TGMpafqLE9haL();
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public final String s3fjYDxWOUexjjVgyA(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public synchronized lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(String str, String str2) {
        return lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(this.f5543lEeR5KfoEr4xU5yHH7.getString(s3fjYDxWOUexjjVgyA(str, str2), null));
    }
}

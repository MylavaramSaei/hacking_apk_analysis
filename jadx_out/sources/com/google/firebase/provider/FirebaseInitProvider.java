package com.google.firebase.provider;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import sKw6Jz5uGcQ479KwIW.e54J8UWNHWALQNixXM;
import sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static e54J8UWNHWALQNixXM f5548lEeR5KfoEr4xU5yHH7 = e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static AtomicBoolean f5549s3fjYDxWOUexjjVgyA = new AtomicBoolean(false);

    public static boolean HJFh0TGMpafqLE9haL() {
        return f5549s3fjYDxWOUexjjVgyA.get();
    }

    public static void lEeR5KfoEr4xU5yHH7(ProviderInfo providerInfo) {
        hoXrIDAFrSwfShk8da.Z9WdNiOsPR0y54zHW4(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static e54J8UWNHWALQNixXM s3fjYDxWOUexjjVgyA() {
        return f5548lEeR5KfoEr4xU5yHH7;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        lEeR5KfoEr4xU5yHH7(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            f5549s3fjYDxWOUexjjVgyA.set(true);
            Log.i("FirebaseInitProvider", husNiw3snxdgZPAGJm.OANkd3mP6AYvwbNLJM(getContext()) == null ? "FirebaseApp initialization unsuccessful" : "FirebaseApp initialization successful");
            f5549s3fjYDxWOUexjjVgyA.set(false);
            return false;
        } catch (Throwable th) {
            f5549s3fjYDxWOUexjjVgyA.set(false);
            throw th;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

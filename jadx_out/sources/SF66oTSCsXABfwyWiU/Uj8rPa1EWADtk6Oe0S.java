package SF66oTSCsXABfwyWiU;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Uj8rPa1EWADtk6Oe0S implements Runnable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final FirebaseMessaging f1411HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final long f1412lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final PowerManager.WakeLock f1413s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public ExecutorService f1414zZKhbgvUfsK4AEX3r0 = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new vlBaBOcZ1q1ndWVoXn.lEeR5KfoEr4xU5yHH7("firebase-iid-executor"));

    public static class lEeR5KfoEr4xU5yHH7 extends BroadcastReceiver {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public Uj8rPa1EWADtk6Oe0S f1415lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(Uj8rPa1EWADtk6Oe0S uj8rPa1EWADtk6Oe0S) {
            this.f1415lEeR5KfoEr4xU5yHH7 = uj8rPa1EWADtk6Oe0S;
        }

        public void lEeR5KfoEr4xU5yHH7() {
            if (Uj8rPa1EWADtk6Oe0S.HJFh0TGMpafqLE9haL()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f1415lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Uj8rPa1EWADtk6Oe0S uj8rPa1EWADtk6Oe0S = this.f1415lEeR5KfoEr4xU5yHH7;
            if (uj8rPa1EWADtk6Oe0S != null && uj8rPa1EWADtk6Oe0S.zZKhbgvUfsK4AEX3r0()) {
                if (Uj8rPa1EWADtk6Oe0S.HJFh0TGMpafqLE9haL()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f1415lEeR5KfoEr4xU5yHH7.f1411HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C(this.f1415lEeR5KfoEr4xU5yHH7, 0L);
                this.f1415lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA().unregisterReceiver(this);
                this.f1415lEeR5KfoEr4xU5yHH7 = null;
            }
        }
    }

    public Uj8rPa1EWADtk6Oe0S(FirebaseMessaging firebaseMessaging, long j) {
        this.f1411HJFh0TGMpafqLE9haL = firebaseMessaging;
        this.f1412lEeR5KfoEr4xU5yHH7 = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) s3fjYDxWOUexjjVgyA().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f1413s3fjYDxWOUexjjVgyA = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public static boolean HJFh0TGMpafqLE9haL() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    public boolean husNiw3snxdgZPAGJm() throws IOException {
        String str;
        try {
            if (this.f1411HJFh0TGMpafqLE9haL.e54J8UWNHWALQNixXM() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            if (XzJ1BS7H9Ilbkv4eVM.IPyIQcaNa8aB7drBED(e.getMessage())) {
                str = "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval";
            } else {
                if (e.getMessage() != null) {
                    throw e;
                }
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", str);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA())) {
            this.f1413s3fjYDxWOUexjjVgyA.acquire();
        }
        try {
            try {
                this.f1411HJFh0TGMpafqLE9haL.GyWRxpdt1T8mEJXPoD(true);
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                this.f1411HJFh0TGMpafqLE9haL.GyWRxpdt1T8mEJXPoD(false);
                if (!cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA())) {
                    return;
                }
            }
            if (!this.f1411HJFh0TGMpafqLE9haL.VItLRw50eXTZeEfGl0()) {
                this.f1411HJFh0TGMpafqLE9haL.GyWRxpdt1T8mEJXPoD(false);
                if (cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA())) {
                    this.f1413s3fjYDxWOUexjjVgyA.release();
                    return;
                }
                return;
            }
            if (cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().zZKhbgvUfsK4AEX3r0(s3fjYDxWOUexjjVgyA()) && !zZKhbgvUfsK4AEX3r0()) {
                new lEeR5KfoEr4xU5yHH7(this).lEeR5KfoEr4xU5yHH7();
                if (cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA())) {
                    this.f1413s3fjYDxWOUexjjVgyA.release();
                    return;
                }
                return;
            }
            if (husNiw3snxdgZPAGJm()) {
                this.f1411HJFh0TGMpafqLE9haL.GyWRxpdt1T8mEJXPoD(false);
            } else {
                this.f1411HJFh0TGMpafqLE9haL.aAp6BD79BhftLCnuvf(this.f1412lEeR5KfoEr4xU5yHH7);
            }
            if (!cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA())) {
                return;
            }
            this.f1413s3fjYDxWOUexjjVgyA.release();
        } catch (Throwable th) {
            if (cT5Hs3CQpLK8NvlZAw.s3fjYDxWOUexjjVgyA().husNiw3snxdgZPAGJm(s3fjYDxWOUexjjVgyA())) {
                this.f1413s3fjYDxWOUexjjVgyA.release();
            }
            throw th;
        }
    }

    public Context s3fjYDxWOUexjjVgyA() {
        return this.f1411HJFh0TGMpafqLE9haL.hoXrIDAFrSwfShk8da();
    }

    public boolean zZKhbgvUfsK4AEX3r0() {
        ConnectivityManager connectivityManager = (ConnectivityManager) s3fjYDxWOUexjjVgyA().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}

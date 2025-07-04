package SF66oTSCsXABfwyWiU;

import SF66oTSCsXABfwyWiU.zZKhbgvUfsK4AEX3r0;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xHA29AmDt6y96AnB3t.zZKhbgvUfsK4AEX3r0;

/* loaded from: classes.dex */
public class KYHag8HRDlnO3X9zmZ {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final e2F9F6h8YJxTHwLCa0 f1383HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ExecutorService f1384lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Context f1385s3fjYDxWOUexjjVgyA;

    public KYHag8HRDlnO3X9zmZ(Context context, e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0, ExecutorService executorService) {
        this.f1384lEeR5KfoEr4xU5yHH7 = executorService;
        this.f1385s3fjYDxWOUexjjVgyA = context;
        this.f1383HJFh0TGMpafqLE9haL = e2f9f6h8yjxthwlca0;
    }

    public final void HJFh0TGMpafqLE9haL(zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f1385s3fjYDxWOUexjjVgyA.getSystemService("notification")).notify(leer5kfoer4xu5yhh7.f1527s3fjYDxWOUexjjVgyA, leer5kfoer4xu5yhh7.f1525HJFh0TGMpafqLE9haL, leer5kfoer4xu5yhh7.f1526lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA());
    }

    public final void husNiw3snxdgZPAGJm(zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, W3RZ2dTDKrKpS5Mxdk w3RZ2dTDKrKpS5Mxdk) {
        if (w3RZ2dTDKrKpS5Mxdk == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.s3fjYDxWOUexjjVgyA(w3RZ2dTDKrKpS5Mxdk.hoXrIDAFrSwfShk8da(), 5L, TimeUnit.SECONDS);
            husniw3snxdgzpagjm.hoXrIDAFrSwfShk8da(bitmap);
            husniw3snxdgzpagjm.xHA29AmDt6y96AnB3t(new zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA().pbVGzGjWvY2LDXC8vo(bitmap).IPyIQcaNa8aB7drBED(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            w3RZ2dTDKrKpS5Mxdk.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            w3RZ2dTDKrKpS5Mxdk.close();
        }
    }

    public boolean lEeR5KfoEr4xU5yHH7() throws PackageManager.NameNotFoundException {
        if (this.f1383HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7("gcm.n.noui")) {
            return true;
        }
        if (s3fjYDxWOUexjjVgyA()) {
            return false;
        }
        W3RZ2dTDKrKpS5Mxdk w3RZ2dTDKrKpS5MxdkZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0();
        zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0.zZKhbgvUfsK4AEX3r0(this.f1385s3fjYDxWOUexjjVgyA, this.f1383HJFh0TGMpafqLE9haL);
        husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0.f1526lEeR5KfoEr4xU5yHH7, w3RZ2dTDKrKpS5MxdkZZKhbgvUfsK4AEX3r0);
        HJFh0TGMpafqLE9haL(leer5kfoer4xu5yhh7ZZKhbgvUfsK4AEX3r0);
        return true;
    }

    public final boolean s3fjYDxWOUexjjVgyA() {
        if (((KeyguardManager) this.f1385s3fjYDxWOUexjjVgyA.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f1385s3fjYDxWOUexjjVgyA.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    public final W3RZ2dTDKrKpS5Mxdk zZKhbgvUfsK4AEX3r0() {
        W3RZ2dTDKrKpS5Mxdk w3RZ2dTDKrKpS5MxdkAcstmh57AKoSEkEFNJ = W3RZ2dTDKrKpS5Mxdk.Acstmh57AKoSEkEFNJ(this.f1383HJFh0TGMpafqLE9haL.OANkd3mP6AYvwbNLJM("gcm.n.image"));
        if (w3RZ2dTDKrKpS5MxdkAcstmh57AKoSEkEFNJ != null) {
            w3RZ2dTDKrKpS5MxdkAcstmh57AKoSEkEFNJ.OANkd3mP6AYvwbNLJM(this.f1384lEeR5KfoEr4xU5yHH7);
        }
        return w3RZ2dTDKrKpS5MxdkAcstmh57AKoSEkEFNJ;
    }
}

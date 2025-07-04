package SF66oTSCsXABfwyWiU;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ToH8yzk8U1nKT0PUfY {
    public static void HJFh0TGMpafqLE9haL(Context context) {
        if (LU0fFDMACqnfIfA1AZ.HJFh0TGMpafqLE9haL(context)) {
            return;
        }
        KYHag8HRDlnO3X9zmZ(new hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm(), context, TCyPEKSzIyweCN5yp1(context));
    }

    public static JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo KYHag8HRDlnO3X9zmZ(Executor executor, final Context context, final boolean z) {
        if (!fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.pbVGzGjWvY2LDXC8vo()) {
            return JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.husNiw3snxdgZPAGJm(null);
        }
        final JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ();
        executor.execute(new Runnable() { // from class: SF66oTSCsXABfwyWiU.lLKzvdU99Iw80uVD5I
            @Override // java.lang.Runnable
            public final void run() {
                ToH8yzk8U1nKT0PUfY.husNiw3snxdgZPAGJm(context, z, acstmh57AKoSEkEFNJ);
            }
        });
        return acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    public static boolean TCyPEKSzIyweCN5yp1(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public static /* synthetic */ void husNiw3snxdgZPAGJm(Context context, boolean z, JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) {
        try {
            if (!s3fjYDxWOUexjjVgyA(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            LU0fFDMACqnfIfA1AZ.KYHag8HRDlnO3X9zmZ(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            acstmh57AKoSEkEFNJ.husNiw3snxdgZPAGJm(null);
        }
    }

    public static boolean s3fjYDxWOUexjjVgyA(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    public static boolean zZKhbgvUfsK4AEX3r0(Context context) {
        if (!fDXXEWvhMVO3O8mnuS.pbVGzGjWvY2LDXC8vo.pbVGzGjWvY2LDXC8vo()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        }
        if (!s3fjYDxWOUexjjVgyA(context)) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "GMS core is set for proxying");
        return true;
    }
}

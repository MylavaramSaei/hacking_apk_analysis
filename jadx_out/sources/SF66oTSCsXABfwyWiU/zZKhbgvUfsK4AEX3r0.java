package SF66oTSCsXABfwyWiU;

import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import xHA29AmDt6y96AnB3t.zZKhbgvUfsK4AEX3r0;

/* loaded from: classes.dex */
public abstract class zZKhbgvUfsK4AEX3r0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final AtomicInteger f1524lEeR5KfoEr4xU5yHH7 = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final int f1525HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm f1526lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final String f1527s3fjYDxWOUexjjVgyA;

        public lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, String str, int i) {
            this.f1526lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm;
            this.f1527s3fjYDxWOUexjjVgyA = str;
            this.f1525HJFh0TGMpafqLE9haL = i;
        }
    }

    public static Bundle Acstmh57AKoSEkEFNJ(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    public static PendingIntent HJFh0TGMpafqLE9haL(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, TCyPEKSzIyweCN5yp1(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), e54J8UWNHWALQNixXM(1073741824));
    }

    public static Integer IPyIQcaNa8aB7drBED(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(context, i));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    public static Intent KYHag8HRDlnO3X9zmZ(String str, e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0, PackageManager packageManager) {
        String strOANkd3mP6AYvwbNLJM = e2f9f6h8yjxthwlca0.OANkd3mP6AYvwbNLJM("gcm.n.click_action");
        if (!TextUtils.isEmpty(strOANkd3mP6AYvwbNLJM)) {
            Intent intent = new Intent(strOANkd3mP6AYvwbNLJM);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriKYHag8HRDlnO3X9zmZ = e2f9f6h8yjxthwlca0.KYHag8HRDlnO3X9zmZ();
        if (uriKYHag8HRDlnO3X9zmZ != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriKYHag8HRDlnO3X9zmZ);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static boolean OANkd3mP6AYvwbNLJM(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7(resources.getDrawable(i, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    public static int T9PhQIpGRhE4yZDm1C(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && OANkd3mP6AYvwbNLJM(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && OANkd3mP6AYvwbNLJM(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !OANkd3mP6AYvwbNLJM(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        return (i == 0 || !OANkd3mP6AYvwbNLJM(resources, i)) ? R.drawable.sym_def_app_icon : i;
    }

    public static int TCyPEKSzIyweCN5yp1() {
        return f1524lEeR5KfoEr4xU5yHH7.incrementAndGet();
    }

    public static String Z9WdNiOsPR0y54zHW4(Context context, String str, Bundle bundle) {
        String str2;
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
            }
            Log.w("FirebaseMessaging", str2);
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                com.example.fcmexpr.keepalive.OANkd3mP6AYvwbNLJM.lEeR5KfoEr4xU5yHH7(notificationManager, com.example.fcmexpr.keepalive.zaq8hOURtfwbcX17cG.lEeR5KfoEr4xU5yHH7("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String aPyGSIylzVNKPT1Bls(e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0) {
        String strOANkd3mP6AYvwbNLJM = e2f9f6h8yjxthwlca0.OANkd3mP6AYvwbNLJM("gcm.n.tag");
        if (!TextUtils.isEmpty(strOANkd3mP6AYvwbNLJM)) {
            return strOANkd3mP6AYvwbNLJM;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    public static int e54J8UWNHWALQNixXM(int i) {
        return i | 67108864;
    }

    public static Uri hoXrIDAFrSwfShk8da(String str, e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0, Resources resources) {
        String strAPyGSIylzVNKPT1Bls = e2f9f6h8yjxthwlca0.aPyGSIylzVNKPT1Bls();
        if (TextUtils.isEmpty(strAPyGSIylzVNKPT1Bls)) {
            return null;
        }
        if ("default".equals(strAPyGSIylzVNKPT1Bls) || resources.getIdentifier(strAPyGSIylzVNKPT1Bls, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        return Uri.parse("android.resource://" + str + "/raw/" + strAPyGSIylzVNKPT1Bls);
    }

    public static lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm(Context context, Context context2, e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0, String str, Bundle bundle) throws JSONException {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm husniw3snxdgzpagjm = new zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(context2, str);
        String strHoXrIDAFrSwfShk8da = e2f9f6h8yjxthwlca0.hoXrIDAFrSwfShk8da(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strHoXrIDAFrSwfShk8da)) {
            husniw3snxdgzpagjm.Acstmh57AKoSEkEFNJ(strHoXrIDAFrSwfShk8da);
        }
        String strHoXrIDAFrSwfShk8da2 = e2f9f6h8yjxthwlca0.hoXrIDAFrSwfShk8da(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strHoXrIDAFrSwfShk8da2)) {
            husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo(strHoXrIDAFrSwfShk8da2);
            husniw3snxdgzpagjm.xHA29AmDt6y96AnB3t(new zZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL().IPyIQcaNa8aB7drBED(strHoXrIDAFrSwfShk8da2));
        }
        husniw3snxdgzpagjm.R9SAhYMerGybF9OAjL(T9PhQIpGRhE4yZDm1C(packageManager, resources, packageName, e2f9f6h8yjxthwlca0.OANkd3mP6AYvwbNLJM("gcm.n.icon"), bundle));
        Uri uriHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(packageName, e2f9f6h8yjxthwlca0, resources);
        if (uriHoXrIDAFrSwfShk8da != null) {
            husniw3snxdgzpagjm.G7AC3DWIx9i9fdanjk(uriHoXrIDAFrSwfShk8da);
        }
        husniw3snxdgzpagjm.IPyIQcaNa8aB7drBED(lEeR5KfoEr4xU5yHH7(context, e2f9f6h8yjxthwlca0, packageName, packageManager));
        PendingIntent pendingIntentS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(context, context2, e2f9f6h8yjxthwlca0);
        if (pendingIntentS3fjYDxWOUexjjVgyA != null) {
            husniw3snxdgzpagjm.e54J8UWNHWALQNixXM(pendingIntentS3fjYDxWOUexjjVgyA);
        }
        Integer numIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(context2, e2f9f6h8yjxthwlca0.OANkd3mP6AYvwbNLJM("gcm.n.color"), bundle);
        if (numIPyIQcaNa8aB7drBED != null) {
            husniw3snxdgzpagjm.TCyPEKSzIyweCN5yp1(numIPyIQcaNa8aB7drBED.intValue());
        }
        husniw3snxdgzpagjm.husNiw3snxdgZPAGJm(!e2f9f6h8yjxthwlca0.lEeR5KfoEr4xU5yHH7("gcm.n.sticky"));
        husniw3snxdgzpagjm.OANkd3mP6AYvwbNLJM(e2f9f6h8yjxthwlca0.lEeR5KfoEr4xU5yHH7("gcm.n.local_only"));
        String strOANkd3mP6AYvwbNLJM = e2f9f6h8yjxthwlca0.OANkd3mP6AYvwbNLJM("gcm.n.ticker");
        if (strOANkd3mP6AYvwbNLJM != null) {
            husniw3snxdgzpagjm.LIMtzhnLwQyigzK0KO(strOANkd3mP6AYvwbNLJM);
        }
        Integer numT9PhQIpGRhE4yZDm1C = e2f9f6h8yjxthwlca0.T9PhQIpGRhE4yZDm1C();
        if (numT9PhQIpGRhE4yZDm1C != null) {
            husniw3snxdgzpagjm.sTkWmhpZ5b1ArQIw4K(numT9PhQIpGRhE4yZDm1C.intValue());
        }
        Integer numSTkWmhpZ5b1ArQIw4K = e2f9f6h8yjxthwlca0.sTkWmhpZ5b1ArQIw4K();
        if (numSTkWmhpZ5b1ArQIw4K != null) {
            husniw3snxdgzpagjm.VItLRw50eXTZeEfGl0(numSTkWmhpZ5b1ArQIw4K.intValue());
        }
        Integer numE54J8UWNHWALQNixXM = e2f9f6h8yjxthwlca0.e54J8UWNHWALQNixXM();
        if (numE54J8UWNHWALQNixXM != null) {
            husniw3snxdgzpagjm.zaq8hOURtfwbcX17cG(numE54J8UWNHWALQNixXM.intValue());
        }
        Long lAcstmh57AKoSEkEFNJ = e2f9f6h8yjxthwlca0.Acstmh57AKoSEkEFNJ("gcm.n.event_time");
        if (lAcstmh57AKoSEkEFNJ != null) {
            husniw3snxdgzpagjm.Y43RdunnpKgpbny0lE(true);
            husniw3snxdgzpagjm.WWC27LAMFqFFBzfbNw(lAcstmh57AKoSEkEFNJ.longValue());
        }
        long[] jArrZaq8hOURtfwbcX17cG = e2f9f6h8yjxthwlca0.zaq8hOURtfwbcX17cG();
        if (jArrZaq8hOURtfwbcX17cG != null) {
            husniw3snxdgzpagjm.A49QRPHynYLCBN0SqP(jArrZaq8hOURtfwbcX17cG);
        }
        int[] iArrHusNiw3snxdgZPAGJm = e2f9f6h8yjxthwlca0.husNiw3snxdgZPAGJm();
        if (iArrHusNiw3snxdgZPAGJm != null) {
            husniw3snxdgzpagjm.aPyGSIylzVNKPT1Bls(iArrHusNiw3snxdgZPAGJm[0], iArrHusNiw3snxdgZPAGJm[1], iArrHusNiw3snxdgZPAGJm[2]);
        }
        husniw3snxdgzpagjm.Z9WdNiOsPR0y54zHW4(pbVGzGjWvY2LDXC8vo(e2f9f6h8yjxthwlca0));
        return new lEeR5KfoEr4xU5yHH7(husniw3snxdgzpagjm, aPyGSIylzVNKPT1Bls(e2f9f6h8yjxthwlca0), 0);
    }

    public static PendingIntent lEeR5KfoEr4xU5yHH7(Context context, e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0, String str, PackageManager packageManager) {
        Intent intentKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(str, e2f9f6h8yjxthwlca0, packageManager);
        if (intentKYHag8HRDlnO3X9zmZ == null) {
            return null;
        }
        intentKYHag8HRDlnO3X9zmZ.addFlags(67108864);
        intentKYHag8HRDlnO3X9zmZ.putExtras(e2f9f6h8yjxthwlca0.VItLRw50eXTZeEfGl0());
        if (zaq8hOURtfwbcX17cG(e2f9f6h8yjxthwlca0)) {
            intentKYHag8HRDlnO3X9zmZ.putExtra("gcm.n.analytics_data", e2f9f6h8yjxthwlca0.A49QRPHynYLCBN0SqP());
        }
        return PendingIntent.getActivity(context, TCyPEKSzIyweCN5yp1(), intentKYHag8HRDlnO3X9zmZ, e54J8UWNHWALQNixXM(1073741824));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int pbVGzGjWvY2LDXC8vo(e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0) {
        boolean zLEeR5KfoEr4xU5yHH7 = e2f9f6h8yjxthwlca0.lEeR5KfoEr4xU5yHH7("gcm.n.default_sound");
        ?? r0 = zLEeR5KfoEr4xU5yHH7;
        if (e2f9f6h8yjxthwlca0.lEeR5KfoEr4xU5yHH7("gcm.n.default_vibrate_timings")) {
            r0 = (zLEeR5KfoEr4xU5yHH7 ? 1 : 0) | 2;
        }
        return e2f9f6h8yjxthwlca0.lEeR5KfoEr4xU5yHH7("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    public static PendingIntent s3fjYDxWOUexjjVgyA(Context context, Context context2, e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0) {
        if (zaq8hOURtfwbcX17cG(e2f9f6h8yjxthwlca0)) {
            return HJFh0TGMpafqLE9haL(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(e2f9f6h8yjxthwlca0.A49QRPHynYLCBN0SqP()));
        }
        return null;
    }

    public static lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0(Context context, e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0) throws PackageManager.NameNotFoundException {
        Bundle bundleAcstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ(context.getPackageManager(), context.getPackageName());
        return husNiw3snxdgZPAGJm(context, context, e2f9f6h8yjxthwlca0, Z9WdNiOsPR0y54zHW4(context, e2f9f6h8yjxthwlca0.Z9WdNiOsPR0y54zHW4(), bundleAcstmh57AKoSEkEFNJ), bundleAcstmh57AKoSEkEFNJ);
    }

    public static boolean zaq8hOURtfwbcX17cG(e2F9F6h8YJxTHwLCa0 e2f9f6h8yjxthwlca0) {
        return e2f9f6h8yjxthwlca0.lEeR5KfoEr4xU5yHH7("google.c.a.e");
    }
}

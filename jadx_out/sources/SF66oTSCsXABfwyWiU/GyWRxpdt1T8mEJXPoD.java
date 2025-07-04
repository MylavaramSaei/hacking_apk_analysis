package SF66oTSCsXABfwyWiU;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;
import jguN4azZtOjukyvhIL.lEeR5KfoEr4xU5yHH7;

/* loaded from: classes.dex */
public abstract class GyWRxpdt1T8mEJXPoD {
    public static void A49QRPHynYLCBN0SqP(Bundle bundle) {
        ao3wqKm5CXFuvC0q47(bundle);
        THTDvPxsHqMeGb512f("_no", bundle);
    }

    public static int Acstmh57AKoSEkEFNJ(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public static boolean G7AC3DWIx9i9fdanjk(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static String HJFh0TGMpafqLE9haL(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    public static String IPyIQcaNa8aB7drBED(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public static String KYHag8HRDlnO3X9zmZ(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(w859GrF8FXGM1qrYSH.TCyPEKSzIyweCN5yp1.zaq8hOURtfwbcX17cG(sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4()).lEeR5KfoEr4xU5yHH7());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static void LIMtzhnLwQyigzK0KO(Intent intent) {
        THTDvPxsHqMeGb512f("_nf", intent.getExtras());
    }

    public static int OANkd3mP6AYvwbNLJM(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return Acstmh57AKoSEkEFNJ(string);
    }

    public static boolean OUd9THiLjZndMj0qdF(Intent intent) {
        if (intent == null || G7AC3DWIx9i9fdanjk(intent)) {
            return false;
        }
        return lEeR5KfoEr4xU5yHH7();
    }

    public static String R9SAhYMerGybF9OAjL(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    public static lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL T9PhQIpGRhE4yZDm1C(Bundle bundle) {
        return (bundle == null || !e2F9F6h8YJxTHwLCa0.R9SAhYMerGybF9OAjL(bundle)) ? lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL.DATA_MESSAGE : lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL.DISPLAY_NOTIFICATION;
    }

    public static String TCyPEKSzIyweCN5yp1(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static void THTDvPxsHqMeGb512f(String str, Bundle bundle) {
        try {
            sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0(bundle);
            if (strZZKhbgvUfsK4AEX3r0 != null) {
                bundle2.putString("_nmid", strZZKhbgvUfsK4AEX3r0);
            }
            String strHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(bundle);
            if (strHusNiw3snxdgZPAGJm != null) {
                bundle2.putString("_nmn", strHusNiw3snxdgZPAGJm);
            }
            String strPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(bundle);
            if (!TextUtils.isEmpty(strPbVGzGjWvY2LDXC8vo)) {
                bundle2.putString("label", strPbVGzGjWvY2LDXC8vo);
            }
            String strTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(bundle);
            if (!TextUtils.isEmpty(strTCyPEKSzIyweCN5yp1)) {
                bundle2.putString("message_channel", strTCyPEKSzIyweCN5yp1);
            }
            String strSTkWmhpZ5b1ArQIw4K = sTkWmhpZ5b1ArQIw4K(bundle);
            if (strSTkWmhpZ5b1ArQIw4K != null) {
                bundle2.putString("_nt", strSTkWmhpZ5b1ArQIw4K);
            }
            String strE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(bundle);
            if (strE54J8UWNHWALQNixXM != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strE54J8UWNHWALQNixXM));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String strR9SAhYMerGybF9OAjL = R9SAhYMerGybF9OAjL(bundle);
            if (strR9SAhYMerGybF9OAjL != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strR9SAhYMerGybF9OAjL));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String strHoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strHoXrIDAFrSwfShk8da);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4().pbVGzGjWvY2LDXC8vo(FXtjrf53D5B1cLsLFG.lEeR5KfoEr4xU5yHH7.class));
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void VItLRw50eXTZeEfGl0(Intent intent) {
        if (jCtUeU2YI1poCxWcjm(intent)) {
            THTDvPxsHqMeGb512f("_nr", intent.getExtras());
        }
        if (OUd9THiLjZndMj0qdF(intent)) {
            WWC27LAMFqFFBzfbNw(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA.MESSAGE_DELIVERED, intent, FirebaseMessaging.R9SAhYMerGybF9OAjL());
        }
    }

    public static void WWC27LAMFqFFBzfbNw(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, Intent intent, ctWLFN70QQINH1kyYo.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        if (pbvgzgjwvy2ldxc8vo == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        jguN4azZtOjukyvhIL.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA(s3fjydxwouexjjvgya, intent);
        if (leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA == null) {
            return;
        }
        try {
            pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7("FCM_CLIENT_EVENT_LOGGING", jguN4azZtOjukyvhIL.s3fjYDxWOUexjjVgyA.class, ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA("proto"), new ctWLFN70QQINH1kyYo.TCyPEKSzIyweCN5yp1() { // from class: SF66oTSCsXABfwyWiU.OqIo5QF00RDxUQb4qq
                @Override // ctWLFN70QQINH1kyYo.TCyPEKSzIyweCN5yp1
                public final Object lEeR5KfoEr4xU5yHH7(Object obj) {
                    return ((jguN4azZtOjukyvhIL.s3fjYDxWOUexjjVgyA) obj).HJFh0TGMpafqLE9haL();
                }
            }).lEeR5KfoEr4xU5yHH7(ctWLFN70QQINH1kyYo.zZKhbgvUfsK4AEX3r0.husNiw3snxdgZPAGJm(jguN4azZtOjukyvhIL.s3fjYDxWOUexjjVgyA.s3fjYDxWOUexjjVgyA().s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA).lEeR5KfoEr4xU5yHH7(), ctWLFN70QQINH1kyYo.KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
        }
    }

    public static boolean XzJ1BS7H9Ilbkv4eVM(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static int Y43RdunnpKgpbny0lE(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public static int Z9WdNiOsPR0y54zHW4(Bundle bundle) {
        int iOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(bundle);
        if (iOANkd3mP6AYvwbNLJM == 2) {
            return 5;
        }
        return iOANkd3mP6AYvwbNLJM == 1 ? 10 : 0;
    }

    public static String aPyGSIylzVNKPT1Bls() {
        return sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4().Acstmh57AKoSEkEFNJ().getPackageName();
    }

    public static void ao3wqKm5CXFuvC0q47(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        } else {
            androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4().pbVGzGjWvY2LDXC8vo(FXtjrf53D5B1cLsLFG.lEeR5KfoEr4xU5yHH7.class));
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        }
    }

    public static String e54J8UWNHWALQNixXM(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static String hoXrIDAFrSwfShk8da(Bundle bundle) {
        return (bundle == null || !e2F9F6h8YJxTHwLCa0.R9SAhYMerGybF9OAjL(bundle)) ? "data" : "display";
    }

    public static String husNiw3snxdgZPAGJm(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static boolean jCtUeU2YI1poCxWcjm(Intent intent) {
        if (intent == null || G7AC3DWIx9i9fdanjk(intent)) {
            return false;
        }
        return XzJ1BS7H9Ilbkv4eVM(intent.getExtras());
    }

    public static boolean lEeR5KfoEr4xU5yHH7() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4();
            Context contextAcstmh57AKoSEkEFNJ = sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4().Acstmh57AKoSEkEFNJ();
            SharedPreferences sharedPreferences = contextAcstmh57AKoSEkEFNJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextAcstmh57AKoSEkEFNJ.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextAcstmh57AKoSEkEFNJ.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static String pbVGzGjWvY2LDXC8vo(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static jguN4azZtOjukyvhIL.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        lEeR5KfoEr4xU5yHH7.C0097lEeR5KfoEr4xU5yHH7 c0097lEeR5KfoEr4xU5yHH7Acstmh57AKoSEkEFNJ = jguN4azZtOjukyvhIL.lEeR5KfoEr4xU5yHH7.OANkd3mP6AYvwbNLJM().hoXrIDAFrSwfShk8da(Y43RdunnpKgpbny0lE(extras)).husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya).KYHag8HRDlnO3X9zmZ(KYHag8HRDlnO3X9zmZ(extras)).pbVGzGjWvY2LDXC8vo(aPyGSIylzVNKPT1Bls()).e54J8UWNHWALQNixXM(lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0.ANDROID).IPyIQcaNa8aB7drBED(T9PhQIpGRhE4yZDm1C(extras)).Acstmh57AKoSEkEFNJ(Z9WdNiOsPR0y54zHW4(extras));
        String strIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(extras);
        if (strIPyIQcaNa8aB7drBED != null) {
            c0097lEeR5KfoEr4xU5yHH7Acstmh57AKoSEkEFNJ.TCyPEKSzIyweCN5yp1(strIPyIQcaNa8aB7drBED);
        }
        String strSTkWmhpZ5b1ArQIw4K = sTkWmhpZ5b1ArQIw4K(extras);
        if (strSTkWmhpZ5b1ArQIw4K != null) {
            c0097lEeR5KfoEr4xU5yHH7Acstmh57AKoSEkEFNJ.T9PhQIpGRhE4yZDm1C(strSTkWmhpZ5b1ArQIw4K);
        }
        String strHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(extras);
        if (strHJFh0TGMpafqLE9haL != null) {
            c0097lEeR5KfoEr4xU5yHH7Acstmh57AKoSEkEFNJ.HJFh0TGMpafqLE9haL(strHJFh0TGMpafqLE9haL);
        }
        String strPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(extras);
        if (strPbVGzGjWvY2LDXC8vo != null) {
            c0097lEeR5KfoEr4xU5yHH7Acstmh57AKoSEkEFNJ.s3fjYDxWOUexjjVgyA(strPbVGzGjWvY2LDXC8vo);
        }
        String strHusNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm(extras);
        if (strHusNiw3snxdgZPAGJm != null) {
            c0097lEeR5KfoEr4xU5yHH7Acstmh57AKoSEkEFNJ.zZKhbgvUfsK4AEX3r0(strHusNiw3snxdgZPAGJm);
        }
        long jZaq8hOURtfwbcX17cG = zaq8hOURtfwbcX17cG(extras);
        if (jZaq8hOURtfwbcX17cG > 0) {
            c0097lEeR5KfoEr4xU5yHH7Acstmh57AKoSEkEFNJ.Z9WdNiOsPR0y54zHW4(jZaq8hOURtfwbcX17cG);
        }
        return c0097lEeR5KfoEr4xU5yHH7Acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    public static String sTkWmhpZ5b1ArQIw4K(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static void xHA29AmDt6y96AnB3t(Intent intent) {
        THTDvPxsHqMeGb512f("_nd", intent.getExtras());
    }

    public static String zZKhbgvUfsK4AEX3r0(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static long zaq8hOURtfwbcX17cG(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm husniw3snxdgzpagjmZ9WdNiOsPR0y54zHW4 = sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm.Z9WdNiOsPR0y54zHW4();
        String strZZKhbgvUfsK4AEX3r0 = husniw3snxdgzpagjmZ9WdNiOsPR0y54zHW4.T9PhQIpGRhE4yZDm1C().zZKhbgvUfsK4AEX3r0();
        if (strZZKhbgvUfsK4AEX3r0 != null) {
            try {
                return Long.parseLong(strZZKhbgvUfsK4AEX3r0);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String strHJFh0TGMpafqLE9haL = husniw3snxdgzpagjmZ9WdNiOsPR0y54zHW4.T9PhQIpGRhE4yZDm1C().HJFh0TGMpafqLE9haL();
        try {
            if (!strHJFh0TGMpafqLE9haL.startsWith("1:")) {
                return Long.parseLong(strHJFh0TGMpafqLE9haL);
            }
            String[] strArrSplit = strHJFh0TGMpafqLE9haL.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException e3) {
            Log.w("FirebaseMessaging", "error parsing app ID", e3);
            return 0L;
        }
    }
}

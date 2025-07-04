package HR5vAalpgOKVm2T0Gq;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class VItLRw50eXTZeEfGl0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 f370lEeR5KfoEr4xU5yHH7 = new Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static Locale f371s3fjYDxWOUexjjVgyA;

    public static String HJFh0TGMpafqLE9haL(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? R.string.ok : Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f101lEeR5KfoEr4xU5yHH7 : Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f90Acstmh57AKoSEkEFNJ : Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f104zZKhbgvUfsK4AEX3r0);
    }

    public static String IPyIQcaNa8aB7drBED(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(context, str);
        if (strPbVGzGjWvY2LDXC8vo == null) {
            strPbVGzGjWvY2LDXC8vo = resources.getString(f2zPq7MOnQrtOlZ1Zg.e54J8UWNHWALQNixXM.f5813lEeR5KfoEr4xU5yHH7);
        }
        return String.format(resources.getConfiguration().locale, strPbVGzGjWvY2LDXC8vo, str2);
    }

    public static String KYHag8HRDlnO3X9zmZ(Context context, int i) {
        String strPbVGzGjWvY2LDXC8vo = i == 6 ? pbVGzGjWvY2LDXC8vo(context, "common_google_play_services_resolution_required_title") : TCyPEKSzIyweCN5yp1(context, i);
        return strPbVGzGjWvY2LDXC8vo == null ? context.getResources().getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f92IPyIQcaNa8aB7drBED) : strPbVGzGjWvY2LDXC8vo;
    }

    public static String TCyPEKSzIyweCN5yp1(Context context, int i) {
        String string;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f93KYHag8HRDlnO3X9zmZ);
            case 2:
                return resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f98e54J8UWNHWALQNixXM);
            case 3:
                return resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f91HJFh0TGMpafqLE9haL);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return pbVGzGjWvY2LDXC8vo(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return pbVGzGjWvY2LDXC8vo(context, "common_google_play_services_network_error_title");
            case 8:
                string = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                string = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                string = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                string = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                string = sb.toString();
                break;
            case 16:
                string = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return pbVGzGjWvY2LDXC8vo(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return pbVGzGjWvY2LDXC8vo(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", string);
        return null;
    }

    public static String husNiw3snxdgZPAGJm(Context context, int i) {
        return (i == 6 || i == 19) ? IPyIQcaNa8aB7drBED(context, "common_google_play_services_resolution_required_text", lEeR5KfoEr4xU5yHH7(context)) : zZKhbgvUfsK4AEX3r0(context, i);
    }

    public static String lEeR5KfoEr4xU5yHH7(Context context) {
        String packageName = context.getPackageName();
        try {
            return i8aHOwH04efS6lZ3Oa.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(context).HJFh0TGMpafqLE9haL(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String pbVGzGjWvY2LDXC8vo(Context context, String str) {
        Z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = f370lEeR5KfoEr4xU5yHH7;
        synchronized (tCyPEKSzIyweCN5yp1) {
            try {
                Locale localeS3fjYDxWOUexjjVgyA = OUd9THiLjZndMj0qdF.s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(context.getResources().getConfiguration()).s3fjYDxWOUexjjVgyA(0);
                if (!localeS3fjYDxWOUexjjVgyA.equals(f371s3fjYDxWOUexjjVgyA)) {
                    tCyPEKSzIyweCN5yp1.clear();
                    f371s3fjYDxWOUexjjVgyA = localeS3fjYDxWOUexjjVgyA;
                }
                String str2 = (String) tCyPEKSzIyweCN5yp1.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesS3fjYDxWOUexjjVgyA = f2zPq7MOnQrtOlZ1Zg.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(context);
                if (resourcesS3fjYDxWOUexjjVgyA == null) {
                    return null;
                }
                int identifier = resourcesS3fjYDxWOUexjjVgyA.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                    return null;
                }
                String string = resourcesS3fjYDxWOUexjjVgyA.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                    return null;
                }
                tCyPEKSzIyweCN5yp1.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String s3fjYDxWOUexjjVgyA(Context context) {
        return context.getResources().getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f95TCyPEKSzIyweCN5yp1);
    }

    public static String zZKhbgvUfsK4AEX3r0(Context context, int i) {
        Resources resources = context.getResources();
        String strLEeR5KfoEr4xU5yHH7 = lEeR5KfoEr4xU5yHH7(context);
        if (i == 1) {
            return resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f100husNiw3snxdgZPAGJm, strLEeR5KfoEr4xU5yHH7);
        }
        if (i == 2) {
            return fDXXEWvhMVO3O8mnuS.KYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(context) ? resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f99hoXrIDAFrSwfShk8da) : resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f96Z9WdNiOsPR0y54zHW4, strLEeR5KfoEr4xU5yHH7);
        }
        if (i == 3) {
            return resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f103s3fjYDxWOUexjjVgyA, strLEeR5KfoEr4xU5yHH7);
        }
        if (i == 5) {
            return IPyIQcaNa8aB7drBED(context, "common_google_play_services_invalid_account_text", strLEeR5KfoEr4xU5yHH7);
        }
        if (i == 7) {
            return IPyIQcaNa8aB7drBED(context, "common_google_play_services_network_error_text", strLEeR5KfoEr4xU5yHH7);
        }
        if (i == 9) {
            return resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f102pbVGzGjWvY2LDXC8vo, strLEeR5KfoEr4xU5yHH7);
        }
        if (i == 20) {
            return IPyIQcaNa8aB7drBED(context, "common_google_play_services_restricted_profile_text", strLEeR5KfoEr4xU5yHH7);
        }
        switch (i) {
            case 16:
                return IPyIQcaNa8aB7drBED(context, "common_google_play_services_api_unavailable_text", strLEeR5KfoEr4xU5yHH7);
            case 17:
                return IPyIQcaNa8aB7drBED(context, "common_google_play_services_sign_in_failed_text", strLEeR5KfoEr4xU5yHH7);
            case 18:
                return resources.getString(Er40JrQbOM51vCQI8w.s3fjYDxWOUexjjVgyA.f94T9PhQIpGRhE4yZDm1C, strLEeR5KfoEr4xU5yHH7);
            default:
                return resources.getString(f2zPq7MOnQrtOlZ1Zg.e54J8UWNHWALQNixXM.f5813lEeR5KfoEr4xU5yHH7, strLEeR5KfoEr4xU5yHH7);
        }
    }
}

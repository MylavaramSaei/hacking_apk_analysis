package SF66oTSCsXABfwyWiU;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class e2F9F6h8YJxTHwLCa0 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Bundle f1453lEeR5KfoEr4xU5yHH7;

    public e2F9F6h8YJxTHwLCa0(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f1453lEeR5KfoEr4xU5yHH7 = new Bundle(bundle);
    }

    public static boolean G7AC3DWIx9i9fdanjk(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    public static boolean R9SAhYMerGybF9OAjL(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(xHA29AmDt6y96AnB3t("gcm.n.e")));
    }

    public static String WWC27LAMFqFFBzfbNw(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean Y43RdunnpKgpbny0lE(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static String xHA29AmDt6y96AnB3t(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public static int zZKhbgvUfsK4AEX3r0(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public Bundle A49QRPHynYLCBN0SqP() {
        Bundle bundle = new Bundle(this.f1453lEeR5KfoEr4xU5yHH7);
        for (String str : this.f1453lEeR5KfoEr4xU5yHH7.keySet()) {
            if (!Y43RdunnpKgpbny0lE(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Long Acstmh57AKoSEkEFNJ(String str) {
        String strOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(str);
        if (TextUtils.isEmpty(strOANkd3mP6AYvwbNLJM)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strOANkd3mP6AYvwbNLJM));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + WWC27LAMFqFFBzfbNw(str) + "(" + strOANkd3mP6AYvwbNLJM + ") into a long");
            return null;
        }
    }

    public JSONArray HJFh0TGMpafqLE9haL(String str) {
        String strOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(str);
        if (TextUtils.isEmpty(strOANkd3mP6AYvwbNLJM)) {
            return null;
        }
        try {
            return new JSONArray(strOANkd3mP6AYvwbNLJM);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + WWC27LAMFqFFBzfbNw(str) + ": " + strOANkd3mP6AYvwbNLJM + ", falling back to default");
            return null;
        }
    }

    public String IPyIQcaNa8aB7drBED(String str) {
        return OANkd3mP6AYvwbNLJM(str + "_loc_key");
    }

    public Uri KYHag8HRDlnO3X9zmZ() {
        String strOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM("gcm.n.link_android");
        if (TextUtils.isEmpty(strOANkd3mP6AYvwbNLJM)) {
            strOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM("gcm.n.link");
        }
        if (TextUtils.isEmpty(strOANkd3mP6AYvwbNLJM)) {
            return null;
        }
        return Uri.parse(strOANkd3mP6AYvwbNLJM);
    }

    public final String LIMtzhnLwQyigzK0KO(String str) {
        if (!this.f1453lEeR5KfoEr4xU5yHH7.containsKey(str) && str.startsWith("gcm.n.")) {
            String strXHA29AmDt6y96AnB3t = xHA29AmDt6y96AnB3t(str);
            if (this.f1453lEeR5KfoEr4xU5yHH7.containsKey(strXHA29AmDt6y96AnB3t)) {
                return strXHA29AmDt6y96AnB3t;
            }
        }
        return str;
    }

    public String OANkd3mP6AYvwbNLJM(String str) {
        return this.f1453lEeR5KfoEr4xU5yHH7.getString(LIMtzhnLwQyigzK0KO(str));
    }

    public Integer T9PhQIpGRhE4yZDm1C() {
        Integer numS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA("gcm.n.notification_priority");
        if (numS3fjYDxWOUexjjVgyA == null) {
            return null;
        }
        if (numS3fjYDxWOUexjjVgyA.intValue() >= -2 && numS3fjYDxWOUexjjVgyA.intValue() <= 2) {
            return numS3fjYDxWOUexjjVgyA;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + numS3fjYDxWOUexjjVgyA + ". Skipping setting notificationPriority.");
        return null;
    }

    public Object[] TCyPEKSzIyweCN5yp1(String str) {
        JSONArray jSONArrayHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(str + "_loc_args");
        if (jSONArrayHJFh0TGMpafqLE9haL == null) {
            return null;
        }
        int length = jSONArrayHJFh0TGMpafqLE9haL.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayHJFh0TGMpafqLE9haL.optString(i);
        }
        return strArr;
    }

    public Bundle VItLRw50eXTZeEfGl0() {
        Bundle bundle = new Bundle(this.f1453lEeR5KfoEr4xU5yHH7);
        for (String str : this.f1453lEeR5KfoEr4xU5yHH7.keySet()) {
            if (G7AC3DWIx9i9fdanjk(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public String Z9WdNiOsPR0y54zHW4() {
        return OANkd3mP6AYvwbNLJM("gcm.n.android_channel_id");
    }

    public String aPyGSIylzVNKPT1Bls() {
        String strOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM("gcm.n.sound2");
        return TextUtils.isEmpty(strOANkd3mP6AYvwbNLJM) ? OANkd3mP6AYvwbNLJM("gcm.n.sound") : strOANkd3mP6AYvwbNLJM;
    }

    public Integer e54J8UWNHWALQNixXM() {
        Integer numS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA("gcm.n.notification_count");
        if (numS3fjYDxWOUexjjVgyA == null) {
            return null;
        }
        if (numS3fjYDxWOUexjjVgyA.intValue() >= 0) {
            return numS3fjYDxWOUexjjVgyA;
        }
        Log.w("FirebaseMessaging", "notificationCount is invalid: " + numS3fjYDxWOUexjjVgyA + ". Skipping setting notificationCount.");
        return null;
    }

    public String hoXrIDAFrSwfShk8da(Resources resources, String str, String str2) {
        String strOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(str2);
        return !TextUtils.isEmpty(strOANkd3mP6AYvwbNLJM) ? strOANkd3mP6AYvwbNLJM : pbVGzGjWvY2LDXC8vo(resources, str, str2);
    }

    public int[] husNiw3snxdgZPAGJm() throws JSONException {
        String str;
        JSONArray jSONArrayHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL("gcm.n.light_settings");
        if (jSONArrayHJFh0TGMpafqLE9haL == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayHJFh0TGMpafqLE9haL.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = zZKhbgvUfsK4AEX3r0(jSONArrayHJFh0TGMpafqLE9haL.optString(0));
            iArr[1] = jSONArrayHJFh0TGMpafqLE9haL.optInt(1);
            iArr[2] = jSONArrayHJFh0TGMpafqLE9haL.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            str = "LightSettings is invalid: " + jSONArrayHJFh0TGMpafqLE9haL + ". " + e.getMessage() + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        } catch (JSONException unused) {
            str = "LightSettings is invalid: " + jSONArrayHJFh0TGMpafqLE9haL + ". Skipping setting LightSettings";
            Log.w("NotificationParams", str);
            return null;
        }
    }

    public boolean lEeR5KfoEr4xU5yHH7(String str) {
        String strOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(str);
        return "1".equals(strOANkd3mP6AYvwbNLJM) || Boolean.parseBoolean(strOANkd3mP6AYvwbNLJM);
    }

    public String pbVGzGjWvY2LDXC8vo(Resources resources, String str, String str2) {
        String strIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(str2);
        if (TextUtils.isEmpty(strIPyIQcaNa8aB7drBED)) {
            return null;
        }
        int identifier = resources.getIdentifier(strIPyIQcaNa8aB7drBED, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", WWC27LAMFqFFBzfbNw(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(str2);
        if (objArrTCyPEKSzIyweCN5yp1 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrTCyPEKSzIyweCN5yp1);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + WWC27LAMFqFFBzfbNw(str2) + ": " + Arrays.toString(objArrTCyPEKSzIyweCN5yp1) + " Default value will be used.", e);
            return null;
        }
    }

    public Integer s3fjYDxWOUexjjVgyA(String str) {
        String strOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(str);
        if (TextUtils.isEmpty(strOANkd3mP6AYvwbNLJM)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strOANkd3mP6AYvwbNLJM));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + WWC27LAMFqFFBzfbNw(str) + "(" + strOANkd3mP6AYvwbNLJM + ") into an int");
            return null;
        }
    }

    public Integer sTkWmhpZ5b1ArQIw4K() {
        Integer numS3fjYDxWOUexjjVgyA = s3fjYDxWOUexjjVgyA("gcm.n.visibility");
        if (numS3fjYDxWOUexjjVgyA == null) {
            return null;
        }
        if (numS3fjYDxWOUexjjVgyA.intValue() >= -1 && numS3fjYDxWOUexjjVgyA.intValue() <= 1) {
            return numS3fjYDxWOUexjjVgyA;
        }
        Log.w("NotificationParams", "visibility is invalid: " + numS3fjYDxWOUexjjVgyA + ". Skipping setting visibility.");
        return null;
    }

    public long[] zaq8hOURtfwbcX17cG() throws JSONException {
        JSONArray jSONArrayHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL("gcm.n.vibrate_timings");
        if (jSONArrayHJFh0TGMpafqLE9haL == null) {
            return null;
        }
        try {
            if (jSONArrayHJFh0TGMpafqLE9haL.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayHJFh0TGMpafqLE9haL.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayHJFh0TGMpafqLE9haL.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayHJFh0TGMpafqLE9haL + ". Skipping setting vibrateTimings.");
            return null;
        }
    }
}

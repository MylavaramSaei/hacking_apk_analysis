package fB1XGht2x9XoIgekQ8;

import HR5vAalpgOKVm2T0Gq.hoXrIDAFrSwfShk8da;
import JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import fB1XGht2x9XoIgekQ8.KYHag8HRDlnO3X9zmZ;
import fB1XGht2x9XoIgekQ8.zZKhbgvUfsK4AEX3r0;
import fDXXEWvhMVO3O8mnuS.TCyPEKSzIyweCN5yp1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import w859GrF8FXGM1qrYSH.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final husNiw3snxdgZPAGJm f5827HJFh0TGMpafqLE9haL = new husNiw3snxdgZPAGJm();

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f5828lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA f5829s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public static final Pattern f5826zZKhbgvUfsK4AEX3r0 = Pattern.compile("[0-9]+s");

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public static final Charset f5825husNiw3snxdgZPAGJm = Charset.forName("UTF-8");

    public HJFh0TGMpafqLE9haL(Context context, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
        this.f5828lEeR5KfoEr4xU5yHH7 = context;
        this.f5829s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya;
    }

    public static void Acstmh57AKoSEkEFNJ() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    public static JSONObject HJFh0TGMpafqLE9haL() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public static byte[] IPyIQcaNa8aB7drBED(JSONObject jSONObject) {
        return jSONObject.toString().getBytes("UTF-8");
    }

    public static long T9PhQIpGRhE4yZDm1C(String str) {
        hoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA(f5826zZKhbgvUfsK4AEX3r0.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void Y43RdunnpKgpbny0lE(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void Z9WdNiOsPR0y54zHW4(HttpURLConnection httpURLConnection, String str, String str2, String str3) throws IOException {
        String strAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(httpURLConnection);
        if (TextUtils.isEmpty(strAPyGSIylzVNKPT1Bls)) {
            return;
        }
        Log.w("Firebase-Installations", strAPyGSIylzVNKPT1Bls);
        Log.w("Firebase-Installations", lEeR5KfoEr4xU5yHH7(str, str2, str3));
    }

    public static String aPyGSIylzVNKPT1Bls(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f5825husNiw3snxdgZPAGJm));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    public static String lEeR5KfoEr4xU5yHH7(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", str2, str3, str4);
    }

    public static boolean pbVGzGjWvY2LDXC8vo(int i) {
        return i >= 200 && i < 300;
    }

    public static JSONObject s3fjYDxWOUexjjVgyA(String str, String str2) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String KYHag8HRDlnO3X9zmZ() {
        try {
            Context context = this.f5828lEeR5KfoEr4xU5yHH7;
            byte[] bArrLEeR5KfoEr4xU5yHH7 = fDXXEWvhMVO3O8mnuS.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(context, context.getPackageName());
            if (bArrLEeR5KfoEr4xU5yHH7 != null) {
                return TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(bArrLEeR5KfoEr4xU5yHH7, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f5828lEeR5KfoEr4xU5yHH7.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.f5828lEeR5KfoEr4xU5yHH7.getPackageName(), e);
            return null;
        }
    }

    public final KYHag8HRDlnO3X9zmZ OANkd3mP6AYvwbNLJM(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f5825husNiw3snxdgZPAGJm));
        KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH72 = KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                lEeR5KfoEr4xU5yHH72.HJFh0TGMpafqLE9haL(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                lEeR5KfoEr4xU5yHH72.zZKhbgvUfsK4AEX3r0(T9PhQIpGRhE4yZDm1C(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return lEeR5KfoEr4xU5yHH72.s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.OK).lEeR5KfoEr4xU5yHH7();
    }

    public final URL TCyPEKSzIyweCN5yp1(String str) throws pbVGzGjWvY2LDXC8vo {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new pbVGzGjWvY2LDXC8vo(e.getMessage(), pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.UNAVAILABLE);
        }
    }

    public final HttpURLConnection e54J8UWNHWALQNixXM(URL url, String str) throws pbVGzGjWvY2LDXC8vo {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f5828lEeR5KfoEr4xU5yHH7.getPackageName());
            zQjb36M22TWHJmh54i.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = (zQjb36M22TWHJmh54i.pbVGzGjWvY2LDXC8vo) this.f5829s3fjYDxWOUexjjVgyA.get();
            if (pbvgzgjwvy2ldxc8vo != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(pbvgzgjwvy2ldxc8vo.lEeR5KfoEr4xU5yHH7()));
                } catch (InterruptedException e) {
                    e = e;
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    httpURLConnection.addRequestProperty("X-Android-Cert", KYHag8HRDlnO3X9zmZ());
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                } catch (ExecutionException e2) {
                    e = e2;
                    Log.w("ContentValues", "Failed to get heartbeats header", e);
                    httpURLConnection.addRequestProperty("X-Android-Cert", KYHag8HRDlnO3X9zmZ());
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", KYHag8HRDlnO3X9zmZ());
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new pbVGzGjWvY2LDXC8vo("Firebase Installations Service is unavailable. Please try again later.", pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.UNAVAILABLE);
        }
    }

    public final zZKhbgvUfsK4AEX3r0 hoXrIDAFrSwfShk8da(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f5825husNiw3snxdgZPAGJm));
        KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH72 = KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7();
        zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH73 = zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                lEeR5KfoEr4xU5yHH73.KYHag8HRDlnO3X9zmZ(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                lEeR5KfoEr4xU5yHH73.HJFh0TGMpafqLE9haL(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                lEeR5KfoEr4xU5yHH73.zZKhbgvUfsK4AEX3r0(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        lEeR5KfoEr4xU5yHH72.HJFh0TGMpafqLE9haL(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        lEeR5KfoEr4xU5yHH72.zZKhbgvUfsK4AEX3r0(T9PhQIpGRhE4yZDm1C(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                lEeR5KfoEr4xU5yHH73.s3fjYDxWOUexjjVgyA(lEeR5KfoEr4xU5yHH72.lEeR5KfoEr4xU5yHH7());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return lEeR5KfoEr4xU5yHH73.husNiw3snxdgZPAGJm(zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA.OK).lEeR5KfoEr4xU5yHH7();
    }

    public KYHag8HRDlnO3X9zmZ husNiw3snxdgZPAGJm(String str, String str2, String str3, String str4) {
        int responseCode;
        KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZOANkd3mP6AYvwbNLJM;
        KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA;
        if (!this.f5827HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA()) {
            throw new pbVGzGjWvY2LDXC8vo("Firebase Installations Service is unavailable. Please try again later.", pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.UNAVAILABLE);
        }
        URL urlTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(urlTCyPEKSzIyweCN5yp1, str);
            try {
                try {
                    httpURLConnectionE54J8UWNHWALQNixXM.setRequestMethod("POST");
                    httpURLConnectionE54J8UWNHWALQNixXM.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionE54J8UWNHWALQNixXM.setDoOutput(true);
                    sTkWmhpZ5b1ArQIw4K(httpURLConnectionE54J8UWNHWALQNixXM);
                    responseCode = httpURLConnectionE54J8UWNHWALQNixXM.getResponseCode();
                    this.f5827HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(responseCode);
                } finally {
                    httpURLConnectionE54J8UWNHWALQNixXM.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (pbVGzGjWvY2LDXC8vo(responseCode)) {
                kYHag8HRDlnO3X9zmZOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM(httpURLConnectionE54J8UWNHWALQNixXM);
            } else {
                Z9WdNiOsPR0y54zHW4(httpURLConnectionE54J8UWNHWALQNixXM, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA = KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7().s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.AUTH_ERROR);
                    kYHag8HRDlnO3X9zmZOANkd3mP6AYvwbNLJM = leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
                } else {
                    if (responseCode == 429) {
                        throw new pbVGzGjWvY2LDXC8vo("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Acstmh57AKoSEkEFNJ();
                        leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA = KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7().s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.BAD_CONFIG);
                        kYHag8HRDlnO3X9zmZOANkd3mP6AYvwbNLJM = leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7();
                    }
                }
            }
            return kYHag8HRDlnO3X9zmZOANkd3mP6AYvwbNLJM;
        }
        throw new pbVGzGjWvY2LDXC8vo("Firebase Installations Service is unavailable. Please try again later.", pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.UNAVAILABLE);
    }

    public final void sTkWmhpZ5b1ArQIw4K(HttpURLConnection httpURLConnection) throws IOException {
        Y43RdunnpKgpbny0lE(httpURLConnection, IPyIQcaNa8aB7drBED(HJFh0TGMpafqLE9haL()));
    }

    public zZKhbgvUfsK4AEX3r0 zZKhbgvUfsK4AEX3r0(String str, String str2, String str3, String str4, String str5) {
        int responseCode;
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0HoXrIDAFrSwfShk8da;
        if (!this.f5827HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA()) {
            throw new pbVGzGjWvY2LDXC8vo("Firebase Installations Service is unavailable. Please try again later.", pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.UNAVAILABLE);
        }
        URL urlTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(String.format("projects/%s/installations", str3));
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionE54J8UWNHWALQNixXM = e54J8UWNHWALQNixXM(urlTCyPEKSzIyweCN5yp1, str);
            try {
                try {
                    httpURLConnectionE54J8UWNHWALQNixXM.setRequestMethod("POST");
                    httpURLConnectionE54J8UWNHWALQNixXM.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionE54J8UWNHWALQNixXM.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                    }
                    zaq8hOURtfwbcX17cG(httpURLConnectionE54J8UWNHWALQNixXM, str2, str4);
                    responseCode = httpURLConnectionE54J8UWNHWALQNixXM.getResponseCode();
                    this.f5827HJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (pbVGzGjWvY2LDXC8vo(responseCode)) {
                    zzkhbgvufsk4aex3r0HoXrIDAFrSwfShk8da = hoXrIDAFrSwfShk8da(httpURLConnectionE54J8UWNHWALQNixXM);
                } else {
                    Z9WdNiOsPR0y54zHW4(httpURLConnectionE54J8UWNHWALQNixXM, str4, str, str3);
                    if (responseCode == 429) {
                        throw new pbVGzGjWvY2LDXC8vo("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Acstmh57AKoSEkEFNJ();
                        zzkhbgvufsk4aex3r0HoXrIDAFrSwfShk8da = zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7().husNiw3snxdgZPAGJm(zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA.BAD_CONFIG).lEeR5KfoEr4xU5yHH7();
                    }
                    httpURLConnectionE54J8UWNHWALQNixXM.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionE54J8UWNHWALQNixXM.disconnect();
                TrafficStats.clearThreadStatsTag();
                return zzkhbgvufsk4aex3r0HoXrIDAFrSwfShk8da;
            } catch (Throwable th) {
                httpURLConnectionE54J8UWNHWALQNixXM.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new pbVGzGjWvY2LDXC8vo("Firebase Installations Service is unavailable. Please try again later.", pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7.UNAVAILABLE);
    }

    public final void zaq8hOURtfwbcX17cG(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        Y43RdunnpKgpbny0lE(httpURLConnection, IPyIQcaNa8aB7drBED(s3fjYDxWOUexjjVgyA(str, str2)));
    }
}

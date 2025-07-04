package Pum9NZyDBKoCnecvlx;

import F8je6vTkTMHm5WbjEC.THTDvPxsHqMeGb512f;
import GraqRgO5nDZP94CSeH.Acstmh57AKoSEkEFNJ;
import GraqRgO5nDZP94CSeH.IPyIQcaNa8aB7drBED;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo;
import org.json.JSONObject;
import pjij9fAFhRRn230kOs.hoXrIDAFrSwfShk8da;

/* loaded from: classes.dex */
public final class HJFh0TGMpafqLE9haL {

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public static final lEeR5KfoEr4xU5yHH7 f1312Acstmh57AKoSEkEFNJ = new lEeR5KfoEr4xU5yHH7(null);

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public static final HJFh0TGMpafqLE9haL f1313Z9WdNiOsPR0y54zHW4 = new HJFh0TGMpafqLE9haL();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public String f1314HJFh0TGMpafqLE9haL;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public String f1317TCyPEKSzIyweCN5yp1;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f1318husNiw3snxdgZPAGJm;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final Map f1320pbVGzGjWvY2LDXC8vo;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final String f1319lEeR5KfoEr4xU5yHH7 = "aptabase-kotlin@0.0.8";

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final long f1321s3fjYDxWOUexjjVgyA = TimeUnit.HOURS.toMillis(1);

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public UUID f1322zZKhbgvUfsK4AEX3r0 = UUID.randomUUID();

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public Date f1316KYHag8HRDlnO3X9zmZ = new Date();

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final ExecutorService f1315IPyIQcaNa8aB7drBED = Executors.newFixedThreadPool(5);

    public static final class lEeR5KfoEr4xU5yHH7 {
        public lEeR5KfoEr4xU5yHH7() {
        }

        public final HJFh0TGMpafqLE9haL lEeR5KfoEr4xU5yHH7() {
            return HJFh0TGMpafqLE9haL.f1313Z9WdNiOsPR0y54zHW4;
        }

        public /* synthetic */ lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
            this();
        }
    }

    public HJFh0TGMpafqLE9haL() {
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() { // from class: Pum9NZyDBKoCnecvlx.lEeR5KfoEr4xU5yHH7
            @Override // java.lang.Runnable
            public final void run() {
                HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(this.f1332lEeR5KfoEr4xU5yHH7);
            }
        }));
        this.f1320pbVGzGjWvY2LDXC8vo = THTDvPxsHqMeGb512f.husNiw3snxdgZPAGJm(IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("US", "https://us.aptabase.com"), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("EU", "https://eu.aptabase.com"), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("DEV", "http://localhost:3000"), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("SH", ""));
    }

    public static final void Acstmh57AKoSEkEFNJ(String str, String str2, JSONObject jSONObject) throws IOException {
        String message;
        StringBuilder sb;
        String str3;
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "$apiURL");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str2, "$appKey");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(jSONObject, "$body");
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            HttpURLConnection httpURLConnection = uRLConnectionOpenConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnectionOpenConnection : null;
            if (httpURLConnection != null) {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("App-Key", str2);
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setDoOutput(true);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream()));
                try {
                    bufferedWriter.write(jSONObject.toString());
                    Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = Acstmh57AKoSEkEFNJ.f265lEeR5KfoEr4xU5yHH7;
                    h3D8MhcyLuC2SOP1fB.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(bufferedWriter, null);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode >= 300) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(inputStream, "getInputStream(...)");
                        Reader inputStreamReader = new InputStreamReader(inputStream, pjij9fAFhRRn230kOs.HJFh0TGMpafqLE9haL.f6573s3fjYDxWOUexjjVgyA);
                        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                        try {
                            String strHJFh0TGMpafqLE9haL = h3D8MhcyLuC2SOP1fB.s3fjYDxWOUexjjVgyA.HJFh0TGMpafqLE9haL(bufferedReader);
                            h3D8MhcyLuC2SOP1fB.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(bufferedReader, null);
                            System.out.println((Object) ("trackEvent failed with status code " + responseCode + ": " + ((Object) strHJFh0TGMpafqLE9haL)));
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                h3D8MhcyLuC2SOP1fB.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(bufferedReader, th);
                                throw th2;
                            }
                        }
                    }
                    httpURLConnection.disconnect();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        h3D8MhcyLuC2SOP1fB.lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(bufferedWriter, th3);
                        throw th4;
                    }
                }
            }
        } catch (MalformedURLException e) {
            message = e.getMessage();
            sb = new StringBuilder();
            str3 = "Malformed URL: ";
            sb.append(str3);
            sb.append(message);
            System.out.println((Object) sb.toString());
        } catch (IOException e2) {
            message = e2.getMessage();
            sb = new StringBuilder();
            str3 = "Connection Error: ";
            sb.append(str3);
            sb.append(message);
            System.out.println((Object) sb.toString());
        } catch (Exception e3) {
            message = e3.getMessage();
            sb = new StringBuilder();
            str3 = "Unexpected exception: ";
            sb.append(str3);
            sb.append(message);
            System.out.println((Object) sb.toString());
        }
    }

    public static final void HJFh0TGMpafqLE9haL(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(hJFh0TGMpafqLE9haL, "this$0");
        hJFh0TGMpafqLE9haL.f1315IPyIQcaNa8aB7drBED.shutdown();
    }

    public static final HJFh0TGMpafqLE9haL TCyPEKSzIyweCN5yp1() {
        return f1312Acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7();
    }

    public final void IPyIQcaNa8aB7drBED(Context context, String str, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(context, "context");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "appKey");
        List listXHA29AmDt6y96AnB3t = hoXrIDAFrSwfShk8da.xHA29AmDt6y96AnB3t(str, new String[]{"-"}, false, 0, 6, null);
        if (listXHA29AmDt6y96AnB3t.size() == 3 && this.f1320pbVGzGjWvY2LDXC8vo.containsKey(listXHA29AmDt6y96AnB3t.get(1))) {
            this.f1317TCyPEKSzIyweCN5yp1 = husNiw3snxdgZPAGJm((String) listXHA29AmDt6y96AnB3t.get(1), kYHag8HRDlnO3X9zmZ);
            this.f1314HJFh0TGMpafqLE9haL = str;
            this.f1318husNiw3snxdgZPAGJm = husNiw3snxdgZPAGJm.f1324IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(context);
        } else {
            System.out.println((Object) ("The Aptabase App Key " + str + " is invalid. Tracking will be disabled."));
        }
    }

    public final SimpleDateFormat KYHag8HRDlnO3X9zmZ() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public final String husNiw3snxdgZPAGJm(String str, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        String strLEeR5KfoEr4xU5yHH7 = (String) this.f1320pbVGzGjWvY2LDXC8vo.get(str);
        if (strLEeR5KfoEr4xU5yHH7 == null) {
            throw new IllegalStateException("Region not found".toString());
        }
        if (pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(str, "SH") && (kYHag8HRDlnO3X9zmZ == null || (strLEeR5KfoEr4xU5yHH7 = kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7()) == null)) {
            System.out.println((Object) "Host parameter must be defined when using Self-Hosted App Key. Tracking will be disabled.");
            return null;
        }
        return strLEeR5KfoEr4xU5yHH7 + "/api/v0/event";
    }

    public final void pbVGzGjWvY2LDXC8vo(String str, Map map) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm;
        final String str2;
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "eventName");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(map, "props");
        final String str3 = this.f1314HJFh0TGMpafqLE9haL;
        if (str3 == null || (husniw3snxdgzpagjm = this.f1318husNiw3snxdgZPAGJm) == null || (str2 = this.f1317TCyPEKSzIyweCN5yp1) == null) {
            return;
        }
        Date date = new Date();
        if (date.getTime() - this.f1316KYHag8HRDlnO3X9zmZ.getTime() > this.f1321s3fjYDxWOUexjjVgyA) {
            this.f1322zZKhbgvUfsK4AEX3r0 = UUID.randomUUID();
        }
        this.f1316KYHag8HRDlnO3X9zmZ = date;
        GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZLEeR5KfoEr4xU5yHH7 = IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("timestamp", KYHag8HRDlnO3X9zmZ().format(new Date()));
        String string = this.f1322zZKhbgvUfsK4AEX3r0.toString();
        pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(string, "toString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(lowerCase, "toLowerCase(...)");
        final JSONObject jSONObject = new JSONObject(THTDvPxsHqMeGb512f.husNiw3snxdgZPAGJm(kYHag8HRDlnO3X9zmZLEeR5KfoEr4xU5yHH7, IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("sessionId", lowerCase), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("eventName", str), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("systemProps", THTDvPxsHqMeGb512f.husNiw3snxdgZPAGJm(IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("isDebug", Boolean.valueOf(husniw3snxdgzpagjm.husNiw3snxdgZPAGJm())), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("osName", "Android"), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("osVersion", Build.VERSION.RELEASE), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("locale", husniw3snxdgzpagjm.zZKhbgvUfsK4AEX3r0()), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("appVersion", husniw3snxdgzpagjm.s3fjYDxWOUexjjVgyA()), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("appBuildNumber", husniw3snxdgzpagjm.lEeR5KfoEr4xU5yHH7()), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("sdkVersion", this.f1319lEeR5KfoEr4xU5yHH7), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("deviceModel", husniw3snxdgzpagjm.HJFh0TGMpafqLE9haL()))), IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7("props", map)));
        this.f1315IPyIQcaNa8aB7drBED.execute(new Runnable() { // from class: Pum9NZyDBKoCnecvlx.s3fjYDxWOUexjjVgyA
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                HJFh0TGMpafqLE9haL.Acstmh57AKoSEkEFNJ(str2, str3, jSONObject);
            }
        });
    }
}

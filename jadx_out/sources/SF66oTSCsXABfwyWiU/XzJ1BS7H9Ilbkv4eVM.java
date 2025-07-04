package SF66oTSCsXABfwyWiU;

import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public class XzJ1BS7H9Ilbkv4eVM {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Ywqw2A0s86HeuFkDt0.HJFh0TGMpafqLE9haL f1425HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final w859GrF8FXGM1qrYSH.IPyIQcaNa8aB7drBED f1426KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA f1427husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm f1428lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final DfpieXfdYs58yZAiXY f1429s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA f1430zZKhbgvUfsK4AEX3r0;

    public XzJ1BS7H9Ilbkv4eVM(sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY, Ywqw2A0s86HeuFkDt0.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2, w859GrF8FXGM1qrYSH.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
        this.f1428lEeR5KfoEr4xU5yHH7 = husniw3snxdgzpagjm;
        this.f1429s3fjYDxWOUexjjVgyA = dfpieXfdYs58yZAiXY;
        this.f1425HJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL;
        this.f1430zZKhbgvUfsK4AEX3r0 = s3fjydxwouexjjvgya;
        this.f1427husNiw3snxdgZPAGJm = s3fjydxwouexjjvgya2;
        this.f1426KYHag8HRDlnO3X9zmZ = iPyIQcaNa8aB7drBED;
    }

    public static boolean IPyIQcaNa8aB7drBED(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    public static String s3fjYDxWOUexjjVgyA(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Acstmh57AKoSEkEFNJ(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "scope"
            r5.putString(r1, r4)
            java.lang.String r4 = "sender"
            r5.putString(r4, r3)
            java.lang.String r4 = "subtype"
            r5.putString(r4, r3)
            sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm r3 = r2.f1428lEeR5KfoEr4xU5yHH7
            sKw6Jz5uGcQ479KwIW.Z9WdNiOsPR0y54zHW4 r3 = r3.T9PhQIpGRhE4yZDm1C()
            java.lang.String r3 = r3.HJFh0TGMpafqLE9haL()
            java.lang.String r4 = "gmp_app_id"
            r5.putString(r4, r3)
            SF66oTSCsXABfwyWiU.DfpieXfdYs58yZAiXY r3 = r2.f1429s3fjYDxWOUexjjVgyA
            int r3 = r3.zZKhbgvUfsK4AEX3r0()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "gmsv"
            r5.putString(r4, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r4 = "osv"
            r5.putString(r4, r3)
            SF66oTSCsXABfwyWiU.DfpieXfdYs58yZAiXY r3 = r2.f1429s3fjYDxWOUexjjVgyA
            java.lang.String r3 = r3.lEeR5KfoEr4xU5yHH7()
            java.lang.String r4 = "app_ver"
            r5.putString(r4, r3)
            SF66oTSCsXABfwyWiU.DfpieXfdYs58yZAiXY r3 = r2.f1429s3fjYDxWOUexjjVgyA
            java.lang.String r3 = r3.s3fjYDxWOUexjjVgyA()
            java.lang.String r4 = "app_ver_name"
            r5.putString(r4, r3)
            java.lang.String r3 = "firebase-app-name-hash"
            java.lang.String r4 = r2.zZKhbgvUfsK4AEX3r0()
            r5.putString(r3, r4)
            w859GrF8FXGM1qrYSH.IPyIQcaNa8aB7drBED r3 = r2.f1426KYHag8HRDlnO3X9zmZ     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            r4 = 0
            JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo r3 = r3.s3fjYDxWOUexjjVgyA(r4)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.Object r3 = JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C r3 = (w859GrF8FXGM1qrYSH.T9PhQIpGRhE4yZDm1C) r3     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            java.lang.String r3 = r3.s3fjYDxWOUexjjVgyA()     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            if (r4 != 0) goto L7a
            java.lang.String r4 = "Goog-Firebase-Installations-Auth"
            r5.putString(r4, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L76:
            r3 = move-exception
            goto L80
        L78:
            r3 = move-exception
            goto L80
        L7a:
            java.lang.String r3 = "FIS auth token is empty"
            android.util.Log.w(r0, r3)     // Catch: java.lang.InterruptedException -> L76 java.util.concurrent.ExecutionException -> L78
            goto L85
        L80:
            java.lang.String r4 = "Failed to get FIS auth token"
            android.util.Log.e(r0, r4, r3)
        L85:
            w859GrF8FXGM1qrYSH.IPyIQcaNa8aB7drBED r3 = r2.f1426KYHag8HRDlnO3X9zmZ
            JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo r3 = r3.lEeR5KfoEr4xU5yHH7()
            java.lang.Object r3 = JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.lEeR5KfoEr4xU5yHH7(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "appid"
            r5.putString(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "fcm-"
            r3.append(r4)
            java.lang.String r4 = "24.1.0"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "cliv"
            r5.putString(r4, r3)
            xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA r3 = r2.f1427husNiw3snxdgZPAGJm
            java.lang.Object r3 = r3.get()
            zQjb36M22TWHJmh54i.Acstmh57AKoSEkEFNJ r3 = (zQjb36M22TWHJmh54i.Acstmh57AKoSEkEFNJ) r3
            xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA r4 = r2.f1430zZKhbgvUfsK4AEX3r0
            java.lang.Object r4 = r4.get()
            Tn7MuV14fPMb1UrB5h.pbVGzGjWvY2LDXC8vo r4 = (Tn7MuV14fPMb1UrB5h.pbVGzGjWvY2LDXC8vo) r4
            if (r3 == 0) goto Le2
            if (r4 == 0) goto Le2
            java.lang.String r0 = "fire-iid"
            zQjb36M22TWHJmh54i.Acstmh57AKoSEkEFNJ$lEeR5KfoEr4xU5yHH7 r3 = r3.s3fjYDxWOUexjjVgyA(r0)
            zQjb36M22TWHJmh54i.Acstmh57AKoSEkEFNJ$lEeR5KfoEr4xU5yHH7 r0 = zQjb36M22TWHJmh54i.Acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7.NONE
            if (r3 == r0) goto Le2
            int r3 = r3.s3fjYDxWOUexjjVgyA()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r0 = "Firebase-Client-Log-Type"
            r5.putString(r0, r3)
            java.lang.String r3 = "Firebase-Client"
            java.lang.String r4 = r4.lEeR5KfoEr4xU5yHH7()
            r5.putString(r3, r4)
        Le2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SF66oTSCsXABfwyWiU.XzJ1BS7H9Ilbkv4eVM.Acstmh57AKoSEkEFNJ(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo HJFh0TGMpafqLE9haL(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        return pbvgzgjwvy2ldxc8vo.IPyIQcaNa8aB7drBED(new hUNBy66ZO1wVLJGW3l.husNiw3snxdgZPAGJm(), new JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7() { // from class: SF66oTSCsXABfwyWiU.jCtUeU2YI1poCxWcjm
            @Override // JXsqbvi9UKxeF3HXpU.lEeR5KfoEr4xU5yHH7
            public final Object lEeR5KfoEr4xU5yHH7(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo2) {
                return this.f1469lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(pbvgzgjwvy2ldxc8vo2);
            }
        });
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo KYHag8HRDlnO3X9zmZ() {
        return HJFh0TGMpafqLE9haL(e54J8UWNHWALQNixXM(DfpieXfdYs58yZAiXY.HJFh0TGMpafqLE9haL(this.f1428lEeR5KfoEr4xU5yHH7), "*", new Bundle()));
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo T9PhQIpGRhE4yZDm1C(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return HJFh0TGMpafqLE9haL(e54J8UWNHWALQNixXM(str, "/topics/" + str2, bundle));
    }

    public final String TCyPEKSzIyweCN5yp1(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo Z9WdNiOsPR0y54zHW4(boolean z) {
        return this.f1425HJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(z);
    }

    public final JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo e54J8UWNHWALQNixXM(String str, String str2, Bundle bundle) {
        try {
            Acstmh57AKoSEkEFNJ(str, str2, bundle);
            return this.f1425HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return JXsqbvi9UKxeF3HXpU.e54J8UWNHWALQNixXM.zZKhbgvUfsK4AEX3r0(e);
        }
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo hoXrIDAFrSwfShk8da(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return HJFh0TGMpafqLE9haL(e54J8UWNHWALQNixXM(str, "/topics/" + str2, bundle));
    }

    public JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo husNiw3snxdgZPAGJm() {
        return this.f1425HJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
    }

    public final /* synthetic */ String pbVGzGjWvY2LDXC8vo(JXsqbvi9UKxeF3HXpU.pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        return TCyPEKSzIyweCN5yp1((Bundle) pbvgzgjwvy2ldxc8vo.e54J8UWNHWALQNixXM(IOException.class));
    }

    public final String zZKhbgvUfsK4AEX3r0() {
        try {
            return s3fjYDxWOUexjjVgyA(MessageDigest.getInstance("SHA-1").digest(this.f1428lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public XzJ1BS7H9Ilbkv4eVM(sKw6Jz5uGcQ479KwIW.husNiw3snxdgZPAGJm husniw3snxdgzpagjm, DfpieXfdYs58yZAiXY dfpieXfdYs58yZAiXY, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, xt9LcS8xZRgoStfDrh.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2, w859GrF8FXGM1qrYSH.IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
        this(husniw3snxdgzpagjm, dfpieXfdYs58yZAiXY, new Ywqw2A0s86HeuFkDt0.HJFh0TGMpafqLE9haL(husniw3snxdgzpagjm.Acstmh57AKoSEkEFNJ()), s3fjydxwouexjjvgya, s3fjydxwouexjjvgya2, iPyIQcaNa8aB7drBED);
    }
}

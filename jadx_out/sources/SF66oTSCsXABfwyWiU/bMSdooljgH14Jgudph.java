package SF66oTSCsXABfwyWiU;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bMSdooljgH14Jgudph {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final String f1441HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final Executor f1443husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final SharedPreferences f1444lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final String f1445s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final ArrayDeque f1446zZKhbgvUfsK4AEX3r0 = new ArrayDeque();

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f1442KYHag8HRDlnO3X9zmZ = false;

    public bMSdooljgH14Jgudph(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f1444lEeR5KfoEr4xU5yHH7 = sharedPreferences;
        this.f1445s3fjYDxWOUexjjVgyA = str;
        this.f1441HJFh0TGMpafqLE9haL = str2;
        this.f1443husNiw3snxdgZPAGJm = executor;
    }

    public static bMSdooljgH14Jgudph zZKhbgvUfsK4AEX3r0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        bMSdooljgH14Jgudph bmsdooljgh14jgudph = new bMSdooljgH14Jgudph(sharedPreferences, str, str2, executor);
        bmsdooljgh14jgudph.husNiw3snxdgZPAGJm();
        return bmsdooljgh14jgudph;
    }

    public final void Acstmh57AKoSEkEFNJ() {
        this.f1443husNiw3snxdgZPAGJm.execute(new Runnable() { // from class: SF66oTSCsXABfwyWiU.hUNBy66ZO1wVLJGW3l
            @Override // java.lang.Runnable
            public final void run() {
                this.f1463lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo();
            }
        });
    }

    public final boolean HJFh0TGMpafqLE9haL(boolean z) {
        if (z && !this.f1442KYHag8HRDlnO3X9zmZ) {
            Acstmh57AKoSEkEFNJ();
        }
        return z;
    }

    public String IPyIQcaNa8aB7drBED() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f1446zZKhbgvUfsK4AEX3r0.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f1441HJFh0TGMpafqLE9haL);
        }
        return sb.toString();
    }

    public String KYHag8HRDlnO3X9zmZ() {
        String str;
        synchronized (this.f1446zZKhbgvUfsK4AEX3r0) {
            str = (String) this.f1446zZKhbgvUfsK4AEX3r0.peek();
        }
        return str;
    }

    public boolean TCyPEKSzIyweCN5yp1(Object obj) {
        boolean zHJFh0TGMpafqLE9haL;
        synchronized (this.f1446zZKhbgvUfsK4AEX3r0) {
            zHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(this.f1446zZKhbgvUfsK4AEX3r0.remove(obj));
        }
        return zHJFh0TGMpafqLE9haL;
    }

    public final void husNiw3snxdgZPAGJm() {
        synchronized (this.f1446zZKhbgvUfsK4AEX3r0) {
            try {
                this.f1446zZKhbgvUfsK4AEX3r0.clear();
                String string = this.f1444lEeR5KfoEr4xU5yHH7.getString(this.f1445s3fjYDxWOUexjjVgyA, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f1441HJFh0TGMpafqLE9haL)) {
                    String[] strArrSplit = string.split(this.f1441HJFh0TGMpafqLE9haL, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f1446zZKhbgvUfsK4AEX3r0.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void pbVGzGjWvY2LDXC8vo() {
        synchronized (this.f1446zZKhbgvUfsK4AEX3r0) {
            this.f1444lEeR5KfoEr4xU5yHH7.edit().putString(this.f1445s3fjYDxWOUexjjVgyA, IPyIQcaNa8aB7drBED()).commit();
        }
    }

    public boolean s3fjYDxWOUexjjVgyA(String str) {
        boolean zHJFh0TGMpafqLE9haL;
        if (TextUtils.isEmpty(str) || str.contains(this.f1441HJFh0TGMpafqLE9haL)) {
            return false;
        }
        synchronized (this.f1446zZKhbgvUfsK4AEX3r0) {
            zHJFh0TGMpafqLE9haL = HJFh0TGMpafqLE9haL(this.f1446zZKhbgvUfsK4AEX3r0.add(str));
        }
        return zHJFh0TGMpafqLE9haL;
    }
}

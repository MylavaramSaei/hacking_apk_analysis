package aRQ2M7vtRaPDEyvpdv;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class aPyGSIylzVNKPT1Bls {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f2471lEeR5KfoEr4xU5yHH7 = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Map f2472s3fjYDxWOUexjjVgyA = Collections.synchronizedMap(new WeakHashMap());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void HJFh0TGMpafqLE9haL(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
        Lc:
            r0.append(r4)
            goto L16
        L10:
            r2 = 3
            if (r4 != r2) goto L16
            java.lang.String r4 = " due to dead object exception."
            goto Lc
        L16:
            if (r5 == 0) goto L20
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L20:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>(r5, r0)
            r3.KYHag8HRDlnO3X9zmZ(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aRQ2M7vtRaPDEyvpdv.aPyGSIylzVNKPT1Bls.HJFh0TGMpafqLE9haL(int, java.lang.String):void");
    }

    public final void KYHag8HRDlnO3X9zmZ(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f2471lEeR5KfoEr4xU5yHH7) {
            map = new HashMap(this.f2471lEeR5KfoEr4xU5yHH7);
        }
        synchronized (this.f2472s3fjYDxWOUexjjVgyA) {
            map2 = new HashMap(this.f2472s3fjYDxWOUexjjVgyA);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ) entry2.getKey()).zZKhbgvUfsK4AEX3r0(new HZ4bptRS9XIcK1CV95.s3fjYDxWOUexjjVgyA(status));
            }
        }
    }

    public final boolean husNiw3snxdgZPAGJm() {
        return (this.f2471lEeR5KfoEr4xU5yHH7.isEmpty() && this.f2472s3fjYDxWOUexjjVgyA.isEmpty()) ? false : true;
    }

    public final void s3fjYDxWOUexjjVgyA(JXsqbvi9UKxeF3HXpU.Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ, boolean z) {
        this.f2472s3fjYDxWOUexjjVgyA.put(acstmh57AKoSEkEFNJ, Boolean.valueOf(z));
        acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7().s3fjYDxWOUexjjVgyA(new hoXrIDAFrSwfShk8da(this, acstmh57AKoSEkEFNJ));
    }

    public final void zZKhbgvUfsK4AEX3r0() {
        KYHag8HRDlnO3X9zmZ(false, husNiw3snxdgZPAGJm.f2493sTkWmhpZ5b1ArQIw4K);
    }
}

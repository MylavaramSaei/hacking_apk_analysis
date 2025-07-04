package aRQ2M7vtRaPDEyvpdv;

import android.util.Log;

/* loaded from: classes.dex */
public final class THTDvPxsHqMeGb512f implements Runnable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final /* synthetic */ f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 f2448lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final /* synthetic */ ao3wqKm5CXFuvC0q47 f2449s3fjYDxWOUexjjVgyA;

    public THTDvPxsHqMeGb512f(ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47, f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2449s3fjYDxWOUexjjVgyA = ao3wqkm5cxfuvc0q47;
        this.f2448lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47 = this.f2449s3fjYDxWOUexjjVgyA;
        A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP = (A49QRPHynYLCBN0SqP) ao3wqkm5cxfuvc0q47.f2474KYHag8HRDlnO3X9zmZ.f2503e54J8UWNHWALQNixXM.get(ao3wqkm5cxfuvc0q47.f2477s3fjYDxWOUexjjVgyA);
        if (a49QRPHynYLCBN0SqP == null) {
            return;
        }
        if (!this.f2448lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1()) {
            a49QRPHynYLCBN0SqP.W3RZ2dTDKrKpS5Mxdk(this.f2448lEeR5KfoEr4xU5yHH7, null);
            return;
        }
        this.f2449s3fjYDxWOUexjjVgyA.f2475husNiw3snxdgZPAGJm = true;
        if (this.f2449s3fjYDxWOUexjjVgyA.f2476lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C()) {
            this.f2449s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED();
            return;
        }
        try {
            ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q472 = this.f2449s3fjYDxWOUexjjVgyA;
            ao3wqkm5cxfuvc0q472.f2476lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(null, ao3wqkm5cxfuvc0q472.f2476lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.f2449s3fjYDxWOUexjjVgyA.f2476lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM("Failed to get service from broker.");
            a49QRPHynYLCBN0SqP.W3RZ2dTDKrKpS5Mxdk(new f2zPq7MOnQrtOlZ1Zg.lEeR5KfoEr4xU5yHH7(10), null);
        }
    }
}

package aRQ2M7vtRaPDEyvpdv;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
public final class bMSdooljgH14Jgudph implements Runnable {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final /* synthetic */ Uj8rPa1EWADtk6Oe0S f2479HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f2480lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final /* synthetic */ String f2481s3fjYDxWOUexjjVgyA;

    public bMSdooljgH14Jgudph(Uj8rPa1EWADtk6Oe0S uj8rPa1EWADtk6Oe0S, LifecycleCallback lifecycleCallback, String str) {
        this.f2479HJFh0TGMpafqLE9haL = uj8rPa1EWADtk6Oe0S;
        this.f2480lEeR5KfoEr4xU5yHH7 = lifecycleCallback;
        this.f2481s3fjYDxWOUexjjVgyA = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        Uj8rPa1EWADtk6Oe0S uj8rPa1EWADtk6Oe0S = this.f2479HJFh0TGMpafqLE9haL;
        if (uj8rPa1EWADtk6Oe0S.f2454s3fjYDxWOUexjjVgyA > 0) {
            LifecycleCallback lifecycleCallback = this.f2480lEeR5KfoEr4xU5yHH7;
            if (uj8rPa1EWADtk6Oe0S.f2452HJFh0TGMpafqLE9haL != null) {
                bundle = uj8rPa1EWADtk6Oe0S.f2452HJFh0TGMpafqLE9haL.getBundle(this.f2481s3fjYDxWOUexjjVgyA);
            } else {
                bundle = null;
            }
            lifecycleCallback.KYHag8HRDlnO3X9zmZ(bundle);
        }
        if (this.f2479HJFh0TGMpafqLE9haL.f2454s3fjYDxWOUexjjVgyA >= 2) {
            this.f2480lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ();
        }
        if (this.f2479HJFh0TGMpafqLE9haL.f2454s3fjYDxWOUexjjVgyA >= 3) {
            this.f2480lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED();
        }
        if (this.f2479HJFh0TGMpafqLE9haL.f2454s3fjYDxWOUexjjVgyA >= 4) {
            this.f2480lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4();
        }
        if (this.f2479HJFh0TGMpafqLE9haL.f2454s3fjYDxWOUexjjVgyA >= 5) {
            this.f2480lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1();
        }
    }
}

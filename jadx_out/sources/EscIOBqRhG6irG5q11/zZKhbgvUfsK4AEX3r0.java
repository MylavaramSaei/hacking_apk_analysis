package EscIOBqRhG6irG5q11;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.view.View;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public int f122HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public boolean f123KYHag8HRDlnO3X9zmZ = true;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public boolean f124TCyPEKSzIyweCN5yp1 = true;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f125husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final View f126lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f127s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f128zZKhbgvUfsK4AEX3r0;

    public zZKhbgvUfsK4AEX3r0(View view) {
        this.f126lEeR5KfoEr4xU5yHH7 = view;
    }

    public void HJFh0TGMpafqLE9haL() {
        this.f127s3fjYDxWOUexjjVgyA = this.f126lEeR5KfoEr4xU5yHH7.getTop();
        this.f122HJFh0TGMpafqLE9haL = this.f126lEeR5KfoEr4xU5yHH7.getLeft();
    }

    public boolean husNiw3snxdgZPAGJm(int i) {
        if (!this.f123KYHag8HRDlnO3X9zmZ || this.f128zZKhbgvUfsK4AEX3r0 == i) {
            return false;
        }
        this.f128zZKhbgvUfsK4AEX3r0 = i;
        lEeR5KfoEr4xU5yHH7();
        return true;
    }

    public void lEeR5KfoEr4xU5yHH7() {
        View view = this.f126lEeR5KfoEr4xU5yHH7;
        lLKzvdU99Iw80uVD5I.udcVtCzLTM1Loe9KrX(view, this.f128zZKhbgvUfsK4AEX3r0 - (view.getTop() - this.f127s3fjYDxWOUexjjVgyA));
        View view2 = this.f126lEeR5KfoEr4xU5yHH7;
        lLKzvdU99Iw80uVD5I.oocVJL811qFf0j0XXZ(view2, this.f125husNiw3snxdgZPAGJm - (view2.getLeft() - this.f122HJFh0TGMpafqLE9haL));
    }

    public int s3fjYDxWOUexjjVgyA() {
        return this.f128zZKhbgvUfsK4AEX3r0;
    }

    public boolean zZKhbgvUfsK4AEX3r0(int i) {
        if (!this.f124TCyPEKSzIyweCN5yp1 || this.f125husNiw3snxdgZPAGJm == i) {
            return false;
        }
        this.f125husNiw3snxdgZPAGJm = i;
        lEeR5KfoEr4xU5yHH7();
        return true;
    }
}

package jsjSYEu4NPZjZxcfmI;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public TimeInterpolator f6200HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f6201husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public long f6202lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public long f6203s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public int f6204zZKhbgvUfsK4AEX3r0;

    public zZKhbgvUfsK4AEX3r0(long j, long j2) {
        this.f6200HJFh0TGMpafqLE9haL = null;
        this.f6204zZKhbgvUfsK4AEX3r0 = 0;
        this.f6201husNiw3snxdgZPAGJm = 1;
        this.f6202lEeR5KfoEr4xU5yHH7 = j;
        this.f6203s3fjYDxWOUexjjVgyA = j2;
    }

    public static TimeInterpolator husNiw3snxdgZPAGJm(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? lEeR5KfoEr4xU5yHH7.f6198s3fjYDxWOUexjjVgyA : interpolator instanceof AccelerateInterpolator ? lEeR5KfoEr4xU5yHH7.f6195HJFh0TGMpafqLE9haL : interpolator instanceof DecelerateInterpolator ? lEeR5KfoEr4xU5yHH7.f6199zZKhbgvUfsK4AEX3r0 : interpolator;
    }

    public static zZKhbgvUfsK4AEX3r0 lEeR5KfoEr4xU5yHH7(ValueAnimator valueAnimator) {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0(valueAnimator.getStartDelay(), valueAnimator.getDuration(), husNiw3snxdgZPAGJm(valueAnimator));
        zzkhbgvufsk4aex3r0.f6204zZKhbgvUfsK4AEX3r0 = valueAnimator.getRepeatCount();
        zzkhbgvufsk4aex3r0.f6201husNiw3snxdgZPAGJm = valueAnimator.getRepeatMode();
        return zzkhbgvufsk4aex3r0;
    }

    public long HJFh0TGMpafqLE9haL() {
        return this.f6203s3fjYDxWOUexjjVgyA;
    }

    public int KYHag8HRDlnO3X9zmZ() {
        return this.f6204zZKhbgvUfsK4AEX3r0;
    }

    public int TCyPEKSzIyweCN5yp1() {
        return this.f6201husNiw3snxdgZPAGJm;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zZKhbgvUfsK4AEX3r0)) {
            return false;
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) obj;
        if (s3fjYDxWOUexjjVgyA() == zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA() && HJFh0TGMpafqLE9haL() == zzkhbgvufsk4aex3r0.HJFh0TGMpafqLE9haL() && KYHag8HRDlnO3X9zmZ() == zzkhbgvufsk4aex3r0.KYHag8HRDlnO3X9zmZ() && TCyPEKSzIyweCN5yp1() == zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1()) {
            return zZKhbgvUfsK4AEX3r0().getClass().equals(zzkhbgvufsk4aex3r0.zZKhbgvUfsK4AEX3r0().getClass());
        }
        return false;
    }

    public int hashCode() {
        return (((((((((int) (s3fjYDxWOUexjjVgyA() ^ (s3fjYDxWOUexjjVgyA() >>> 32))) * 31) + ((int) (HJFh0TGMpafqLE9haL() ^ (HJFh0TGMpafqLE9haL() >>> 32)))) * 31) + zZKhbgvUfsK4AEX3r0().getClass().hashCode()) * 31) + KYHag8HRDlnO3X9zmZ()) * 31) + TCyPEKSzIyweCN5yp1();
    }

    public long s3fjYDxWOUexjjVgyA() {
        return this.f6202lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + s3fjYDxWOUexjjVgyA() + " duration: " + HJFh0TGMpafqLE9haL() + " interpolator: " + zZKhbgvUfsK4AEX3r0().getClass() + " repeatCount: " + KYHag8HRDlnO3X9zmZ() + " repeatMode: " + TCyPEKSzIyweCN5yp1() + "}\n";
    }

    public TimeInterpolator zZKhbgvUfsK4AEX3r0() {
        TimeInterpolator timeInterpolator = this.f6200HJFh0TGMpafqLE9haL;
        return timeInterpolator != null ? timeInterpolator : lEeR5KfoEr4xU5yHH7.f6198s3fjYDxWOUexjjVgyA;
    }

    public zZKhbgvUfsK4AEX3r0(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f6204zZKhbgvUfsK4AEX3r0 = 0;
        this.f6201husNiw3snxdgZPAGJm = 1;
        this.f6202lEeR5KfoEr4xU5yHH7 = j;
        this.f6203s3fjYDxWOUexjjVgyA = j2;
        this.f6200HJFh0TGMpafqLE9haL = timeInterpolator;
    }
}

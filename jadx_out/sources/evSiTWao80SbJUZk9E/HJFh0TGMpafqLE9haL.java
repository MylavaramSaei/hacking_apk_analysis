package evSiTWao80SbJUZk9E;

import android.content.Context;

/* loaded from: classes.dex */
public final class HJFh0TGMpafqLE9haL extends IPyIQcaNa8aB7drBED {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 f5763HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f5764lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 f5765s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final String f5766zZKhbgvUfsK4AEX3r0;

    public HJFh0TGMpafqLE9haL(Context context, O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f5764lEeR5KfoEr4xU5yHH7 = context;
        if (leer5kfoer4xu5yhh7 == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f5765s3fjYDxWOUexjjVgyA = leer5kfoer4xu5yhh7;
        if (leer5kfoer4xu5yhh72 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f5763HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh72;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f5766zZKhbgvUfsK4AEX3r0 = str;
    }

    @Override // evSiTWao80SbJUZk9E.IPyIQcaNa8aB7drBED
    public String HJFh0TGMpafqLE9haL() {
        return this.f5766zZKhbgvUfsK4AEX3r0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IPyIQcaNa8aB7drBED)) {
            return false;
        }
        IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED = (IPyIQcaNa8aB7drBED) obj;
        return this.f5764lEeR5KfoEr4xU5yHH7.equals(iPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA()) && this.f5765s3fjYDxWOUexjjVgyA.equals(iPyIQcaNa8aB7drBED.husNiw3snxdgZPAGJm()) && this.f5763HJFh0TGMpafqLE9haL.equals(iPyIQcaNa8aB7drBED.zZKhbgvUfsK4AEX3r0()) && this.f5766zZKhbgvUfsK4AEX3r0.equals(iPyIQcaNa8aB7drBED.HJFh0TGMpafqLE9haL());
    }

    public int hashCode() {
        return ((((((this.f5764lEeR5KfoEr4xU5yHH7.hashCode() ^ 1000003) * 1000003) ^ this.f5765s3fjYDxWOUexjjVgyA.hashCode()) * 1000003) ^ this.f5763HJFh0TGMpafqLE9haL.hashCode()) * 1000003) ^ this.f5766zZKhbgvUfsK4AEX3r0.hashCode();
    }

    @Override // evSiTWao80SbJUZk9E.IPyIQcaNa8aB7drBED
    public O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 husNiw3snxdgZPAGJm() {
        return this.f5765s3fjYDxWOUexjjVgyA;
    }

    @Override // evSiTWao80SbJUZk9E.IPyIQcaNa8aB7drBED
    public Context s3fjYDxWOUexjjVgyA() {
        return this.f5764lEeR5KfoEr4xU5yHH7;
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f5764lEeR5KfoEr4xU5yHH7 + ", wallClock=" + this.f5765s3fjYDxWOUexjjVgyA + ", monotonicClock=" + this.f5763HJFh0TGMpafqLE9haL + ", backendName=" + this.f5766zZKhbgvUfsK4AEX3r0 + "}";
    }

    @Override // evSiTWao80SbJUZk9E.IPyIQcaNa8aB7drBED
    public O1furmptfI76BGfN0d.lEeR5KfoEr4xU5yHH7 zZKhbgvUfsK4AEX3r0() {
        return this.f5763HJFh0TGMpafqLE9haL;
    }
}

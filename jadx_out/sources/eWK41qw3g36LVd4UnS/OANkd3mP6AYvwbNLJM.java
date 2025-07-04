package eWK41qw3g36LVd4UnS;

import java.util.Set;

/* loaded from: classes.dex */
public final class OANkd3mP6AYvwbNLJM implements ctWLFN70QQINH1kyYo.pbVGzGjWvY2LDXC8vo {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Y43RdunnpKgpbny0lE f5684HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Set f5685lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final aPyGSIylzVNKPT1Bls f5686s3fjYDxWOUexjjVgyA;

    public OANkd3mP6AYvwbNLJM(Set set, aPyGSIylzVNKPT1Bls apygsiylzvnkpt1bls, Y43RdunnpKgpbny0lE y43RdunnpKgpbny0lE) {
        this.f5685lEeR5KfoEr4xU5yHH7 = set;
        this.f5686s3fjYDxWOUexjjVgyA = apygsiylzvnkpt1bls;
        this.f5684HJFh0TGMpafqLE9haL = y43RdunnpKgpbny0lE;
    }

    @Override // ctWLFN70QQINH1kyYo.pbVGzGjWvY2LDXC8vo
    public ctWLFN70QQINH1kyYo.IPyIQcaNa8aB7drBED lEeR5KfoEr4xU5yHH7(String str, Class cls, ctWLFN70QQINH1kyYo.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, ctWLFN70QQINH1kyYo.TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
        if (this.f5685lEeR5KfoEr4xU5yHH7.contains(hJFh0TGMpafqLE9haL)) {
            return new sTkWmhpZ5b1ArQIw4K(this.f5686s3fjYDxWOUexjjVgyA, str, hJFh0TGMpafqLE9haL, tCyPEKSzIyweCN5yp1, this.f5684HJFh0TGMpafqLE9haL);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", hJFh0TGMpafqLE9haL, this.f5685lEeR5KfoEr4xU5yHH7));
    }
}

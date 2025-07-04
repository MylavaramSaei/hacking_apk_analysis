package androidx.lifecycle;

import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements pbVGzGjWvY2LDXC8vo {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final LIMtzhnLwQyigzK0KO f3811lEeR5KfoEr4xU5yHH7;

    public SavedStateHandleAttacher(LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(lIMtzhnLwQyigzK0KO, "provider");
        this.f3811lEeR5KfoEr4xU5yHH7 = lIMtzhnLwQyigzK0KO;
    }

    @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
    public void zZKhbgvUfsK4AEX3r0(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(z9WdNiOsPR0y54zHW4, "source");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "event");
        if (leer5kfoer4xu5yhh7 == KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_CREATE) {
            z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1().HJFh0TGMpafqLE9haL(this);
            this.f3811lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + leer5kfoer4xu5yhh7).toString());
        }
    }
}

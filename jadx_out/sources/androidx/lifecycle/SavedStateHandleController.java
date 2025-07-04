package androidx.lifecycle;

import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements pbVGzGjWvY2LDXC8vo {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public boolean f3812lEeR5KfoEr4xU5yHH7;

    public final void IPyIQcaNa8aB7drBED(androidx.savedstate.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "registry");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(kYHag8HRDlnO3X9zmZ, "lifecycle");
        if (!(!this.f3812lEeR5KfoEr4xU5yHH7)) {
            throw new IllegalStateException("Already attached to lifecycleOwner".toString());
        }
        this.f3812lEeR5KfoEr4xU5yHH7 = true;
        kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(this);
        throw null;
    }

    public final boolean pbVGzGjWvY2LDXC8vo() {
        return this.f3812lEeR5KfoEr4xU5yHH7;
    }

    @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
    public void zZKhbgvUfsK4AEX3r0(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(z9WdNiOsPR0y54zHW4, "source");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "event");
        if (leer5kfoer4xu5yhh7 == KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_DESTROY) {
            this.f3812lEeR5KfoEr4xU5yHH7 = false;
            z9WdNiOsPR0y54zHW4.TCyPEKSzIyweCN5yp1().HJFh0TGMpafqLE9haL(this);
        }
    }
}

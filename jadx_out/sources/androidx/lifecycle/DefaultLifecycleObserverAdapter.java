package androidx.lifecycle;

import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements pbVGzGjWvY2LDXC8vo {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final s3fjYDxWOUexjjVgyA f3765lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final pbVGzGjWvY2LDXC8vo f3766s3fjYDxWOUexjjVgyA;

    public /* synthetic */ class lEeR5KfoEr4xU5yHH7 {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final /* synthetic */ int[] f3767lEeR5KfoEr4xU5yHH7;

        static {
            int[] iArr = new int[KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.values().length];
            try {
                iArr[KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3767lEeR5KfoEr4xU5yHH7 = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, "defaultLifecycleObserver");
        this.f3765lEeR5KfoEr4xU5yHH7 = s3fjydxwouexjjvgya;
        this.f3766s3fjYDxWOUexjjVgyA = pbvgzgjwvy2ldxc8vo;
    }

    @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
    public void zZKhbgvUfsK4AEX3r0(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(z9WdNiOsPR0y54zHW4, "source");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "event");
        switch (lEeR5KfoEr4xU5yHH7.f3767lEeR5KfoEr4xU5yHH7[leer5kfoer4xu5yhh7.ordinal()]) {
            case 1:
                this.f3765lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL(z9WdNiOsPR0y54zHW4);
                break;
            case 2:
                this.f3765lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(z9WdNiOsPR0y54zHW4);
                break;
            case 3:
                this.f3765lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(z9WdNiOsPR0y54zHW4);
                break;
            case 4:
                this.f3765lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(z9WdNiOsPR0y54zHW4);
                break;
            case 5:
                this.f3765lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(z9WdNiOsPR0y54zHW4);
                break;
            case 6:
                this.f3765lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(z9WdNiOsPR0y54zHW4);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        pbVGzGjWvY2LDXC8vo pbvgzgjwvy2ldxc8vo = this.f3766s3fjYDxWOUexjjVgyA;
        if (pbvgzgjwvy2ldxc8vo != null) {
            pbvgzgjwvy2ldxc8vo.zZKhbgvUfsK4AEX3r0(z9WdNiOsPR0y54zHW4, leer5kfoer4xu5yhh7);
        }
    }
}

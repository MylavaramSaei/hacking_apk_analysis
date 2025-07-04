package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class KYHag8HRDlnO3X9zmZ {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public AtomicReference f3770lEeR5KfoEr4xU5yHH7 = new AtomicReference();

    public enum lEeR5KfoEr4xU5yHH7 {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0042lEeR5KfoEr4xU5yHH7 Companion = new C0042lEeR5KfoEr4xU5yHH7(null);

        /* renamed from: androidx.lifecycle.KYHag8HRDlnO3X9zmZ$lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
        public static final class C0042lEeR5KfoEr4xU5yHH7 {

            /* renamed from: androidx.lifecycle.KYHag8HRDlnO3X9zmZ$lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
            public /* synthetic */ class C0043lEeR5KfoEr4xU5yHH7 {

                /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
                public static final /* synthetic */ int[] f3771lEeR5KfoEr4xU5yHH7;

                static {
                    int[] iArr = new int[s3fjYDxWOUexjjVgyA.values().length];
                    try {
                        iArr[s3fjYDxWOUexjjVgyA.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[s3fjYDxWOUexjjVgyA.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[s3fjYDxWOUexjjVgyA.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[s3fjYDxWOUexjjVgyA.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[s3fjYDxWOUexjjVgyA.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f3771lEeR5KfoEr4xU5yHH7 = iArr;
                }
            }

            public C0042lEeR5KfoEr4xU5yHH7() {
            }

            public final lEeR5KfoEr4xU5yHH7 lEeR5KfoEr4xU5yHH7(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, "state");
                int i = C0043lEeR5KfoEr4xU5yHH7.f3771lEeR5KfoEr4xU5yHH7[s3fjydxwouexjjvgya.ordinal()];
                if (i == 1) {
                    return lEeR5KfoEr4xU5yHH7.ON_DESTROY;
                }
                if (i == 2) {
                    return lEeR5KfoEr4xU5yHH7.ON_STOP;
                }
                if (i != 3) {
                    return null;
                }
                return lEeR5KfoEr4xU5yHH7.ON_PAUSE;
            }

            public final lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, "state");
                int i = C0043lEeR5KfoEr4xU5yHH7.f3771lEeR5KfoEr4xU5yHH7[s3fjydxwouexjjvgya.ordinal()];
                if (i == 1) {
                    return lEeR5KfoEr4xU5yHH7.ON_START;
                }
                if (i == 2) {
                    return lEeR5KfoEr4xU5yHH7.ON_RESUME;
                }
                if (i != 5) {
                    return null;
                }
                return lEeR5KfoEr4xU5yHH7.ON_CREATE;
            }

            public /* synthetic */ C0042lEeR5KfoEr4xU5yHH7(jpEZy3U5wFkT2e9PKQ.husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
                this();
            }
        }

        public /* synthetic */ class s3fjYDxWOUexjjVgyA {

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public static final /* synthetic */ int[] f3772lEeR5KfoEr4xU5yHH7;

            static {
                int[] iArr = new int[lEeR5KfoEr4xU5yHH7.values().length];
                try {
                    iArr[lEeR5KfoEr4xU5yHH7.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[lEeR5KfoEr4xU5yHH7.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[lEeR5KfoEr4xU5yHH7.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[lEeR5KfoEr4xU5yHH7.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[lEeR5KfoEr4xU5yHH7.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[lEeR5KfoEr4xU5yHH7.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[lEeR5KfoEr4xU5yHH7.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f3772lEeR5KfoEr4xU5yHH7 = iArr;
            }
        }

        public final s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA() {
            switch (s3fjYDxWOUexjjVgyA.f3772lEeR5KfoEr4xU5yHH7[ordinal()]) {
                case 1:
                case 2:
                    return s3fjYDxWOUexjjVgyA.CREATED;
                case 3:
                case 4:
                    return s3fjYDxWOUexjjVgyA.STARTED;
                case 5:
                    return s3fjYDxWOUexjjVgyA.RESUMED;
                case 6:
                    return s3fjYDxWOUexjjVgyA.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum s3fjYDxWOUexjjVgyA {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean s3fjYDxWOUexjjVgyA(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(s3fjydxwouexjjvgya, "state");
            return compareTo(s3fjydxwouexjjvgya) >= 0;
        }
    }

    public abstract void HJFh0TGMpafqLE9haL(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ);

    public abstract void lEeR5KfoEr4xU5yHH7(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ);

    public abstract s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA();
}

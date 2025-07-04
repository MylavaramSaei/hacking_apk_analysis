package androidx.lifecycle;

import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.lEeR5KfoEr4xU5yHH7;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final LegacySavedStateHandleController f3784lEeR5KfoEr4xU5yHH7 = new LegacySavedStateHandleController();

    public static final class lEeR5KfoEr4xU5yHH7 implements lEeR5KfoEr4xU5yHH7.InterfaceC0055lEeR5KfoEr4xU5yHH7 {
        @Override // androidx.savedstate.lEeR5KfoEr4xU5yHH7.InterfaceC0055lEeR5KfoEr4xU5yHH7
        public void lEeR5KfoEr4xU5yHH7(CSih7GetOUab1dYQjM.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) throws NoSuchMethodException, SecurityException {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(zzkhbgvufsk4aex3r0, "owner");
            if (!(zzkhbgvufsk4aex3r0 instanceof OUd9THiLjZndMj0qdF)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            ao3wqKm5CXFuvC0q47 ao3wqkm5cxfuvc0q47ZZKhbgvUfsK4AEX3r0 = ((OUd9THiLjZndMj0qdF) zzkhbgvufsk4aex3r0).zZKhbgvUfsK4AEX3r0();
            androidx.savedstate.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA();
            Iterator it = ao3wqkm5cxfuvc0q47ZZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL().iterator();
            while (it.hasNext()) {
                VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0S3fjYDxWOUexjjVgyA = ao3wqkm5cxfuvc0q47ZZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA((String) it.next());
                jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.s3fjYDxWOUexjjVgyA(vItLRw50eXTZeEfGl0S3fjYDxWOUexjjVgyA);
                LegacySavedStateHandleController.lEeR5KfoEr4xU5yHH7(vItLRw50eXTZeEfGl0S3fjYDxWOUexjjVgyA, leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA, zzkhbgvufsk4aex3r0.TCyPEKSzIyweCN5yp1());
            }
            if (!ao3wqkm5cxfuvc0q47ZZKhbgvUfsK4AEX3r0.HJFh0TGMpafqLE9haL().isEmpty()) {
                leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA.pbVGzGjWvY2LDXC8vo(lEeR5KfoEr4xU5yHH7.class);
            }
        }
    }

    public static final void lEeR5KfoEr4xU5yHH7(VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0, androidx.savedstate.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) throws NoSuchMethodException, SecurityException {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(vItLRw50eXTZeEfGl0, "viewModel");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh7, "registry");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(kYHag8HRDlnO3X9zmZ, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) vItLRw50eXTZeEfGl0.HJFh0TGMpafqLE9haL("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.pbVGzGjWvY2LDXC8vo()) {
            return;
        }
        savedStateHandleController.IPyIQcaNa8aB7drBED(leer5kfoer4xu5yhh7, kYHag8HRDlnO3X9zmZ);
        f3784lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(leer5kfoer4xu5yhh7, kYHag8HRDlnO3X9zmZ);
    }

    public final void s3fjYDxWOUexjjVgyA(final androidx.savedstate.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, final KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ) throws NoSuchMethodException, SecurityException {
        KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA s3fjYDxWOUexjjVgyA2 = kYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA();
        if (s3fjYDxWOUexjjVgyA2 == KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.INITIALIZED || s3fjYDxWOUexjjVgyA2.s3fjYDxWOUexjjVgyA(KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.STARTED)) {
            leer5kfoer4xu5yhh7.pbVGzGjWvY2LDXC8vo(lEeR5KfoEr4xU5yHH7.class);
        } else {
            kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(new pbVGzGjWvY2LDXC8vo() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.pbVGzGjWvY2LDXC8vo
                public void zZKhbgvUfsK4AEX3r0(Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4, KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72) throws NoSuchMethodException, SecurityException {
                    jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(z9WdNiOsPR0y54zHW4, "source");
                    jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(leer5kfoer4xu5yhh72, "event");
                    if (leer5kfoer4xu5yhh72 == KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7.ON_START) {
                        kYHag8HRDlnO3X9zmZ.HJFh0TGMpafqLE9haL(this);
                        leer5kfoer4xu5yhh7.pbVGzGjWvY2LDXC8vo(LegacySavedStateHandleController.lEeR5KfoEr4xU5yHH7.class);
                    }
                }
            });
        }
    }
}

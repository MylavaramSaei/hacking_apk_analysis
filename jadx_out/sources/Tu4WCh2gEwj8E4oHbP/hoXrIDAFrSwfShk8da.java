package Tu4WCh2gEwj8E4oHbP;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class hoXrIDAFrSwfShk8da {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static e54J8UWNHWALQNixXM f1762lEeR5KfoEr4xU5yHH7 = new s3fjYDxWOUexjjVgyA();

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public static ThreadLocal f1763s3fjYDxWOUexjjVgyA = new ThreadLocal();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static ArrayList f1761HJFh0TGMpafqLE9haL = new ArrayList();

    public static void HJFh0TGMpafqLE9haL(ViewGroup viewGroup, e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
        if (e54j8uwnhwalqnixxm == null || viewGroup == null) {
            return;
        }
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7(e54j8uwnhwalqnixxm, viewGroup);
        viewGroup.addOnAttachStateChangeListener(leer5kfoer4xu5yhh7);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(leer5kfoer4xu5yhh7);
    }

    public static void lEeR5KfoEr4xU5yHH7(ViewGroup viewGroup, e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
        if (f1761HJFh0TGMpafqLE9haL.contains(viewGroup) || !W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I.lLKzvdU99Iw80uVD5I(viewGroup)) {
            return;
        }
        f1761HJFh0TGMpafqLE9haL.add(viewGroup);
        if (e54j8uwnhwalqnixxm == null) {
            e54j8uwnhwalqnixxm = f1762lEeR5KfoEr4xU5yHH7;
        }
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxmClone = e54j8uwnhwalqnixxm.clone();
        zZKhbgvUfsK4AEX3r0(viewGroup, e54j8uwnhwalqnixxmClone);
        Z9WdNiOsPR0y54zHW4.s3fjYDxWOUexjjVgyA(viewGroup, null);
        HJFh0TGMpafqLE9haL(viewGroup, e54j8uwnhwalqnixxmClone);
    }

    public static Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 s3fjYDxWOUexjjVgyA() {
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7;
        WeakReference weakReference = (WeakReference) f1763s3fjYDxWOUexjjVgyA.get();
        if (weakReference != null && (leer5kfoer4xu5yhh7 = (Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7) weakReference.get()) != null) {
            return leer5kfoer4xu5yhh7;
        }
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh72 = new Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7();
        f1763s3fjYDxWOUexjjVgyA.set(new WeakReference(leer5kfoer4xu5yhh72));
        return leer5kfoer4xu5yhh72;
    }

    public static void zZKhbgvUfsK4AEX3r0(ViewGroup viewGroup, e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
        ArrayList arrayList = (ArrayList) s3fjYDxWOUexjjVgyA().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e54J8UWNHWALQNixXM) it.next()).aAp6BD79BhftLCnuvf(viewGroup);
            }
        }
        if (e54j8uwnhwalqnixxm != null) {
            e54j8uwnhwalqnixxm.Z9WdNiOsPR0y54zHW4(viewGroup, true);
        }
        Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7(viewGroup);
    }

    public static class lEeR5KfoEr4xU5yHH7 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public e54J8UWNHWALQNixXM f1764lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public ViewGroup f1765s3fjYDxWOUexjjVgyA;

        /* renamed from: Tu4WCh2gEwj8E4oHbP.hoXrIDAFrSwfShk8da$lEeR5KfoEr4xU5yHH7$lEeR5KfoEr4xU5yHH7, reason: collision with other inner class name */
        public class C0019lEeR5KfoEr4xU5yHH7 extends T9PhQIpGRhE4yZDm1C {

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final /* synthetic */ Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 f1766lEeR5KfoEr4xU5yHH7;

            public C0019lEeR5KfoEr4xU5yHH7(Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
                this.f1766lEeR5KfoEr4xU5yHH7 = leer5kfoer4xu5yhh7;
            }

            @Override // Tu4WCh2gEwj8E4oHbP.e54J8UWNHWALQNixXM.KYHag8HRDlnO3X9zmZ
            public void lEeR5KfoEr4xU5yHH7(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm) {
                ((ArrayList) this.f1766lEeR5KfoEr4xU5yHH7.get(lEeR5KfoEr4xU5yHH7.this.f1765s3fjYDxWOUexjjVgyA)).remove(e54j8uwnhwalqnixxm);
                e54j8uwnhwalqnixxm.ToH8yzk8U1nKT0PUfY(this);
            }
        }

        public lEeR5KfoEr4xU5yHH7(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm, ViewGroup viewGroup) {
            this.f1764lEeR5KfoEr4xU5yHH7 = e54j8uwnhwalqnixxm;
            this.f1765s3fjYDxWOUexjjVgyA = viewGroup;
        }

        public final void lEeR5KfoEr4xU5yHH7() {
            this.f1765s3fjYDxWOUexjjVgyA.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f1765s3fjYDxWOUexjjVgyA.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            lEeR5KfoEr4xU5yHH7();
            if (!hoXrIDAFrSwfShk8da.f1761HJFh0TGMpafqLE9haL.remove(this.f1765s3fjYDxWOUexjjVgyA)) {
                return true;
            }
            Z9WdNiOsPR0y54zHW4.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA = hoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA();
            ArrayList arrayList = (ArrayList) leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA.get(this.f1765s3fjYDxWOUexjjVgyA);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA.put(this.f1765s3fjYDxWOUexjjVgyA, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f1764lEeR5KfoEr4xU5yHH7);
            this.f1764lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(new C0019lEeR5KfoEr4xU5yHH7(leer5kfoer4xu5yhh7S3fjYDxWOUexjjVgyA));
            this.f1764lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(this.f1765s3fjYDxWOUexjjVgyA, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((e54J8UWNHWALQNixXM) it.next()).LU0fFDMACqnfIfA1AZ(this.f1765s3fjYDxWOUexjjVgyA);
                }
            }
            this.f1764lEeR5KfoEr4xU5yHH7.lLKzvdU99Iw80uVD5I(this.f1765s3fjYDxWOUexjjVgyA);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            lEeR5KfoEr4xU5yHH7();
            hoXrIDAFrSwfShk8da.f1761HJFh0TGMpafqLE9haL.remove(this.f1765s3fjYDxWOUexjjVgyA);
            ArrayList arrayList = (ArrayList) hoXrIDAFrSwfShk8da.s3fjYDxWOUexjjVgyA().get(this.f1765s3fjYDxWOUexjjVgyA);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((e54J8UWNHWALQNixXM) it.next()).LU0fFDMACqnfIfA1AZ(this.f1765s3fjYDxWOUexjjVgyA);
                }
            }
            this.f1764lEeR5KfoEr4xU5yHH7.e54J8UWNHWALQNixXM(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}

package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class THTDvPxsHqMeGb512f extends ao3wqKm5CXFuvC0q47 {

    public class HJFh0TGMpafqLE9haL implements Transition.TransitionListener {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ Object f3513HJFh0TGMpafqLE9haL;

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3514KYHag8HRDlnO3X9zmZ;

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final /* synthetic */ Object f3516husNiw3snxdgZPAGJm;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ Object f3517lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3518s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3519zZKhbgvUfsK4AEX3r0;

        public HJFh0TGMpafqLE9haL(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3517lEeR5KfoEr4xU5yHH7 = obj;
            this.f3518s3fjYDxWOUexjjVgyA = arrayList;
            this.f3513HJFh0TGMpafqLE9haL = obj2;
            this.f3519zZKhbgvUfsK4AEX3r0 = arrayList2;
            this.f3516husNiw3snxdgZPAGJm = obj3;
            this.f3514KYHag8HRDlnO3X9zmZ = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(transition, this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f3517lEeR5KfoEr4xU5yHH7;
            if (obj != null) {
                THTDvPxsHqMeGb512f.this.LIMtzhnLwQyigzK0KO(obj, this.f3518s3fjYDxWOUexjjVgyA, null);
            }
            Object obj2 = this.f3513HJFh0TGMpafqLE9haL;
            if (obj2 != null) {
                THTDvPxsHqMeGb512f.this.LIMtzhnLwQyigzK0KO(obj2, this.f3519zZKhbgvUfsK4AEX3r0, null);
            }
            Object obj3 = this.f3516husNiw3snxdgZPAGJm;
            if (obj3 != null) {
                THTDvPxsHqMeGb512f.this.LIMtzhnLwQyigzK0KO(obj3, this.f3514KYHag8HRDlnO3X9zmZ, null);
            }
        }
    }

    public static class KYHag8HRDlnO3X9zmZ {
        public static void lEeR5KfoEr4xU5yHH7(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        public static void s3fjYDxWOUexjjVgyA(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    public class husNiw3snxdgZPAGJm extends Transition.EpicenterCallback {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ Rect f3520lEeR5KfoEr4xU5yHH7;

        public husNiw3snxdgZPAGJm(Rect rect) {
            this.f3520lEeR5KfoEr4xU5yHH7 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3520lEeR5KfoEr4xU5yHH7;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3520lEeR5KfoEr4xU5yHH7;
        }
    }

    public class lEeR5KfoEr4xU5yHH7 extends Transition.EpicenterCallback {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ Rect f3522lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(Rect rect) {
            this.f3522lEeR5KfoEr4xU5yHH7 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f3522lEeR5KfoEr4xU5yHH7;
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Transition.TransitionListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ View f3525lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3526s3fjYDxWOUexjjVgyA;

        public s3fjYDxWOUexjjVgyA(View view, ArrayList arrayList) {
            this.f3525lEeR5KfoEr4xU5yHH7 = view;
            this.f3526s3fjYDxWOUexjjVgyA = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(transition, this);
            this.f3525lEeR5KfoEr4xU5yHH7.setVisibility(8);
            int size = this.f3526s3fjYDxWOUexjjVgyA.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3526s3fjYDxWOUexjjVgyA.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA(transition, this);
            KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(transition, this);
        }
    }

    public class zZKhbgvUfsK4AEX3r0 implements Transition.TransitionListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ Runnable f3527lEeR5KfoEr4xU5yHH7;

        public zZKhbgvUfsK4AEX3r0(Runnable runnable) {
            this.f3527lEeR5KfoEr4xU5yHH7 = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3527lEeR5KfoEr4xU5yHH7.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    public static boolean xHA29AmDt6y96AnB3t(Transition transition) {
        return (ao3wqKm5CXFuvC0q47.pbVGzGjWvY2LDXC8vo(transition.getTargetIds()) && ao3wqKm5CXFuvC0q47.pbVGzGjWvY2LDXC8vo(transition.getTargetNames()) && ao3wqKm5CXFuvC0q47.pbVGzGjWvY2LDXC8vo(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public Object Acstmh57AKoSEkEFNJ(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public Object G7AC3DWIx9i9fdanjk(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void HJFh0TGMpafqLE9haL(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public Object KYHag8HRDlnO3X9zmZ(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public void LIMtzhnLwQyigzK0KO(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                LIMtzhnLwQyigzK0KO(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (xHA29AmDt6y96AnB3t(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget((View) arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void OANkd3mP6AYvwbNLJM(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            IPyIQcaNa8aB7drBED(view, rect);
            ((Transition) obj).setEpicenterCallback(new lEeR5KfoEr4xU5yHH7(rect));
        }
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void R9SAhYMerGybF9OAjL(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            LIMtzhnLwQyigzK0KO(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void T9PhQIpGRhE4yZDm1C(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new s3fjYDxWOUexjjVgyA(view, arrayList));
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void Y43RdunnpKgpbny0lE(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ao3wqKm5CXFuvC0q47.zZKhbgvUfsK4AEX3r0(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        s3fjYDxWOUexjjVgyA(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public Object Z9WdNiOsPR0y54zHW4(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void aPyGSIylzVNKPT1Bls(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new husNiw3snxdgZPAGJm(rect));
        }
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void hoXrIDAFrSwfShk8da(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new HJFh0TGMpafqLE9haL(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public boolean husNiw3snxdgZPAGJm(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void lEeR5KfoEr4xU5yHH7(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void s3fjYDxWOUexjjVgyA(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                s3fjYDxWOUexjjVgyA(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (xHA29AmDt6y96AnB3t(transition) || !ao3wqKm5CXFuvC0q47.pbVGzGjWvY2LDXC8vo(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.ao3wqKm5CXFuvC0q47
    public void zaq8hOURtfwbcX17cG(Fragment fragment, Object obj, OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, Runnable runnable) {
        ((Transition) obj).addListener(new zZKhbgvUfsK4AEX3r0(runnable));
    }
}

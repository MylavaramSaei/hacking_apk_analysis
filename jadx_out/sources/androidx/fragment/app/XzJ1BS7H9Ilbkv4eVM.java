package androidx.fragment.app;

import OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7;
import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class XzJ1BS7H9Ilbkv4eVM {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final ViewGroup f3561lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final ArrayList f3562s3fjYDxWOUexjjVgyA = new ArrayList();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final ArrayList f3559HJFh0TGMpafqLE9haL = new ArrayList();

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f3563zZKhbgvUfsK4AEX3r0 = false;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public boolean f3560husNiw3snxdgZPAGJm = false;

    public static /* synthetic */ class HJFh0TGMpafqLE9haL {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final /* synthetic */ int[] f3564lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public static final /* synthetic */ int[] f3565s3fjYDxWOUexjjVgyA;

        static {
            int[] iArr = new int[husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.values().length];
            f3565s3fjYDxWOUexjjVgyA = iArr;
            try {
                iArr[husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3565s3fjYDxWOUexjjVgyA[husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3565s3fjYDxWOUexjjVgyA[husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.values().length];
            f3564lEeR5KfoEr4xU5yHH7 = iArr2;
            try {
                iArr2[husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3564lEeR5KfoEr4xU5yHH7[husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3564lEeR5KfoEr4xU5yHH7[husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3564lEeR5KfoEr4xU5yHH7[husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class husNiw3snxdgZPAGJm {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final Fragment f3566HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public HJFh0TGMpafqLE9haL f3570lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public s3fjYDxWOUexjjVgyA f3571s3fjYDxWOUexjjVgyA;

        /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
        public final List f3572zZKhbgvUfsK4AEX3r0 = new ArrayList();

        /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
        public final HashSet f3569husNiw3snxdgZPAGJm = new HashSet();

        /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
        public boolean f3567KYHag8HRDlnO3X9zmZ = false;

        /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
        public boolean f3568TCyPEKSzIyweCN5yp1 = false;

        public enum HJFh0TGMpafqLE9haL {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : s3fjYDxWOUexjjVgyA(view.getVisibility());
            }

            public static HJFh0TGMpafqLE9haL s3fjYDxWOUexjjVgyA(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            public void lEeR5KfoEr4xU5yHH7(View view) {
                int i;
                int i2 = HJFh0TGMpafqLE9haL.f3564lEeR5KfoEr4xU5yHH7[ordinal()];
                if (i2 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i = 0;
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        public class lEeR5KfoEr4xU5yHH7 implements lEeR5KfoEr4xU5yHH7.InterfaceC0014lEeR5KfoEr4xU5yHH7 {
            public lEeR5KfoEr4xU5yHH7() {
            }

            @Override // OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7.InterfaceC0014lEeR5KfoEr4xU5yHH7
            public void lEeR5KfoEr4xU5yHH7() {
                husNiw3snxdgZPAGJm.this.s3fjYDxWOUexjjVgyA();
            }
        }

        public enum s3fjYDxWOUexjjVgyA {
            NONE,
            ADDING,
            REMOVING
        }

        public husNiw3snxdgZPAGJm(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, Fragment fragment, OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            this.f3570lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
            this.f3571s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya;
            this.f3566HJFh0TGMpafqLE9haL = fragment;
            leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(new lEeR5KfoEr4xU5yHH7());
        }

        public final void Acstmh57AKoSEkEFNJ(OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            e54J8UWNHWALQNixXM();
            this.f3569husNiw3snxdgZPAGJm.add(leer5kfoer4xu5yhh7);
        }

        public void HJFh0TGMpafqLE9haL() {
            if (this.f3568TCyPEKSzIyweCN5yp1) {
                return;
            }
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3568TCyPEKSzIyweCN5yp1 = true;
            Iterator it = this.f3572zZKhbgvUfsK4AEX3r0.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final boolean IPyIQcaNa8aB7drBED() {
            return this.f3567KYHag8HRDlnO3X9zmZ;
        }

        public final Fragment KYHag8HRDlnO3X9zmZ() {
            return this.f3566HJFh0TGMpafqLE9haL;
        }

        public s3fjYDxWOUexjjVgyA TCyPEKSzIyweCN5yp1() {
            return this.f3571s3fjYDxWOUexjjVgyA;
        }

        public final void Z9WdNiOsPR0y54zHW4(HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya) {
            s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya2;
            int i = HJFh0TGMpafqLE9haL.f3565s3fjYDxWOUexjjVgyA[s3fjydxwouexjjvgya.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.f3570lEeR5KfoEr4xU5yHH7 != HJFh0TGMpafqLE9haL.REMOVED) {
                        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3566HJFh0TGMpafqLE9haL + " mFinalState = " + this.f3570lEeR5KfoEr4xU5yHH7 + " -> " + hJFh0TGMpafqLE9haL + ". ");
                        }
                        this.f3570lEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL;
                        return;
                    }
                    return;
                }
                if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3566HJFh0TGMpafqLE9haL + " mFinalState = " + this.f3570lEeR5KfoEr4xU5yHH7 + " -> REMOVED. mLifecycleImpact  = " + this.f3571s3fjYDxWOUexjjVgyA + " to REMOVING.");
                }
                this.f3570lEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.REMOVED;
                s3fjydxwouexjjvgya2 = s3fjYDxWOUexjjVgyA.REMOVING;
            } else {
                if (this.f3570lEeR5KfoEr4xU5yHH7 != HJFh0TGMpafqLE9haL.REMOVED) {
                    return;
                }
                if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3566HJFh0TGMpafqLE9haL + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3571s3fjYDxWOUexjjVgyA + " to ADDING.");
                }
                this.f3570lEeR5KfoEr4xU5yHH7 = HJFh0TGMpafqLE9haL.VISIBLE;
                s3fjydxwouexjjvgya2 = s3fjYDxWOUexjjVgyA.ADDING;
            }
            this.f3571s3fjYDxWOUexjjVgyA = s3fjydxwouexjjvgya2;
        }

        public abstract void e54J8UWNHWALQNixXM();

        public HJFh0TGMpafqLE9haL husNiw3snxdgZPAGJm() {
            return this.f3570lEeR5KfoEr4xU5yHH7;
        }

        public final void lEeR5KfoEr4xU5yHH7(Runnable runnable) {
            this.f3572zZKhbgvUfsK4AEX3r0.add(runnable);
        }

        public final boolean pbVGzGjWvY2LDXC8vo() {
            return this.f3568TCyPEKSzIyweCN5yp1;
        }

        public final void s3fjYDxWOUexjjVgyA() {
            if (IPyIQcaNa8aB7drBED()) {
                return;
            }
            this.f3567KYHag8HRDlnO3X9zmZ = true;
            if (this.f3569husNiw3snxdgZPAGJm.isEmpty()) {
                HJFh0TGMpafqLE9haL();
                return;
            }
            Iterator it = new ArrayList(this.f3569husNiw3snxdgZPAGJm).iterator();
            while (it.hasNext()) {
                ((OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7) it.next()).lEeR5KfoEr4xU5yHH7();
            }
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f3570lEeR5KfoEr4xU5yHH7 + "} {mLifecycleImpact = " + this.f3571s3fjYDxWOUexjjVgyA + "} {mFragment = " + this.f3566HJFh0TGMpafqLE9haL + "}";
        }

        public final void zZKhbgvUfsK4AEX3r0(OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            if (this.f3569husNiw3snxdgZPAGJm.remove(leer5kfoer4xu5yhh7) && this.f3569husNiw3snxdgZPAGJm.isEmpty()) {
                HJFh0TGMpafqLE9haL();
            }
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ zZKhbgvUfsK4AEX3r0 f3583lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            this.f3583lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (XzJ1BS7H9Ilbkv4eVM.this.f3562s3fjYDxWOUexjjVgyA.contains(this.f3583lEeR5KfoEr4xU5yHH7)) {
                this.f3583lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm().lEeR5KfoEr4xU5yHH7(this.f3583lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ().f3421W3RZ2dTDKrKpS5Mxdk);
            }
        }
    }

    public class s3fjYDxWOUexjjVgyA implements Runnable {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ zZKhbgvUfsK4AEX3r0 f3585lEeR5KfoEr4xU5yHH7;

        public s3fjYDxWOUexjjVgyA(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
            this.f3585lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
        }

        @Override // java.lang.Runnable
        public void run() {
            XzJ1BS7H9Ilbkv4eVM.this.f3562s3fjYDxWOUexjjVgyA.remove(this.f3585lEeR5KfoEr4xU5yHH7);
            XzJ1BS7H9Ilbkv4eVM.this.f3559HJFh0TGMpafqLE9haL.remove(this.f3585lEeR5KfoEr4xU5yHH7);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 extends husNiw3snxdgZPAGJm {

        /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
        public final LIMtzhnLwQyigzK0KO f3587IPyIQcaNa8aB7drBED;

        public zZKhbgvUfsK4AEX3r0(husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO, OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
            super(hJFh0TGMpafqLE9haL, s3fjydxwouexjjvgya, lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4(), leer5kfoer4xu5yhh7);
            this.f3587IPyIQcaNa8aB7drBED = lIMtzhnLwQyigzK0KO;
        }

        @Override // androidx.fragment.app.XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm
        public void HJFh0TGMpafqLE9haL() {
            super.HJFh0TGMpafqLE9haL();
            this.f3587IPyIQcaNa8aB7drBED.T9PhQIpGRhE4yZDm1C();
        }

        @Override // androidx.fragment.app.XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm
        public void e54J8UWNHWALQNixXM() {
            if (TCyPEKSzIyweCN5yp1() != husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.ADDING) {
                if (TCyPEKSzIyweCN5yp1() == husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.REMOVING) {
                    Fragment fragmentZ9WdNiOsPR0y54zHW4 = this.f3587IPyIQcaNa8aB7drBED.Z9WdNiOsPR0y54zHW4();
                    View viewOOMFI1Dcqcg1BSVNty = fragmentZ9WdNiOsPR0y54zHW4.oOMFI1Dcqcg1BSVNty();
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewOOMFI1Dcqcg1BSVNty.findFocus() + " on view " + viewOOMFI1Dcqcg1BSVNty + " for Fragment " + fragmentZ9WdNiOsPR0y54zHW4);
                    }
                    viewOOMFI1Dcqcg1BSVNty.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragmentZ9WdNiOsPR0y54zHW42 = this.f3587IPyIQcaNa8aB7drBED.Z9WdNiOsPR0y54zHW4();
            View viewFindFocus = fragmentZ9WdNiOsPR0y54zHW42.f3421W3RZ2dTDKrKpS5Mxdk.findFocus();
            if (viewFindFocus != null) {
                fragmentZ9WdNiOsPR0y54zHW42.jsjSYEu4NPZjZxcfmI(viewFindFocus);
                if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentZ9WdNiOsPR0y54zHW42);
                }
            }
            View viewOOMFI1Dcqcg1BSVNty2 = KYHag8HRDlnO3X9zmZ().oOMFI1Dcqcg1BSVNty();
            if (viewOOMFI1Dcqcg1BSVNty2.getParent() == null) {
                this.f3587IPyIQcaNa8aB7drBED.s3fjYDxWOUexjjVgyA();
                viewOOMFI1Dcqcg1BSVNty2.setAlpha(0.0f);
            }
            if (viewOOMFI1Dcqcg1BSVNty2.getAlpha() == 0.0f && viewOOMFI1Dcqcg1BSVNty2.getVisibility() == 0) {
                viewOOMFI1Dcqcg1BSVNty2.setVisibility(4);
            }
            viewOOMFI1Dcqcg1BSVNty2.setAlpha(fragmentZ9WdNiOsPR0y54zHW42.XzJ1BS7H9Ilbkv4eVM());
        }
    }

    public XzJ1BS7H9Ilbkv4eVM(ViewGroup viewGroup) {
        this.f3561lEeR5KfoEr4xU5yHH7 = viewGroup;
    }

    public static XzJ1BS7H9Ilbkv4eVM aPyGSIylzVNKPT1Bls(ViewGroup viewGroup, tXWeW0sqVddf7ZBflq txwew0sqvddf7zbflq) {
        Object tag = viewGroup.getTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f938s3fjYDxWOUexjjVgyA);
        if (tag instanceof XzJ1BS7H9Ilbkv4eVM) {
            return (XzJ1BS7H9Ilbkv4eVM) tag;
        }
        XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVMLEeR5KfoEr4xU5yHH7 = txwew0sqvddf7zbflq.lEeR5KfoEr4xU5yHH7(viewGroup);
        viewGroup.setTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f938s3fjYDxWOUexjjVgyA, xzJ1BS7H9Ilbkv4eVMLEeR5KfoEr4xU5yHH7);
        return xzJ1BS7H9Ilbkv4eVMLEeR5KfoEr4xU5yHH7;
    }

    public static XzJ1BS7H9Ilbkv4eVM hoXrIDAFrSwfShk8da(ViewGroup viewGroup, zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg) {
        return aPyGSIylzVNKPT1Bls(viewGroup, zaq8hourtfwbcx17cg.evSiTWao80SbJUZk9E());
    }

    public void Acstmh57AKoSEkEFNJ() {
        String str;
        String str2;
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zAAp6BD79BhftLCnuvf = lLKzvdU99Iw80uVD5I.aAp6BD79BhftLCnuvf(this.f3561lEeR5KfoEr4xU5yHH7);
        synchronized (this.f3562s3fjYDxWOUexjjVgyA) {
            try {
                zaq8hOURtfwbcX17cG();
                Iterator it = this.f3562s3fjYDxWOUexjjVgyA.iterator();
                while (it.hasNext()) {
                    ((husNiw3snxdgZPAGJm) it.next()).e54J8UWNHWALQNixXM();
                }
                Iterator it2 = new ArrayList(this.f3559HJFh0TGMpafqLE9haL).iterator();
                while (it2.hasNext()) {
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) it2.next();
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zAAp6BD79BhftLCnuvf) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f3561lEeR5KfoEr4xU5yHH7 + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(husniw3snxdgzpagjm);
                        Log.v("FragmentManager", sb.toString());
                    }
                    husniw3snxdgzpagjm.s3fjYDxWOUexjjVgyA();
                }
                Iterator it3 = new ArrayList(this.f3562s3fjYDxWOUexjjVgyA).iterator();
                while (it3.hasNext()) {
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm2 = (husNiw3snxdgZPAGJm) it3.next();
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zAAp6BD79BhftLCnuvf) {
                            str = "";
                        } else {
                            str = "Container " + this.f3561lEeR5KfoEr4xU5yHH7 + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(husniw3snxdgzpagjm2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    husniw3snxdgzpagjm2.s3fjYDxWOUexjjVgyA();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void HJFh0TGMpafqLE9haL(LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4());
        }
        lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.GONE, husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.NONE, lIMtzhnLwQyigzK0KO);
    }

    public final husNiw3snxdgZPAGJm IPyIQcaNa8aB7drBED(Fragment fragment) {
        Iterator it = this.f3562s3fjYDxWOUexjjVgyA.iterator();
        while (it.hasNext()) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) it.next();
            if (husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().equals(fragment) && !husniw3snxdgzpagjm.IPyIQcaNa8aB7drBED()) {
                return husniw3snxdgzpagjm;
            }
        }
        return null;
    }

    public abstract void KYHag8HRDlnO3X9zmZ(List list, boolean z);

    public void OANkd3mP6AYvwbNLJM() {
        synchronized (this.f3562s3fjYDxWOUexjjVgyA) {
            try {
                zaq8hOURtfwbcX17cG();
                this.f3560husNiw3snxdgZPAGJm = false;
                int size = this.f3562s3fjYDxWOUexjjVgyA.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) this.f3562s3fjYDxWOUexjjVgyA.get(size);
                    husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL HJFh0TGMpafqLE9haL2 = husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL(husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().f3421W3RZ2dTDKrKpS5Mxdk);
                    husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm = husniw3snxdgzpagjm.husNiw3snxdgZPAGJm();
                    husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.VISIBLE;
                    if (hJFh0TGMpafqLE9haLHusNiw3snxdgZPAGJm == hJFh0TGMpafqLE9haL && HJFh0TGMpafqLE9haL2 != hJFh0TGMpafqLE9haL) {
                        this.f3560husNiw3snxdgZPAGJm = husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().udcVtCzLTM1Loe9KrX();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ViewGroup T9PhQIpGRhE4yZDm1C() {
        return this.f3561lEeR5KfoEr4xU5yHH7;
    }

    public void TCyPEKSzIyweCN5yp1() {
        if (this.f3560husNiw3snxdgZPAGJm) {
            return;
        }
        if (!lLKzvdU99Iw80uVD5I.aAp6BD79BhftLCnuvf(this.f3561lEeR5KfoEr4xU5yHH7)) {
            Acstmh57AKoSEkEFNJ();
            this.f3563zZKhbgvUfsK4AEX3r0 = false;
            return;
        }
        synchronized (this.f3562s3fjYDxWOUexjjVgyA) {
            try {
                if (!this.f3562s3fjYDxWOUexjjVgyA.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f3559HJFh0TGMpafqLE9haL);
                    this.f3559HJFh0TGMpafqLE9haL.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) it.next();
                        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + husniw3snxdgzpagjm);
                        }
                        husniw3snxdgzpagjm.s3fjYDxWOUexjjVgyA();
                        if (!husniw3snxdgzpagjm.pbVGzGjWvY2LDXC8vo()) {
                            this.f3559HJFh0TGMpafqLE9haL.add(husniw3snxdgzpagjm);
                        }
                    }
                    zaq8hOURtfwbcX17cG();
                    ArrayList arrayList2 = new ArrayList(this.f3562s3fjYDxWOUexjjVgyA);
                    this.f3562s3fjYDxWOUexjjVgyA.clear();
                    this.f3559HJFh0TGMpafqLE9haL.addAll(arrayList2);
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((husNiw3snxdgZPAGJm) it2.next()).e54J8UWNHWALQNixXM();
                    }
                    KYHag8HRDlnO3X9zmZ(arrayList2, this.f3563zZKhbgvUfsK4AEX3r0);
                    this.f3563zZKhbgvUfsK4AEX3r0 = false;
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void Z9WdNiOsPR0y54zHW4() {
        if (this.f3560husNiw3snxdgZPAGJm) {
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f3560husNiw3snxdgZPAGJm = false;
            TCyPEKSzIyweCN5yp1();
        }
    }

    public husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA e54J8UWNHWALQNixXM(LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjmIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4());
        husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1 = husniw3snxdgzpagjmIPyIQcaNa8aB7drBED != null ? husniw3snxdgzpagjmIPyIQcaNa8aB7drBED.TCyPEKSzIyweCN5yp1() : null;
        husNiw3snxdgZPAGJm husniw3snxdgzpagjmPbVGzGjWvY2LDXC8vo = pbVGzGjWvY2LDXC8vo(lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4());
        return (husniw3snxdgzpagjmPbVGzGjWvY2LDXC8vo == null || !(s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1 == null || s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1 == husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.NONE)) ? s3fjydxwouexjjvgyaTCyPEKSzIyweCN5yp1 : husniw3snxdgzpagjmPbVGzGjWvY2LDXC8vo.TCyPEKSzIyweCN5yp1();
    }

    public void husNiw3snxdgZPAGJm(LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4());
        }
        lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.VISIBLE, husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.NONE, lIMtzhnLwQyigzK0KO);
    }

    public final void lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        synchronized (this.f3562s3fjYDxWOUexjjVgyA) {
            try {
                OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new OUd9THiLjZndMj0qdF.lEeR5KfoEr4xU5yHH7();
                husNiw3snxdgZPAGJm husniw3snxdgzpagjmIPyIQcaNa8aB7drBED = IPyIQcaNa8aB7drBED(lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4());
                if (husniw3snxdgzpagjmIPyIQcaNa8aB7drBED != null) {
                    husniw3snxdgzpagjmIPyIQcaNa8aB7drBED.Z9WdNiOsPR0y54zHW4(hJFh0TGMpafqLE9haL, s3fjydxwouexjjvgya);
                    return;
                }
                zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = new zZKhbgvUfsK4AEX3r0(hJFh0TGMpafqLE9haL, s3fjydxwouexjjvgya, lIMtzhnLwQyigzK0KO, leer5kfoer4xu5yhh7);
                this.f3562s3fjYDxWOUexjjVgyA.add(zzkhbgvufsk4aex3r0);
                zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7(new lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0));
                zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7(new s3fjYDxWOUexjjVgyA(zzkhbgvufsk4aex3r0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final husNiw3snxdgZPAGJm pbVGzGjWvY2LDXC8vo(Fragment fragment) {
        Iterator it = this.f3559HJFh0TGMpafqLE9haL.iterator();
        while (it.hasNext()) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) it.next();
            if (husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().equals(fragment) && !husniw3snxdgzpagjm.IPyIQcaNa8aB7drBED()) {
                return husniw3snxdgzpagjm;
            }
        }
        return null;
    }

    public void s3fjYDxWOUexjjVgyA(husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL, LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4());
        }
        lEeR5KfoEr4xU5yHH7(hJFh0TGMpafqLE9haL, husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.ADDING, lIMtzhnLwQyigzK0KO);
    }

    public void sTkWmhpZ5b1ArQIw4K(boolean z) {
        this.f3563zZKhbgvUfsK4AEX3r0 = z;
    }

    public void zZKhbgvUfsK4AEX3r0(LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KO) {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + lIMtzhnLwQyigzK0KO.Z9WdNiOsPR0y54zHW4());
        }
        lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.REMOVED, husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.REMOVING, lIMtzhnLwQyigzK0KO);
    }

    public final void zaq8hOURtfwbcX17cG() {
        Iterator it = this.f3562s3fjYDxWOUexjjVgyA.iterator();
        while (it.hasNext()) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) it.next();
            if (husniw3snxdgzpagjm.TCyPEKSzIyweCN5yp1() == husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.ADDING) {
                husniw3snxdgzpagjm.Z9WdNiOsPR0y54zHW4(husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(husniw3snxdgzpagjm.KYHag8HRDlnO3X9zmZ().oOMFI1Dcqcg1BSVNty().getVisibility()), husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.NONE);
            }
        }
    }
}

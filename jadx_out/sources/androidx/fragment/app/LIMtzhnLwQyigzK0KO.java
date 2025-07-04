package androidx.fragment.app;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.XzJ1BS7H9Ilbkv4eVM;
import androidx.lifecycle.KYHag8HRDlnO3X9zmZ;

/* loaded from: classes.dex */
public class LIMtzhnLwQyigzK0KO {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Fragment f3484HJFh0TGMpafqLE9haL;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final e54J8UWNHWALQNixXM f3486lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final A49QRPHynYLCBN0SqP f3487s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f3488zZKhbgvUfsK4AEX3r0 = false;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public int f3485husNiw3snxdgZPAGJm = -1;

    public class lEeR5KfoEr4xU5yHH7 implements View.OnAttachStateChangeListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ View f3489lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(View view) {
            this.f3489lEeR5KfoEr4xU5yHH7 = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f3489lEeR5KfoEr4xU5yHH7.removeOnAttachStateChangeListener(this);
            lLKzvdU99Iw80uVD5I.ctWLFN70QQINH1kyYo(this.f3489lEeR5KfoEr4xU5yHH7);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ class s3fjYDxWOUexjjVgyA {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public static final /* synthetic */ int[] f3491lEeR5KfoEr4xU5yHH7;

        static {
            int[] iArr = new int[KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.values().length];
            f3491lEeR5KfoEr4xU5yHH7 = iArr;
            try {
                iArr[KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3491lEeR5KfoEr4xU5yHH7[KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3491lEeR5KfoEr4xU5yHH7[KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3491lEeR5KfoEr4xU5yHH7[KYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public LIMtzhnLwQyigzK0KO(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP, Fragment fragment) {
        this.f3486lEeR5KfoEr4xU5yHH7 = e54j8uwnhwalqnixxm;
        this.f3487s3fjYDxWOUexjjVgyA = a49QRPHynYLCBN0SqP;
        this.f3484HJFh0TGMpafqLE9haL = fragment;
    }

    public void Acstmh57AKoSEkEFNJ() {
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        if (fragment.f3436hoXrIDAFrSwfShk8da && fragment.f3429aPyGSIylzVNKPT1Bls && !fragment.f3449zaq8hOURtfwbcX17cG) {
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3484HJFh0TGMpafqLE9haL);
            }
            Fragment fragment2 = this.f3484HJFh0TGMpafqLE9haL;
            fragment2.Er40JrQbOM51vCQI8w(fragment2.HZ4bptRS9XIcK1CV95(fragment2.f3443s3fjYDxWOUexjjVgyA), null, this.f3484HJFh0TGMpafqLE9haL.f3443s3fjYDxWOUexjjVgyA);
            View view = this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f3484HJFh0TGMpafqLE9haL;
                fragment3.f3421W3RZ2dTDKrKpS5Mxdk.setTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f937lEeR5KfoEr4xU5yHH7, fragment3);
                Fragment fragment4 = this.f3484HJFh0TGMpafqLE9haL;
                if (fragment4.f3420VItLRw50eXTZeEfGl0) {
                    fragment4.f3421W3RZ2dTDKrKpS5Mxdk.setVisibility(8);
                }
                this.f3484HJFh0TGMpafqLE9haL.uAIIhSQWhOmxUb3Bqo();
                e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f3486lEeR5KfoEr4xU5yHH7;
                Fragment fragment5 = this.f3484HJFh0TGMpafqLE9haL;
                e54j8uwnhwalqnixxm.e54J8UWNHWALQNixXM(fragment5, fragment5.f3421W3RZ2dTDKrKpS5Mxdk, fragment5.f3443s3fjYDxWOUexjjVgyA, false);
                this.f3484HJFh0TGMpafqLE9haL.f3439lEeR5KfoEr4xU5yHH7 = 2;
            }
        }
    }

    public void G7AC3DWIx9i9fdanjk() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        this.f3484HJFh0TGMpafqLE9haL.owCQzRKpGarpL4247z();
        this.f3486lEeR5KfoEr4xU5yHH7.Z9WdNiOsPR0y54zHW4(this.f3484HJFh0TGMpafqLE9haL, false);
    }

    public void HJFh0TGMpafqLE9haL() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        Fragment fragment2 = fragment.f3417TCyPEKSzIyweCN5yp1;
        LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM = null;
        if (fragment2 != null) {
            LIMtzhnLwQyigzK0KO lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM2 = this.f3487s3fjYDxWOUexjjVgyA.e54J8UWNHWALQNixXM(fragment2.f3437husNiw3snxdgZPAGJm);
            if (lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM2 == null) {
                throw new IllegalStateException("Fragment " + this.f3484HJFh0TGMpafqLE9haL + " declared target fragment " + this.f3484HJFh0TGMpafqLE9haL.f3417TCyPEKSzIyweCN5yp1 + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f3484HJFh0TGMpafqLE9haL;
            fragment3.f3406IPyIQcaNa8aB7drBED = fragment3.f3417TCyPEKSzIyweCN5yp1.f3437husNiw3snxdgZPAGJm;
            fragment3.f3417TCyPEKSzIyweCN5yp1 = null;
            lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM = lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM2;
        } else {
            String str = fragment.f3406IPyIQcaNa8aB7drBED;
            if (str != null && (lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM = this.f3487s3fjYDxWOUexjjVgyA.e54J8UWNHWALQNixXM(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f3484HJFh0TGMpafqLE9haL + " declared target fragment " + this.f3484HJFh0TGMpafqLE9haL.f3406IPyIQcaNa8aB7drBED + " that does not belong to this FragmentManager!");
            }
        }
        if (lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM != null) {
            lIMtzhnLwQyigzK0KOE54J8UWNHWALQNixXM.T9PhQIpGRhE4yZDm1C();
        }
        Fragment fragment4 = this.f3484HJFh0TGMpafqLE9haL;
        fragment4.f3425Y43RdunnpKgpbny0lE.ctWLFN70QQINH1kyYo();
        fragment4.getClass();
        Fragment fragment5 = this.f3484HJFh0TGMpafqLE9haL;
        fragment5.f3403G7AC3DWIx9i9fdanjk = fragment5.f3425Y43RdunnpKgpbny0lE.zXY7dgnTfw9Pd9RXel();
        this.f3486lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ(this.f3484HJFh0TGMpafqLE9haL, false);
        this.f3484HJFh0TGMpafqLE9haL.O1furmptfI76BGfN0d();
        this.f3486lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA(this.f3484HJFh0TGMpafqLE9haL, false);
    }

    public void IPyIQcaNa8aB7drBED() {
        View view;
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        ViewGroup viewGroup = fragment.f3445tXWeW0sqVddf7ZBflq;
        if (viewGroup != null && (view = fragment.f3421W3RZ2dTDKrKpS5Mxdk) != null) {
            viewGroup.removeView(view);
        }
        this.f3484HJFh0TGMpafqLE9haL.Ywqw2A0s86HeuFkDt0();
        this.f3486lEeR5KfoEr4xU5yHH7.T9PhQIpGRhE4yZDm1C(this.f3484HJFh0TGMpafqLE9haL, false);
        Fragment fragment2 = this.f3484HJFh0TGMpafqLE9haL;
        fragment2.f3445tXWeW0sqVddf7ZBflq = null;
        fragment2.f3421W3RZ2dTDKrKpS5Mxdk = null;
        fragment2.f3410LU0fFDMACqnfIfA1AZ = null;
        fragment2.f3450zcy2NNbtVXgoGQbfuq.IPyIQcaNa8aB7drBED(null);
        this.f3484HJFh0TGMpafqLE9haL.f3429aPyGSIylzVNKPT1Bls = false;
    }

    public void KYHag8HRDlnO3X9zmZ() throws Resources.NotFoundException {
        String resourceName;
        if (this.f3484HJFh0TGMpafqLE9haL.f3436hoXrIDAFrSwfShk8da) {
            return;
        }
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        LayoutInflater layoutInflaterHZ4bptRS9XIcK1CV95 = fragment.HZ4bptRS9XIcK1CV95(fragment.f3443s3fjYDxWOUexjjVgyA);
        Fragment fragment2 = this.f3484HJFh0TGMpafqLE9haL;
        ViewGroup viewGroup = fragment2.f3445tXWeW0sqVddf7ZBflq;
        if (viewGroup == null) {
            int i = fragment2.f3409LIMtzhnLwQyigzK0KO;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f3484HJFh0TGMpafqLE9haL + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.f3425Y43RdunnpKgpbny0lE.k0CbjZvfUz23r8IN6W().lEeR5KfoEr4xU5yHH7(this.f3484HJFh0TGMpafqLE9haL.f3409LIMtzhnLwQyigzK0KO);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f3484HJFh0TGMpafqLE9haL;
                    if (!fragment3.f3411OANkd3mP6AYvwbNLJM) {
                        try {
                            resourceName = fragment3.W3RZ2dTDKrKpS5Mxdk().getResourceName(this.f3484HJFh0TGMpafqLE9haL.f3409LIMtzhnLwQyigzK0KO);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f3484HJFh0TGMpafqLE9haL.f3409LIMtzhnLwQyigzK0KO) + " (" + resourceName + ") for fragment " + this.f3484HJFh0TGMpafqLE9haL);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    zcy2NNbtVXgoGQbfuq.HJFh0TGMpafqLE9haL.TCyPEKSzIyweCN5yp1(this.f3484HJFh0TGMpafqLE9haL, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.f3484HJFh0TGMpafqLE9haL;
        fragment4.f3445tXWeW0sqVddf7ZBflq = viewGroup;
        fragment4.Er40JrQbOM51vCQI8w(layoutInflaterHZ4bptRS9XIcK1CV95, viewGroup, fragment4.f3443s3fjYDxWOUexjjVgyA);
        View view = this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f3484HJFh0TGMpafqLE9haL;
            fragment5.f3421W3RZ2dTDKrKpS5Mxdk.setTag(LU0fFDMACqnfIfA1AZ.s3fjYDxWOUexjjVgyA.f937lEeR5KfoEr4xU5yHH7, fragment5);
            if (viewGroup != null) {
                s3fjYDxWOUexjjVgyA();
            }
            Fragment fragment6 = this.f3484HJFh0TGMpafqLE9haL;
            if (fragment6.f3420VItLRw50eXTZeEfGl0) {
                fragment6.f3421W3RZ2dTDKrKpS5Mxdk.setVisibility(8);
            }
            if (lLKzvdU99Iw80uVD5I.aAp6BD79BhftLCnuvf(this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk)) {
                lLKzvdU99Iw80uVD5I.ctWLFN70QQINH1kyYo(this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk);
            } else {
                View view2 = this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk;
                view2.addOnAttachStateChangeListener(new lEeR5KfoEr4xU5yHH7(view2));
            }
            this.f3484HJFh0TGMpafqLE9haL.uAIIhSQWhOmxUb3Bqo();
            e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f3486lEeR5KfoEr4xU5yHH7;
            Fragment fragment7 = this.f3484HJFh0TGMpafqLE9haL;
            e54j8uwnhwalqnixxm.e54J8UWNHWALQNixXM(fragment7, fragment7.f3421W3RZ2dTDKrKpS5Mxdk, fragment7.f3443s3fjYDxWOUexjjVgyA, false);
            int visibility = this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk.getVisibility();
            this.f3484HJFh0TGMpafqLE9haL.PDw1hXOtArGjUqFgpT(this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk.getAlpha());
            Fragment fragment8 = this.f3484HJFh0TGMpafqLE9haL;
            if (fragment8.f3445tXWeW0sqVddf7ZBflq != null && visibility == 0) {
                View viewFindFocus = fragment8.f3421W3RZ2dTDKrKpS5Mxdk.findFocus();
                if (viewFindFocus != null) {
                    this.f3484HJFh0TGMpafqLE9haL.jsjSYEu4NPZjZxcfmI(viewFindFocus);
                    if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f3484HJFh0TGMpafqLE9haL);
                    }
                }
                this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk.setAlpha(0.0f);
            }
        }
        this.f3484HJFh0TGMpafqLE9haL.f3439lEeR5KfoEr4xU5yHH7 = 2;
    }

    public final Bundle OANkd3mP6AYvwbNLJM() {
        Bundle bundle = new Bundle();
        this.f3484HJFh0TGMpafqLE9haL.vlBaBOcZ1q1ndWVoXn(bundle);
        this.f3486lEeR5KfoEr4xU5yHH7.pbVGzGjWvY2LDXC8vo(this.f3484HJFh0TGMpafqLE9haL, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk != null) {
            sTkWmhpZ5b1ArQIw4K();
        }
        if (this.f3484HJFh0TGMpafqLE9haL.f3405HJFh0TGMpafqLE9haL != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f3484HJFh0TGMpafqLE9haL.f3405HJFh0TGMpafqLE9haL);
        }
        if (this.f3484HJFh0TGMpafqLE9haL.f3448zZKhbgvUfsK4AEX3r0 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f3484HJFh0TGMpafqLE9haL.f3448zZKhbgvUfsK4AEX3r0);
        }
        if (!this.f3484HJFh0TGMpafqLE9haL.f3404GyWRxpdt1T8mEJXPoD) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f3484HJFh0TGMpafqLE9haL.f3404GyWRxpdt1T8mEJXPoD);
        }
        return bundle;
    }

    public void R9SAhYMerGybF9OAjL() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        this.f3484HJFh0TGMpafqLE9haL.i8aHOwH04efS6lZ3Oa();
        this.f3486lEeR5KfoEr4xU5yHH7.Acstmh57AKoSEkEFNJ(this.f3484HJFh0TGMpafqLE9haL, false);
    }

    public void T9PhQIpGRhE4yZDm1C() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f3488zZKhbgvUfsK4AEX3r0) {
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + Z9WdNiOsPR0y54zHW4());
                return;
            }
            return;
        }
        try {
            this.f3488zZKhbgvUfsK4AEX3r0 = true;
            boolean z = false;
            while (true) {
                int iZZKhbgvUfsK4AEX3r0 = zZKhbgvUfsK4AEX3r0();
                Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
                int i = fragment.f3439lEeR5KfoEr4xU5yHH7;
                if (iZZKhbgvUfsK4AEX3r0 == i) {
                    if (!z && i == -1 && fragment.f3434e54J8UWNHWALQNixXM && !fragment.YlLW4G6OV9TFyuw5ix() && !this.f3484HJFh0TGMpafqLE9haL.f3416T9PhQIpGRhE4yZDm1C) {
                        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f3484HJFh0TGMpafqLE9haL);
                        }
                        this.f3487s3fjYDxWOUexjjVgyA.hoXrIDAFrSwfShk8da().KYHag8HRDlnO3X9zmZ(this.f3484HJFh0TGMpafqLE9haL);
                        this.f3487s3fjYDxWOUexjjVgyA.zaq8hOURtfwbcX17cG(this);
                        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f3484HJFh0TGMpafqLE9haL);
                        }
                        this.f3484HJFh0TGMpafqLE9haL.XdzLv4NdAtTYoEzVzB();
                    }
                    Fragment fragment2 = this.f3484HJFh0TGMpafqLE9haL;
                    if (fragment2.f3408KqgKJKIWne3kz1AdHk) {
                        if (fragment2.f3421W3RZ2dTDKrKpS5Mxdk != null && (viewGroup = fragment2.f3445tXWeW0sqVddf7ZBflq) != null) {
                            XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVMHoXrIDAFrSwfShk8da = XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da(viewGroup, fragment2.THTDvPxsHqMeGb512f());
                            if (this.f3484HJFh0TGMpafqLE9haL.f3420VItLRw50eXTZeEfGl0) {
                                xzJ1BS7H9Ilbkv4eVMHoXrIDAFrSwfShk8da.HJFh0TGMpafqLE9haL(this);
                            } else {
                                xzJ1BS7H9Ilbkv4eVMHoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(this);
                            }
                        }
                        Fragment fragment3 = this.f3484HJFh0TGMpafqLE9haL;
                        zaq8hOURtfwbcX17cG zaq8hourtfwbcx17cg = fragment3.f3425Y43RdunnpKgpbny0lE;
                        if (zaq8hourtfwbcx17cg != null) {
                            zaq8hourtfwbcx17cg.fLSSbwbzFBVpwBH5FM(fragment3);
                        }
                        Fragment fragment4 = this.f3484HJFh0TGMpafqLE9haL;
                        fragment4.f3408KqgKJKIWne3kz1AdHk = false;
                        fragment4.ctWLFN70QQINH1kyYo(fragment4.f3420VItLRw50eXTZeEfGl0);
                        this.f3484HJFh0TGMpafqLE9haL.f3415R9SAhYMerGybF9OAjL.ao3wqKm5CXFuvC0q47();
                    }
                    this.f3488zZKhbgvUfsK4AEX3r0 = false;
                    return;
                }
                if (iZZKhbgvUfsK4AEX3r0 <= i) {
                    switch (i - 1) {
                        case -1:
                            pbVGzGjWvY2LDXC8vo();
                            break;
                        case 0:
                            if (fragment.f3416T9PhQIpGRhE4yZDm1C && this.f3487s3fjYDxWOUexjjVgyA.aPyGSIylzVNKPT1Bls(fragment.f3437husNiw3snxdgZPAGJm) == null) {
                                zaq8hOURtfwbcX17cG();
                            }
                            TCyPEKSzIyweCN5yp1();
                            break;
                        case 1:
                            IPyIQcaNa8aB7drBED();
                            this.f3484HJFh0TGMpafqLE9haL.f3439lEeR5KfoEr4xU5yHH7 = 1;
                            break;
                        case 2:
                            fragment.f3429aPyGSIylzVNKPT1Bls = false;
                            fragment.f3439lEeR5KfoEr4xU5yHH7 = 2;
                            break;
                        case 3:
                            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f3484HJFh0TGMpafqLE9haL);
                            }
                            Fragment fragment5 = this.f3484HJFh0TGMpafqLE9haL;
                            if (fragment5.f3416T9PhQIpGRhE4yZDm1C) {
                                zaq8hOURtfwbcX17cG();
                            } else if (fragment5.f3421W3RZ2dTDKrKpS5Mxdk != null && fragment5.f3405HJFh0TGMpafqLE9haL == null) {
                                sTkWmhpZ5b1ArQIw4K();
                            }
                            Fragment fragment6 = this.f3484HJFh0TGMpafqLE9haL;
                            if (fragment6.f3421W3RZ2dTDKrKpS5Mxdk != null && (viewGroup2 = fragment6.f3445tXWeW0sqVddf7ZBflq) != null) {
                                XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da(viewGroup2, fragment6.THTDvPxsHqMeGb512f()).zZKhbgvUfsK4AEX3r0(this);
                            }
                            this.f3484HJFh0TGMpafqLE9haL.f3439lEeR5KfoEr4xU5yHH7 = 3;
                            break;
                        case 4:
                            G7AC3DWIx9i9fdanjk();
                            break;
                        case 5:
                            fragment.f3439lEeR5KfoEr4xU5yHH7 = 5;
                            break;
                        case 6:
                            hoXrIDAFrSwfShk8da();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            HJFh0TGMpafqLE9haL();
                            break;
                        case 1:
                            husNiw3snxdgZPAGJm();
                            break;
                        case 2:
                            Acstmh57AKoSEkEFNJ();
                            KYHag8HRDlnO3X9zmZ();
                            break;
                        case 3:
                            lEeR5KfoEr4xU5yHH7();
                            break;
                        case 4:
                            if (fragment.f3421W3RZ2dTDKrKpS5Mxdk != null && (viewGroup3 = fragment.f3445tXWeW0sqVddf7ZBflq) != null) {
                                XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da(viewGroup3, fragment.THTDvPxsHqMeGb512f()).s3fjYDxWOUexjjVgyA(XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA(this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk.getVisibility()), this);
                            }
                            this.f3484HJFh0TGMpafqLE9haL.f3439lEeR5KfoEr4xU5yHH7 = 4;
                            break;
                        case 5:
                            R9SAhYMerGybF9OAjL();
                            break;
                        case 6:
                            fragment.f3439lEeR5KfoEr4xU5yHH7 = 6;
                            break;
                        case 7:
                            aPyGSIylzVNKPT1Bls();
                            break;
                    }
                }
                z = true;
            }
        } catch (Throwable th) {
            this.f3488zZKhbgvUfsK4AEX3r0 = false;
            throw th;
        }
    }

    public void TCyPEKSzIyweCN5yp1() {
        Fragment fragmentHusNiw3snxdgZPAGJm;
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        boolean z = fragment.f3434e54J8UWNHWALQNixXM && !fragment.YlLW4G6OV9TFyuw5ix();
        if (z) {
            Fragment fragment2 = this.f3484HJFh0TGMpafqLE9haL;
            if (!fragment2.f3416T9PhQIpGRhE4yZDm1C) {
                this.f3487s3fjYDxWOUexjjVgyA.WWC27LAMFqFFBzfbNw(fragment2.f3437husNiw3snxdgZPAGJm, null);
            }
        }
        if (z || this.f3487s3fjYDxWOUexjjVgyA.hoXrIDAFrSwfShk8da().hoXrIDAFrSwfShk8da(this.f3484HJFh0TGMpafqLE9haL)) {
            this.f3484HJFh0TGMpafqLE9haL.getClass();
            throw null;
        }
        String str = this.f3484HJFh0TGMpafqLE9haL.f3406IPyIQcaNa8aB7drBED;
        if (str != null && (fragmentHusNiw3snxdgZPAGJm = this.f3487s3fjYDxWOUexjjVgyA.husNiw3snxdgZPAGJm(str)) != null && fragmentHusNiw3snxdgZPAGJm.f3418THTDvPxsHqMeGb512f) {
            this.f3484HJFh0TGMpafqLE9haL.f3417TCyPEKSzIyweCN5yp1 = fragmentHusNiw3snxdgZPAGJm;
        }
        this.f3484HJFh0TGMpafqLE9haL.f3439lEeR5KfoEr4xU5yHH7 = 0;
    }

    public void Y43RdunnpKgpbny0lE(int i) {
        this.f3485husNiw3snxdgZPAGJm = i;
    }

    public Fragment Z9WdNiOsPR0y54zHW4() {
        return this.f3484HJFh0TGMpafqLE9haL;
    }

    public void aPyGSIylzVNKPT1Bls() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        View viewXHA29AmDt6y96AnB3t = this.f3484HJFh0TGMpafqLE9haL.xHA29AmDt6y96AnB3t();
        if (viewXHA29AmDt6y96AnB3t != null && e54J8UWNHWALQNixXM(viewXHA29AmDt6y96AnB3t)) {
            boolean zRequestFocus = viewXHA29AmDt6y96AnB3t.requestFocus();
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(viewXHA29AmDt6y96AnB3t);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f3484HJFh0TGMpafqLE9haL);
                sb.append(" resulting in focused view ");
                sb.append(this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f3484HJFh0TGMpafqLE9haL.jsjSYEu4NPZjZxcfmI(null);
        this.f3484HJFh0TGMpafqLE9haL.fDXXEWvhMVO3O8mnuS();
        this.f3486lEeR5KfoEr4xU5yHH7.IPyIQcaNa8aB7drBED(this.f3484HJFh0TGMpafqLE9haL, false);
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        fragment.f3443s3fjYDxWOUexjjVgyA = null;
        fragment.f3405HJFh0TGMpafqLE9haL = null;
        fragment.f3448zZKhbgvUfsK4AEX3r0 = null;
    }

    public final boolean e54J8UWNHWALQNixXM(View view) {
        if (view == this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk) {
                return true;
            }
        }
        return false;
    }

    public void hoXrIDAFrSwfShk8da() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        this.f3484HJFh0TGMpafqLE9haL.pgB7Gmjz55y9NQYnAD();
        this.f3486lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(this.f3484HJFh0TGMpafqLE9haL, false);
    }

    public void husNiw3snxdgZPAGJm() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        if (fragment.f3428aAp6BD79BhftLCnuvf) {
            fragment.QW0Trt6m3nVBNaYFnP(fragment.f3443s3fjYDxWOUexjjVgyA);
            this.f3484HJFh0TGMpafqLE9haL.f3439lEeR5KfoEr4xU5yHH7 = 1;
            return;
        }
        this.f3486lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1(fragment, fragment.f3443s3fjYDxWOUexjjVgyA, false);
        Fragment fragment2 = this.f3484HJFh0TGMpafqLE9haL;
        fragment2.yL2E9nlEZpg8ZZx8XE(fragment2.f3443s3fjYDxWOUexjjVgyA);
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f3486lEeR5KfoEr4xU5yHH7;
        Fragment fragment3 = this.f3484HJFh0TGMpafqLE9haL;
        e54j8uwnhwalqnixxm.HJFh0TGMpafqLE9haL(fragment3, fragment3.f3443s3fjYDxWOUexjjVgyA, false);
    }

    public void lEeR5KfoEr4xU5yHH7() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        fragment.yvdWWG9COQQotjfedH(fragment.f3443s3fjYDxWOUexjjVgyA);
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = this.f3486lEeR5KfoEr4xU5yHH7;
        Fragment fragment2 = this.f3484HJFh0TGMpafqLE9haL;
        e54j8uwnhwalqnixxm.lEeR5KfoEr4xU5yHH7(fragment2, fragment2.f3443s3fjYDxWOUexjjVgyA, false);
    }

    public void pbVGzGjWvY2LDXC8vo() {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        this.f3484HJFh0TGMpafqLE9haL.f2zPq7MOnQrtOlZ1Zg();
        this.f3486lEeR5KfoEr4xU5yHH7.zZKhbgvUfsK4AEX3r0(this.f3484HJFh0TGMpafqLE9haL, false);
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        fragment.f3439lEeR5KfoEr4xU5yHH7 = -1;
        fragment.getClass();
        Fragment fragment2 = this.f3484HJFh0TGMpafqLE9haL;
        fragment2.f3403G7AC3DWIx9i9fdanjk = null;
        fragment2.f3425Y43RdunnpKgpbny0lE = null;
        if ((!fragment2.f3434e54J8UWNHWALQNixXM || fragment2.YlLW4G6OV9TFyuw5ix()) && !this.f3487s3fjYDxWOUexjjVgyA.hoXrIDAFrSwfShk8da().hoXrIDAFrSwfShk8da(this.f3484HJFh0TGMpafqLE9haL)) {
            return;
        }
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f3484HJFh0TGMpafqLE9haL);
        }
        this.f3484HJFh0TGMpafqLE9haL.XdzLv4NdAtTYoEzVzB();
    }

    public void s3fjYDxWOUexjjVgyA() {
        int iIPyIQcaNa8aB7drBED = this.f3487s3fjYDxWOUexjjVgyA.IPyIQcaNa8aB7drBED(this.f3484HJFh0TGMpafqLE9haL);
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        fragment.f3445tXWeW0sqVddf7ZBflq.addView(fragment.f3421W3RZ2dTDKrKpS5Mxdk, iIPyIQcaNa8aB7drBED);
    }

    public void sTkWmhpZ5b1ArQIw4K() {
        if (this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk == null) {
            return;
        }
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f3484HJFh0TGMpafqLE9haL + " with view " + this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f3484HJFh0TGMpafqLE9haL.f3405HJFh0TGMpafqLE9haL = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f3484HJFh0TGMpafqLE9haL.f3410LU0fFDMACqnfIfA1AZ.pbVGzGjWvY2LDXC8vo(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f3484HJFh0TGMpafqLE9haL.f3448zZKhbgvUfsK4AEX3r0 = bundle;
    }

    public int zZKhbgvUfsK4AEX3r0() {
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        if (fragment.f3425Y43RdunnpKgpbny0lE == null) {
            return fragment.f3439lEeR5KfoEr4xU5yHH7;
        }
        int iMin = this.f3485husNiw3snxdgZPAGJm;
        int i = s3fjYDxWOUexjjVgyA.f3491lEeR5KfoEr4xU5yHH7[fragment.f3419ToH8yzk8U1nKT0PUfY.ordinal()];
        if (i != 1) {
            iMin = i != 2 ? i != 3 ? i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f3484HJFh0TGMpafqLE9haL;
        if (fragment2.f3436hoXrIDAFrSwfShk8da) {
            if (fragment2.f3429aPyGSIylzVNKPT1Bls) {
                iMin = Math.max(this.f3485husNiw3snxdgZPAGJm, 2);
                View view = this.f3484HJFh0TGMpafqLE9haL.f3421W3RZ2dTDKrKpS5Mxdk;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f3485husNiw3snxdgZPAGJm < 4 ? Math.min(iMin, fragment2.f3439lEeR5KfoEr4xU5yHH7) : Math.min(iMin, 1);
            }
        }
        if (!this.f3484HJFh0TGMpafqLE9haL.f3427Z9WdNiOsPR0y54zHW4) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f3484HJFh0TGMpafqLE9haL;
        ViewGroup viewGroup = fragment3.f3445tXWeW0sqVddf7ZBflq;
        XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgyaE54J8UWNHWALQNixXM = viewGroup != null ? XzJ1BS7H9Ilbkv4eVM.hoXrIDAFrSwfShk8da(viewGroup, fragment3.THTDvPxsHqMeGb512f()).e54J8UWNHWALQNixXM(this) : null;
        if (s3fjydxwouexjjvgyaE54J8UWNHWALQNixXM == XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (s3fjydxwouexjjvgyaE54J8UWNHWALQNixXM == XzJ1BS7H9Ilbkv4eVM.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f3484HJFh0TGMpafqLE9haL;
            if (fragment4.f3434e54J8UWNHWALQNixXM) {
                iMin = fragment4.YlLW4G6OV9TFyuw5ix() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f3484HJFh0TGMpafqLE9haL;
        if (fragment5.f3413OqIo5QF00RDxUQb4qq && fragment5.f3439lEeR5KfoEr4xU5yHH7 < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f3484HJFh0TGMpafqLE9haL);
        }
        return iMin;
    }

    public void zaq8hOURtfwbcX17cG() {
        xHA29AmDt6y96AnB3t xha29amdt6y96anb3t = new xHA29AmDt6y96AnB3t(this.f3484HJFh0TGMpafqLE9haL);
        Fragment fragment = this.f3484HJFh0TGMpafqLE9haL;
        if (fragment.f3439lEeR5KfoEr4xU5yHH7 <= -1 || xha29amdt6y96anb3t.f3654T9PhQIpGRhE4yZDm1C != null) {
            xha29amdt6y96anb3t.f3654T9PhQIpGRhE4yZDm1C = fragment.f3443s3fjYDxWOUexjjVgyA;
        } else {
            Bundle bundleOANkd3mP6AYvwbNLJM = OANkd3mP6AYvwbNLJM();
            xha29amdt6y96anb3t.f3654T9PhQIpGRhE4yZDm1C = bundleOANkd3mP6AYvwbNLJM;
            if (this.f3484HJFh0TGMpafqLE9haL.f3406IPyIQcaNa8aB7drBED != null) {
                if (bundleOANkd3mP6AYvwbNLJM == null) {
                    xha29amdt6y96anb3t.f3654T9PhQIpGRhE4yZDm1C = new Bundle();
                }
                xha29amdt6y96anb3t.f3654T9PhQIpGRhE4yZDm1C.putString("android:target_state", this.f3484HJFh0TGMpafqLE9haL.f3406IPyIQcaNa8aB7drBED);
                int i = this.f3484HJFh0TGMpafqLE9haL.f3442pbVGzGjWvY2LDXC8vo;
                if (i != 0) {
                    xha29amdt6y96anb3t.f3654T9PhQIpGRhE4yZDm1C.putInt("android:target_req_state", i);
                }
            }
        }
        this.f3487s3fjYDxWOUexjjVgyA.WWC27LAMFqFFBzfbNw(this.f3484HJFh0TGMpafqLE9haL.f3437husNiw3snxdgZPAGJm, xha29amdt6y96anb3t);
    }

    public LIMtzhnLwQyigzK0KO(e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm, A49QRPHynYLCBN0SqP a49QRPHynYLCBN0SqP, Fragment fragment, xHA29AmDt6y96AnB3t xha29amdt6y96anb3t) {
        this.f3486lEeR5KfoEr4xU5yHH7 = e54j8uwnhwalqnixxm;
        this.f3487s3fjYDxWOUexjjVgyA = a49QRPHynYLCBN0SqP;
        this.f3484HJFh0TGMpafqLE9haL = fragment;
        fragment.f3405HJFh0TGMpafqLE9haL = null;
        fragment.f3448zZKhbgvUfsK4AEX3r0 = null;
        fragment.f3444sTkWmhpZ5b1ArQIw4K = 0;
        fragment.f3429aPyGSIylzVNKPT1Bls = false;
        fragment.f3427Z9WdNiOsPR0y54zHW4 = false;
        Fragment fragment2 = fragment.f3417TCyPEKSzIyweCN5yp1;
        fragment.f3406IPyIQcaNa8aB7drBED = fragment2 != null ? fragment2.f3437husNiw3snxdgZPAGJm : null;
        fragment.f3417TCyPEKSzIyweCN5yp1 = null;
        Bundle bundle = xha29amdt6y96anb3t.f3654T9PhQIpGRhE4yZDm1C;
        fragment.f3443s3fjYDxWOUexjjVgyA = bundle == null ? new Bundle() : bundle;
    }
}

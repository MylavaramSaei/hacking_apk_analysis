package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: CSih7GetOUab1dYQjM, reason: collision with root package name */
    public Handler f3607CSih7GetOUab1dYQjM;

    /* renamed from: DFYiVi7zXozAjRciKa, reason: collision with root package name */
    public boolean f3608DFYiVi7zXozAjRciKa;

    /* renamed from: FtYx4GXtxwA8al5hBy, reason: collision with root package name */
    public boolean f3609FtYx4GXtxwA8al5hBy;

    /* renamed from: ayduHasC7VpxsVXE0T, reason: collision with root package name */
    public boolean f3614ayduHasC7VpxsVXE0T;

    /* renamed from: evSiTWao80SbJUZk9E, reason: collision with root package name */
    public Dialog f3617evSiTWao80SbJUZk9E;

    /* renamed from: zXY7dgnTfw9Pd9RXel, reason: collision with root package name */
    public boolean f3622zXY7dgnTfw9Pd9RXel;

    /* renamed from: osrHU7fvDp2EgxZPfM, reason: collision with root package name */
    public Runnable f3620osrHU7fvDp2EgxZPfM = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: ZJNyOIPL0usMs2xSAn, reason: collision with root package name */
    public DialogInterface.OnCancelListener f3613ZJNyOIPL0usMs2xSAn = new s3fjYDxWOUexjjVgyA();

    /* renamed from: Tu4WCh2gEwj8E4oHbP, reason: collision with root package name */
    public DialogInterface.OnDismissListener f3612Tu4WCh2gEwj8E4oHbP = new HJFh0TGMpafqLE9haL();

    /* renamed from: k0CbjZvfUz23r8IN6W, reason: collision with root package name */
    public int f3619k0CbjZvfUz23r8IN6W = 0;

    /* renamed from: Kh0uC90qEEhuLdpgB9, reason: collision with root package name */
    public int f3610Kh0uC90qEEhuLdpgB9 = 0;

    /* renamed from: Pum9NZyDBKoCnecvlx, reason: collision with root package name */
    public boolean f3611Pum9NZyDBKoCnecvlx = true;

    /* renamed from: ctWLFN70QQINH1kyYo, reason: collision with root package name */
    public boolean f3615ctWLFN70QQINH1kyYo = true;

    /* renamed from: jocVUfxESVhVJU8LoH, reason: collision with root package name */
    public int f3618jocVUfxESVhVJU8LoH = -1;

    /* renamed from: eWK41qw3g36LVd4UnS, reason: collision with root package name */
    public androidx.lifecycle.OANkd3mP6AYvwbNLJM f3616eWK41qw3g36LVd4UnS = new zZKhbgvUfsK4AEX3r0();

    /* renamed from: xMfAHy6F7qK0zhxhKG, reason: collision with root package name */
    public boolean f3621xMfAHy6F7qK0zhxhKG = false;

    public class HJFh0TGMpafqLE9haL implements DialogInterface.OnDismissListener {
        public HJFh0TGMpafqLE9haL() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (husNiw3snxdgZPAGJm.this.f3617evSiTWao80SbJUZk9E != null) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = husNiw3snxdgZPAGJm.this;
                husniw3snxdgzpagjm.onDismiss(husniw3snxdgzpagjm.f3617evSiTWao80SbJUZk9E);
            }
        }
    }

    /* renamed from: androidx.fragment.app.husNiw3snxdgZPAGJm$husNiw3snxdgZPAGJm, reason: collision with other inner class name */
    public class C0040husNiw3snxdgZPAGJm extends IPyIQcaNa8aB7drBED {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ IPyIQcaNa8aB7drBED f3624lEeR5KfoEr4xU5yHH7;

        public C0040husNiw3snxdgZPAGJm(IPyIQcaNa8aB7drBED iPyIQcaNa8aB7drBED) {
            this.f3624lEeR5KfoEr4xU5yHH7 = iPyIQcaNa8aB7drBED;
        }

        @Override // androidx.fragment.app.IPyIQcaNa8aB7drBED
        public View lEeR5KfoEr4xU5yHH7(int i) {
            return this.f3624lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA() ? this.f3624lEeR5KfoEr4xU5yHH7.lEeR5KfoEr4xU5yHH7(i) : husNiw3snxdgZPAGJm.this.fBZDmBPlAHk1Liuf1T(i);
        }

        @Override // androidx.fragment.app.IPyIQcaNa8aB7drBED
        public boolean s3fjYDxWOUexjjVgyA() {
            return this.f3624lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA() || husNiw3snxdgZPAGJm.this.hgxXdWVkE1CPHCTwpz();
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements Runnable {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // java.lang.Runnable
        public void run() {
            husNiw3snxdgZPAGJm.this.f3612Tu4WCh2gEwj8E4oHbP.onDismiss(husNiw3snxdgZPAGJm.this.f3617evSiTWao80SbJUZk9E);
        }
    }

    public class s3fjYDxWOUexjjVgyA implements DialogInterface.OnCancelListener {
        public s3fjYDxWOUexjjVgyA() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (husNiw3snxdgZPAGJm.this.f3617evSiTWao80SbJUZk9E != null) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = husNiw3snxdgZPAGJm.this;
                husniw3snxdgzpagjm.onCancel(husniw3snxdgzpagjm.f3617evSiTWao80SbJUZk9E);
            }
        }
    }

    public class zZKhbgvUfsK4AEX3r0 implements androidx.lifecycle.OANkd3mP6AYvwbNLJM {
        public zZKhbgvUfsK4AEX3r0() {
        }

        @Override // androidx.lifecycle.OANkd3mP6AYvwbNLJM
        /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
        public void lEeR5KfoEr4xU5yHH7(androidx.lifecycle.Z9WdNiOsPR0y54zHW4 z9WdNiOsPR0y54zHW4) {
            if (z9WdNiOsPR0y54zHW4 == null || !husNiw3snxdgZPAGJm.this.f3615ctWLFN70QQINH1kyYo) {
                return;
            }
            View viewOOMFI1Dcqcg1BSVNty = husNiw3snxdgZPAGJm.this.oOMFI1Dcqcg1BSVNty();
            if (viewOOMFI1Dcqcg1BSVNty.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (husNiw3snxdgZPAGJm.this.f3617evSiTWao80SbJUZk9E != null) {
                if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + husNiw3snxdgZPAGJm.this.f3617evSiTWao80SbJUZk9E);
                }
                husNiw3snxdgZPAGJm.this.f3617evSiTWao80SbJUZk9E.setContentView(viewOOMFI1Dcqcg1BSVNty);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Er40JrQbOM51vCQI8w(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.Er40JrQbOM51vCQI8w(layoutInflater, viewGroup, bundle);
        if (this.f3421W3RZ2dTDKrKpS5Mxdk != null || this.f3617evSiTWao80SbJUZk9E == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f3617evSiTWao80SbJUZk9E.onRestoreInstanceState(bundle2);
    }

    public Dialog GeBgWLiG3rAOvStVF8() {
        return this.f3617evSiTWao80SbJUZk9E;
    }

    @Override // androidx.fragment.app.Fragment
    public IPyIQcaNa8aB7drBED IPyIQcaNa8aB7drBED() {
        return new C0040husNiw3snxdgZPAGJm(super.IPyIQcaNa8aB7drBED());
    }

    @Override // androidx.fragment.app.Fragment
    public void Jsouc4ileb8SxQhxbX() {
        super.Jsouc4ileb8SxQhxbX();
        Dialog dialog = this.f3617evSiTWao80SbJUZk9E;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Kh0uC90qEEhuLdpgB9() {
        super.Kh0uC90qEEhuLdpgB9();
        if (!this.f3614ayduHasC7VpxsVXE0T && !this.f3609FtYx4GXtxwA8al5hBy) {
            this.f3609FtYx4GXtxwA8al5hBy = true;
        }
        lLKzvdU99Iw80uVD5I().TCyPEKSzIyweCN5yp1(this.f3616eWK41qw3g36LVd4UnS);
    }

    public final void MHebQjnRowM60e3HDn(boolean z, boolean z2, boolean z3) {
        if (this.f3609FtYx4GXtxwA8al5hBy) {
            return;
        }
        this.f3609FtYx4GXtxwA8al5hBy = true;
        this.f3614ayduHasC7VpxsVXE0T = false;
        Dialog dialog = this.f3617evSiTWao80SbJUZk9E;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f3617evSiTWao80SbJUZk9E.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f3607CSih7GetOUab1dYQjM.getLooper()) {
                    onDismiss(this.f3617evSiTWao80SbJUZk9E);
                } else {
                    this.f3607CSih7GetOUab1dYQjM.post(this.f3620osrHU7fvDp2EgxZPfM);
                }
            }
        }
        this.f3608DFYiVi7zXozAjRciKa = true;
        if (this.f3618jocVUfxESVhVJU8LoH >= 0) {
            if (z3) {
                THTDvPxsHqMeGb512f().uAIIhSQWhOmxUb3Bqo(this.f3618jocVUfxESVhVJU8LoH, 1);
            } else {
                THTDvPxsHqMeGb512f().i8aHOwH04efS6lZ3Oa(this.f3618jocVUfxESVhVJU8LoH, 1, z);
            }
            this.f3618jocVUfxESVhVJU8LoH = -1;
            return;
        }
        VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0T9PhQIpGRhE4yZDm1C = THTDvPxsHqMeGb512f().T9PhQIpGRhE4yZDm1C();
        vItLRw50eXTZeEfGl0T9PhQIpGRhE4yZDm1C.hoXrIDAFrSwfShk8da(true);
        vItLRw50eXTZeEfGl0T9PhQIpGRhE4yZDm1C.Z9WdNiOsPR0y54zHW4(this);
        if (z3) {
            vItLRw50eXTZeEfGl0T9PhQIpGRhE4yZDm1C.TCyPEKSzIyweCN5yp1();
        } else if (z) {
            vItLRw50eXTZeEfGl0T9PhQIpGRhE4yZDm1C.KYHag8HRDlnO3X9zmZ();
        } else {
            vItLRw50eXTZeEfGl0T9PhQIpGRhE4yZDm1C.husNiw3snxdgZPAGJm();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater Pum9NZyDBKoCnecvlx(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater layoutInflaterPum9NZyDBKoCnecvlx = super.Pum9NZyDBKoCnecvlx(bundle);
        if (this.f3615ctWLFN70QQINH1kyYo && !this.f3622zXY7dgnTfw9Pd9RXel) {
            dCumDqZdWZ8NLrsgb7(bundle);
            if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f3617evSiTWao80SbJUZk9E;
            return dialog != null ? layoutInflaterPum9NZyDBKoCnecvlx.cloneInContext(dialog.getContext()) : layoutInflaterPum9NZyDBKoCnecvlx;
        }
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f3615ctWLFN70QQINH1kyYo) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
            Log.d("FragmentManager", sb.toString());
        }
        return layoutInflaterPum9NZyDBKoCnecvlx;
    }

    public int WaWv1mJ1ya3uoEaKqz() {
        return this.f3610Kh0uC90qEEhuLdpgB9;
    }

    public Dialog YIIWDMF3jHAs3E0PkN(Bundle bundle) {
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.IPyIQcaNa8aB7drBED(OWyIJu8lIXxQlvLhaC(), WaWv1mJ1ya3uoEaKqz());
    }

    public void ayaSAlBnO403UB0TMR(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    public void ayduHasC7VpxsVXE0T(Bundle bundle) {
        super.ayduHasC7VpxsVXE0T(bundle);
        Dialog dialog = this.f3617evSiTWao80SbJUZk9E;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f3619k0CbjZvfUz23r8IN6W;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3610Kh0uC90qEEhuLdpgB9;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f3611Pum9NZyDBKoCnecvlx;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f3615ctWLFN70QQINH1kyYo;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f3618jocVUfxESVhVJU8LoH;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void bBVlTkqEpHW053CjWL(Bundle bundle) {
        Bundle bundle2;
        super.bBVlTkqEpHW053CjWL(bundle);
        if (this.f3617evSiTWao80SbJUZk9E == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f3617evSiTWao80SbJUZk9E.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public void bMSdooljgH14Jgudph(Bundle bundle) {
        super.bMSdooljgH14Jgudph(bundle);
        this.f3607CSih7GetOUab1dYQjM = new Handler();
        this.f3615ctWLFN70QQINH1kyYo = this.f3409LIMtzhnLwQyigzK0KO == 0;
        if (bundle != null) {
            this.f3619k0CbjZvfUz23r8IN6W = bundle.getInt("android:style", 0);
            this.f3610Kh0uC90qEEhuLdpgB9 = bundle.getInt("android:theme", 0);
            this.f3611Pum9NZyDBKoCnecvlx = bundle.getBoolean("android:cancelable", true);
            this.f3615ctWLFN70QQINH1kyYo = bundle.getBoolean("android:showsDialog", this.f3615ctWLFN70QQINH1kyYo);
            this.f3618jocVUfxESVhVJU8LoH = bundle.getInt("android:backStackId", -1);
        }
    }

    public final void dCumDqZdWZ8NLrsgb7(Bundle bundle) {
        if (this.f3615ctWLFN70QQINH1kyYo && !this.f3621xMfAHy6F7qK0zhxhKG) {
            try {
                this.f3622zXY7dgnTfw9Pd9RXel = true;
                Dialog dialogYIIWDMF3jHAs3E0PkN = YIIWDMF3jHAs3E0PkN(bundle);
                this.f3617evSiTWao80SbJUZk9E = dialogYIIWDMF3jHAs3E0PkN;
                if (this.f3615ctWLFN70QQINH1kyYo) {
                    ayaSAlBnO403UB0TMR(dialogYIIWDMF3jHAs3E0PkN, this.f3619k0CbjZvfUz23r8IN6W);
                    Context contextAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls();
                    if (contextAPyGSIylzVNKPT1Bls instanceof Activity) {
                        this.f3617evSiTWao80SbJUZk9E.setOwnerActivity((Activity) contextAPyGSIylzVNKPT1Bls);
                    }
                    this.f3617evSiTWao80SbJUZk9E.setCancelable(this.f3611Pum9NZyDBKoCnecvlx);
                    this.f3617evSiTWao80SbJUZk9E.setOnCancelListener(this.f3613ZJNyOIPL0usMs2xSAn);
                    this.f3617evSiTWao80SbJUZk9E.setOnDismissListener(this.f3612Tu4WCh2gEwj8E4oHbP);
                    this.f3621xMfAHy6F7qK0zhxhKG = true;
                } else {
                    this.f3617evSiTWao80SbJUZk9E = null;
                }
                this.f3622zXY7dgnTfw9Pd9RXel = false;
            } catch (Throwable th) {
                this.f3622zXY7dgnTfw9Pd9RXel = false;
                throw th;
            }
        }
    }

    public View fBZDmBPlAHk1Liuf1T(int i) {
        Dialog dialog = this.f3617evSiTWao80SbJUZk9E;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void hUNBy66ZO1wVLJGW3l(Bundle bundle) {
        super.hUNBy66ZO1wVLJGW3l(bundle);
    }

    public boolean hgxXdWVkE1CPHCTwpz() {
        return this.f3621xMfAHy6F7qK0zhxhKG;
    }

    @Override // androidx.fragment.app.Fragment
    public void k0CbjZvfUz23r8IN6W() {
        super.k0CbjZvfUz23r8IN6W();
        Dialog dialog = this.f3617evSiTWao80SbJUZk9E;
        if (dialog != null) {
            this.f3608DFYiVi7zXozAjRciKa = true;
            dialog.setOnDismissListener(null);
            this.f3617evSiTWao80SbJUZk9E.dismiss();
            if (!this.f3609FtYx4GXtxwA8al5hBy) {
                onDismiss(this.f3617evSiTWao80SbJUZk9E);
            }
            this.f3617evSiTWao80SbJUZk9E = null;
            this.f3621xMfAHy6F7qK0zhxhKG = false;
        }
    }

    public final Dialog lBAL39rPf03qYLFNNP() {
        Dialog dialogGeBgWLiG3rAOvStVF8 = GeBgWLiG3rAOvStVF8();
        if (dialogGeBgWLiG3rAOvStVF8 != null) {
            return dialogGeBgWLiG3rAOvStVF8;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f3608DFYiVi7zXozAjRciKa) {
            return;
        }
        if (zaq8hOURtfwbcX17cG.yvdWWG9COQQotjfedH(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        MHebQjnRowM60e3HDn(true, true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void xMfAHy6F7qK0zhxhKG() {
        super.xMfAHy6F7qK0zhxhKG();
        Dialog dialog = this.f3617evSiTWao80SbJUZk9E;
        if (dialog != null) {
            this.f3608DFYiVi7zXozAjRciKa = false;
            dialog.show();
            View decorView = this.f3617evSiTWao80SbJUZk9E.getWindow().getDecorView();
            androidx.lifecycle.jCtUeU2YI1poCxWcjm.lEeR5KfoEr4xU5yHH7(decorView, this);
            androidx.lifecycle.XzJ1BS7H9Ilbkv4eVM.lEeR5KfoEr4xU5yHH7(decorView, this);
            CSih7GetOUab1dYQjM.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(decorView, this);
        }
    }
}

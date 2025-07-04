package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e54J8UWNHWALQNixXM<S> extends zaq8hOURtfwbcX17cG {

    /* renamed from: ZJNyOIPL0usMs2xSAn, reason: collision with root package name */
    public com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7 f5161ZJNyOIPL0usMs2xSAn;

    /* renamed from: osrHU7fvDp2EgxZPfM, reason: collision with root package name */
    public int f5162osrHU7fvDp2EgxZPfM;

    public class lEeR5KfoEr4xU5yHH7 extends OANkd3mP6AYvwbNLJM {
        public lEeR5KfoEr4xU5yHH7() {
        }
    }

    public static e54J8UWNHWALQNixXM h6NrAcYSuIyiU1qV6F(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, int i, com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        e54J8UWNHWALQNixXM e54j8uwnhwalqnixxm = new e54J8UWNHWALQNixXM();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", zzkhbgvufsk4aex3r0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", leer5kfoer4xu5yhh7);
        e54j8uwnhwalqnixxm.tmIBXGVvBsrJ7i63G2(bundle);
        return e54j8uwnhwalqnixxm;
    }

    @Override // androidx.fragment.app.Fragment
    public View ZJNyOIPL0usMs2xSAn(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(aPyGSIylzVNKPT1Bls(), this.f5162osrHU7fvDp2EgxZPfM));
        new lEeR5KfoEr4xU5yHH7();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void ayduHasC7VpxsVXE0T(Bundle bundle) {
        super.ayduHasC7VpxsVXE0T(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5162osrHU7fvDp2EgxZPfM);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5161ZJNyOIPL0usMs2xSAn);
    }

    @Override // androidx.fragment.app.Fragment
    public void bMSdooljgH14Jgudph(Bundle bundle) {
        super.bMSdooljgH14Jgudph(bundle);
        if (bundle == null) {
            bundle = T9PhQIpGRhE4yZDm1C();
        }
        this.f5162osrHU7fvDp2EgxZPfM = bundle.getInt("THEME_RES_ID_KEY");
        androidx.activity.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f5161ZJNyOIPL0usMs2xSAn = (com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}

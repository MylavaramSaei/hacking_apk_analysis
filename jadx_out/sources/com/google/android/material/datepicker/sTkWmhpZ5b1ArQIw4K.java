package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class sTkWmhpZ5b1ArQIw4K extends LinearLayoutManager {

    public class lEeR5KfoEr4xU5yHH7 extends androidx.recyclerview.widget.TCyPEKSzIyweCN5yp1 {
        public lEeR5KfoEr4xU5yHH7(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.TCyPEKSzIyweCN5yp1
        public float xHA29AmDt6y96AnB3t(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public sTkWmhpZ5b1ArQIw4K(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.aPyGSIylzVNKPT1Bls
    public void Tn7MuV14fPMb1UrB5h(RecyclerView recyclerView, RecyclerView.WWC27LAMFqFFBzfbNw wWC27LAMFqFFBzfbNw, int i) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = new lEeR5KfoEr4xU5yHH7(recyclerView.getContext());
        leer5kfoer4xu5yhh7.OANkd3mP6AYvwbNLJM(i);
        yuvys90eVmNOCmVGXw(leer5kfoer4xu5yhh7);
    }
}

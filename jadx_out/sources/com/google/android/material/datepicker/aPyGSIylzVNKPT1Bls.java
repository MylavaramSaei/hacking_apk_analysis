package com.google.android.material.datepicker;

import W3RZ2dTDKrKpS5Mxdk.lLKzvdU99Iw80uVD5I;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public class aPyGSIylzVNKPT1Bls extends RecyclerView.TCyPEKSzIyweCN5yp1 {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7 f5154HJFh0TGMpafqLE9haL;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f5155husNiw3snxdgZPAGJm;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final pbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C f5156zZKhbgvUfsK4AEX3r0;

    public class lEeR5KfoEr4xU5yHH7 implements AdapterView.OnItemClickListener {

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f5157lEeR5KfoEr4xU5yHH7;

        public lEeR5KfoEr4xU5yHH7(MaterialCalendarGridView materialCalendarGridView) {
            this.f5157lEeR5KfoEr4xU5yHH7 = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (this.f5157lEeR5KfoEr4xU5yHH7.getAdapter().OANkd3mP6AYvwbNLJM(i)) {
                aPyGSIylzVNKPT1Bls.this.f5156zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this.f5157lEeR5KfoEr4xU5yHH7.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class s3fjYDxWOUexjjVgyA extends RecyclerView.OUd9THiLjZndMj0qdF {

        /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
        public final MaterialCalendarGridView f5159G7AC3DWIx9i9fdanjk;

        /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
        public final TextView f5160R9SAhYMerGybF9OAjL;

        public s3fjYDxWOUexjjVgyA(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7109Y43RdunnpKgpbny0lE);
            this.f5160R9SAhYMerGybF9OAjL = textView;
            lLKzvdU99Iw80uVD5I.evSiTWao80SbJUZk9E(textView, true);
            this.f5159G7AC3DWIx9i9fdanjk = (MaterialCalendarGridView) linearLayout.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7111aPyGSIylzVNKPT1Bls);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public aPyGSIylzVNKPT1Bls(Context context, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, com.google.android.material.datepicker.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7, TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, pbVGzGjWvY2LDXC8vo.T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C) {
        T9PhQIpGRhE4yZDm1C T9PhQIpGRhE4yZDm1C2 = leer5kfoer4xu5yhh7.T9PhQIpGRhE4yZDm1C();
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1CPbVGzGjWvY2LDXC8vo = leer5kfoer4xu5yhh7.pbVGzGjWvY2LDXC8vo();
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1CE54J8UWNHWALQNixXM = leer5kfoer4xu5yhh7.e54J8UWNHWALQNixXM();
        if (T9PhQIpGRhE4yZDm1C2.compareTo(t9PhQIpGRhE4yZDm1CE54J8UWNHWALQNixXM) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (t9PhQIpGRhE4yZDm1CE54J8UWNHWALQNixXM.compareTo(t9PhQIpGRhE4yZDm1CPbVGzGjWvY2LDXC8vo) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f5155husNiw3snxdgZPAGJm = (hoXrIDAFrSwfShk8da.f5165husNiw3snxdgZPAGJm * pbVGzGjWvY2LDXC8vo.auvQiDfBN48eRz3fFq(context)) + (Z9WdNiOsPR0y54zHW4.hUNDUI3oB5uci3ylnY(context) ? pbVGzGjWvY2LDXC8vo.auvQiDfBN48eRz3fFq(context) : 0);
        this.f5154HJFh0TGMpafqLE9haL = leer5kfoer4xu5yhh7;
        this.f5156zZKhbgvUfsK4AEX3r0 = t9PhQIpGRhE4yZDm1C;
        sTkWmhpZ5b1ArQIw4K(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.TCyPEKSzIyweCN5yp1
    /* renamed from: A49QRPHynYLCBN0SqP, reason: merged with bridge method [inline-methods] */
    public void pbVGzGjWvY2LDXC8vo(s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya, int i) {
        T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1CE54J8UWNHWALQNixXM = this.f5154HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C().e54J8UWNHWALQNixXM(i);
        s3fjydxwouexjjvgya.f5160R9SAhYMerGybF9OAjL.setText(t9PhQIpGRhE4yZDm1CE54J8UWNHWALQNixXM.Acstmh57AKoSEkEFNJ());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) s3fjydxwouexjjvgya.f5159G7AC3DWIx9i9fdanjk.findViewById(tmIBXGVvBsrJ7i63G2.husNiw3snxdgZPAGJm.f7111aPyGSIylzVNKPT1Bls);
        if (materialCalendarGridView.getAdapter() == null || !t9PhQIpGRhE4yZDm1CE54J8UWNHWALQNixXM.equals(materialCalendarGridView.getAdapter().f5167lEeR5KfoEr4xU5yHH7)) {
            hoXrIDAFrSwfShk8da hoxridafrswfshk8da = new hoXrIDAFrSwfShk8da(t9PhQIpGRhE4yZDm1CE54J8UWNHWALQNixXM, null, this.f5154HJFh0TGMpafqLE9haL, null);
            materialCalendarGridView.setNumColumns(t9PhQIpGRhE4yZDm1CE54J8UWNHWALQNixXM.f5114zZKhbgvUfsK4AEX3r0);
            materialCalendarGridView.setAdapter((ListAdapter) hoxridafrswfshk8da);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().aPyGSIylzVNKPT1Bls(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new lEeR5KfoEr4xU5yHH7(materialCalendarGridView));
    }

    public T9PhQIpGRhE4yZDm1C G7AC3DWIx9i9fdanjk(int i) {
        return this.f5154HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C().e54J8UWNHWALQNixXM(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.TCyPEKSzIyweCN5yp1
    public int HJFh0TGMpafqLE9haL() {
        return this.f5154HJFh0TGMpafqLE9haL.Z9WdNiOsPR0y54zHW4();
    }

    public int LIMtzhnLwQyigzK0KO(T9PhQIpGRhE4yZDm1C t9PhQIpGRhE4yZDm1C) {
        return this.f5154HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C().T9PhQIpGRhE4yZDm1C(t9PhQIpGRhE4yZDm1C);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.TCyPEKSzIyweCN5yp1
    /* renamed from: VItLRw50eXTZeEfGl0, reason: merged with bridge method [inline-methods] */
    public s3fjYDxWOUexjjVgyA Z9WdNiOsPR0y54zHW4(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(tmIBXGVvBsrJ7i63G2.TCyPEKSzIyweCN5yp1.f7075T9PhQIpGRhE4yZDm1C, viewGroup, false);
        if (!Z9WdNiOsPR0y54zHW4.hUNDUI3oB5uci3ylnY(viewGroup.getContext())) {
            return new s3fjYDxWOUexjjVgyA(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.OANkd3mP6AYvwbNLJM(-1, this.f5155husNiw3snxdgZPAGJm));
        return new s3fjYDxWOUexjjVgyA(linearLayout, true);
    }

    public CharSequence xHA29AmDt6y96AnB3t(int i) {
        return G7AC3DWIx9i9fdanjk(i).Acstmh57AKoSEkEFNJ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.TCyPEKSzIyweCN5yp1
    public long zZKhbgvUfsK4AEX3r0(int i) {
        return this.f5154HJFh0TGMpafqLE9haL.T9PhQIpGRhE4yZDm1C().e54J8UWNHWALQNixXM(i).Z9WdNiOsPR0y54zHW4();
    }
}

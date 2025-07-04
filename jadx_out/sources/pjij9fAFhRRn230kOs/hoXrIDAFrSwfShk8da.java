package pjij9fAFhRRn230kOs;

import RkBK3rbmyPvWiHUrac.OANkd3mP6AYvwbNLJM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class hoXrIDAFrSwfShk8da extends T9PhQIpGRhE4yZDm1C {

    public static final class lEeR5KfoEr4xU5yHH7 extends jpEZy3U5wFkT2e9PKQ.Acstmh57AKoSEkEFNJ implements OANkd3mP6AYvwbNLJM {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final /* synthetic */ boolean f6575HJFh0TGMpafqLE9haL;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final /* synthetic */ List f6576s3fjYDxWOUexjjVgyA;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lEeR5KfoEr4xU5yHH7(List list, boolean z) {
            super(2);
            this.f6576s3fjYDxWOUexjjVgyA = list;
            this.f6575HJFh0TGMpafqLE9haL = z;
        }

        @Override // RkBK3rbmyPvWiHUrac.OANkd3mP6AYvwbNLJM
        public /* bridge */ /* synthetic */ Object s3fjYDxWOUexjjVgyA(Object obj, Object obj2) {
            return zZKhbgvUfsK4AEX3r0((CharSequence) obj, ((Number) obj2).intValue());
        }

        public final GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ zZKhbgvUfsK4AEX3r0(CharSequence charSequence, int i) {
            jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence, "$this$$receiver");
            GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZHusNiw3snxdgZPAGJm = hoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(charSequence, this.f6576s3fjYDxWOUexjjVgyA, i, this.f6575HJFh0TGMpafqLE9haL, false);
            if (kYHag8HRDlnO3X9zmZHusNiw3snxdgZPAGJm != null) {
                return GraqRgO5nDZP94CSeH.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(kYHag8HRDlnO3X9zmZHusNiw3snxdgZPAGJm.HJFh0TGMpafqLE9haL(), Integer.valueOf(((String) kYHag8HRDlnO3X9zmZHusNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0()).length()));
            }
            return null;
        }
    }

    public static final String A49QRPHynYLCBN0SqP(String str, char c, String str2) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str2, "missingDelimiterValue");
        int iT9PhQIpGRhE4yZDm1C = T9PhQIpGRhE4yZDm1C(str, c, 0, false, 6, null);
        if (iT9PhQIpGRhE4yZDm1C == -1) {
            return str2;
        }
        String strSubstring = str.substring(iT9PhQIpGRhE4yZDm1C + 1, str.length());
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int Acstmh57AKoSEkEFNJ(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return TCyPEKSzIyweCN5yp1(charSequence, str, i, z);
    }

    public static final List G7AC3DWIx9i9fdanjk(CharSequence charSequence, String str, boolean z, int i) {
        Y43RdunnpKgpbny0lE(i);
        int length = 0;
        int iTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(charSequence, str, 0, z);
        if (iTCyPEKSzIyweCN5yp1 == -1 || i == 1) {
            return F8je6vTkTMHm5WbjEC.Acstmh57AKoSEkEFNJ.lEeR5KfoEr4xU5yHH7(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iTCyPEKSzIyweCN5yp1).toString());
            length = str.length() + iTCyPEKSzIyweCN5yp1;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iTCyPEKSzIyweCN5yp1 = TCyPEKSzIyweCN5yp1(charSequence, str, length, z);
        } while (iTCyPEKSzIyweCN5yp1 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static final int IPyIQcaNa8aB7drBED(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        cni9M1Tt0N7bwq7oSh.lEeR5KfoEr4xU5yHH7 hJFh0TGMpafqLE9haL = !z2 ? new cni9M1Tt0N7bwq7oSh.HJFh0TGMpafqLE9haL(cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(i, 0), cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(i2, charSequence.length())) : cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0(cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(i, KYHag8HRDlnO3X9zmZ(charSequence)), cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iLEeR5KfoEr4xU5yHH7 = hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
            int iS3fjYDxWOUexjjVgyA = hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA();
            int iHJFh0TGMpafqLE9haL = hJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL();
            if ((iHJFh0TGMpafqLE9haL <= 0 || iLEeR5KfoEr4xU5yHH7 > iS3fjYDxWOUexjjVgyA) && (iHJFh0TGMpafqLE9haL >= 0 || iS3fjYDxWOUexjjVgyA > iLEeR5KfoEr4xU5yHH7)) {
                return -1;
            }
            while (!T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7((String) charSequence2, 0, (String) charSequence, iLEeR5KfoEr4xU5yHH7, charSequence2.length(), z)) {
                if (iLEeR5KfoEr4xU5yHH7 == iS3fjYDxWOUexjjVgyA) {
                    return -1;
                }
                iLEeR5KfoEr4xU5yHH7 += iHJFh0TGMpafqLE9haL;
            }
            return iLEeR5KfoEr4xU5yHH7;
        }
        int iLEeR5KfoEr4xU5yHH72 = hJFh0TGMpafqLE9haL.lEeR5KfoEr4xU5yHH7();
        int iS3fjYDxWOUexjjVgyA2 = hJFh0TGMpafqLE9haL.s3fjYDxWOUexjjVgyA();
        int iHJFh0TGMpafqLE9haL2 = hJFh0TGMpafqLE9haL.HJFh0TGMpafqLE9haL();
        if ((iHJFh0TGMpafqLE9haL2 <= 0 || iLEeR5KfoEr4xU5yHH72 > iS3fjYDxWOUexjjVgyA2) && (iHJFh0TGMpafqLE9haL2 >= 0 || iS3fjYDxWOUexjjVgyA2 > iLEeR5KfoEr4xU5yHH72)) {
            return -1;
        }
        while (!sTkWmhpZ5b1ArQIw4K(charSequence2, 0, charSequence, iLEeR5KfoEr4xU5yHH72, charSequence2.length(), z)) {
            if (iLEeR5KfoEr4xU5yHH72 == iS3fjYDxWOUexjjVgyA2) {
                return -1;
            }
            iLEeR5KfoEr4xU5yHH72 += iHJFh0TGMpafqLE9haL2;
        }
        return iLEeR5KfoEr4xU5yHH72;
    }

    public static final int KYHag8HRDlnO3X9zmZ(CharSequence charSequence) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final String LIMtzhnLwQyigzK0KO(CharSequence charSequence, cni9M1Tt0N7bwq7oSh.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(hJFh0TGMpafqLE9haL, "range");
        return charSequence.subSequence(hJFh0TGMpafqLE9haL.TCyPEKSzIyweCN5yp1().intValue(), hJFh0TGMpafqLE9haL.KYHag8HRDlnO3X9zmZ().intValue() + 1).toString();
    }

    public static final YUDx3zHgOZWWxq2Qgs.lEeR5KfoEr4xU5yHH7 OANkd3mP6AYvwbNLJM(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        Y43RdunnpKgpbny0lE(i2);
        return new zZKhbgvUfsK4AEX3r0(charSequence, i, i2, new lEeR5KfoEr4xU5yHH7(F8je6vTkTMHm5WbjEC.TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA(strArr), z));
    }

    public static final List R9SAhYMerGybF9OAjL(CharSequence charSequence, String[] strArr, boolean z, int i) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return G7AC3DWIx9i9fdanjk(charSequence, str, z, i);
            }
        }
        Iterable iterableLEeR5KfoEr4xU5yHH7 = YUDx3zHgOZWWxq2Qgs.KYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(zaq8hOURtfwbcX17cG(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(F8je6vTkTMHm5WbjEC.e54J8UWNHWALQNixXM.TCyPEKSzIyweCN5yp1(iterableLEeR5KfoEr4xU5yHH7, 10));
        Iterator it = iterableLEeR5KfoEr4xU5yHH7.iterator();
        while (it.hasNext()) {
            arrayList.add(LIMtzhnLwQyigzK0KO(charSequence, (cni9M1Tt0N7bwq7oSh.HJFh0TGMpafqLE9haL) it.next()));
        }
        return arrayList;
    }

    public static /* synthetic */ int T9PhQIpGRhE4yZDm1C(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = KYHag8HRDlnO3X9zmZ(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return Z9WdNiOsPR0y54zHW4(charSequence, c, i, z);
    }

    public static final int TCyPEKSzIyweCN5yp1(CharSequence charSequence, String str, int i, boolean z) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "string");
        return (z || !(charSequence instanceof String)) ? pbVGzGjWvY2LDXC8vo(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    public static /* synthetic */ String VItLRw50eXTZeEfGl0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return A49QRPHynYLCBN0SqP(str, c, str2);
    }

    public static final void Y43RdunnpKgpbny0lE(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    public static final int Z9WdNiOsPR0y54zHW4(CharSequence charSequence, char c, int i, boolean z) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? aPyGSIylzVNKPT1Bls(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    public static final int aPyGSIylzVNKPT1Bls(CharSequence charSequence, char[] cArr, int i, boolean z) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(F8je6vTkTMHm5WbjEC.IPyIQcaNa8aB7drBED.TCyPEKSzIyweCN5yp1(cArr), i);
        }
        for (int iS3fjYDxWOUexjjVgyA = cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(i, KYHag8HRDlnO3X9zmZ(charSequence)); -1 < iS3fjYDxWOUexjjVgyA; iS3fjYDxWOUexjjVgyA--) {
            char cCharAt = charSequence.charAt(iS3fjYDxWOUexjjVgyA);
            for (char c : cArr) {
                if (s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(c, cCharAt, z)) {
                    return iS3fjYDxWOUexjjVgyA;
                }
            }
        }
        return -1;
    }

    public static final int e54J8UWNHWALQNixXM(CharSequence charSequence, String str, int i, boolean z) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "string");
        return (z || !(charSequence instanceof String)) ? IPyIQcaNa8aB7drBED(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    public static /* synthetic */ int hoXrIDAFrSwfShk8da(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = KYHag8HRDlnO3X9zmZ(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return e54J8UWNHWALQNixXM(charSequence, str, i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
    
        return GraqRgO5nDZP94CSeH.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(java.lang.Integer.valueOf(r12), r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ husNiw3snxdgZPAGJm(java.lang.CharSequence r10, java.util.Collection r11, int r12, boolean r13, boolean r14) {
        /*
            r0 = 0
            if (r13 != 0) goto L2d
            int r1 = r11.size()
            r2 = 1
            if (r1 != r2) goto L2d
            java.lang.Object r11 = F8je6vTkTMHm5WbjEC.Y43RdunnpKgpbny0lE.Acstmh57AKoSEkEFNJ(r11)
            java.lang.String r11 = (java.lang.String) r11
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            if (r14 != 0) goto L1d
            int r10 = Acstmh57AKoSEkEFNJ(r1, r2, r3, r4, r5, r6)
            goto L21
        L1d:
            int r10 = hoXrIDAFrSwfShk8da(r1, r2, r3, r4, r5, r6)
        L21:
            if (r10 >= 0) goto L24
            goto L2c
        L24:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ r0 = GraqRgO5nDZP94CSeH.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(r10, r11)
        L2c:
            return r0
        L2d:
            r1 = 0
            if (r14 != 0) goto L3e
            cni9M1Tt0N7bwq7oSh.HJFh0TGMpafqLE9haL r14 = new cni9M1Tt0N7bwq7oSh.HJFh0TGMpafqLE9haL
            int r12 = cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.lEeR5KfoEr4xU5yHH7(r12, r1)
            int r1 = r10.length()
            r14.<init>(r12, r1)
            goto L4a
        L3e:
            int r14 = KYHag8HRDlnO3X9zmZ(r10)
            int r12 = cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.s3fjYDxWOUexjjVgyA(r12, r14)
            cni9M1Tt0N7bwq7oSh.lEeR5KfoEr4xU5yHH7 r14 = cni9M1Tt0N7bwq7oSh.husNiw3snxdgZPAGJm.zZKhbgvUfsK4AEX3r0(r12, r1)
        L4a:
            boolean r12 = r10 instanceof java.lang.String
            if (r12 == 0) goto L96
            int r12 = r14.lEeR5KfoEr4xU5yHH7()
            int r1 = r14.s3fjYDxWOUexjjVgyA()
            int r14 = r14.HJFh0TGMpafqLE9haL()
            if (r14 <= 0) goto L5e
            if (r12 <= r1) goto L62
        L5e:
            if (r14 >= 0) goto Ld4
            if (r1 > r12) goto Ld4
        L62:
            java.util.Iterator r8 = r11.iterator()
        L66:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r3 = 0
            r5 = r12
            r7 = r13
            boolean r2 = pjij9fAFhRRn230kOs.T9PhQIpGRhE4yZDm1C.lEeR5KfoEr4xU5yHH7(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L66
            goto L85
        L84:
            r9 = r0
        L85:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L92
        L89:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ r10 = GraqRgO5nDZP94CSeH.IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7(r10, r9)
            return r10
        L92:
            if (r12 == r1) goto Ld4
            int r12 = r12 + r14
            goto L62
        L96:
            int r12 = r14.lEeR5KfoEr4xU5yHH7()
            int r1 = r14.s3fjYDxWOUexjjVgyA()
            int r14 = r14.HJFh0TGMpafqLE9haL()
            if (r14 <= 0) goto La6
            if (r12 <= r1) goto Laa
        La6:
            if (r14 >= 0) goto Ld4
            if (r1 > r12) goto Ld4
        Laa:
            java.util.Iterator r8 = r11.iterator()
        Lae:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r9 = r8.next()
            r2 = r9
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r6 = r2.length()
            r4 = r10
            r5 = r12
            r7 = r13
            boolean r2 = sTkWmhpZ5b1ArQIw4K(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lae
            goto Lcb
        Lca:
            r9 = r0
        Lcb:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto Ld0
            goto L89
        Ld0:
            if (r12 == r1) goto Ld4
            int r12 = r12 + r14
            goto Laa
        Ld4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pjij9fAFhRRn230kOs.hoXrIDAFrSwfShk8da.husNiw3snxdgZPAGJm(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ");
    }

    public static /* synthetic */ int pbVGzGjWvY2LDXC8vo(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return IPyIQcaNa8aB7drBED(charSequence, charSequence2, i, i2, z, z2);
    }

    public static final boolean sTkWmhpZ5b1ArQIw4K(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!s3fjYDxWOUexjjVgyA.lEeR5KfoEr4xU5yHH7(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ List xHA29AmDt6y96AnB3t(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return R9SAhYMerGybF9OAjL(charSequence, strArr, z, i);
    }

    public static /* synthetic */ YUDx3zHgOZWWxq2Qgs.lEeR5KfoEr4xU5yHH7 zaq8hOURtfwbcX17cG(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return OANkd3mP6AYvwbNLJM(charSequence, strArr, i, z, i2);
    }
}

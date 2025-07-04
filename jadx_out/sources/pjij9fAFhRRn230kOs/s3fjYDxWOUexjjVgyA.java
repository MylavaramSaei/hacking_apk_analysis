package pjij9fAFhRRn230kOs;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA extends lEeR5KfoEr4xU5yHH7 {
    public static final boolean lEeR5KfoEr4xU5yHH7(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
